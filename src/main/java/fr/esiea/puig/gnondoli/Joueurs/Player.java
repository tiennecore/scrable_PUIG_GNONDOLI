package fr.esiea.puig.gnondoli.Joueurs;


import fr.esiea.puig.gnondoli.Plateau.IActionPlayer;
import fr.esiea.puig.gnondoli.Plateau.LettresPlateau;
import fr.esiea.puig.gnondoli.PotCommun.Bag;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.esiea.puig.gnondoli.Letters.Letter;

public class Player implements IActionPlayer{
	
	Bag LettresPlayer= new Bag();
	List<Letter> MesLettres=new ArrayList<Letter>();
	
	
	public void SupprimerMesLettres(){
		int i=MesLettres.size()-1;
		do{
			MesLettres.remove(i);
			i--;			
		}while(i>=0);
	}	
	
	
	public LettresPlateau Piocher(){
		LettresPlateau.CommunPot.add(LettresPlayer.getNextLetter());
		return null;	
	}


	@Override
	public boolean TrouverLettre(Letter c) {
		Letter existence= LettresPlateau.CommunPot
        .stream()
        .filter(x -> c.equals(x))
        .findAny()
        .orElse(null);
		
		if (existence == null)
		{
			return false;
		}
		else
		{
			return true;
		}
		// TODO Auto-generated method stub
		
	}


	@Override
	public LettresPlateau SelectionnerLettre(Letter c) {
		LettresPlateau.CommunPot
        .stream()
        .collect(Collectors.toCollection(() ->  MesLettres));
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public LettresPlateau SupprimerLettre(Letter c) {
		int i=LettresPlateau.CommunPot.size()-1;
		do{
			if (c.equals(LettresPlateau.CommunPot.get(i))){
				LettresPlateau.CommunPot.remove(i);
			}
			i--;			
		}while(i>=0);
		// TODO Auto-generated method stub
		return null;
	}


	

}
