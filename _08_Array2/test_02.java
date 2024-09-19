package _08_Array2;

public class test_02 {
//1번부터 5번까지 선언문 int[][]a=new int[4][5]		
	public static void main(String[] args) {
		int[][]a=new int[4][5];
		int num=1;
			//배열값 입력부
		 //  *20,19,18,17,16,
		 //  *15,14,13,12,11,
	     //  *10,9,8,7,6,
	     //  *5,4,3,2,1
	     // 여기에다가 문제 풀기	
	      for(int i=3; i>=0; i--) {
	    	  for(int j=4; j>=0; j--) {
	    		  a[i][j]=num;
	    		  num++;
	    	  }
	      }
	      
	      
	//배열값 출력부
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[0].length; j++) {
					System.out.print(a[i][j]+"");
				}
				System.out.println();
			}

	}

}
