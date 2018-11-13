
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Gui extends JFrame{

    public Gui() {
    Dimension windowSize = new Dimension(800, 600);
    setSize(windowSize);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int windowPositionX = (screenSize.width - windowSize.width) / 2;
    int windowPositionY = (screenSize.height - windowSize.height) / 2;
    Point windowPosition = new Point(windowPositionX, windowPositionY);
    setLocation(windowPosition);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    //createAndAddDrawingPanel();
    setVisible(true);
  }

  public void createAndAddDrawingPanel(int breite, int hoehe) {
    // Das JPanel-Objekt ist ein Objekt einer anonymen Unterklasse von JPanel
    // Siehe Java-Grundkurs Abschnitt 3.9
    add(new JPanel() {
      // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
      // Methode beim Dsiplay aufruft.
      @Override
      protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
          //drawSquare(g, hoehe,breite);
    	  JLabel labelx = new JLabel("Gebe die X Position 1-9 ein");
    	  JLabel labely = new JLabel("Gebe die Y Position 1-9 ein");
    	  labelx.setBounds(320,10,200,20);
    	  labely.setBounds(320,50,200,20);
          JTextField textfieldX = new JTextField();
           textfieldX.setBounds(320, 30, 80, 20);
           JTextField textfieldY = new JTextField();
           textfieldY.setBounds(320, 70, 80, 20);
           JButton btn = new JButton("Zum Block machen");
           btn.setBounds(320, 90, 80, 20);
           add(labelx);
           add(labely);
          add(textfieldX);
          add(textfieldY);
          add(btn);
          btn.addActionListener(new ActionListener()
          {
            public void actionPerformed(ActionEvent e)
            {
              // display/center the jdialog when the button is pressed
            	JLabel label = new JLabel("Gebe die Y Position 1-9 ein");
          	  label.setBounds(320,100,200,20);
          	  add(label);
            }
          });
      }
    });
  }
  
  public void drawSquare( int h, int b,ArrayList<Kachel> kachel){
	  				
	  			  Graphics g = this.getGraphics();
	  			 for (int i = 0; i < kachel.size(); i++) {
	  				for (int j = 0;j < kachel.size(); j++) {
	  					for (Kachel k : kachel) {
		  					if(k.getX() == i && k.getY()== j){
		  						g.setColor(k.getColor());
		  						g.fillRect(i*30, j*30, 30, 30);
		  		            }
	  					}
	  					
						
	  					
					}
					
				}
	  			  
                  //g.setColor(kachel.getColor());
            	  
            	 // System.out.println(kachel.getColor());
                
                
              
          
      //changeColor(g);
  //this.repaint();
  }
  
  
  

    

    
    
}
