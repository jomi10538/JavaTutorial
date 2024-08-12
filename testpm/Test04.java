package testpm;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//Q1.1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시오.
		 int oddsum = 0;
			
			for(int i=0; i < 100; i++) {
			   if ((i+1)% 2 != 0) {
				oddsum=oddsum + (i+1);
			   }
	    }	
	    System.out.println("1부터 100까지 홀수는 더하고 짝수는 뺀 결과 값은"+ oddsum +"입니다.\n");
		//Q2. 1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각출력하시오.
	    int oddsum1 = 0;
		int evensum = 0;
		
		for(int i=0; i < 100; i++) {
		   if ((i+1)% 2 != 0) {
			oddsum1=oddsum1 + (i+1);
		    }
		}
		System.out.println("1부터 100까지 홀수는 홀수끼리 더한 값은"+ oddsum1 +"입니다.\n");
		
		for(int i=0; i < 100; i++) {
		   if ((i+1)% 2 == 0) {
			evensum=evensum + (i+1);
		    }
		}
		System.out.println("1부터 100까지 짝수는 짝수끼리 더한 값은"+ evensum +"입니다.\n");

		//Q3. 1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		
		int oddsum2 = 0;
		for (int i =0; i < 100; i++) {
			if((i%2)==1) {
				oddsum2++;
			 }
		}
		System.out.printf("홀수의 개수는 %d개 입니다.\n",oddsum2);

		//Q4. 100부터 999까지의 숫자의 모든 숫자의 합을 구하시오.453인 경우 4+5+3로 합한 값의 모든 총합을 구하시오.
		
		int sum=0;
		for(int i= 100; i <= 999; i++) {
				sum += i;
		}
		System.out.println("100부터 999까지 모든 숫자의 합은"+ sum +"입니다.\n");
	    int num = 494550;
		int sum1 = 0;
		while(num >0) {
			sum1 +=num%10;
			num/=10;
		}
	 
		System.out.println(sum1);
	
	       
		//Q5. 범인은 100부터 999까지 숫자에 숨어 있다.범인은 십의 자리에 있고. 3의 배수이다. 범인 숫자를 모두 출력하시오.
		       for(int i=100; i<999; i++) {
        		   if(((i/10)%10)%3==0&&((i/10)%10)!=0) {
        System.out.println(i);
        		   }
		       }
        //Q6. 범인을 찾아라. 0부터 100까지 숫자중 하나이다. 0부터 1 2 3 순서대로 합한 값을누적한다. 합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.범인 숫자 한 개를 출력하시오.. (단, break사용하지 않는다)
		int sum4=0;
		int cnt4=0;
		for(int i=0; i <=100; i++) {
			if(sum4 <=44) {
				sum4 =+ i;
				cnt4++;
			}
		}
		System.out.println(cnt4-1);
		//Q7. 1+2+3+4+5+6+7+8+9+10=결과값 요렇게 출력하기
		       for(int i =0; i < 10; i++) {
		    	   System.out.print(i+1);
		    	   if(i<9) {
		    		   System.out.print("+");
		    	   }
		       }
	}
}	



		    	
	



