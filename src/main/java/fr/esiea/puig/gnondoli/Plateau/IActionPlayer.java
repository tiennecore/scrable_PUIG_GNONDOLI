package fr.esiea.puig.gnondoli.Plateau;

import fr.esiea.puig.gnondoli.Letters.Letter;

public interface IActionPlayer {
	
	boolean TrouverLettre(Letter c);
	
	LettresPlateau SelectionnerLettre(Letter c);
	
	LettresPlateau SupprimerLettre(Letter c);
	
	LettresPlateau Piocher();

}
