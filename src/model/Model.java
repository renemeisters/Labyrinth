package model;

import java.util.ArrayList;
import java.awt.Color;

public class Model {
	private Labyrinth l;
	private ArrayList<Kachel> kacheln;

	public void createLabyrinth(int hoehe, int breite) {
		
		l = new Labyrinth(hoehe, breite);
	}

	public void changeKachel(int x, int y, Color c) {
		l.changeKachel(x,y,c);
		
	}

	public ArrayList<Kachel> getKacheln() {
		// TODO Auto-generated method stub
		kacheln = l.getKacheln();
		return kacheln;
	}



}
