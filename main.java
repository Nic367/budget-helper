import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class main extends JFrame implements ActionListener{
    //javac *.java
    //java main.java
    
    public static final int WIDTH = 800;
    public static final int HEIGHT = 400;
    
    private int qsPos = 0;
    private JTextField qsIoField;
    private int a, b, c, d, ee, f, g, h, i;
    private Vector<String> questions = new Vector<String>();
    
    public static void main(String[] args){
        main t1 = new main();
        //t1.pack();
        t1.setVisible(true);
    }
    
    public main(){
        //TODO: Bug! find a way to randomize answers so that A isnt always lawful good etc etc
        setTitle("Alignment Tree");
        setDefaultCloseOperation(EXIT_ON_CLOSE);    /*instead of WindowDestroyer*/
        setSize(WIDTH, HEIGHT);                     /*instead of "t1.pack();" in main*/
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1,1));
        
//TITLE PAGE
		//X

//INFO PAGE
		//X

//QUESTION PAGE
		questions.add("FIRST QUESTION");
		questions.add("SECOND QUESTION");
		questions.add("THIRD QUESTION");
		
		JPanel qsPanel = new JPanel();
        qsPanel.setLayout(new GridLayout(2,1));		/*row, col*/
        //TEXT PANEL
		    JPanel qsTextPanel = new JPanel();
		    qsTextPanel.setLayout(new BorderLayout());
		    qsIoField = new JTextField();				/*defined private*/
		    qsIoField.setText(questions.get(qsPos));
		    qsIoField.setBackground(Color.white);
        //ADD TO TEXT PANEL
		    qsTextPanel.add(qsIoField, BorderLayout.CENTER);
		//BUTTON PANEL
		    JPanel qsButtonsPanel = new JPanel();
		    qsButtonsPanel.setLayout(new GridLayout(3,3));
		    JButton aButton = new JButton("A"+"0X");
		    JButton bButton = new JButton("B");
		    JButton cButton = new JButton("C");
		    JButton dButton = new JButton("D");
		    JButton eButton = new JButton("E");
		    JButton fButton = new JButton("F");
		    JButton gButton = new JButton("G");
		    JButton hButton = new JButton("H");
		    JButton iButton = new JButton("I");
		    aButton.addActionListener(this);
		    bButton.addActionListener(this);
		    cButton.addActionListener(this);
		    dButton.addActionListener(this);
		    eButton.addActionListener(this);
		    fButton.addActionListener(this);
		    gButton.addActionListener(this);
		    hButton.addActionListener(this);
		    iButton.addActionListener(this);
		//ADD TO BUTTON PANEL
		    qsButtonsPanel.add(aButton);
		    qsButtonsPanel.add(bButton);
		    qsButtonsPanel.add(cButton);
		    qsButtonsPanel.add(dButton);
		    qsButtonsPanel.add(eButton);
		    qsButtonsPanel.add(fButton);
		    qsButtonsPanel.add(gButton);
		    qsButtonsPanel.add(hButton);
		    qsButtonsPanel.add(iButton);
//ADD TO QUESTION PAGE
        qsPanel.add(qsTextPanel);
        qsPanel.add(qsButtonsPanel);
        
        
        
        
        
        
        
        
        
        
        //ADD PAGES/PANELS TO CONTENT PANE
        contentPane.add(qsPanel);
    }
    
    public void updateQsIoField(){
    	if(qsPos<questions.size()){
    		qsIoField.setText(questions.get(qsPos));
    	}else
    		qsIoField.setText(qsPos+" > number of questions");
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("A")){
        	//qsIoField.setText("A");
        	a++;
        }else if(e.getActionCommand().equals("B")){
        	qsIoField.setText("B");
        	b++;
        }else if(e.getActionCommand().equals("C")){
        	qsIoField.setText("C");
        	c++;
        }else if(e.getActionCommand().equals("D")){
        	qsIoField.setText("D");
        	d++;
        }else if(e.getActionCommand().equals("E")){
        	qsIoField.setText("E");
        	ee++;
        }else if(e.getActionCommand().equals("F")){
        	qsIoField.setText("F");
        	f++;
        }else if(e.getActionCommand().equals("G")){
        	qsIoField.setText("G");
        	g++;
        }else if(e.getActionCommand().equals("H")){
        	qsIoField.setText("H");
        	h++;
        }else if(e.getActionCommand().equals("I")){
        	qsIoField.setText("I");
        	i++;
        }else 
            qsIoField.setText("That's an L, try again.");
        qsPos++;
        updateQsIoField();
    }
}
