
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vmadmin
 */
public class Main {
    
    
    public static void main(String[] args) {
        int hoehe = Integer.parseInt(args[0]);
        int breite = Integer.parseInt(args[1]);
        Labyrinth labyrinth = new Labyrinth(hoehe, breite);
   
        labyrinth.printToConsole();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte gebe die xpos von 0 - " + breite + " ein.");
        int x= scan.nextInt();
        System.out.println("Bitte gebe die ypos von 0 - " + hoehe + " ein.");
        int y = scan.nextInt();
        System.out.println("Bitte wählen Sie ein Symbol: z, o, *");
        char type = scan.next().charAt(0);
        labyrinth.changeKachel(x, y, type);
        labyrinth.printToConsole();
      
    }
    
}
