package _03for;

public class _00_for {

	public static void main(String[] args) {
		int[] a= {30,40,50,55,65,};
		//모든 value값을 출력하시오
        int index=0;
       for(int i=0; i<5;i++) {
    	   System.out.println(a[i]);
       }
      //Q1 65 55 50 40 30 순으로 출력
    	   for(int i = 4; i > -1 ; i-- ) {
    		   System.out.println(a[i]);
    	   }
    	   
      //Q2 40 50 55 65 30 순으로 출력
    	   for(int i = 1; i <=5; i++ ) {
    		   System.out.println(a[i%5]);
    	   }
    	   
      //배열순회를 반복하면서 값의 조건 판별 후 출력
           for(int i=0; i<5; i++) {
        	   if(a[i]>=50) 
        		 System.out.println(a[i]);
        	}
         
        		 //50이상 정수를 합하시오
           System.out.println("50이상 합계");
        	int sum =0;
        	for(int i=0; i<5; i++) {	 
        		if(a[i] >= 50) {
        		   sum += a[i];
        		}
        	
            System.out.println(sum);
	       }
	    

        		 //평균을 구하시오 단,50점이상
           System.out.println("50이상 평균");
        	int cnt=0;
        	int sum1=0;
        	
        	for(int i=0; i <5; i++) {	 
        		if(a[i] >= 50) {
        		   sum1 += a[i];
        		   cnt++;
        		}
        	}
        	 System.out.println(sum1/cnt);
        	 
        		 //평균을 구하시오 단,최저점수는 포함하지 마시오
        	 System.out.println("최저점수를 제외한 평균");
           	int cnt1=0;
           	int sum2=0;
           	int minnum=10000;
           	
           	for(int i=0; i <5; i++) {	 
           		if(minnum > a[i]) {
           		   minnum = a[i];
           		}
           		   sum2 +=a[i];
           		   cnt1++;
           		}
           	
           		
           	 System.out.println((double)(sum2-minnum)/(cnt1-1));
        		 
    	   }
       
	}


