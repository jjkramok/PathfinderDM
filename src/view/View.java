package view;

import javax.swing.*;

/**
 + * Created by Kramok on 25/6/2015.
 + */
public class View {

    private static void createAndShowGUI() {
        //Create a window
        JFrame frame = new JFrame("SwingFrame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Add label
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

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
