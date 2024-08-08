import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class trolly implements ActionListener {
    Frame frame = new Frame();
    

    Font font = new Font("arial",Font.BOLD,18);
   
    Label heading = new Label(" TRANSPORT COMPANY");
    


    Label la1 = new Label("Enter Trollyload");
    Label la2 = new Label("Total Income");
    Label la3 = new Label("Driver");
    Label la4 = new Label("10% Tax");
    Label la5 = new Label("Diesel");
    Label la6 = new Label("Profit");

    TextField te1 = new TextField();
    TextField te2 = new TextField();
    TextField te3 = new TextField();
    TextField te4 = new TextField();
    TextField te5 = new TextField();
    TextField te6 = new TextField();

    Button b = new Button("CALCULATE");
    Button b1 = new Button("CLEAR");
    Button b2 = new Button("ABOUT ME");
    Button b3 = new Button("EXIT");



    trolly(){
        frame.setBounds(400,100,500,500);
        frame.setBackground(Color.CYAN.darker());
        frame.setLayout(null);


        heading.setBounds(130,50,250,30);
        heading.setFont(font);
       

        la1.setBounds(100,100,100,25);
        la2.setBounds(100,130,100,25);
        la3.setBounds(100,160,100,25);
        la4.setBounds(100,190,100,25);
        la5.setBounds(100,220,100,25);
        la6.setBounds(100,250,100,25);

        te1.setBounds(200,100,100,25);
        te2.setBounds(200,130,100,25);
        te3.setBounds(200,160,100,25);
        te4.setBounds(200,190,100,25);
        te5.setBounds(200,220,100,25);
        te6.setBounds(200,250,100,25);

        b.setBounds(320,100,100,25);
        b1.setBounds(100,300,80,25);
        b2.setBounds(200,300,80,25);
        b3.setBounds(300,300,80,25);


       

        te2.setEditable(false);
        te3.setEditable(false);
        te4.setEditable(false);
        te5.setEditable(false);
        te6.setEditable(false);
        

        frame.add(la1);
        frame.add(la2);
        frame.add(la3);
        frame.add(la4);
        frame.add(la5);
        frame.add(la6);

        frame.add(te1);
        frame.add(te2);
        frame.add(te3);
        frame.add(te4);
        frame.add(te5);
        frame.add(te6);

        frame.add(b);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.add(heading);

        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


        frame.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        String s1 = te1.getText();
        int a = Integer.parseInt(s1);

        int ti = a*1200;
        int dri = a*150;
        int tax = ti/100*10;
        int des = a*580;
        int ttax = dri+tax+des;
        int in = ti-ttax;
        if (e.getSource()==b) {
            te2.setText(""+ti);
            te3.setText(""+dri);
            te4.setText(""+tax);
            te5.setText(""+des);
            te6.setText(""+in);
        }
        if (e.getSource()==b1) {
            te1.setText(" ");
            te2.setText(" ");
            te3.setText(" ");
            te4.setText(" ");
            te5.setText(" ");
            te6.setText(" ");
        }
        if (e.getSource()==b2) {
            JOptionPane.showMessageDialog(frame, "Developer : Zayn Ali Rajar");
        }
        if (e.getSource()==b3) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        trolly ob = new trolly();
    }
    
}