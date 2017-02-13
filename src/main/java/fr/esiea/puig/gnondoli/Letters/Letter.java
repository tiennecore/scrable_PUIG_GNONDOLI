package fr.esiea.puig.gnondoli.Letters;
import java.util.HashMap;
import java.util.Map;





public class Letter {
	
	private static Map<Character,Letter> cache = new HashMap<Character, Letter>();
	
	private Character lettre;
	
	private Letter(char lettre) {
		this.lettre = lettre;
	}
	public static Object GetChar(char lettre){
		return lettre;
	}
	public static Letter valueOf(char lettre) {
		return cache.computeIfAbsent(lettre, input-> Letter.valueOf(input));
	}
	
	public int compareTo(Letter letter){
		return lettre.compareTo(letter.lettre);
	}

}
