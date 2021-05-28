package com.ikhsan.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MencariDataMahasiswa {
    private JTextField textFieldNama;
    private JTextField TextFieldNim;
    private JButton CariButton;
    private JPanel basePanel;
    private JButton ulangButton;
    private JTextPane createdByIkhsanDwiTextPane;
    private JLabel logo;
    private JTextArea outputresult;



    public MencariDataMahasiswa() {

        //CARI BUTTON
        CariButton.addActionListener(e -> {
            String nama = textFieldNama.getText();
            String nim = TextFieldNim.getText();

            DataResource dr = new DataResource();
            dr.setNama(nama);
            dr.setNim(nim);

            //MESSAGE DIALOG
            JOptionPane.showMessageDialog(null, "Pastikan Nim 11 Angka!","Info", JOptionPane.INFORMATION_MESSAGE);
            if (textFieldNama.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mohon Masukkan Nama Anda!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }else if (TextFieldNim.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mohon Masukkan Nim Anda!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }

            //OUTPUT
            outputresult.setText(dr.name() + dr.nim() + dr.getTahunMasuk() + dr.getJenjangPendidikan() +
                    dr.getFakultas() + dr.getJurusan() + dr.getJenisKelamin() + dr.getUrutaMahasiswa());
            ulangButton.requestFocus();
        });

                //ULANG BUTTON
             ulangButton.addActionListener(e -> {
                 textFieldNama.setText(null);
                 TextFieldNim.setText(null);
                 outputresult.setText(null);
                 textFieldNama.requestFocus();
             });
    }

    //BASE PANEL
    public JPanel getBasePanel() {
        return basePanel;
    }

    //GAMBAR
    private void createUIComponents() {
logo = new JLabel(new ImageIcon("uinlogo.png"));
    }
}

