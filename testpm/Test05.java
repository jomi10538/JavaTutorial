package testpm;

public class Test05 {
	
	public static void main(String[] args) {
		// Q1.100부터 999까지의 숫자중에서 홀수만 출력하시오.
		System.out.print("Q1.");
		for(int i=100; i<1000; i++){
			if (i%2 ==1) {
			System.out.println(i);
			}
		}
		// Q2.1부터 100까지 숫자 중에서 홀수의 총합을 구하시오.
		System.out.print("Q2.");
		int s = 0;
		for(int j = 1; j <=100; j++){
			if(j%2==1){
				s += j;
			}
		}	
		     System.out.println(s);
		// Q3. 다음과 같이 출력하시오 10 9 8 7 6 5 4 3 2 1
		     System.out.print("Q3.");
		 for(int a=10; a> 0; a--) {
			 if(a==1) {
				 System.out.println(1);
			 }else
				 System.out.println(a+"");
		 }
		 //Q4.arr배열에서 배열의 값이 짝수인 것만 출력하시오.
		 System.out.print("Q4.");
		 int[] arr= {45,23,25,64,3,24,48};
		 for(int k=0; k < 7; k++) {
			 if(arr[k] %2 == 0) {
				 System.out.println(arr[k]);
			 }
		 }
		}
}

    
