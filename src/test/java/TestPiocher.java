import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.esiea.puig.gnondoli.Joueurs.Player;
import fr.esiea.puig.gnondoli.Plateau.LettresPlateau;



public class TestPiocher {
	private LettresPlateau pot ;
	private Player playertest;
	public TestPiocher(){
		this.pot= new LettresPlateau();
		this.playertest= new Player(pot);
		
		
	}
	
	@Test
	public void TestExistElement(){
		playertest.Piocher();
		playertest.Piocher();
		
		assertTrue("un element exist ", playertest.TrouverLettre(playertest.getPlateau().getCommunPot().get(0))==true);
		assertFalse("element not found ", playertest.TrouverLettre(playertest.getPlateau().getCommunPot().get(0))==false);
		
	}

}
