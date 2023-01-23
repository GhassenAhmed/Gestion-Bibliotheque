package tp7;

public class Roman extends Livre {
	private float prixliv;
	Roman(int n,String t,String au,int nbrp,float p){
		super(n,t,au,nbrp);
		prixliv=p;
	}
	
	// redefinition toString
		public String toString() {
			return super.toString() + "Prix Livre : "+prixliv;
		}
		
	//accesseur auteur
	public float getprixliv() {
		return prixliv;
	}
	//modificateur prixliv
	public void setprixliv(float para) {
		prixliv=para;
	}
	
	//afficher
	public void afficher() {
		super.afficher();
		System.out.println("Prix :"+prixliv);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
