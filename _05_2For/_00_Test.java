package _05_2For;

public class _00_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i < 5; i++) {
			System.out.println("1*"+i+"="+(1*i));
		}
		
		for(int dan=1; dan<5; dan++) {
			//System.out.println(dan);
			for(int i=0; i < 5; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}

	}

}
