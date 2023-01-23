package tp7;

public class Livrotheque extends Bibliotheque{
	
	//constructeur
	Livrotheque(int capacite){
		super(capacite);
	}
	boolean ajouter(Document doc) {
		if(doc instanceof Livre) {
			return super.ajouter(doc);
		}
		else
			return false;
	}
	
	public Livre livre(int i) {
		return (Livre)(super.document(i));
	}
	
	 void afficheauteur() {
		 super.afficheauteur();
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Livrotheque l = new Livrotheque(50);
		
		l.ajouter(new Livre(123252,"Dsi22","ghassen",450));
		l.afficheauteur();

	}
	
	
}
