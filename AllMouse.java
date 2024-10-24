import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class screen implements MouseListener,MouseMotionListener
{
    public JFrame frame;
    public JLabel l1;
    public boolean toggle;
    public screen()
    {
        toggle = true;
    }

    public void displayScreen()
    {
        frame = new JFrame("Mouse Events");
        frame.setSize(500,300);
        frame.setLayout(null);
        frame.setVisible(true);
        // frame.addWindowListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Mouse event name : ");
        l1.setBounds(10,50,400,100);

        frame.add(l1);

        frame.addMouseMotionListener(this);
        frame.addMouseListener(this);
    }
    public void mouseReleased(MouseEvent eobj)
    {
        l1.setText("Mouse event name : mouseReleased");
    }
    public void mouseEntered(MouseEvent eobj)
    {
        l1.setText("Mouse event name : mouseEntered");
    }
    public void mouseExited(MouseEvent eobj)
    {
        l1.setText("Mouse event name : mouseExited");
    }
    public void mousePressed(MouseEvent eobj)
    {
        l1.setText("Mouse event name : mousePressed");

    }
    public void mouseClicked(MouseEvent eobj)
    {
        l1.setText("Mouse event name : mouseClicked");
    }
    public void mouseMoved(MouseEvent eobj)
    {
        // l1.setText("Mouse event name : mouseMoved");

        if(toggle)
        {
            frame.getContentPane().setBackground(Color.WHITE);
            toggle = false;
        }
        else
        {
            frame.getContentPane().setBackground(Color.RED);
            toggle = true;
        }
    }
    public void mouseDragged(MouseEvent eobj)
    {
        l1.setText("Mouse event name : mouseDragged");
    }
}

class AllMouse
{
    public static void main(String arg[])
    {
        screen s = new screen();
        s.displayScreen();
    }
}