package com.ikhsan.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MencariDataMahasiswa {
    private JTextField textFieldNama;
    private JTextField TextFieldNim;
    private JButton simpanButton;
    private JPanel basePanel;
    private JTextField resultName;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField1;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton button1;
    private JTextPane createdByIkhsanDwiTextPane;
    private JTextArea Result;
    private String ResultNim;


    public MencariDataMahasiswa() {
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nama = textFieldNama.getText();
                String nim = TextFieldNim.getText();

                DataResource dr = new DataResource();
                dr.setNama(nama);
                dr.setNim(nim);

                resultName.setText(dr.name());
                textField2.setText(dr.nim());
                textField3.setText(dr.getJenjangPendidikan());
                textField1.setText(dr.getTahunMasuk());
                textField4.setText(dr.getFakultas());
                textField5.setText(dr.getJurusan());
                textField6.setText(dr.getJenisKelamin());
                textField7.setText(dr.getUrutaMahasiswa());
            }


        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldNama.setText("");
                TextFieldNim.setText("");
                resultName.setText("");
                textField2.setText("");
                textField3.setText("");
                textField1.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                textFieldNama.requestFocus();
            }
        });
    }

    public JPanel getBasePanel() {
        return basePanel;
    }
}

