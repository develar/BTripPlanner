package com.github.develar;

import org.free.garminimg.swing.MapPanel;
import org.free.garminimg.swing.NullConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;

public class Test extends JDialog {
  private JPanel contentPane;
  private JButton buttonOK;
  private JButton buttonCancel;
  private JPanel content;

  public Test() throws IOException {
    setContentPane(contentPane);
    setModal(true);
    getRootPane().setDefaultButton(buttonOK);

    MapPanel<Point2D.Double> mapPanel = new MapPanel<>(new NullConverter(), 0);
    content.add(mapPanel, BorderLayout.CENTER);

    File file = new File("/Users/develar/openmtbmap_bayern_16.08.2013.img");

    mapPanel.addMapLocation(file);
    mapPanel.showAllMap();
    mapPanel.setSize(500, 500);


    buttonOK.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        onOK();
      }
    });

    buttonCancel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        onCancel();
      }
    });

// call onCancel() when cross is clicked
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        onCancel();
      }
    });

// call onCancel() on ESCAPE
    contentPane.registerKeyboardAction(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        onCancel();
      }
    }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
  }

  private void onOK() {
// add your code here
    dispose();
  }

  private void onCancel() {
// add your code here if necessary
    dispose();
  }

  public static void main(String[] args) throws IOException {
    Test dialog = new Test();
    dialog.pack();
    dialog.setVisible(true);
    System.exit(0);
  }
}
