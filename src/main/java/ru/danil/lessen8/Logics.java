package ru.danil.lessen8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logics extends JFrame {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bSum, bDif, bDiv, bMut, bDel, bEq;
    JTextField t1;
    int i = 0, SUM = 0, DIF = 0, DIV = 0, MUT = 0;
    String j, h;
    int a, b;
    Ehandler handler = new Ehandler();

    public Logics(String s) {
        super(s);
        setLayout(new FlowLayout());
        t1 = new JTextField(12);
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bSum = new JButton("+");
        bDel = new JButton("        CE       ");
        bDif = new JButton("-");
        bDiv = new JButton("/");
        bMut = new JButton("*");
        bEq = new JButton("=");
        t1.setEditable(false);
        add(t1);
        add(bDel);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(bEq);
        add(bSum);
        add(bMut);
        add(bDif);
        add(bDiv);
        bDel.addActionListener(handler);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        b0.addActionListener(handler);
        bSum.addActionListener(handler);
        bEq.addActionListener(handler);
        bMut.addActionListener(handler);
        bDiv.addActionListener(handler);
        bDif.addActionListener(handler);
    }
    class Ehandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==bDel){
                t1.setText(null);
                i = 0;
            }
            if (e.getSource()==b1){
                t1.setText(t1.getText()+"1");
                i++;
            }
            if (e.getSource()==b2){
                t1.setText(t1.getText()+"2");
                i++;
            }
            if (e.getSource()==b3){
                t1.setText(t1.getText()+"3");
                i++;
            }
            if (e.getSource()==b4){
                t1.setText(t1.getText()+"4");
                i++;
            }
            if (e.getSource()==b5){
                t1.setText(t1.getText()+"5");
                i++;
            }
            if (e.getSource()==b6){
                t1.setText(t1.getText()+"6");
                i++;
            }
            if (e.getSource()==b7){
                t1.setText(t1.getText()+"7");
                i++;
            }
            if (e.getSource()==b8){
                t1.setText(t1.getText()+"8");
                i++;
            }
            if (e.getSource()==b9){
                t1.setText(t1.getText()+"9");
                i++;
            }if (e.getSource()==b0){
                t1.setText(t1.getText()+"0");
                i++;
            }
            if (e.getSource()==bEq) {
                h = t1.getText();
                b = Integer.parseInt(h);
                a = Integer.parseInt(j);
                if (SUM == 1) {
                    t1.setText(a + b + "");
                    SUM = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (DIF == 1) {
                    t1.setText(a - b + "");
                    DIF = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (MUT == 1) {
                    t1.setText(a * b + "");
                    MUT = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (DIV == 1) {
                    t1.setText(a / b + "");
                    DIV = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
            }
            if (e.getSource()==bSum){
                j = t1.getText();
                t1.setText(null);
                SUM++;
            }
            if (e.getSource()==bDif){
                j = t1.getText();
                t1.setText(null);
                DIF++;
            }
            if (e.getSource()==bMut){
                j = t1.getText();
                t1.setText(null);
                MUT++;
            }
            if (e.getSource()==bDiv){
                j = t1.getText();
                t1.setText(null);
                DIV++;
            }
        }
    }
}
