package com.ikhsan.project;

import javax.swing.*;

public class RunExecute {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Biodata Mahasiswa/i Uin Suska");
        jFrame.setContentPane(new MencariDataMahasiswa().getBasePanel()) ;
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1000, 600);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }
}
