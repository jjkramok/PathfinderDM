package view;

import javax.swing.*;
import java.awt.*;

/**
* Created by Kramok on 25/6/2015.
*/
public class View {

    private static void createAndShowGUI() {
        //Create a window
        JFrame frame = new JFrame("SwingFrame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Create a panel
        JPanel panel = new JPanel(new BorderLayout());

        //Creating a layout
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());



        //Add label
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        //Add button
        JButton button = new JButton("roll die");
        frame.getContentPane().add(button);

        contentPane.add(button, BorderLayout.PAGE_START);

        //Display the window
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }


}
