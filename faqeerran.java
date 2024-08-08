import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.JOptionPane;

public class faqeerran implements ActionListener {
    Frame win = new Frame();
    Label heading = new Label("Zakir Sain");
    Label l1 = new Label("Enter Your Name");
    Label l2 = new Label("Enter Your Age");
    Font f = new Font("arial",Font.BOLD,30);
    Font fo = new Font("arial",Font.BOLD,15);

    Button b1 = new Button("Predict");
    Button b2 = new  Button("Clear");
    Button b3 = new  Button("About me");
    Button b4 = new  Button("Exit");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();

    faqeerran(){
        win.setBounds(300,0,700,500);
        win.setLayout(null);

        heading.setBounds(200,50,300,30);

        l1.setBounds(100,100,200,25);
        t1.setBounds(300,100,100,25);

        l2.setBounds(100,150,200,25);
        t2.setBounds(300,150,100,25);

        b1.setBounds(100,200,100,25);

        t3.setBounds(100,250,500,25);
        b2.setBounds(100,300,100,25);
        b3.setBounds(230,300,100,25);
        b4.setBounds(360,300,100,25);

        l1.setFont(fo);
        l2.setFont(fo);
        t1.setFont(fo);
        t2.setFont(fo);
        t3.setFont(fo);
        b1.setFont(fo);
        b2.setFont(fo);
        b3.setFont(fo);
        b4.setFont(fo);

        win.add(l1);
        win.add(l2);

        win.add(heading);
        heading.setFont(f);

        win.add(t1);
        win.add(t2);
        win.add(t3);
        
        win.add(b1);
        win.add(b2);
        win.add(b3);
        win.add(b4);

        t3.setEditable(false);

        win.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);


      

    }

    public void actionPerformed(ActionEvent e){
        String s1 = t2.getText();
        String s2 = t1.getText();
        int a = Integer.parseInt(s1);
        Random ra = new Random();
        int b = ra.nextInt(5);

        if (e.getSource()==b1) {
            if (a>=10 && a<=20) {
                
                if (b==1) {
                    t3.setText(s2+" You Will get a Good Grade in Current class");
                }
                
                if (b==2) {
                    t3.setText(s2+" You have to worry about your studies");
                }
                if (b==3) {
                    t3.setText(s2+" you will win tomorrows match");
                }
                if (b==4) {
                    t3.setText(s2+" you will get a new phone ");
                }
                
                
            }
            if (a>20 && a<=35) {
                if (b==1) {
                    t3.setText(s2+" You're likely to experience significant strides in your career path, such as a promotion");
                }
                if (b==2) {
                    t3.setText(s2+" You'll continue to explore and refine your personal interests and passions, ");
                }
                if (b==3) {
                    t3.setText(s2+"  Whether it's forming new relationships or strengthening existing ones,");
                }
                if (b==4) {
                    t3.setText(s2+" As you establish yourself further in your chosen field and gain more experience");
                }
            }
            if (a>35 && a<46) {

                if (b==1) {
                    t3.setText(s2+" Your family life could see significant developments, such as starting a family if you haven't already");
                }
                if (b==2) {
                    t3.setText(s2+" This period often prompts increased attention to health and wellness.");
                }
                if (b==3) {
                    t3.setText(s2+"  With more responsibilities and potentially a growing family, you may prioritize financial stability.");
                }
                if (b==4) {
                    t3.setText(s2+"  You may embark on exciting travel experiences");
                }
               
            }
            if (a>45 && a<=60) {
                if (b==1) {
                    t3.setText(s2+"  You might explore new career paths, consider early retirement");
                }
                if (b==2) {
                    t3.setText(s2+" With children growing up and potentially leaving home");
                }
                if (b==3) {
                    t3.setText(s2+" Prioritizing health becomes increasingly important during this stage of life");
                }
                if (b==4) {
                    t3.setText(s2+" With more time and resources at your disposal, you may indulge in travel adventures");
                }
                
            }
            if (a>60) {
                t3.setText(s2+" You will die tomorrow");
            }
        }
        if (e.getSource()==b2) {
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
        }
        if (e.getSource()==b3) {
            JOptionPane.showMessageDialog(win, "Developer : Zain Ali Rajar");
        }
        if (e.getSource()==b4) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        faqeerran ob = new faqeerran();
    }
}
