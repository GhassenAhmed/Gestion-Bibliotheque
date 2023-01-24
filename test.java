package tp7;

public class test {
	
	private int poids;
	test(int p){
		poids=p;
	}
	public static boolean egale(test t , test v) {
		return v.poids==t.poids;
	} 
	public boolean equals(Object o) {
		test t =(test)o;
		return this.poids==t.poids;
	}
	public  void augmenter(int x) {
		poids=x;
	}
	public int getpoids() {
		return poids;
	}
	
	
	
}
