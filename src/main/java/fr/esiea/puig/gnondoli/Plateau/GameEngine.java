package fr.esiea.puig.gnondoli.Plateau;


import java.util.ArrayList;
import java.util.List;

import fr.esiea.puig.gnondoli.Joueurs.Player;
public class GameEngine {
	final int NOMBRE_DE_MOTS_POUR_GAGNER = 9;
	boolean EndOfGame=false;
	private List<Player> players;
	
	public GameEngine(List<Player> players) {
		this.players = players;
	}
	
	public void run(){
		players.forEach( elem -> elem.Piocher());
		
		PlayerIterator<Player> tours = new PlayerIterator<Player>(players);
		while(!isGameFinish()) {
			Player currentPlayer = (Player) tours.next();
			currentPlayer.Piocher();
			currentPlayer.Piocher();
			currentPlayer.ActionPlayer();
			
		}
	}

	private boolean isGameFinish() {
		
		players.forEach( player ->{
			if (player.getSizeMesMots()==NOMBRE_DE_MOTS_POUR_GAGNER){
				EndOfGame=true;
			}	
		});
		
		return EndOfGame;
	}
	
	private Player Init() {
		List<Integer> val=new ArrayList<Integer>();
		int lettermin=25;
		int firstplayer=0;
		for(int i=0;i<players.size()-1;i++){
			val.add(players.get(i).getRandomPlayer());
		}
		for(int i=0;i<val.size()-1;i++){
			if(val.get(i)<lettermin){
				lettermin=val.get(i);
				firstplayer=i;
			}
		}
		return players.get(firstplayer);
		
	}

}
