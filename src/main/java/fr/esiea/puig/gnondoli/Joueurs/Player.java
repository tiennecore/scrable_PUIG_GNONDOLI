package fr.esiea.puig.gnondoli.Joueurs;


import fr.esiea.puig.gnondoli.Plateau.IActionPlayer;
import fr.esiea.puig.gnondoli.Plateau.LettresPlateau;
import fr.esiea.puig.gnondoli.PotCommun.Bag;
import fr.esiea.puig.gnondoli.Words.IWord;
import fr.esiea.puig.gnondoli.Words.Word;

import java.util.ArrayList;
import java.util.List;


public class Player implements IActionPlayer,IWord{
	
	private Bag LettresPlayer;
	private List<Word> MesMots;
	
	public Player(Bag LettresPlayer,List<Word> MesMots){
		this.LettresPlayer= new Bag();
		this.MesMots=new ArrayList<Word>();
	}
	public int getSizeMesMots() {
		return MesMots.size()-1;
	}
	public void Piocher(){
		LettresPlayer.getNextLetter();
	}

	
	@Override
	public boolean TrouverLettre(char c) {
		char existence= LettresPlateau.CommunPot
        .stream()
        .filter(x -> c==x)
        .findAny()
        .orElse(null);
		
		return existence == c;			
	}


	@Override
	public void SelectionnerLettre(char c,int NumberWordUsed) {
		
		int i=LettresPlateau.CommunPot.size()-1;
		Word WordUsed= MesMots.get(NumberWordUsed);
		do{
			if (c==(LettresPlateau.CommunPot.get(i))){
				((Word) MesMots).AddLetterToWord(c,WordUsed);
			}
			i--;			
		}while(i>=0);
		
	}


	@Override
	public void SupprimerLettre(char c) {
		int i=LettresPlateau.CommunPot.size()-1;
		do{
			if (c==(LettresPlateau.CommunPot.get(i))){
				LettresPlateau.CommunPot.remove(i);
			}
			i--;			
		}while(i>=0);
	}


	@Override
	public void AddLetterToWord(char letter,Word WordUsed) {
		WordUsed.setWordPlayer(WordUsed.getWordPlayer() + letter);
	}


	@Override
	public int ActualWord() {
		int i=0;
		do{
			i++;
		}
		while(!MesMots.get(i).equals(null) || !MesMots.get(i).equals("") || i<=getSizeMesMots());
		return i;
	}


	@Override
	public void DeleteWord() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void DeleteWordPlayer(int PlaceWord) {
		Word ThisWord=MesMots.get(PlaceWord);
		ThisWord.DeleteWord();
		// TODO Auto-generated method stub
		
	}


	public void ActionPlayer() {
		
		
	}


	

}
