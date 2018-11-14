package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import model.Labyrinth;
import model.Model;
import view.Gui;
import view.View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vmadmin
 */
public class Controller {
    private static View v;
    private static Model m;
    private static int hoehe;
    private static int breite;
    private static Gui g;
    public static void main(String[] args) {
         hoehe = Integer.parseInt(args[0]);
        breite = Integer.parseInt(args[1]);
      /*  Labyrinth labyrinth = new Labyrinth(hoehe, breite);
   
        labyrinth.printToConsole();*/

      v = new View();
        g = v.getGui();
      m = new Model();
        m.createLabyrinth(hoehe,breite);

        v.drawLabyrinth(hoehe,breite, m);
        g.addFieldChangeListener(new FieldListener());
        /*int x = v.getXChange();
        int y = v.getYChange();
        m.changeKachel();*/

      
    }

    static class FieldListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int x, y;
            try{

                x = g.returnXField();
                y = g.returnYField();

                m.changeKachel(x,y);
                v.drawLabyrinth(hoehe,breite,m);
            }
            catch (NumberFormatException ex){
                g.displayErrorMessage("In beiden Feldern müssen Nummern eigegeben werden!");
            }
        }
    }
    
}
