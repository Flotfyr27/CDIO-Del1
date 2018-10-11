package spil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JLabel lblp1, lblp2, sp1, sp2;


    public GUI() {
        JFrame jframe = new JFrame();
        jframe.setTitle("32_del1");
        jframe.setSize(250,120);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setLayout(new FlowLayout());

        lblp1 = new JLabel("Player1: ");
        lblp2 = new JLabel("Player2: ");

        sp1 = new JLabel("0");
        sp2 = new JLabel("0");

        jframe.add(lblp1);
        jframe.add(sp1);
        jframe.add(lblp2);
        jframe.add(sp2);

        JButton jbtn = new JButton("Roll dice");
        jbtn.setActionCommand("Roll");
        jbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Roll")) {
                    //Roll dice of correct player, then add values to scores
                }

            }
        });

        jframe.add(jbtn);

        jframe.setVisible(true);


    }


    public static void main(String[] args) {
        new GUI();
    }
}
