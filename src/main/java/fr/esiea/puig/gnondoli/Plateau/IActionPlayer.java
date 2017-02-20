package fr.esiea.puig.gnondoli.Plateau;


public interface IActionPlayer {
	
	boolean TrouverLettre(char c);
	
	void SelectionnerLettre(char c,int NumberWordUsed);
	
	void SupprimerLettre(char c);
	
	void Piocher();
	
	int getRandomPlayer();

}
