import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;


import org.junit.Test;

import fr.esiea.puig.gnondoli.Joueurs.Player;
import fr.esiea.puig.gnondoli.PotCommun.Bag;


public class Lettre_Test{
	protected Bag sac;
	int i=Player.MesLettres.size();
	@Before
	public void setUp() {
        sac = new Bag();
    }
	
	@After
    public void tearDown() {
		Player.MesLettres.remove(i);
    }
	
	@Test
	public void TestCreationLettre(){
		sac.getNextLetter();
		int j=Player.MesLettres.size();
		assertTrue("un élément a été ajouté ", i!=j);
		assertFalse("pas d'élément ajouté ", i==j);
		
		
	}

}
