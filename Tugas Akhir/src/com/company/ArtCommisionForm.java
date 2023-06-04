package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArtCommisionForm {
    private JTextField textField1;
    private JTextArea textArea1;
    private JLabel Nama;
    private JCheckBox sayaTelahMembacaDanCheckBox;
    private JButton batalkanButton;
    private JButton lanjutkanPembayaranButton;

    private JTextField textField2;
    private JPanel Panel;
    private JRadioButton VISACCRadioButton;
    private JRadioButton paypalRadioButton;
    private JRadioButton EWalletRadioButton;
    private JCheckBox faceCheckBox;
    private JCheckBox halfBodyBustUpCheckBox;
    private JCheckBox fullBodyCheckBox;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Pemesanan Art Comission");
        frame.setContentPane(new ArtCommisionForm() .Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setResizable(true);
    }


    public ArtCommisionForm() {
        lanjutkanPembayaranButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("Nama:" + textField1.getText()   + "\nDetail pesanan:" +  textField2.getText() );
            }
        });
        batalkanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textArea1.setText("");

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
