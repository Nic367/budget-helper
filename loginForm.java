import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class main extends JFrame implements ActionListener{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 400;
    
    private JTextField usernameText, passwordText;
    private JButton loginButton, registerButton, resetButton;
    
    public static void main(String[] args){
        main t1 = new main();
        t1.setVisible(true);
    }
    
    public main(){
        setTitle("Budget Helper");
        setDefaultCloseOperation(EXIT_ON_CLOSE);    /*instead of WindowDestroyer*/
        setSize(WIDTH, HEIGHT);                     /*instead of "t1.pack();" in main*/
        
        Container contentPane = getContentPane();
        
        
        
        
        
        
        contentPane.add(settingsPanel);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("")){
        	//qsIoField.setText("That's an L, try again.");
        }
    }
}
