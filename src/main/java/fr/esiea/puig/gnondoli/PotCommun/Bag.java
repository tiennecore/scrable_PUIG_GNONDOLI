package fr.esiea.puig.gnondoli.PotCommun;

import java.util.Random;

import fr.esiea.puig.gnondoli.Letters.Letter;

public class Bag implements ILetterBag{

	private Random random = new Random();
	
	@Override
	public Letter getNextLetter() {
		return Letter.valueOf((char)('a' + random.nextInt(26)));
	}

}
