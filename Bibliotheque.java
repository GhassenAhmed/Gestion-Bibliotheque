package tp7;

public class Bibliotheque {

	 protected Document[] tabdoc;
	 protected int nombre;
	
	//constructeur 
	Bibliotheque(int capacite){
		
	  tabdoc=new Document[capacite];
		nombre=0;
	}
	
	//affiche
	
	
	//document
	 Document document(int i) {
		
			return tabdoc[i];

		
		
	}
	
	//ajout
	 boolean ajouter(Document doc){
		 
		 if(tabdoc.length>nombre)
			{
				tabdoc[nombre]=doc ;
				nombre++ ; 
				return true ; 
				}
			else
			{
				return false ; 
			} 
	 }
	
	//suppression
	 
	 boolean supprimer(Document doc) 
	 {
		 int i,j;
		 for (i=0;i<nombre;i++)
		 {
			 if(tabdoc[i].getnumEnreg()==doc.getnumEnreg())
			 {
				 for(j=i;j<nombre;j++)
				 {
					 tabdoc[j]=tabdoc[j+1];
					 
				 }
				 nombre --;
				 return true;
			 }
		 }
		 return false;
	 }
	
		
	//affichage auteur
	 void afficheauteur() {
			for(int i=0;i<nombre;i++) {
				if(tabdoc[i] instanceof Livre) {
					System.out.println(((Livre) tabdoc[i]).getauteur());
				}
			}
		}
	 
	
	 	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bibliotheque bibliotheque = new Bibliotheque(50);
		Document unDocument= new Roman(1003,"Compte rendu du TP2","A. Metral",20,200);
		bibliotheque.ajouter(new Document(1001,"\"Je n'ai plus d'idee"));
		bibliotheque.ajouter(new Livre(1002,"Nicolas Sarkozy, le manuel vaudou","Y. Rolognese",500));
		bibliotheque.ajouter(unDocument);
		bibliotheque.ajouter(new Manuel(1004,"Vive le Java","A. Metral-Boitel",200,2));
		bibliotheque.ajouter(new Revue(1005,"Science et Vie",4,2008));
		bibliotheque.ajouter(new Dictionnaire(1006,"Larousse","Francais"));
		System.out.println("--------------DOCUMENTS---------------------");
		bibliotheque.afficherDocument();
		System.out.println("--------------Auteurs---------------------");
		bibliotheque.afficheauteur();
		System.out.println("--------------End---------------------");
		System.out.println("-----DOCUMENTS SANS LE NUM 1003-------------");
		bibliotheque.supprimer(unDocument);
		bibliotheque.afficherDocument();
		System.out.println("--------------End---------------------");
		
		
		
		
		
		
		
		
	}

}
