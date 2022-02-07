import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class main extends JFrame implements ActionListener{
    //javac *.java
    //java main.java
    
    public static final int WIDTH = 800;
    public static final int HEIGHT = 400;
    
    private JTextField hourlyIoField, hoursIoField, salaryIoField, debtIoField, debtPayIoField, qsIoField;  //TODO: remove last
    private JRadioButton aButton, bButton;  //TODO: rename these to their proper names
    private JCheckBox cButton;
    
    public static void main(String[] args){
        main t1 = new main();
        //t1.pack();
        t1.setVisible(true);
    }
    
    public main(){
        setTitle("Budget Helper");
        setDefaultCloseOperation(EXIT_ON_CLOSE);    /*instead of WindowDestroyer*/
        setSize(WIDTH, HEIGHT);                     /*instead of "t1.pack();" in main*/
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1,1));
        
//SETTINGS PAGE		
		JPanel settingsPanel = new JPanel();                /*filled row by row, and from left to right*/
        settingsPanel.setLayout(new GridLayout(2,3));		/*row, col*/
        //TEXT PANEL
		JPanel qsTextPanel = new JPanel();
		qsTextPanel.setLayout(new BorderLayout());
		qsIoField = new JTextField();				        /*defined private*/
		qsIoField.setBackground(Color.white);
        //ADD TO TEXT PANEL
		qsTextPanel.add(qsIoField, BorderLayout.CENTER);
		//BUTTON PANEL
		JPanel qsButtonsPanel = new JPanel();
		qsButtonsPanel.setLayout(new FlowLayout());
		
		aButton = new JRadioButton("Hourly");
        bButton = new JRadioButton("Salary");
        bButton.setSelected(true);
        
        cButton = new JCheckBox("Debt");
        cButton.setSelected(false);
        
		
		aButton.addActionListener(this);
		bButton.addActionListener(this);
		cButton.addActionListener(this);
		//ADD TO BUTTON PANEL
		qsButtonsPanel.add(aButton);
		qsButtonsPanel.add(bButton);
		qsButtonsPanel.add(cButton);
		
		
//ADD TO QUESTION PAGE
        settingsPanel.add(qsTextPanel);
        settingsPanel.add(qsButtonsPanel);
        
        
        
        
        
        
        
        
        
        
        
        
        //ADD PAGES/PANELS TO CONTENT PANE
        contentPane.add(settingsPanel);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Hourly") || e.getActionCommand().equals("Salary")){
            if(e.getActionCommand().equals("Hourly")){
            	aButton.setSelected(true);
            	bButton.setSelected(false);
            }else{
                aButton.setSelected(false);
            	bButton.setSelected(true);
            }
        }
        
        if(e.getActionCommand().equals("D")){
        	qsIoField.setText("D");
        }else 
            qsIoField.setText("That's an L, try again.");
    }
}
