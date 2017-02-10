package fr.esiea.puig.gnondoli.App;

import java.util.Arrays;
import java.util.List;

import fr.esiea.puig.gnondoli.Joueurs.Player;
import fr.esiea.puig.gnondoli.Letters.Letter;
import fr.esiea.puig.gnondoli.Plateau.LettresPlateau;


public class Application {
	public static void main( String[] args )
	{
		
		Player p1 = new Player();
		Player p2 = new Player();
		List<Player> players = Arrays.asList(p1,p2);
		p1.Piocher();
		for(int i=0;i<10;i++){
			
			//p2.Piocher();
		}
		for(Letter elem: LettresPlateau.CommunPot)
	       {
	       	 System.out.println (elem);
	       }
		
		
	}

}
