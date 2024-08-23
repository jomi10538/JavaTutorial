package testpm;

public class Test03 {
     //문제1
	public static void main(String[] args) {
		//평균
		double avg = 89.2;
		if(avg >= 80)  {		
			System.out.println("합격"); 
		} else {
	    System.out.println("불합격");	
	}
        //문제2
		int level=2;
		int point=30;
		if(level ==1) {
			point += 30;
		}else 
			point += 10;
		System.out.println(point);
        //문제3
		int[]lotto = {6,12,33,4,5,26};
		System.out.println(lotto[2]+80);
        //문제4
		int[]lotto1 = {6,12,33,4,5,26};
	    if(lotto1[3] %2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
        //문제5
	    int sum = 0;
	    if (lotto1[0]%2==1) {
			sum += lotto1[0];
		}
	    if (lotto1[1]%2==1) {
	    	sum += lotto1[1];
	    }
	    if (lotto1[2]%2==1) {
	 	    sum += lotto1[2];
		}
	 	if (lotto1[3]%2==1) {
		    sum += lotto1[3];
		}
		if (lotto1[4]%2==1) {
		 	sum += lotto1[4];
		}
		if (lotto[5]%2==1) {
		    sum += lotto[5];
		}
		System.out.println(sum);
        //문제6
		int[] a = {45,34,64,45,24};
		System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
        //문제7
		int[] num= {45,34,64};
		//int index0 = num[0]/10 + num[0]%10;
		//int index1 = num[1]/10 + num[1]%10;
		//int index2 = num[2]/10 + num[2]%10;
		
		if(num[0]/10 + num[0]%10 >num[1]/10 + num[1]%10) {
			if(num[0]/10 + num[0]%10 > num[2]/10 + num[2]%10) {
				System.out.println(num[0]);
			}else {
				System.out.println(num[2]);
			}
		}else {
			if(num[1]/10 + num[1]%10 > num[2]/10 + num[2]%10) {
				System.out.println(num[1]);
			}else {
				System.out.println(num[2]);
			}
		}
        //문제8
		int[] x = {6,5,9};
		int[] y = {4,10,6};
		int bx = 3;
		int by = 2;
		
		if ((x[0] % bx == 0) && (y[0] % by ==0)) {
			System.out.println("0번새");
		}
		if ((x[1] % bx == 0) && (y[1] % by ==0)) {
			System.out.println("1번새");
	}
		if ((x[2] % bx == 0) && (y[2] % by ==0)) {
			System.out.println("2번새");
		}
   
	
        //문제9
	    int[] x1 = {10, 20, 5, 6};
	    int[] y1 = {11, 5, 2, 2}; 
	    {
	    if(y1[0] <=y1[0] && y1[0]+y1[2] <=x1[0]+x1[2]) {
             if(x1[1] <=y1[1]+y1[3] && y1[1]<=x1[1]+x1[3]) {
		                System.out.println("hit");
	           } else
		                System.out.println("miss");
        } else
                System.out.println("miss");
	    } 
	 }
}


    
