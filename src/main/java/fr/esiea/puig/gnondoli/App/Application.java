package fr.esiea.puig.gnondoli.App;

import java.util.Arrays;
import java.util.List;

import fr.esiea.puig.gnondoli.Front.Fenetre;
import fr.esiea.puig.gnondoli.Joueurs.Player;
import fr.esiea.puig.gnondoli.Plateau.GameEngine;
import fr.esiea.puig.gnondoli.Plateau.LettresPlateau;


public class Application {
	public static void main( String[] args )
	{
		LettresPlateau potcommun=new LettresPlateau();
		Player p1=new Player(potcommun);
		p1.Piocher();
		//OrgaJeu.run();
		//Fenetre FrameGame=new Fenetre();
		
		
		
	}

}
