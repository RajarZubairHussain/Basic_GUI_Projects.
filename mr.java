import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class mr  implements ActionListener{

    int total = 500;
    


    Frame fr = new Frame();

    Label l1 = new Label("ENTER JAVA MARKS");
    Label l2 = new Label("ENTER C++ MARKS");
    Label l3 = new Label("ENTER C# MARKS");
    Label l4 = new Label("ENTER VB MARKS");
    Label l5 = new Label("ENTER PYTHON MARKS");

    Button b1 = new Button("CALCULATE"); 
    Button b2 = new Button("Clear"); 
    Button b3 = new Button("About me"); 
    Button b4 = new Button("Exit"); 

    Label l6 = new Label("Obtain");
    Label l7 = new Label("Total");
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


    mr(){
        fr.setBounds(0,0,500,800);
        Font f = new Font("arial",Font.BOLD,12);
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

        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        
        

        l1.setBounds(100,80,130,25);
        t1.setBounds(260,80,100,25);

        l2.setBounds(100,130,130,25);
        t2.setBounds(260,130,100,25);

        l3.setBounds(100,180,130,25);
        t3.setBounds(260,180,100,25);

        l4.setBounds(100,230,130,25);
        t4.setBounds(260,230,100,25);

        l5.setBounds(100,280,150,25);
        t5.setBounds(260,280,100,25);

        b1.setBounds(100,350,100,25);


        l6.setBounds(100,400,130,25);
        t6.setBounds(260,400,100,25);

        l7.setBounds(100,450,130,25);
        t7.setBounds(260,450,100,25);

        l8.setBounds(100,500,130,25);
        t8.setBounds(260,500,100,25);

        l9.setBounds(100,550,130,25);
        t9.setBounds(260,550,100,25);

        b2.setBounds(100,600,100,25);
        b3.setBounds(200,600,100,25);
        b4.setBounds(300,600,100,25);

        fr.setLayout(null); 

        fr.setBackground(Color.LIGHT_GRAY.brighter());

        t6.setEditable(false);
        t7.setEditable(false);
        t8.setEditable(false);
        t9.setEditable(false);

        fr.add(l1);
        fr.add(l2);
        fr.add(l3);
        fr.add(l4);
        fr.add(l5);
        fr.add(l6);
        fr.add(l7);
        fr.add(l8);
        fr.add(l9);

        fr.add(t1);
        fr.add(t2);
        fr.add(t3);
        fr.add(t4);
        fr.add(t5);
        fr.add(t6);
        fr.add(t7);
        fr.add(t8);
        fr.add(t9);

        fr.add(b1);
        fr.add(b2);
        fr.add(b3);
        fr.add(b4);

        fr.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent e){

        

        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3 = t3.getText();
        String s4 = t4.getText();
        String s5 = t5.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int d = Integer.parseInt(s4);
        int f = Integer.parseInt(s5);

        int obtain = a+b+c+d+f;
        int total = 500;
        int per = obtain*100/total;
        
        
        if (e.getSource()==b1) {
            t6.setText(""+(obtain));
            t7.setText(""+total);
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
            JOptionPane.showMessageDialog(fr,"My Name is Zain ");
        }
        if (e.getSource()==b4) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        mr ob = new mr();
    }
}
