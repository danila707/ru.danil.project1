package ru.danil.lessen8;

import javax.swing.*;

public class Calculator extends JFrame {

    public static void main(String[] args) {
       Logics cal = new Logics("канкулятор");
       cal.setTitle("канкулятор");
       cal.setSize(150, 300);
       cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       cal.setResizable(false);
       cal.setLocationRelativeTo(null);
       cal.setVisible(true);

   }
}
