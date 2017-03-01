package fr.esiea.puig.gnondoli.Plateau;

import java.util.ArrayList;

import java.util.List;

import fr.esiea.puig.gnondoli.PotCommun.Bag;



public class LettresPlateau{
	
	
	private List<Character> CommunPot ;
	
	public LettresPlateau() {
		this.CommunPot=(new ArrayList<Character>());
	}

	public List<Character> getCommunPot() {
		return CommunPot;
	}

	public void setCommunPot(List<Character> communPot) {
		CommunPot = communPot;
	}

	
}
