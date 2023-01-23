package tp7;

public class Dictionnaire extends Document {
	private String langue;
	
	Dictionnaire(int n,String t,String l){
		super(n,t);
		langue=l;
	}
	
	//toString
		public String toString() {
			return super.toString() + "langue :"+langue;
		}
		
	//accesseur langue
		public String getlangue() {
			return langue;
		}
		
	//modificateur langue
		public void setlangue(String para) {
			langue=para;
		}
		
	//afficher
	public void afficher() {
		super.afficher();
		System.out.println(" "+langue);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
