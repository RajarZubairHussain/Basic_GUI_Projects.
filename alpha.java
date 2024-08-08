import java.awt.*;
import java.awt.event.*;

public class alpha implements ActionListener {
    Frame win = new Frame();
    TextField t1 = new TextField();

    Button b1 = new Button("A");
    Button b2 = new Button("B");
    Button b3 = new Button("C");
    Button b4 = new Button("D");
    Button b5 = new Button("E");
    Button b6 = new Button("F");
    Button b7 = new Button("G");
    Button b8 = new Button("H");
    Button b9 = new Button("I");
    Button b10 = new Button("J");
    Button b11 = new Button("K");
    Button b12 = new Button("L");
    Button b13 = new Button("M");
    Button b14 = new Button("N");
    Button b15 = new Button("O");
    Button b16 = new Button("P");
    Button b17 = new Button("Q");
    Button b18 = new Button("R");
    Button b19 = new Button("S");
    Button b20 = new Button("T");
    Button b21 = new Button("U");
    Button b22 = new Button("V");
    Button b23 = new Button("W");
    Button b24 = new Button("X");
    Button b25 = new Button("Y");
    Button b26 = new Button("Z");

    Button b27 = new Button("Play Song");
    Button b28 = new Button("Exit");

    Font f = new Font("arial",Font.BOLD,15);
    

    alpha(){
        win.setBounds(400,0,450,800);
        

        win.setLayout(null);
       

        t1.setBounds(100,100,240,25);

        b1.setBounds(100,150,40,25);
        b2.setBounds(150,150,40,25);
        b3.setBounds(200,150,40,25);
        b4.setBounds(250,150,40,25);
        b5.setBounds(300,150,40,25);

        b6.setBounds(100,200,40,25);
        b7.setBounds(150,200,40,25);
        b8.setBounds(200,200,40,25);
        b9.setBounds(250,200,40,25);
        b10.setBounds(300,200,40,25);

        b11.setBounds(100,250,40,25);
        b12.setBounds(150,250,40,25);
        b13.setBounds(200,250,40,25);
        b14.setBounds(250,250,40,25);
        b15.setBounds(300,250,40,25);

        b16.setBounds(100,300,40,25);
        b17.setBounds(150,300,40,25);
        b18.setBounds(200,300,40,25);
        b19.setBounds(250,300,40,25);
        b20.setBounds(300,300,40,25);

        b21.setBounds(100,350,40,25);
        b22.setBounds(150,350,40,25);
        b23.setBounds(200,350,40,25);
        b24.setBounds(250,350,40,25);
        b25.setBounds(300,350,40,25);

        b26.setBounds(100,400,40,25);

        b27.setBounds(150,400,120,25);
        b28.setBounds(280,400,60,25);

        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);
        b6.setFont(f);
        b7.setFont(f);
        b8.setFont(f);
        b9.setFont(f);
        b10.setFont(f);
        b11.setFont(f);
        b12.setFont(f);
        b13.setFont(f);
        b14.setFont(f);
        b15.setFont(f);
        b16.setFont(f);
        b17.setFont(f);
        b18.setFont(f);
        b19.setFont(f);
        b20.setFont(f);
        b21.setFont(f);
        b22.setFont(f);
        b23.setFont(f);
        b24.setFont(f);
        b25.setFont(f);
        b26.setFont(f);
        b27.setFont(f);
        b28.setFont(f);

        t1.setFont(f);
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
        win.add(b20);
        win.add(b21);
        win.add(b22);
        win.add(b23);
        win.add(b24);
        win.add(b25);
        win.add(b26);

        win.add(b27);
        win.add(b28);

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
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        

        win.setVisible(true);



        
    }

    public void actionPerformed(ActionEvent e){
        

    }

    public static void main(String[] args) {
        alpha ob = new alpha();
    }
    
}
