
import java.util.ArrayList;
import javax.swing.JFrame;
import sun.applet.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vmadmin
 */
public class Labyrinth extends JFrame{

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
       
        for (int x = 0; x < hoehe; x++) {
              for (int y = 0; y < breite; y++) {
                kacheln.add(new Kachel('*',x,y));
                 // System.out.println("x: " +x + " y: " +y);
                gui.createAndAddDrawingPanel(breite,hoehe);
         }
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
                  
            }
        }
        
    }
    
 
    

    
  
    
    
    
}
