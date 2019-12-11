/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08.btvn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author son maithanh
 */
public class caculator {

    public static void main(String[] args) {
        caculator cl = new caculator();
    }
    JFrame f;
    JLabel lb;
    JButton number0, number1, number2, number3, number4, number5, number6, number7, number8, number9, AC, btBang, btTru, btNhan, btChia, btCong;
    JPanel pn;
    String value = new String();
    int kq, x;

    public caculator() {
        initContainer();
        initConponent();
        addConponent();
        addEvent();
        f.setVisible(true);
    }

    private void initContainer() {

        f = new JFrame();
        f.setSize((int) 417.5, (int) 547.5);
        f.setLayout(null);
        pn = new JPanel();
        pn.setSize(f.getWidth(), f.getHeight());
        pn.setLayout(null);
        pn.setBackground(Color.gray);
        pn.setBounds(0, 0, f.getWidth(), f.getHeight());
        f.add(pn);

    }

    private void initConponent() {
        lb = new JLabel("0");
        lb.setBounds(0, 0, 400, 100);
        lb.setBackground(Color.BLACK);

        number7 = new JButton("7");
        number7.setBounds(0, 100, 100, 100);

        number8 = new JButton("8");
        number8.setBounds(100, 100, 100, 100);

        number9 = new JButton("9");
        number9.setBounds(200, 100, 100, 100);

        AC = new JButton("AC");
        AC.setBounds(300, 100, 100, 100);

        number4 = new JButton("4");
        number4.setBounds(0, 200, 100, 100);

        number5 = new JButton("5");
        number5.setBounds(100, 200, 100, 100);

        number6 = new JButton("6");
        number6.setBounds(200, 200, 100, 100);

        btTru = new JButton("-");
        btTru.setBounds(300, 200, 100, 100);

        number1 = new JButton("1");
        number1.setBounds(0, 300, 100, 100);

        number2 = new JButton("2");
        number2.setBounds(100, 300, 100, 100);

        number3 = new JButton("3");
        number3.setBounds(200, 300, 100, 100);

        btNhan = new JButton("x");
        btNhan.setBounds(300, 300, 100, 100);

        number0 = new JButton("0");
        number0.setBounds(0, 400, 100, 100);

        btCong = new JButton("+");
        btCong.setBounds(100, 400, 100, 100);

        btChia = new JButton("/");
        btChia.setBounds(200, 400, 100, 100);

        btBang = new JButton("=");
        btBang.setBounds(300, 400, 100, 100);

    }

    private void addConponent() {
        pn.add(lb);
        pn.add(number0);
        pn.add(number1);
        pn.add(number2);
        pn.add(number3);
        pn.add(number4);
        pn.add(number5);
        pn.add(number6);
        pn.add(number7);
        pn.add(number8);
        pn.add(number9);
        pn.add(AC);
        pn.add(btBang);
        pn.add(btTru);
        pn.add(btCong);
        pn.add(btNhan);
        pn.add(btChia);

    }

    private void addEvent() {
        number0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "0";
                lb.setText(value);

            }
        });
        number1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "1";
                lb.setText(value);

            }
        });
        number2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "2";
                lb.setText(value);

            }
        });
        number3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "3";
                lb.setText(value);

            }
        });
        number4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "4";
                lb.setText(value);

            }
        });
        number5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "5";
                lb.setText(value);

            }
        });
        number6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "6";
                lb.setText(value);

            }
        });
        number7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "7";
                lb.setText(value);

            }
        });
        number8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "8";
                lb.setText(value);

            }
        });
        number9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "9";
                lb.setText(value);

            }
        });
        btChia.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "/";
                lb.setText(value);

            }
        });
        btNhan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "x";
                lb.setText(value);

            }
        });
        btCong.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "cong";
                lb.setText(value);

            }
        });
        btTru.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value += "-";
                lb.setText(value);

            }
        });
        AC.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                value = "";
                lb.setText(value);

            }
        });
        btBang.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String[] s1 = new String[2];
                for (int i = 0; i < value.length(); i++) {
                    if (value.charAt(i) == '-') {
                        x = 3;break;
                    } else if (value.charAt(i) == 'x') {
                        x = 1;break;
                    } else if (value.charAt(i) == '/') {
                        x = 2;break;
                    } else {
                        x = 4;
                    }

                }
                switch (x) {
                    case 1:
                        try {
                            int n = 0;
                            for (String s : value.split("x")) {
                                s1[n] = s;
                                n++;
                            }
                            kq = Integer.parseInt(s1[0]) * Integer.parseInt(s1[1]);
                            lb.setText(String.valueOf(kq));
                            value = String.valueOf(kq);
                        } catch (Exception b) {
                            lb.setText("sai roi, nhap lai");
                            value = "";
                        }
                        break;
                    case 2:
                        try {
                            int n = 0;
                            for (String s : value.split("/")) {
                                s1[n] = s;
                                n++;
                            }
                            kq = Integer.parseInt(s1[0]) / Integer.parseInt(s1[1]);
                            lb.setText(String.valueOf(kq));
                            value = String.valueOf(kq);
                        } catch (Exception b) {
                            lb.setText("sai roi, nhap lai");
                            value = "";
                        }
                        break;
                    case 3:
                        try {
                            int n = 0;
                            for (String s : value.split("-")) {
                                s1[n] = s;
                                n++;
                            }
                            kq = Integer.parseInt(s1[0]) - Integer.parseInt(s1[1]);
                            lb.setText(String.valueOf(kq));
                            value = String.valueOf(kq);
                        } catch (Exception b) {
                            lb.setText("sai roi, nhap lai");
                            value = "";
                        }
                        break;
                    case 4:
                        try {
                            int n = 0;
                            for (String s : value.split("cong")) {
                                s1[n] = s;
                                n++;
                            }
                            kq = Integer.parseInt(s1[0]) + Integer.parseInt(s1[1]);
                            lb.setText(String.valueOf(kq));
                            value = String.valueOf(kq);
                        } catch (Exception b) {
                            lb.setText("sai roi, nhap lai");
                            value = "";
                        }
                        break;
                }

                
                

            }
        });

    }
}
