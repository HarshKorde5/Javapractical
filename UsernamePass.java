import java.util.*;
import java.awt.*;
import java.awt.event.*;

class usernamePassUnmatchedException extends Exception
{
    
}

class loginWindow
{
    public Frame frame;
    public Label userName,password,resultLabel,attemptsLabel;
    public TextField userNameField,passwordField;
    public Button login,clear;
    public int attempt;

    public loginWindow()
    {
        this.attempt = 3;
    }

    public void createWindow()
    {
        frame = new Frame("Login");

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        userName = new Label("Enter username : ");
        password = new Label("Enter password : ");

        userName.setBounds(100,100,130,50);
        password.setBounds(100,200,130,50);

        userNameField = new TextField();
        passwordField = new TextField();

        userNameField.setBounds(250,100,130,40);
        passwordField.setBounds(250,200,130,40);

        login = new Button("Login");
        clear = new Button("Clear");

        login.setBounds(100,300,100,50);
        clear.setBounds(300,300,100,50);

        resultLabel = new Label("");
        resultLabel.setBounds(50,400,300,50);

        attemptsLabel = new Label("Attempts remaining : 3");
        attemptsLabel.setBounds(150,370,200,20);

        frame.add(userName);
        frame.add(password);
        frame.add(userNameField);
        frame.add(passwordField);
        frame.add(login);
        frame.add(clear);
        frame.add(resultLabel);
        frame.add(attemptsLabel);

        loginListener listener = new loginListener(this);

        frame.addWindowListener(listener);
        login.addActionListener(listener);
        clear.addActionListener(listener);

    }

}

class loginListener extends WindowAdapter implements ActionListener
{
    public loginWindow loginWindowobj;

    public loginListener(loginWindow l)
    {
        this.loginWindowobj = l;
    }
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==loginWindowobj.clear)
        {
            loginWindowobj.userNameField.setText("");
            loginWindowobj.passwordField.setText("");
            loginWindowobj.resultLabel.setText("");
        }

        if(e.getSource()==loginWindowobj.login)
        {

            if(loginWindowobj.attempt > 0)
            {
                String id = loginWindowobj.userNameField.getText();
                String pass = loginWindowobj.passwordField.getText();

                try
                {
                    if(id.equals(pass))
                    {
                        loginWindowobj.resultLabel.setText("Username and Password matched");
                        
                    }
                    else
                    {
                        loginWindowobj.attempt--;
                        loginWindowobj.resultLabel.setText("Username and Password not matched");
                        throw new usernamePassUnmatchedException();
                    }
                }
                catch(usernamePassUnmatchedException eobj)
                {
                    System.out.println("UserName and Password not matched");
                }
                loginWindowobj.attemptsLabel.setText("Attempts remaining : "+loginWindowobj.attempt);

            }
            else
            {
                System.out.println("Attempts exceeded");
                System.exit(0);
            }
        }
    }

}

class UsernamePass
{
    public static void main(String arg[])
    {
        loginWindow window = new loginWindow();
        window.createWindow();
    }
}