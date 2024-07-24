package advanceProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

/**
 *
 * @hatem
 */
public class Phone extends JPanel implements ActionListener {

    JButton Number1, Number2, Number3, Number4, Number5, Number6, Number7, Number8, Number9, Number0;
    JButton Delete, Clear;
    JButton Done, Back;

    JTextField NumberShow;

    public int count;
    String ch;
    public String messeg;
    public String messeg1;
    public String messeg2 = "الرقم غير صالح";
    //public String num=NumberShow.getText();
    // public JLabel n;
    public Queue1 q;

    //n=new JLabel(" ");
    public Phone() {

        this.setSize(250, 250);
        this.setVisible(true);
        this.setLayout(null);
        //this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Container c = getContentPane();
        Icon Delet = new ImageIcon("C:\\Users\\MAS\\Desktop\\delete.png");
        Icon back = new ImageIcon("C:\\Users\\MAS\\Desktop\\back.png");
        Icon done = new ImageIcon("C:\\Users\\MAS\\Desktop\\done.png");

// D
        Delete = new JButton(Delet);
        Back = new JButton(back);
        Done = new JButton(done);

        NumberShow = new JTextField(10);
        NumberShow.setText("05");

        this.setLayout(null);

        Done.setBounds(180, 190, 60, 30);
        Back.setBounds(40, 190, 60, 30);
        NumberShow.setBounds(40, 30, 150, 31);
        Delete.setBounds(191, 30, 50, 30);

        this.add(Delete);
        this.add(NumberShow);
        this.add(Back);
        this.add(Done);

        Number1 = new JButton("1");
        Number2 = new JButton("2");
        Number3 = new JButton("3");
        Number4 = new JButton("4");
        Number5 = new JButton("5");
        Number6 = new JButton("6");
        Number7 = new JButton("7");
        Number8 = new JButton("8");
        Number9 = new JButton("9");
        Number0 = new JButton("0");

        Number1.setBounds(40, 70, 60, 30);
        Number2.setBounds(110, 70, 60, 30);
        Number3.setBounds(180, 70, 60, 30);
        Number4.setBounds(40, 110, 60, 30);
        Number5.setBounds(110, 110, 60, 30);
        Number6.setBounds(180, 110, 60, 30);
        Number7.setBounds(40, 150, 60, 30);
        Number8.setBounds(110, 150, 60, 30);
        Number9.setBounds(180, 150, 60, 30);
        Number0.setBounds(110, 190, 60, 30);

        this.add(Number1);
        this.add(Number2);
        this.add(Number3);
        this.add(Number4);
        this.add(Number5);
        this.add(Number6);
        this.add(Number7);
        this.add(Number8);
        this.add(Number9);
        this.add(Number0);

        Number1.addActionListener(this);
        Number2.addActionListener(this);
        Number3.addActionListener(this);
        Number4.addActionListener(this);
        Number5.addActionListener(this);
        Number6.addActionListener(this);
        Number7.addActionListener(this);
        Number8.addActionListener(this);
        Number9.addActionListener(this);
        Number0.addActionListener(this);

        //this.setLayout(new FlowLayout());
        Delete.addActionListener(this);
        //Clear.addActionListener(this);
        Done.addActionListener(this);
        Back.addActionListener(this);
    }
    //MainFarme m =new MainFarme();

    public void actionPerformed(ActionEvent e) {

        String num = NumberShow.getText();

        if (e.getSource() == Number1) {
            NumberShow.setText(NumberShow.getText().concat("1"));
        }

        if (e.getSource() == Number2) {
            NumberShow.setText(NumberShow.getText().concat("2"));
        }

        if (e.getSource() == Number3) {
            NumberShow.setText(NumberShow.getText().concat("3"));
        }

        if (e.getSource() == Number4) {
            NumberShow.setText(NumberShow.getText().concat("4"));
        }

        if (e.getSource() == Number5) {
            NumberShow.setText(NumberShow.getText().concat("5"));
        }

        if (e.getSource() == Number6) {
            NumberShow.setText(NumberShow.getText().concat("6"));
        }

        if (e.getSource() == Number7) {
            NumberShow.setText(NumberShow.getText().concat("7"));
        }

        if (e.getSource() == Number8) {
            NumberShow.setText(NumberShow.getText().concat("8"));
        }

        if (e.getSource() == Number9) {
            NumberShow.setText(NumberShow.getText().concat("9"));
        }

        if (e.getSource() == Number0) {
            NumberShow.setText(NumberShow.getText().concat("0"));
        }

        if (!MainFarme.language1.isVisible()) {
            messeg2 = "الرقم غير صالح";
        }
        if (!MainFarme.language2.isVisible()) {
            messeg2 = "המפר נייד לא נכון";
        }
        if (!MainFarme.language3.isVisible()) {
            messeg2 = "number is valid";
        }

        //the button action
        if (e.getSource() == Delete) {
            String s = NumberShow.getText();
            NumberShow.setText("");
            for (int i = 0; i < s.length() - 1; i++) {
                NumberShow.setText(NumberShow.getText() + s.charAt(i));
            }
        }
        if (e.getSource() == Back) {
            setVisible(false);
            NumberShow.setText("");
            RunProject.mainFream.setVisible(true);

        }
        if (e.getSource() == Done) {

            if (num.length() > 10) {
                JOptionPane.showMessageDialog(null, messeg2);
            } else if (num.length() < 10) {
                JOptionPane.showMessageDialog(null, messeg2);

            } else {
//m++;
                q.enqueue(count + ch);
                JOptionPane.showMessageDialog(null, messeg1 + NumberShow.getText() + messeg + count + ch);
                 setVisible(false);
            NumberShow.setText("");
            RunProject.mainFream.setVisible(true);
            }
           
        }

    }

}
