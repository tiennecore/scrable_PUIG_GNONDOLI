package fr.esiea.puig.gnondoli.Words;


public class Word implements IWord{
	
	private String WordPlayer;

	public Word(String WordPlayer){
		this.WordPlayer=null;
		
	}

	
	@Override
	public int ActualWord() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void DeleteWord() {
		setWordPlayer("");
		
	}

	@Override
	public void DeleteWordPlayer(int PlaceWord) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void AddLetterToWord(char letter, Word WordUsed) {
		// TODO Auto-generated method stub
		
	}


	public String getWordPlayer() {
		return WordPlayer;
	}


	public void setWordPlayer(String wordPlayer) {
		WordPlayer = wordPlayer;
	}
	

}
