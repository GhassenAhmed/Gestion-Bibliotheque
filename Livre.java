package tp7;

public class Livre extends Document {
	private String auteur;
	private int nbrPages;
	
	Livre(int n,String t,String aut,int nbrP ){
		super(n,t);
		auteur=aut;
		nbrPages=nbrP;
	}
	
	// redefinition toString
	public String toString() {
		return super.toString() + "----auteur : "+auteur+" nbrPages :"+nbrPages;
	}
	
	//accesseur auteur
	public String getauteur() {
		return auteur;
	}
	//modificateur auteur
	public void setauteur(String para) {
		auteur=para;
	}
	
	
	//accesseur nbrPages
		public int getnbrPages() {
			return nbrPages;
		}
		//modificateur nbrPages
		public void setnbrPages(int para) {
			nbrPages=para;
		}
		
		//afficher
		public void afficher() {
			super.afficher();
			System.out.println("-"+"   "+auteur+"("+nbrPages+")");
		}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
