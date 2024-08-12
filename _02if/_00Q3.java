package _02if;

public class _00Q3 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int my=18;
		
		//up1
		if( a <- my && my <= b) {
			System.out.println("도로 위");
		}else {
			System.out.println("도로가 아님");
		}
	    //up2
		     

		if(a <= my && my <= b) {
			System.out.println("도로 위");
			int distanceCenter = a+(b-a)/2;
			System.out.println(distanceCenter);
			if(my <= distanceCenter) {
				System.out.println("a로 부터"+(my-a));
			}else {
				System.out.println("b로 부터"+(b-my));
			}
		}else {
			System.out.println("도로가 아님");
	}

	}
}
