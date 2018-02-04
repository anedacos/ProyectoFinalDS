/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

/**
 *
 * @author Antho
 */
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Main {
  public static void main(String args[]) {
    String labels[] = { "A", "B", "C", "D", "E", "F", "G", "H" };
    JFrame frame = new JFrame("Selecting JList");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JList jlist = new JList(labels);
    JScrollPane scrollPane1 = new JScrollPane(jlist);
    frame.add(scrollPane1, BorderLayout.CENTER);

    MouseListener mouseListener = new MouseAdapter() {
      public void mouseClicked(MouseEvent mouseEvent) {
        JList theList = (JList) mouseEvent.getSource();
        if (mouseEvent.getClickCount() == 2) {
          int index = theList.locationToIndex(mouseEvent.getPoint());
          if (index >= 0) {
            Object o = theList.getModel().getElementAt(index);
            System.out.println("Double-clicked on: " + o.toString());
          }
        }
      }
    };
    jlist.addMouseListener(mouseListener);

    frame.setSize(350, 200);
    frame.setVisible(true);
  }
}
