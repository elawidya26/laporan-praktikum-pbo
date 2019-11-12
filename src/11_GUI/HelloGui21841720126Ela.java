/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Ela Widya
 */
public class HelloGui21841720126Ela extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JPanel panel;
    
    public HelloGui21841720126Ela() {
        createTextFieldEla();
        createButtonEla();
        createPanelEla();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }
    
    private void createTextFieldEla() {
        aLabel = new JLabel ("Nilai A: ");
        bLabel = new JLabel ("Nilai B: ");
        cLabel = new JLabel ("Hasil: ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    
    private void createButtonEla() {
        button = new JButton("Calculate");
        class AddInterestListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a  = Integer.valueOf(aField.getText());
                int b  = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil : " + c);
            }  
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    
    private void createPanelEla() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        add(panel);
    }
    
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("Ini Percobaan HelloGui Frame");
        frame = new HelloGui21841720126Ela();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(600, 300);
        //frame.setLocation(200, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
}
