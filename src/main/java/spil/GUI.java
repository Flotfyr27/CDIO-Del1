package spil;

import com.sun.glass.ui.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JLabel lblp1, lblp2, sp1, sp2;
    private JTextArea msg;
    private JButton jbtn;
    public boolean buttonPressed;


    public GUI() {
        buttonPressed = false;
        JFrame jframe = new JFrame();
        jframe.setTitle("32_del1");
        jframe.setSize(300,200);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setLayout(new FlowLayout());

        lblp1 = new JLabel("Player1: ");
        lblp2 = new JLabel("Player2: ");

        sp1 = new JLabel("0");
        sp2 = new JLabel("0");

        msg = new JTextArea();

        jframe.add(lblp1);
        jframe.add(sp1);
        jframe.add(lblp2);
        jframe.add(sp2);

        JButton jbtn = new JButton("Roll dice");
        jbtn.setActionCommand("Roll");
        jbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Roll")) {
                    buttonPressed = true;
                    //Roll dice of correct player, then add values to scores
                }

            }
        });

        jframe.add(jbtn);

        jframe.add(msg);
        msg.setPreferredSize(new Dimension(200,100));

        jframe.setLocation(300,300);
        jframe.setVisible(true);


    }

    public void setScore(String player, int score){
        if(player.compareToIgnoreCase("Player 1")==0)
            sp1.setText(score+"");
        else
            sp2.setText(score+"");
    }

    public void WriteMessage(String message){
        msg.setText(message);
    }

    public String getMessage(){
        return msg.getText();
    }
}
