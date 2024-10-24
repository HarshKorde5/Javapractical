import javax.swing.*;
import java.awt.event.*;

class myWindow implements ItemListener
{
    public JFrame frame;
    public JTextField t1;
    public JComboBox box;

    public void displayWindow() 
    {
        frame = new JFrame("Combo Box");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t1 = new JTextField(50);
        t1.setBounds(50,400,200,50);
        frame.add(t1);

        String subjects[] = {"Java","TCS","WT","FDS","CN","OS","Python"};

        box = new JComboBox(subjects);
        box.setBounds(50,100,200,50);
        frame.add(box);
        box.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource() == box)
        {
            t1.setText(""+box.getSelectedItem());
        }
    }


}

class ComboBoxDemo
{
    public static void main(String arg[])
    {
        myWindow m = new myWindow();
        m.displayWindow();

    }
}