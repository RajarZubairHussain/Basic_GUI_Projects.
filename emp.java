import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class emp implements ActionListener {

    Frame win = new Frame();
    Label l1 = new Label("Enter Employee Basic Pay");
    Label l2 = new Label("House Rent 45%");
    Label l3 = new Label("Medical Allaonce 15%");
    Label l4 = new Label("Bonus 5%");
    Label l5 = new Label("GrassPay");
    Label l6 = new Label("Income Tax 5%");
    Label l7 = new Label("Convance Allaonce 8%");
    Label l8 = new Label("Zakawat 2.5%");
    Label l9 = new Label("Net Income");
    
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();
    TextField t5 = new TextField();
    TextField t6 = new TextField();
    TextField t7 = new TextField();
    TextField t8 = new TextField();
    TextField t9 = new TextField();

    Button b1 = new Button("Calculate");
    Button b2 = new Button("Clear");
    Button b3 = new Button("About Me");
    Button b4 = new Button("Exit");

    Font f = new Font("arial",Font.BOLD,25);
    Font fo = new Font("arial",Font.BOLD,14);

    Label heading = new Label("Calculate Employee Salary ");

    emp(){
        win.setBounds(400,0,500,800);
        heading.setBounds(100,50,400,30);
        heading.setFont(f);

        win.setLayout(null);

        win.setBackground(Color.DARK_GRAY.brighter());

        b1.setFont(fo);
        b2.setFont(fo);
        b3.setFont(fo);
        b4.setFont(fo);

        l1.setFont(fo);
        l2.setFont(fo);
        l3.setFont(fo);
        l4.setFont(fo);
        l5.setFont(fo);
        l6.setFont(fo);
        l7.setFont(fo);
        l8.setFont(fo);
        l9.setFont(fo);

      

        l1.setBounds(100,100,200,25);
        t1.setBounds(300,100,100,25);

        b1.setBounds(100,150,100,25);

        

        l2.setBounds(100,200,200,25);
        t2.setBounds(300,200,100,25);

        l3.setBounds(100,250,200,25);
        t3.setBounds(300,250,100,25);

        l4.setBounds(100,300,200,25);
        t4.setBounds(300,300,100,25);

        l5.setBounds(100,350,200,25);
        t5.setBounds(300, 350, 100, 25);

        l6.setBounds(100,400,200,25);
        t6.setBounds(300,400,100,25);

        l7.setBounds(100,450,200,25);
        t7.setBounds(300,450,100,25);

        l8.setBounds(100,500,200,25);
        t8.setBounds(300,500,100,25);

        

        l9.setBounds(100,550,200,25);
        t9.setBounds(300,550,100,25);

        b2.setBounds(100,600,100,25);
        b3.setBounds(200,600,100,25);
        b4.setBounds(300,600,100,25);

        
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        t5.setEditable(false);
        t6.setEditable(false);
        t7.setEditable(false);
        t8.setEditable(false);
        t9.setEditable(false);

        win.add(heading);

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
        

        win.add(b1);
        win.add(b2);
        win.add(b3);
        win.add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        win.setVisible(true);


    }

    public void actionPerformed(ActionEvent e){
        String s1 = t1.getText();

        int a = Integer.parseInt(s1);

        int hr = a/100*45;
        int ma = a/100*15;
        int bo = a/100*5;
        int gp = a+hr+bo+ma;
        int it = gp/100*5;
        int ca = gp/100*8;
        int za = gp/100*3;

        int tax = it+ca+za;
        int ni = gp-tax;

        if (e.getSource()==b1) {
            t2.setText(""+hr);
            t3.setText(""+ma);
            t4.setText(""+bo);
            t5.setText(""+gp);
            t6.setText(""+it);
            t7.setText(""+ca);
            t8.setText(""+za);
            t9.setText(""+ni);
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
            JOptionPane.showMessageDialog(win," Developer : Zain ALi Rajar");
            
        }
        if (e.getSource()==b4) {
            System.exit(0);
        }

    }
    public static void main(String[] args) {
        emp ob = new emp();
    }


    
}