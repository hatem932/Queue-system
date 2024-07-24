package advanceProject;

import static advanceProject.MainFarme.queue1;
import static advanceProject.MainFarme.queue2;
import static advanceProject.MainFarme.queue3;
import static advanceProject.MainFarme.queue4;
import static advanceProject.MainFarme.queue5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class counter extends JFrame implements ActionListener {
    //this.counter("الواجهة الرئيسية");

    JButton BService1, BService2, BService3, BService4, BService5;
    JLabel Service1, Service2, Service3, Service4, Service5;
    

    public counter() {

        BService1 = new JButton("تسليم بريد شباك 15");
        BService2 = new JButton("تسليم بريد شباك 16");
        BService3 = new JButton("شباك طرود و طوابع");
        BService4 = new JButton("شباك عام");
        BService5 = new JButton("عملات اجنبية وتحويل اموال دولي");

        Service1 = new JLabel(" " );
        Service2 = new JLabel(" " );
        Service3 = new JLabel(" " );
        Service4 = new JLabel(" " );
        Service5 = new JLabel(" " );

        this.setTitle(" الموظف");
       
        this.setBounds(0, 500, 1200, 200);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(true);
        setLayout(null);

        Service1.setBounds(30, 10, 50, 50);
        BService1.setBounds(20, 80, 200, 30);
        Service2.setBounds(350, 10, 50, 50);
        BService2.setBounds(250, 80, 200, 30);
        Service3.setBounds(550, 10, 50, 50);
        BService3.setBounds(480, 80, 200, 30);
        Service4.setBounds(770, 10, 50, 50);
        BService4.setBounds(710, 80, 200, 30);
        Service5.setBounds(990, 10, 50, 50);
        BService5.setBounds(940, 80, 200, 30);

        this.add(Service1);
        this.add(BService1);
        this.add(Service2);
        this.add(BService2);
        this.add(Service3);
        this.add(BService3);
        this.add(Service4);
        this.add(BService4);
        this.add(Service5);
        this.add(BService5);
        BService1.addActionListener(this);
        BService2.addActionListener(this);
        BService3.addActionListener(this);
        BService4.addActionListener(this);
        BService5.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String messeg="لا يوجد المزيد من الادوار";
     
        if (e.getSource() == BService1) {

                if (queue1.isEmpty()) {
                    JOptionPane.showMessageDialog(null, messeg);
                } else {
                    String q1 = queue1.dequeue();
                    Service1.setText(q1);
                    MainFarme.l6.setText(q1);

                }
            }
            if (e.getSource() == BService2) {

                if (queue2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, messeg);
                } else {
                    String q1 = queue2.dequeue();
                    Service2.setText(q1);
                    MainFarme.l7.setText(q1);

                }
            }
            if (e.getSource() == BService3) {

                if (queue3.isEmpty()) {
                    JOptionPane.showMessageDialog(null, messeg);
                } else {
                    String q1 = queue3.dequeue();
                    Service3.setText(q1);
                    MainFarme.l8.setText(q1);

                }
            }
            if (e.getSource() == BService4) {

                if (queue4.isEmpty()) {
                    JOptionPane.showMessageDialog(null, messeg);
                } else {
                    String q1 = queue4.dequeue();
                    Service4.setText(q1);
                    MainFarme.l9.setText(q1);

                }
            }
            if (e.getSource() == BService5) {

                if (queue5.isEmpty()) {
                    JOptionPane.showMessageDialog(null, messeg);
                } else {
                    String q1 = queue5.dequeue();
                    Service5.setText(q1);
                    MainFarme.l10.setText(q1);

                }
            }
        }
        
    }

