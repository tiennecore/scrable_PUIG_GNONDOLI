package fr.esiea.puig.gnondoli.App;

import java.util.Arrays;
import java.util.List;

import fr.esiea.puig.gnondoli.Joueurs.Player;
import fr.esiea.puig.gnondoli.Plateau.GameEngine;
import fr.esiea.puig.gnondoli.Plateau.LettresPlateau;


public class Application {
	public static void main( String[] args )
	{
		
		Player p1 = new Player(null, null);
		Player p2 = new Player(null, null);
		List<Player> joueurs = Arrays.asList(p1,p2);
		GameEngine OrgaJeu= new GameEngine(joueurs);
		OrgaJeu.run();
		for(char elem: LettresPlateau.CommunPot)
	       {
	       	 System.out.println (elem);
	       }
		
		
	}

}
