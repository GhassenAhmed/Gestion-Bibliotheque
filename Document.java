package tp7;

public class Document {

	private int numEnreg;
	private String titre;
	//constructeur
	Document(int n,String t){
		numEnreg=n;
		titre=t;
	}
	
	//toString
	public String toString() {
		return "[Num: "+numEnreg+"]"+" --titre :"+titre;
	}
	
	//accesseur numEnreg
	public int getnumEnreg() {
		return numEnreg;
	}
	
	//modificateur numEnreg
	
	public void settitle(String para) {
		titre=para;
	}
	
	//afficher
	public void afficher() {
		System.out.println("Bienvenu chez "+titre+"[Num: "+numEnreg+"]");
	}
	
	
	private static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
