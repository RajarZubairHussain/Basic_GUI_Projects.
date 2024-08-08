import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class rancal implements ActionListener{
    Frame win = new Frame();
    Label heading = new Label("CALCULATOR");
    Label l1 = new Label("Enter 1st Value");
    Label l2 = new Label("Enter 2nd Value");
    Label l3 = new Label("Result");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    Button b1 = new Button("Calculate");
    Button b2 = new Button("Clear");
    Button b3 = new Button("About me");
    Button b4 = new Button("Exit");

    Font f = new Font("arial",Font.BOLD,15);
    Font fo = new Font("arial",Font.BOLD,20);

    rancal(){
        win.setBounds(400,0,500,500);
        win.setLayout(null);
        

        l1.setBounds(100,100,150,25);
        t1.setBounds(250,100,100,25);

        l2.setBounds(100,150,150,25);
        t2.setBounds(250,150,100,25);

        b1.setBounds(100,200,100,25);

        l3.setBounds(100,250,150,25);
        t3.setBounds(250,250,100,25);

        heading.setBounds(180,50,200,30);
        heading.setFont(fo);

        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);

        t1.setFont(f);
        t2.setFont(f);
        t3.setFont(f);
        

        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        

        

        t3.setEditable(false);

        win.add(heading);
        win.add(b1);

        win.add(l1);
        win.add(l2);
        win.add(l3);

        win.add(t1);
        win.add(t2);
        win.add(t3);
        

        win.add(b2);
        win.add(b3);
        win.add(b4);

        b1.addActionListener(this);
        win.setVisible(true);

        


    }
    public void actionPerformed(ActionEvent e){
        String s1 = t1.getText();
        String s2 = t2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        Random ob = new Random();
        if (s1.trim().equals("") || s2.trim().equals("")) 
            return;
        
        
        if (e.getSource()==b1) {
            int c = ob.nextInt(5);
            if (c==1) {
                t3.setText(""+(a*b));
            }
            if (c==2) {
                t3.setText(""+(a/b));
            }
            if (c==3) {
                t3.setText(""+(a-b));
            }
            if (c==4) {
                t3.setText(""+(a+b));
            }
        }
        
            
    }
    public static void main(String[] args) {
        rancal ob = new rancal();
    }

}
