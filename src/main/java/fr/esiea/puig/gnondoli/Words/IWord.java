package fr.esiea.puig.gnondoli.Words;



public interface IWord {
	void AddLetterToWord(char letter,Word WordUsed);
	int ActualWord();
	void DeleteWord();
	void DeleteWordPlayer(int PlaceWord);

}
