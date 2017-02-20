package fr.esiea.puig.gnondoli.PotCommun;

import java.util.Random;
import fr.esiea.puig.gnondoli.Plateau.LettresPlateau;

public class Bag implements ILetterBag{

	private Random random = new Random();
	
	@Override
	public void getNextLetter() {
		char lettre=(char)('a' + random.nextInt(26));
		
		LettresPlateau.CommunPot.add(lettre);
	}

}
