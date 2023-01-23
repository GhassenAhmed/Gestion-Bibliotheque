package tp7;

public class Revue extends Document{
	private int mois;
	private int annee;
	
	Revue(int n,String t,int m,int an){
		super(n,t);
		mois=m;
		annee=an;
	}
	
	//toString
	public String toString() {
		return super.toString() + "date :"+mois+"/"+annee;
	}
	
	//accesseur mois
		public int getmois() {
			return mois;
		}
	//modificateur auteur
	public void setmois(int para) {
		mois=para;
	}
	
	//accesseur annee
		public int getannee() {
			return annee;
		}
	//modificateur auteur
	public void setannee(int para) {
		annee=para;
	}
	
	//afficher
	public void afficher() {
		super.afficher();
		System.out.println("date :"+mois+"/"+annee);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
