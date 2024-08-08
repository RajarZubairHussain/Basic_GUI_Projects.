import java.util.*;

import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.*;

public class ranmark2 implements ActionListener {
    Frame win = new Frame();
    Label l1 = new Label("Enter Total Marks");
    Label heading = new Label("MARKSHEET");


    Button b1 = new Button("Result");
    Button b2 = new Button("Clear");
    Button b3 = new Button("About me");
    Button b4 = new Button("Exit");

    Label l2 = new Label("Java Marks");
    Label l3 = new Label("C++ Marks");
    Label l4 = new Label("C# Marks");
    Label l5 = new Label("DB Marks");
    Label l6 = new Label("Python Marks");

    Label l7 = new Label("Obtain Marks");
    Label l8 = new Label("Percentage");
    Label l9 = new Label("Grade");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();
    TextField t5 = new TextField();
    TextField t6 = new TextField();
    TextField t7 = new TextField();
    TextField t8 = new TextField();
    TextField t9 = new TextField();

    Font f = new Font("arial",Font.BOLD,15);
    Font n = new Font("arial",Font.BOLD,25);

    ranmark2(){
        win.setBounds(400,0,500,800);
        win.setLayout(null);

        heading.setBounds(180,30,200,30);

        l1.setBounds(100,80,130,25);
        t1.setBounds(260,80,100,25);

        b1.setBounds(100,130,130,25);
        b2.setBounds(100,600,80,25);
        b3.setBounds(200,600,80,25);
        b4.setBounds(300,600,80,25);
        b1.setBackground(Color.DARK_GRAY.brighter());

        

        l3.setBounds(100,180,130,25);
        t3.setBounds(260,180,100,25);

        l4.setBounds(100,230,130,25);
        t4.setBounds(260,230,100,25);

        l5.setBounds(100,280,130,25);
        t5.setBounds(260,280,100,25);

        l2.setBounds(100,340,130,25);
        t2.setBounds(260,340,100,25);

       


        l6.setBounds(100,400,130,25);
        t6.setBounds(260,400,100,25);

        l7.setBounds(100,450,130,25);
        t7.setBounds(260,450,100,25);

        l8.setBounds(100,500,130,25);
        t8.setBounds(260,500,100,25);

        l9.setBounds(100,550,130,25);
        t9.setBounds(260,550,100,25);

        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);

        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);
        l8.setFont(f);
        l9.setFont(f);


        t1.setFont(f);
        t2.setFont(f);
        t3.setFont(f);
        t4.setFont(f);
        t5.setFont(f);
        t6.setFont(f);
        t7.setFont(f);
        t8.setFont(f);
        t9.setFont(f);

        heading.setFont(n);

        

        win.add(l1);
        win.add(l2);
        win.add(l3);
        win.add(l4);
        win.add(l5);
        win.add(l6);
        win.add(l7);
        win.add(l8);
        win.add(l9);

        win.add(t1);
        win.add(t2);
        win.add(t3);
        win.add(t4);
        win.add(t5);
        win.add(t6);
        win.add(t7);
        win.add(t8);
        win.add(t9);

        win.add(heading);


        win.add(b1);
        win.add(b2);
        win.add(b3);
        win.add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);


        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        t5.setEditable(false);
        t6.setEditable(false);
        t7.setEditable(false);
        t8.setEditable(false);
        t9.setEditable(false);


        win.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        Random ob = new Random();
        String s1 = t1.getText();
        int a = Integer.parseInt(s1);
        int range = a/5;
        int b = ob.nextInt(range);
        int c = ob.nextInt(range);
        int d = ob.nextInt(range);
        int f = ob.nextInt(range);
        int g = ob.nextInt(range);

        int obta = b+c+d+f+g;
        double per = obta*100/a;
        
        if (e.getSource()==b1){
            t2.setText(""+b);
            t3.setText(""+c);
            t4.setText(""+d);
            t5.setText(""+f);
            t6.setText(""+g);
            t7.setText(""+obta);
            t8.setText(""+per);

            if (per>=90 ) {
                t9.setText("A+");
            }
            if (per>=80 && per<90) {
                t9.setText("A");
            }
            if (per>=70 && per<80) {
                t9.setText("B");
            }
            if (per>=60 && per<70) {
                t9.setText("C");
            }
            if (per>=50 && per<60) {
                t9.setText("D");
            }
            if (per>=40 && per<50) {
                t9.setText("E");
            }
            if ( per<40) {
                t9.setText("Fail");
            }



        }
         if (e.getSource()==b2) {
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
            t4.setText(" ");
            t5.setText(" ");
            t6.setText(" ");
            t7.setText(" ");
            t8.setText(" ");
            t9.setText(" ");
        }
        if (e.getSource()==b3) {
            JOptionPane.showMessageDialog(win,"My Name is Zain ");
        }
        if (e.getSource()==b4) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        ranmark2 ob = new ranmark2();
    }
}
