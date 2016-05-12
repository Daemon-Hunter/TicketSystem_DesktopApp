/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import bookings.IBooking;
import javax.swing.JApplet;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
 
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
 
import javafx.embed.swing.JFXPanel;
 
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.Chart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import wrappers.DesktopWrapper;

/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
public class SwingInterop extends JApplet {
    
    private static final int PANEL_WIDTH_INT = 460;
    private static final int PANEL_HEIGHT_INT = 220;
    private static final int TABLE_PANEL_HEIGHT_INT = 100;
    
    private static JFXPanel chartFxPanel;
    private static DefaultTableModel tableModel;
    private Chart chart;
 
 
    @Override
    public void init() {
        tableModel = new DefaultTableModel();
        
        // create javafx panel for charts
        chartFxPanel = new JFXPanel();
        chartFxPanel.setPreferredSize(new Dimension(PANEL_WIDTH_INT, PANEL_HEIGHT_INT));
 
        
        //JTable
        JTable table = new JTable(tableModel);
        table.setAutoCreateRowSorter(true);
        table.setGridColor(Color.DARK_GRAY);
        SwingInterop.DecimalFormatRenderer renderer = new SwingInterop.DecimalFormatRenderer();
        renderer.setHorizontalAlignment(JLabel.RIGHT);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        JScrollPane tablePanel = new JScrollPane(table);
        tablePanel.setPreferredSize(new Dimension(PANEL_WIDTH_INT, TABLE_PANEL_HEIGHT_INT));
 
        JPanel chartTablePanel = new JPanel();
        chartTablePanel.setLayout(new BorderLayout());
 
        //Split pane that holds both chart and table
        JSplitPane jsplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        jsplitPane.setTopComponent(chartTablePanel);
        jsplitPane.setBottomComponent(tablePanel);
        jsplitPane.setDividerLocation(410);
        chartTablePanel.add(chartFxPanel, BorderLayout.CENTER);
 
        add(jsplitPane, BorderLayout.CENTER);
        
        // create JavaFX scene
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    createScene();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(SwingInterop.this, "Error loading sales data from database.");
                }
            }
        });
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                
                JFrame frame = new JFrame("Bookings data");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 
                JApplet applet = new SwingInterop();
                applet.init();
 
                frame.setContentPane(applet.getContentPane());
 
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
 
                applet.start();
            }
        });
    }
 
    private void createScene() throws IOException {
        chart = createBarChart();
        chartFxPanel.setScene(new Scene(chart));
    }
    
    private BarChart createBarChart() throws IOException {
        
        // Create date instances to compare booking date against.
        // Different thresholds scope the correct bookings.
        Calendar cal = Calendar.getInstance();
        
        cal.add(Calendar.DATE, -7);
        Date week1 = cal.getTime();
        
        cal.add(Calendar.DATE, -14);
        Date week2 = cal.getTime();
        
        cal.add(Calendar.DATE, -21);
        Date week3 = cal.getTime();
        
        // Create an array to hold each week's bookings (could do daily?)
        List<IBooking> week1Bookings = new LinkedList<>();
        List<IBooking> week2Bookings = new LinkedList<>();
        List<IBooking> week3Bookings = new LinkedList<>();
        
        List<IBooking> bookings = DesktopWrapper.getInstance().getThisMonthsSales();
        
        // Check this month's sales.
        for (IBooking booking : bookings) {
            
            // Previous week
            if (booking.getBookingTime().after(week1)) {
                week1Bookings.add(booking);
                
                // week before
            } else if (booking.getBookingTime().after(week2)) {
                week2Bookings.add(booking);
                
                // week before that
            } else if (booking.getBookingTime().after(week3)) {
                week3Bookings.add(booking);
            }
        }
        
        // Initialise each chart axis
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Week");
        
        NumberAxis   yAxis = new NumberAxis();
        yAxis.setLabel("Number of bookings");
        
        // Initialise the chart
        BarChart<String, Number> chart = new BarChart<>(xAxis, yAxis);
        chart.setTitle("Number of sales per week.");
        
        // Total the number of sales for each week
        int week1Total = 0;
        for (IBooking b : week1Bookings) {
            week1Total += b.getQuantity();
        }
        
        int week2Total = 0;
        for (IBooking b : week2Bookings) {
            week2Total += b.getQuantity();
        }
        
        int week3Total = 0;
        for (IBooking b : week3Bookings) {
            week3Total += b.getQuantity();
        }
        
        // Create data to map onto chart
        XYChart.Series series1 = new XYChart.Series<>();
        series1.getData().add(new XYChart.Data<>("Previous week", week1Total));
        series1.getData().add(new XYChart.Data<>("Week before", week2Total));
        series1.getData().add(new XYChart.Data<>("Week before that", week3Total));
        
        // Set the scene...
        chart.getData().addAll(series1);
        return chart;
        
//        CategoryAxis xAxis = new CategoryAxis();
//        xAxis.setCategories(FXCollections.<String>observableArrayList(tableModel.getColumnNames()));
//        xAxis.setLabel("Year");
// 
//        double tickUnit = tableModel.getTickUnit();
// 
//        NumberAxis yAxis = new NumberAxis();
//        yAxis.setTickUnit(tickUnit);
//        yAxis.setLabel("Units Sold");
// 
//        final BarChart chart = new BarChart(xAxis, yAxis, tableModel.getBarChartData());
//        tableModel.addTableModelListener(new TableModelListener() {
// 
//            @Override
//            public void tableChanged(TableModelEvent e) {
//                if (e.getType() == TableModelEvent.UPDATE) {
//                    final int row = e.getFirstRow();
//                    final int column = e.getColumn();
//                    final Object value = ((SampleTableModel) e.getSource()).getValueAt(row, column);
// 
//                    Platform.runLater(new Runnable() {
//                        @Override
//                        public void run() {
//                            XYChart.Series<String, Number> s = (XYChart.Series<String, Number>) chart.getData().get(row);
//                            BarChart.Data data = s.getData().get(column);
//                            data.setYValue(value);
//                        }
//                    });
//                }
//            }
//        });
//        return chart;
    }
 
 
    private static class DecimalFormatRenderer extends DefaultTableCellRenderer {
        private static final DecimalFormat formatter = new DecimalFormat("#.0");
 
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            value = formatter.format((Number) value);
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }
}
