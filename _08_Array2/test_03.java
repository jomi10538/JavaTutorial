package _08_Array2;

public class test_03 {

	//1번부터 5번까지 선언문 int[][]a=new int[4][5]		
		public static void main(String[] args) {
			int[][]a=new int[4][5];
			int num=1;
				//배열값 입력부
			 //  *1,2,3,4,5,
			 //  *10,9,8,7,6,
		     //  *11,12,13,14,15,
		     //  *20,19,18,17,16
		     // 여기에다가 문제 풀기	
		      for(int i=0; i<a.length; i++) {
		    	      for(int j=0; j<a[0].length; j++) {
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
