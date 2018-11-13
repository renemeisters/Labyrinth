
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Labyrinth extends JPanel{

    private int hoehe;
    private int breite;
    private ArrayList<Kachel> kacheln = new ArrayList<Kachel>();
    private static final  Gui gui = new Gui();
    
    public Labyrinth(int hoehe, int breite) {
        this.breite = breite;
        this.hoehe = hoehe;
        createKacheln();
    }
    
    private void createKacheln(){
       int count = 1;
       gui.createAndAddDrawingPanel(breite,hoehe);
        for (int x = 0; x < hoehe; x++) {
              for (int y = 0; y < breite; y++) {
                kacheln.add(new Kachel('*',x,y,Color.gray));
                 // System.out.println("x: " +x + " y: " +y);
               
       
              
                gui.drawSquare(hoehe,breite,kacheln);
                count++;
         }
              count++;
        }
        
    }
    
    public void printToConsole(){
        char[][] board = new char[breite][hoehe];
         for (int x = 0; x < breite+1; x++) {
            for (int y = 0; y < hoehe; y++) {
              for (Kachel kachel : kacheln) {
            if(kachel.getX() == x && kachel.getY()== y){
                 board[y][x] = kachel.getBlockType();
            }
        }
        
            }
        }
         for (int i = 0; i < breite; i++) {
            for (int j = 0; j < hoehe; j++) {
                System.out.print(board[i][j]);
            }
             System.out.println();
        }
                
        
    }
    
    public void changeKachel(int xPos, int yPos, char symbol){
        
        for (Kachel kachel : kacheln) {
            if(kachel.getX() == xPos && kachel.getY()== yPos){
                
            kachel.setBlockType(symbol);
            	
            	kachel.setColor(Color.CYAN);
            	  gui.drawSquare(hoehe,breite,kacheln);
                  //Graphics g = gui.getGraphics();
                  //gui.changeColor(g,kachel.getX(),kachel.getY(),kachel.getColor(), kacheln);
               
                  }
        }
        
    }
    

    
 
    

    
  
    
    
    
}
