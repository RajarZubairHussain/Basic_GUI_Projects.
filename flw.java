import java.util.*;

import javax.swing.plaf.ButtonUI;

import java.awt.*;
import java.awt.event.*;

public class flw implements ActionListener {
    Frame win = new Frame();
    Button top = new Button("Top");
    Button bottom = new Button("Bottom");
    Button right = new Button("Right");
    Button left = new Button("Left");

    int topb=120;
    int leftb=100;

    Label demo = new Label("Demo");
    flw(){
        win.setBounds(0,0,1000,800);
        win.setLayout(null);

        demo.setBounds(200,100,100,25);

        top.setBounds(200,400,100,25);
        bottom.setBounds(200,600,100,25);
        right.setBounds(100,500,100,25);
        left.setBounds(300,500,100,25);

        win.add(bottom);
        win.add(right);
        win.add(left);
        win.add(top);
        win.add(demo);
        
        demo.setLocation(leftb,topb);

        win.setVisible(true);

        top.addActionListener(this);
        bottom.addActionListener(this);
        right.addActionListener(this);
        left.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        
        if (e.getSource()==left) {
            leftb+=50;

        }
        if (e.getSource()==right) {
            leftb-=50;

        }
        if (e.getSource()==top) {
            topb-=50;
        }
        if (e.getSource()==bottom) {
            topb+=50;
        }

        demo.setLocation(leftb,topb);
    }
    public static void main(String[] args) {
        flw ob = new flw();
    }
}
