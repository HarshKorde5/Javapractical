import javax.swing.*;
import java.awt.event.*;

class myWindow implements ActionListener
{
    public JFrame frame;
    public JTextField t1,t2,t3;
    public JButton b1,b2,b3;   
    public JLabel l1,l2,l3;

    public void displayWindow()
    {
        frame = new JFrame("Strings");
        frame.setSize(600,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Enter First string : ");
        l2 = new JLabel("Enter Second string : ");
        l3 = new JLabel("Result string : ");

        t1 = new JTextField(50);
        t2 = new JTextField(50);
        t3 = new JTextField(50);

        b1 = new JButton("Concat");
        b2 = new JButton("Reverse");
        b3 = new JButton("Clear");


        l1.setBounds(20,50,200,50);
        l2.setBounds(20,110,200,50);
        l3.setBounds(20,170,200,50);

        t1.setBounds(250,50,200,50);
        t2.setBounds(250,110,200,50);
        t3.setBounds(250,170,200,50);

        b1.setBounds(100,250,150,50);
        b2.setBounds(300,250,150,50);
        b3.setBounds(500,250,100,50);


        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();

        if(command.equals("Concat"))
        {
            t3.setText(t1.getText().concat(t2.getText()));
        }
        else if(command.equals("Reverse"))
        {
            String s = t1.getText();
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.reverse();

            
            t3.setText(sb.toString());
        }
        else if(command.equals("Clear"))
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
}


class ConcatString
{
    public static void main(String arg[])
    {
        myWindow m = new myWindow();
        m.displayWindow();
    }
}