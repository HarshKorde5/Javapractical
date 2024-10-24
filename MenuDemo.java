import javax.swing.*;
import java.awt.*;

class myWindow 
{
    public JMenuBar menuBar;
    public JFrame frame;
    public JMenu file,edit,about;
    public JMenuItem i1,i2,i3,i4,i5;

    public void displayWindow()
    {
        frame = new JFrame("Java AWT Examples");
        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        about = new JMenu("About");
        i1 = new JMenuItem("New      Ctrl+N");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Show About");
        i5 = new JMenuItem("Exit");

        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.addSeparator();
        file.add(i4);
        file.addSeparator();
        file.add(i5);

        menuBar = new JMenuBar();

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(about);

        frame.setJMenuBar(menuBar);
    }
}

class MenuDemo
{
    public static void main(String arg[])
    {
        myWindow m = new myWindow();
        m.displayWindow();
    }
}