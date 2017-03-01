package fr.esiea.puig.gnondoli.Joueurs;


import fr.esiea.puig.gnondoli.Plateau.IActionPlayer;
import fr.esiea.puig.gnondoli.Plateau.LettresPlateau;
import fr.esiea.puig.gnondoli.PotCommun.Bag;
import fr.esiea.puig.gnondoli.Words.IWord;
import fr.esiea.puig.gnondoli.Words.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Player implements IActionPlayer,IWord{
	
	private Bag LettresPlayer;
	private LettresPlateau plateau;
	private List<Word> MesMots;
	
	public Player(LettresPlateau pot){
		this.LettresPlayer= new Bag(pot);
		this.MesMots=new ArrayList<Word>();
		this.setPlateau(pot);
	}
	public int getSizeMesMots() {
		return MesMots.size()-1;
	}
	public void Piocher(){
		LettresPlayer.getNextLetter(getRandomPlayer());
	}

	
	@Override
	public boolean TrouverLettre(char c) {
		char existence= getPlateau().getCommunPot()
        .stream()
        .filter(x -> c==x)
        .findAny()
        .orElse(null);
		
		return existence == c;			
	}


	@Override
	public void SelectionnerLettre(char c,int NumberWordUsed) {
		
		int i=getPlateau().getCommunPot().size()-1;
		Word WordUsed= MesMots.get(NumberWordUsed);
		do{
			if (c==(getPlateau().getCommunPot().get(i))){
				((Word) MesMots).AddLetterToWord(c,WordUsed);
			}
			i--;			
		}while(i>=0);
		
	}


	@Override
	public void SupprimerLettre(char c) {
		int i=getPlateau().getCommunPot().size()-1;
		do{
			if (c==(getPlateau().getCommunPot().get(i))){
				getPlateau().getCommunPot().remove(i);
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
	@Override
	public int getRandomPlayer() {
		Random random = new Random();
		return random.nextInt(25);
	}
	public LettresPlateau getPlateau() {
		return plateau;
	}
	public void setPlateau(LettresPlateau plateau) {
		this.plateau = plateau;
	}


	

}
