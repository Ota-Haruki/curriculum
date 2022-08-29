package check;

public class Main {
	 private String firstName = "太田";
	 private String lastName = "春紀";
	 
   public void test() {
	        // クラス内部ではすべてのレベルのメンバーにアクセス可
	        System.out.print(firstName);
	        System.out.print(lastName);
	    }

	public static void main(String[] args) {
		Main m = new Main();
        m.test();

	}

}
