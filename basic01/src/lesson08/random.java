/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author son maithanh
 */
public class random {

    JFrame f;
    JPanel pn;
    JButton bt;
    JTextField t1, t2;
    JLabel lb;

    public random() {
        initContainer();
        initComponent();
        addComponent();
        addEvent();
        f.setVisible(true);

    }

    private void initContainer() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        f = new JFrame();
        f.setSize(400, 400);
        f.setLayout(null);
        pn = new JPanel();
        pn.setLayout(null);
        pn.setBackground(Color.white);
        pn.setBounds(0, 0, f.getWidth(), f.getHeight());
        f.add(pn);
    }

    private void initComponent() {
        t1 = new JTextField();
        t1.setBounds(100, 0, 100, 100);
        t1.setBackground(Color.red);

        t2 = new JTextField();
        t2.setBounds(100, 100, 100, 100);

        bt = new JButton("fuck");
        bt.setBounds(100, 200, 100, 100);

        lb = new JLabel("radom");
        lb.setBounds(100, 300, 100, 100);
    }

    private void addComponent() {
        pn.add(t1);
        pn.add(t2);
        pn.add(bt);
        pn.add(lb);

    }

    private void addEvent() {
        bt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int max = Integer.parseInt(t1.getText());
                int min = Integer.parseInt(t2.getText());
                int value = max-(int)(Math.random() * (max - min));
                lb.setText(String.valueOf(value));
            }
        });
    }

}
