package _08_Array2;

public class test07 {

	public static void main(String[] args) {
		//1 1 0 2
		//3 2 1 2
		//0 0 3 2
		//4 4 4 4
		//2 4 3 1
		//2 4 1 3
//7.위와 같은 게임 배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다.제거가 가능한 블록의 좌표를 출력하시오.
		int[][] a=
		            {{1,1,0,2},
	                {3,2,1,2},
		            {0,0,3,2},
		            {4,4,4,4},
		            {2,4,3,1},
		            {2,4,1,3}};
		
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < a[i].length; j++) {
				System.out.print(String.format("%4d", a[i][j]));
			}
		}
		System.out.println();
		}
	

}
