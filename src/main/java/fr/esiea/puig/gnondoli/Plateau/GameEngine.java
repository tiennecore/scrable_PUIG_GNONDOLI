package fr.esiea.puig.gnondoli.Plateau;


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
	

}
