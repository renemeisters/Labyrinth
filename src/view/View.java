package view;

import java.util.ArrayList;

import model.Kachel;
import model.Model;

public class View {

    private static final  Gui gui = new Gui();
    Model m;
    ArrayList<Kachel> kacheln;
	
	public int getXChange() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Gui getGui(){
		return gui;
	}

	public void drawLabyrinth(int hoehe, int breite, Model model) {
		m = model;
		kacheln = m.getKacheln();
		gui.createAndAddDrawingPanel(breite, hoehe);
		gui.drawSquare(hoehe, breite, kacheln);
		
	}

	public int getYChange() {
		// TODO Auto-generated method stub
		return 0;
	}

}
