import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.esiea.puig.gnondoli.Joueurs.Player;
import fr.esiea.puig.gnondoli.Plateau.LettresPlateau;



public class TestPiocher {
	Player playertest= new Player();
	
	
	@Test
	public void TestExistElement(){
		playertest.Piocher();
		playertest.Piocher();
		char testlettre =playertest.MesLettres.get(0);
		char existence= playertest.MesLettres
		        .stream()
		        .filter(x -> testlettre==x)
		        .findAny()
		        .orElse(null);
		assertTrue("un élément exist ", existence==testlettre);
		assertFalse("un élément don't found ", existence==' ');
		
	}

}
