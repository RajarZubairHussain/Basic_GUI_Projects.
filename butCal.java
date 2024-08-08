import java.awt.*;
import java.awt.event.*;

public class butCal implements ActionListener {
    Frame win = new Frame();
    TextField t1 = new TextField();
    
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button b10 = new Button("0");
    Button b11 = new Button("+");
    Button b12 = new Button("-");
    Button b13 = new Button("*");
    Button b14 = new Button("/");
    Button b15 = new Button("%");
    Button b16 = new Button("=");
    Button b17 = new Button("CLEAR");
    Button b18 = new Button("ABOUT ME ");
    Button b19 = new Button("EXIT");

    butCal(){
        win.setBounds(450,10,400,500);
        win.setLayout(null);

        t1.setBounds(100,100,220,25);

        b1.setBounds(100,150,40,25);
        b2.setBounds(160,150,40,25);
        b3.setBounds(220,150,40,25);
        b4.setBounds(280,150,40,25);
        b5.setBounds(100,200,40,25);
        b6.setBounds(160,200,40,25);
        b7.setBounds(220,200,40,25);
        b8.setBounds(280,200,40,25);
        b9.setBounds(100,250,40,25);
        b10.setBounds(160,250,40,25);
        b11.setBounds(220,250,40,25);
        b12.setBounds(280,250,40,25);
        b13.setBounds(100,300,40,25);
        b14.setBounds(160,300,40,25);
        b15.setBounds(220,300,40,25);
        b16.setBounds(280,300,40,25);

        b17.setBounds(100,350,50,25);
        b18.setBounds(200,350,80,25);
        b19.setBounds(280,350,50,25);

        t1.setEditable(false);

        win.add(t1);

        win.add(b1);
        win.add(b2);
        win.add(b3);
        win.add(b4);
        win.add(b5);
        win.add(b6);
        win.add(b7);
        win.add(b8);
        win.add(b9);
        win.add(b10);
        win.add(b11);
        win.add(b12);
        win.add(b13);
        win.add(b14);
        win.add(b15);
        win.add(b16);
        win.add(b17);
        win.add(b18);
        win.add(b19);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);

        win.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s1 = t1.getText();
        int a = Integer.parseInt(s1);
        int one = 1;
        if (e.getSource()==b1) {
            t1.setText(""+one);
        }
    }
    public static void main(String[] args) {
        butCal ob = new butCal();
    }

}
