import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class myWindow implements ActionListener
{
    public char choice;
    public int no1,no2,result;
    public JFrame frame; 
    public JTextField inputField;
    public JPanel centerPanel,inputPanel;
    public JButton b[];
    public JButton equals,add,sub,mul,div,clear;

    public void displayWindow()
    {
        frame = new JFrame("Calculator");
        frame.setSize(550,700);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        frame.add(inputField,BorderLayout.NORTH);

        //frame.add(new GridLayout(4,4),BorderLayout.CENTER);

        inputField = new JTextField(30);
        inputPanel = new JPanel();
        inputPanel.add(inputField);

        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(4,4,10,10));
        b = new JButton[10];
        for(int i = 0;i < 10;i++)
        {
            b[i] = new JButton(""+i);
            b[i].addActionListener(this);
        }


        equals = new JButton("=");
        equals.addActionListener(this);
        add = new JButton("+");
        add.addActionListener(this);
        sub = new JButton("-");
        sub.addActionListener(this);
        mul = new JButton("*");
        mul.addActionListener(this);
        div = new JButton("/");
        div.addActionListener(this);
        clear = new JButton("C");
        clear.addActionListener(this);


        centerPanel.add(b[1]);
        centerPanel.add(b[2]);
        centerPanel.add(b[3]);
        centerPanel.add(add);

        centerPanel.add(b[4]);
        centerPanel.add(b[5]);
        centerPanel.add(b[6]);
        centerPanel.add(sub);

        centerPanel.add(b[7]);
        centerPanel.add(b[8]);
        centerPanel.add(b[9]);
        centerPanel.add(mul);

        centerPanel.add(b[0]);
        centerPanel.add(clear);
        centerPanel.add(equals);
        centerPanel.add(div);


        frame.add(inputPanel,BorderLayout.NORTH);
        frame.add(centerPanel);
    }   

    public void actionPerformed(ActionEvent eobj)
    {

        String command = eobj.getActionCommand();
        // System.out.println(command);

        char ch = command.charAt(0);


        if(Character.isDigit(ch))
        {
            inputField.setText(inputField.getText()+command);
        }
        else
        {
            if(command.equals("+"))
            {
                no1 = Integer.parseInt(inputField.getText());
                choice = '+';
                inputField.setText("");
            }
            else if(command.equals("-"))
            {
                no1 = Integer.parseInt(inputField.getText());
                choice = '-';
                inputField.setText("");

            }
            else if(command.equals("*"))
            {
                no1 = Integer.parseInt(inputField.getText());
                choice = '*';
                inputField.setText("");
            }
            else if(command.equals("/"))
            {
                no1 = Integer.parseInt(inputField.getText());
                choice = '/';
                inputField.setText("");
            }
            
            if(command.equals("="))
            {
                no2 = Integer.parseInt(inputField.getText());
                switch(choice)
                {
                    case '+':
                        result = no1 + no2;
                    break;

                    case '-':
                        result = no1 - no2;
                    break;

                    case '*':
                        result = no1 * no2;
                    break;

                    case '/':
                        result = no1 / no2;
                    break;
                }

                inputField.setText(""+result);
            }

            if(command.equals("C"))
            {
                inputField.setText("");
            }
        }
    }
}


class Calculator
{
    public static void main(String arg[])
    {
        myWindow m = new myWindow();
        m.displayWindow();
    }
}