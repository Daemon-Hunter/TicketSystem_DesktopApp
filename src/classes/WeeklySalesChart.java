/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import bookings.IBooking;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import wrappers.DesktopWrapper;

/**
 *
 * @author 10512691
 */
public class WeeklySalesChart extends Application {
    
    final static String current = "This Week";
    final static String last    = "Last Week";
    final static String earlier = "Previous Week";

    @Override
    public void start(Stage stage) throws Exception {
        
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
        List<IBooking> week1Bookings = null;
        List<IBooking> week2Bookings = null;
        List<IBooking> week3Bookings = null;
        
        // Check this month's sales.
        for (IBooking booking : DesktopWrapper.getInstance().getThisMonthsSales()) {
            
            // Previous week
            if (booking.getBookingTime().before(week1)) {
                week1Bookings.add(booking);
                
                // week before
            } else if (booking.getBookingTime().before(week2)) {
                week2Bookings.add(booking);
                
                // week before that
            } else if (booking.getBookingTime().before(week3)) {
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
        stage.setTitle("Weekly Sales Trend");
        Scene scene = new Scene(chart, 460, 220);
        chart.getData().addAll(series1);
        stage.show();
    }
    
}
