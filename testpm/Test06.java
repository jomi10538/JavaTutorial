package testpm;

public class Test06 {

	public static void main(String[] args) {
		// Q0.선택받은 너 int[]letter={8,12,4,13,2,14,4,5}짝수만 출력하시오.
		System.out.print("Q1.");
		for(int i=2; i<14; i++){
			if (i%2 ==0) {
			System.out.println(i);
			}
		}
		// Q1. 큰놈 int[] letter={8,12,4,13,2,14,4,5}	배열의 가장 큰수가 있는 인덱스를 출력하시오.
		System.out.print("Q1.");
		int[] arr= new int[] {8,12,4,13,2,14,4,5};
		int big =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > big) {
				big=arr[i];
			}
		}
		for(int i=0; i < arr.length; i++) {
			if(arr[i] ==big){
				System.out.print("가장 큰수의 인덱스:"+i+"\n");
			}
			else {
			}
		}
		     System.out.println(big);
		
        // Q2. 현상수배 int[] letter={8,12,4,13,25,14,4,5}범인을찾으시오.범인은 짝수이면서 가장큰 값이다.범인은 14입니다. 
		     System.out.print("Q2.");
		     int[] array= {8,12,4,13,2,14,4,5};
		     int max = array[0];
		     for(int a=1; a<array.length; a++) {
		    		 if(max <array[a]) {
		    			max=array[a];
		    		 }
		     }
		     System.out.println("가장 큰 값" +max);

		// Q3. 비밀편지 String word ="gehoudfkimjnlvy"; int[] letter={8,12,3,13,1,14,3,4}; letter  배열은 word문자열 알파벳의 위치이다.letter배열의 암호를 풀어서 편지의 내용을 출력하시오. 
		     System.out.print("Q3.");
		     String word ="gehoudfkimjnlvy";
             int[] letter={8,12,3,13,1,14,3,4};
             int c=0;
             for(int i=0; i<8; i++) {
            	 c=letter[i];
            	 char letterword=word.charAt(c);
            	 System.out.println(letterword);
             }
		// Q4. 난건물주 int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1} int size=2; arr 배열에서 0이 의미하는 것은 공터이다. size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?size가 2일경우에 7개이다. 
             System.out.println("Q4.");
             int[] arr1 = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
             int size=2;
             int a=-1;
             int building=0;
             for(int i =0; i < arr1.length; i++) {
            	 if(arr1[i]==a&&arr1[i+1]==a) {
            		 building++;
            	 }
            	 System.out.println(building);
             }
             
		// Q5. 앞뒤가똑같은너 키보드로 문자를 입력받는다. 문자로 입력 받는 방법은 Scanner in = new Scanner(System.in); String a  = in.nextLine();     숫자는  nextInt(), 문자열을 nextLine() 메서드를 사용한다.이때 문자열의 길이는 0보다 크고 10보다 작으며 짝수만 가능하다.조건에 만족될때까지 문자 입력을 받는다.문자열을 앞으로 읽으나 뒤로 읽으나 같은 경우의 문자를 판별하는 코드를 작성하세요


		// Q6.String a ="23-56+45*2-56"; 수식을 계산하는 프로그램을 작성하세요.수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다.메서드는 최대한 적게 사용하세요

		//-------------------------------------------------------------------------------
		//[7번 , 8번 문제 배열 제시]int[] a = {34,2,35,8,31,45}최대값을 구하는 문제에서 철수는 변수를 사용하지 않고 배열만 이용하여 푸는 방법을 생각하였다. 

		// Q7.철수는 배열의 0번 인덱스부터 순회한다.0번 인덱스에서는 0번인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치 될 것이다.위와 같은 방식으로 가장큰 수를 구하시오.


		// Q8.철수는 배열의 0번 인덱스에 가장 큰 값을 저장하면 될 것이라고 생각한다.0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서 가장 큰 값이 나오면 가장 큰 값을 갱신한다.위와 같은 방식으로 가장 큰 수를 구하시오.

	}

}
