package fr.esiea.puig.gnondoli.Plateau;

import java.util.ArrayList;

import java.util.List;

import fr.esiea.puig.gnondoli.Letters.Letter;



public class LettresPlateau {
	
	public static List<Letter> CommunPot = new ArrayList<Letter>();
	
	private LettresPlateau(List<Letter> CommunPot) {
		LettresPlateau.CommunPot = CommunPot;
	}

}
