package tp7;

public class TestDocument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		test t=new test(6);
		test v=new test(7);
		System.out.println(test.egale(t, v)); 
		t.augmenter(15);
		System.out.println(t.getpoids());
		
	}

}
