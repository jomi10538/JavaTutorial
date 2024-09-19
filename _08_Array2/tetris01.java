package _08_Array2;

public class tetris01 {

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
		for(int i=0; i<a[0].length; i++) {
			for(int j=a.length-1; j>=0; j--) {
				System.out.print(a[j][i]+"");
			}
			System.out.println();
		}
				
  }
}


