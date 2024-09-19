package _08_Array2;

public class tetris02 {

	public static void main(String[] args) {
		  //1 1 0
		  //0 1 0
	      //0 1 1
		int[][] a = {{1,1,0},
				     {0,1,0},
		             {0,1,1}};
		System.out.println();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
		     System.out.print(a[i][j]+"");
			}
		 System.out.println();
	}
		  //0 0 1
		  //1 1 1
	      //1 0 0
		System.out.println();
		for(int i=a.length-1; i>=0; i--) {
			for(int j=0; j<a[0].length; j++) {
		     System.out.print(a[j][i]+"");
			}
		System.out.println();
			}	  
	}					
}


