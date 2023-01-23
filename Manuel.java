package tp7;

public class Manuel extends Livre {

	private int niveau;
	Manuel(int n,String t,String au,int nbrp,int ni){
		super(n,t,au,nbrp);
		niveau=ni;
	}
	
	// redefinition toString
		public String toString() {
			return super.toString() + "niveau : "+niveau;
		}
	
	//accesseur auteur
	public int getniveau() {
		return niveau;
	}
	//modificateur prixliv
	public void setniveau(int para) {
		niveau=para;
	}
		
	//afficher
	public void afficher() {
		super.afficher();
		System.out.println("-niveau "+niveau);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
