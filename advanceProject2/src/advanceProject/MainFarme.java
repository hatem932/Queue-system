package advanceProject;

import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainFarme extends JFrame implements ActionListener {

    public static Queue1 queue1 = new Queue1();
    public static Queue1 queue2 = new Queue1();
    public static Queue1 queue3 = new Queue1();
    public static Queue1 queue4 = new Queue1();
    public static Queue1 queue5 = new Queue1();

    public static int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
    public static JButton language1, language2, language3;//button to change languge
    JButton Service1, Service2, Service3, Service4, Service5;//button to choose the service whitout SMS
    JButton SMSService1, SMSService2, SMSService3, SMSService4, SMSService5;//button to choose the service whit SMS
    public static JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;

    public static MainFarme mainFarme;

    static String messeg = "دورك هو :";
    static String messeg1 = "رقم هاتفك هو";
    String ch;

    public void phoneF(int count, String messeg, String messeg1, String s, Queue1 q) {
        JFrame jf = new JFrame("A simple paint program");
        Phone f = new Phone();

        f.count = count;
        f.ch = s;
        f.messeg = messeg;
        f.messeg1 = messeg1;
        f.q = q;
        jf.add(f);
        jf.setVisible(true);
        jf.setSize(300, 300);

    }

    public MainFarme() {
        this.setTitle("الواجهة الرئيسية");
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);

        language1 = new JButton("عربي");
        language2 = new JButton("עברית");
        language3 = new JButton("English");

        this.add(language1);
        language1.setVisible(false);
        this.add(language2);
        this.add(language3);

        language1.addActionListener(this);
        language2.addActionListener(this);
        language3.addActionListener(this);

        setLayout(null);

        l1 = new JLabel("الدور وصل ل:");
        l2 = new JLabel("الدور وصل ل:");
        l3 = new JLabel("الدور وصل ل:");
        l4 = new JLabel("الدور وصل ل:");
        l5 = new JLabel("الدور وصل ل:");

        l6 = new JLabel("" + count1);
        l7 = new JLabel("" + count2);
        l8 = new JLabel("" + count3);
        l9 = new JLabel("" + count4);
        l10 = new JLabel("" + count5);

        Service1 = new JButton("تسليم بريد شباك 15 (بدون SMS)");
        Service2 = new JButton(" تسليم بريد شباك 16 (بدونSMS) ");
        Service3 = new JButton("شباك طرود و طوابع  (بدون SMS) ");
        Service4 = new JButton(" شباك عام (بدونSMS) ");
        Service5 = new JButton("عملات و تحويل اموال دولي ");

        SMSService1 = new JButton("SMS");
        SMSService2 = new JButton("SMS");
        SMSService3 = new JButton("SMS");
        SMSService4 = new JButton("SMS");
        SMSService5 = new JButton("SMS");

        Service1.addActionListener(this);
        Service2.addActionListener(this);
        Service3.addActionListener(this);
        Service4.addActionListener(this);
        Service5.addActionListener(this);

        SMSService1.addActionListener(this);
        SMSService2.addActionListener(this);
        SMSService3.addActionListener(this);
        SMSService4.addActionListener(this);
        SMSService5.addActionListener(this);

        // phone.Done.addActionListener(this);
        language1.setBounds(50, 10, 100, 40);
        language2.setBounds(160, 10, 100, 40);
        language3.setBounds(270, 10, 100, 40);

        Service1.setBounds(30, 90, 200, 40);
        Service2.setBounds(30, 150, 200, 40);
        Service3.setBounds(30, 210, 200, 40);
        Service4.setBounds(30, 270, 200, 40);
        Service5.setBounds(30, 330, 200, 40);

        SMSService1.setBounds(235, 90, 60, 40);
        SMSService2.setBounds(235, 150, 60, 40);
        SMSService3.setBounds(235, 210, 60, 40);
        SMSService4.setBounds(235, 270, 60, 40);
        SMSService5.setBounds(235, 330, 60, 40);

        l1.setBounds(350, 90, 90, 40);
        l2.setBounds(350, 150, 90, 40);
        l3.setBounds(350, 210, 90, 40);
        l4.setBounds(350, 270, 90, 40);
        l5.setBounds(350, 330, 90, 40);

        l6.setBounds(325, 90, 90, 40);
        l7.setBounds(325, 150, 90, 40);
        l8.setBounds(325, 210, 90, 40);
        l9.setBounds(325, 270, 90, 40);
        l10.setBounds(325, 330, 90, 40);

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);

        this.add(l6);
        this.add(l7);
        this.add(l8);
        this.add(l9);
        this.add(l10);

        this.add(Service1);
        this.add(Service2);
        this.add(Service3);
        this.add(Service4);
        this.add(Service5);

        this.add(SMSService1);
        this.add(SMSService2);
        this.add(SMSService3);
        this.add(SMSService4);
        this.add(SMSService5);

    }
    // public Phone phone = new Phone();

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == language1) {
            language1.setVisible(false);
            language2.setVisible(true);
            language3.setVisible(true);
            this.setTitle("الواجهة الرئيسية");
            messeg = "دورك هو :";
            messeg1 = "رقم هاتفك هو";

            SMSService1.setText("SMS");
            SMSService2.setText("SMS");
            SMSService3.setText("SMS");
            SMSService4.setText("SMS");
            SMSService5.setText("SMS");

            Service1.setText("تسليم بريد شباك 15 (بدون SMS)");
            Service2.setText(" تسليم بريد شباك 16 (بدونSMS) ");
            Service3.setText("شباك طرود و طوابع  (بدون SMS) ");
            Service4.setText(" شباك عام (بدونSMS) ");
            Service5.setText("عملات اجنبية و تحويل اموال دولي ");
            l1.setText("الدور وصل ل:");
            l2.setText("الدور وصل ل:");
            l3.setText("الدور وصل ل:");
            l4.setText("الدور وصل ل:");
            l5.setText("الدور وصل ل:");
            Service1.setBounds(30, 90, 200, 40);
            Service2.setBounds(30, 150, 200, 40);
            Service3.setBounds(30, 210, 200, 40);
            Service4.setBounds(30, 270, 200, 40);
            Service5.setBounds(30, 330, 200, 40);

            SMSService1.setBounds(235, 90, 80, 40);
            SMSService2.setBounds(235, 150, 80, 40);
            SMSService3.setBounds(235, 210, 80, 40);
            SMSService4.setBounds(235, 270, 80, 40);
            SMSService5.setBounds(235, 330, 80, 40);

            l1.setBounds(350, 90, 90, 40);
            l2.setBounds(350, 150, 90, 40);
            l3.setBounds(350, 210, 90, 40);
            l4.setBounds(350, 270, 90, 40);
            l5.setBounds(350, 330, 90, 40);

            l6.setBounds(325, 90, 90, 40);
            l7.setBounds(325, 150, 90, 40);
            l8.setBounds(325, 210, 90, 40);
            l9.setBounds(325, 270, 90, 40);
            l10.setBounds(325, 330, 90, 40);
        }

        if (ae.getSource() == language2) {
            language1.setVisible(true);
            language2.setVisible(false);
            language3.setVisible(true);

            this.setTitle("רשמי");
            messeg = ": התורך";
            messeg1 = "מספר ניידך :";
            SMSService1.setText("SMS עם");
            SMSService2.setText("SMS עם");
            SMSService3.setText("SMS עם");
            SMSService4.setText("SMS עם");
            SMSService5.setText("SMS עם");

            Service1.setText("SMS  אשנב כל 15 בלי");
            Service2.setText("SMS אשנב כל 16 בלי");
            Service3.setText("SMS משלוח דבי דואר בלי");
            Service4.setText("SMS מסירת דןאר ללקןח בלי ");
            Service5.setText("SMS מטבע חוץ בלי ");

            l1.setText("התור הגיע לי");
            l2.setText("התור הגיע לי");
            l3.setText("התור הגיע לי");
            l4.setText("התור הגיע לי");
            l5.setText("התור הגיע לי");

            Service1.setBounds(30, 90, 200, 40);
            Service2.setBounds(30, 150, 200, 40);
            Service3.setBounds(30, 210, 200, 40);
            Service4.setBounds(30, 270, 200, 40);
            Service5.setBounds(30, 330, 200, 40);

            SMSService1.setBounds(235, 90, 80, 40);
            SMSService2.setBounds(235, 150, 80, 40);
            SMSService3.setBounds(235, 210, 80, 40);
            SMSService4.setBounds(235, 270, 80, 40);
            SMSService5.setBounds(235, 330, 80, 40);

            l1.setBounds(350, 90, 90, 40);
            l2.setBounds(350, 150, 90, 40);
            l3.setBounds(350, 210, 90, 40);
            l4.setBounds(350, 270, 90, 40);
            l5.setBounds(350, 330, 90, 40);

            l6.setBounds(325, 90, 90, 40);
            l7.setBounds(325, 150, 90, 40);
            l8.setBounds(325, 210, 90, 40);
            l9.setBounds(325, 270, 90, 40);
            l10.setBounds(325, 330, 90, 40);

        }

        if (ae.getSource() == language3) {
            language1.setVisible(true);
            language2.setVisible(true);
            language3.setVisible(false);
            messeg = "you nummber is :";
            messeg1 = "your phone is";

            this.setTitle("Main Frame");
            SMSService1.setText("SMS");
            SMSService2.setText("SMS");
            SMSService3.setText("SMS");
            SMSService4.setText("SMS");
            SMSService5.setText("SMS");

            Service1.setText("Delivery Mail Window 15 Without SMS");
            Service2.setText("Delivery Mail Window 16 Without SMS");
            Service3.setText("Window Stamps and Parcels Without SMS");
            Service4.setText("General Window without SMS");
            Service5.setText("Foreign currency without SMS");

            l1.setText("Role arrived for");
            l2.setText("Role arrived for");
            l3.setText("Role arrived for");
            l4.setText("Role arrived for");
            l5.setText("Role arrived for");

            Service1.setBounds(10, 90, 250, 40);
            Service2.setBounds(10, 150, 250, 40);
            Service3.setBounds(10, 210, 250, 40);
            Service4.setBounds(10, 270, 250, 40);
            Service5.setBounds(10, 330, 250, 40);

            SMSService1.setBounds(270, 90, 90, 40);
            SMSService2.setBounds(270, 150, 90, 40);
            SMSService3.setBounds(270, 210, 90, 40);
            SMSService4.setBounds(270, 270, 90, 40);
            SMSService5.setBounds(270, 330, 90, 40);

            l1.setBounds(370, 90, 90, 40);
            l2.setBounds(370, 150, 90, 40);
            l3.setBounds(370, 210, 90, 40);
            l4.setBounds(370, 270, 90, 40);
            l5.setBounds(370, 330, 90, 40);

            l6.setBounds(460, 90, 90, 40);
            l7.setBounds(460, 150, 90, 40);
            l8.setBounds(460, 210, 90, 40);
            l9.setBounds(460, 270, 90, 40);
            l10.setBounds(460, 330, 90, 40);
        }
        if (ae.getSource() == Service1) {
            count1++;
            ch = "A";
            //String m1 = String.valueOf(count1);
            queue1.enqueue(count1 + ch);
            JOptionPane.showMessageDialog(null, messeg + count1 + ch);

        }
        if (ae.getSource() == SMSService1) {
            count1++;
            ch = "A";

            phoneF(count1, messeg, messeg1, ch, queue1);

        }
        if (ae.getSource() == Service2) {

            count2++;
            ch = "B";
            // String m2 = String.valueOf(count2);
            queue2.enqueue(count2 + ch);
            JOptionPane.showMessageDialog(null, messeg + count2 + ch);

        }
        if (ae.getSource() == SMSService2) {
            count2++;
            ch = "B";
            phoneF(count2, messeg, messeg1, ch, queue2);
        }

        if (ae.getSource() == Service3) {
            count3++;
            ch = "C";
            //String m3 = String.valueOf(count3);
            queue3.enqueue(count3 + ch);
            JOptionPane.showMessageDialog(null, messeg + count3 + ch);

        }
        if (ae.getSource() == SMSService3) {
            count3++;
            ch = "C";
            phoneF(count3, messeg, messeg1, ch, queue3);
        }
        if (ae.getSource() == Service4) {
            count4++;
            ch = "D";
            //String m4 = String.valueOf(count4);
            queue4.enqueue(count4 + ch);

            JOptionPane.showMessageDialog(null, messeg + count4 + ch);
        }
        if (ae.getSource() == SMSService4) {
            count4++;
            ch = "D";
            phoneF(count4, messeg, messeg1, ch, queue4);

        }
        if (ae.getSource() == Service5) {
            count5++;
            ch = "E";
            // String m5 = String.valueOf(count5);
            queue5.enqueue(count5 + ch);
            JOptionPane.showMessageDialog(null, messeg + count5 + ch);

        }
        if (ae.getSource() == SMSService5) {
            count5++;
            ch = "E";
            phoneF(count5, messeg, messeg1, ch, queue5);

        }
    }

}
