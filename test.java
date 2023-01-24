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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test t=new test(6);
		test v=new test(7);
		System.out.println(test.egale(t, v)); 
		System.out.println(t.equals(v));
	}
	
	
}
