/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contentpanel.events;

import events.IChildEvent;
import events.IParentEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dominic
 */
public class EventTableModel extends DefaultTableModel{

    EventTableModel(List<IChildEvent> events, int size)
    {
    //    super(size)
    }
}
