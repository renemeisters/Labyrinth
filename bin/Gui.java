
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vmadmin
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
          drawSquare(g, hoehe,breite);
          JTextField textfieldX = new JTextField("X Position");
           textfieldX.setBounds(320, 20, 80, 20);
           JTextField textfieldY = new JTextField("Y Position");
           textfieldY.setBounds(320, 50, 80, 20);
           JButton btn = new JButton("Zum Block machen");
           btn.setBounds(320, 80, 80, 20);
          add(textfieldX);
          add(textfieldY);
          //add(btn);
         
      }
    });
  }
  
  private void drawSquare(Graphics g, int h, int b){
  for (int i = 0; i < b*30; i+=30) {
              for (int j = 0; j < h*30; j+=30) {
                  //g.setColor(Color.magenta);
                  g.drawRect(i, j, 30, 30);
              }
          }
      changeColor(g);
  
  }
  
  private void changeColor(Graphics g){
   
       g.setColor(Color.magenta);
       g.fillRect(60, 60, 30, 30);
  }
    
    

    
    
}
