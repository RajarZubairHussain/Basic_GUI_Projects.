import java.util.*;
import java.awt.*;
import java.awt.event.*;



public class fram implements ActionListener {

    int top = 100;
    int right = 100;
    Frame win = new Frame();

    Button rightb = new Button("Right");
    Button leftb = new Button("Left");
    Button topb = new Button("Top");
    Button bottomb = new Button("Bottom");

    fram(){
        win.setBounds(0,0,500,500);
        win.setLayout(null);

        leftb.setBounds(50,100,100,25);
        rightb.setBounds(150,100,100,25);
        topb.setBounds(100,50,100,25);
        bottomb.setBounds(100,150,100,25);

        win.add(bottomb);
        win.add(topb);
        win.add(leftb);
        win.add(rightb);

        
        win.setVisible(true);

        topb.addActionListener(this);
        bottomb.addActionListener(this);
        rightb.addActionListener(this);
        leftb.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource()==rightb) {
            right+=50;
        }
        if (e.getSource()==leftb) {
            right-=50;
        }
        if (e.getSource()==topb) {
            top-=50;
        }
        if (e.getSource()==bottomb) {
            top+=50;
        }
        win.setLocation(right,top);

    }

    public static void main(String[] args) {
        fram o = new fram();
    }
    
}
