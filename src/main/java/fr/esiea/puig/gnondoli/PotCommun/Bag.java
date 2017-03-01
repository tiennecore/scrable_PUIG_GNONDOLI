package fr.esiea.puig.gnondoli.PotCommun;

import java.util.Random;
import fr.esiea.puig.gnondoli.Plateau.LettresPlateau;

public class Bag implements ILetterBag{

	private LettresPlateau plateau;
	
	public Bag(LettresPlateau pot){
		this.plateau=pot;
	}
	@Override
	public void getNextLetter(int valrand) {
		char lettre=(char)('a' + valrand );
		plateau.getCommunPot().add(lettre);
	}
	
}
