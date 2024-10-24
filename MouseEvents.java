import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class screen implements MouseListener,MouseMotionListener
{
    public JFrame frame;
    public JTextField position;
    public boolean toggle;
    public screen()
    {
        toggle = true;
    }

    public void displayScreen()
    {
        frame = new JFrame("Mouse Events");
        frame.setSize(500,300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        // frame.addWindowListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        position = new JTextField("Position of Mouse click : ",50);
        //position.setBounds(200,200,200,50);

        frame.add(position);

        frame.addMouseMotionListener(this);
        frame.addMouseListener(this);
    }
    public void mouseReleased(MouseEvent eobj){}
    public void mouseEntered(MouseEvent eobj){}
    public void mouseExited(MouseEvent eobj){}
    public void mousePressed(MouseEvent eobj)
    {
        position.setText("Position of Mouse click : "+eobj.getX()+","+eobj.getY());
    }
    public void mouseClicked(MouseEvent eobj){}
    public void mouseMoved(MouseEvent eobj)
    {
        if(toggle)
        {
            frame.getContentPane().setBackground(Color.BLUE);
            toggle = false;
        }
        else
        {
            frame.getContentPane().setBackground(Color.RED);
            toggle = true;
        }
    }
    public void mouseDragged(MouseEvent eobj){}


}


class MouseEvents
{
    public static void main(String arg[])
    {
        screen s = new screen();
        s.displayScreen();
    }
}