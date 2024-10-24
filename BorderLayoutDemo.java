import java.awt.*;

class myWindow
{
    public Frame frame;
    public Button N,S,E,W,C;

    public void displayWindow()
    {
        frame = new Frame("Border Layout Manager");
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        N = new Button("North");
        S = new Button("South");
        E = new Button("East");
        W = new Button("West");
        C = new Button("Center");

        frame.add(N,BorderLayout.NORTH);
        frame.add(S,BorderLayout.SOUTH);
        frame.add(E,BorderLayout.EAST);
        frame.add(W,BorderLayout.WEST);
        frame.add(C,BorderLayout.CENTER);

    }
}

class BorderLayoutDemo
{
    public static void main(String arg[])
    {
        myWindow m = new myWindow();
        m.displayWindow();

    }
}