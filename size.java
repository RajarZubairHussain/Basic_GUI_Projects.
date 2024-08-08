import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class size implements ActionListener {

    int wirth = 100;
    int hei = 25;
    Frame win = new Frame();
    Button hi = new Button("H++");
    Button hd = new Button("H--");
    Button wi = new Button("W++");
    Button wd = new Button("W--");

    Button zain = new Button("Zain");

    size(){
        win.setBounds(0,0,800,800);
        win.setLayout(null);

        hi.setBounds(400,50,100,25);
        hd.setBounds(400,150,100,25);
        wi.setBounds(300,100,100,25);
        wd.setBounds(500,100,100,25);

        zain.setBounds(100,400,100,25);

        win.add(hd);
        win.add(hi);
        win.add(wi);
        win.add(wd);

        win.add(zain);

        win.setVisible(true);

        hd.addActionListener(this);
        hi.addActionListener(this);
        wi.addActionListener(this);
        wd.addActionListener(this);

        
    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource()==hi) {
            hei+=10;
        }

        if (e.getSource()==hd) {
            hei-=10;
        }
        if (e.getSource()==wi) {
            wirth+=20;
        }
        if (e.getSource()==wd) {
            wirth-=20;
        }

        zain.setSize(wirth,hei);
            
    }
    

    public static void main(String[] args) {
        size  ob = new size();
    }


    
}