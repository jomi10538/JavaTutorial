package _08_Array2;

public class test06 {

	public static void main(String[] args) {
		int[][]  a= {{1,2,3,4,5},
			    {6,7,8,9,10},
			    {11,12,13,14,15},
			    {16,17,18,19,20},
			    {21,22,23,24,25}};
//6.2차원의 배열의 모든 값을 출력하시오.출력시엔 행의 번호는 내림차순,열의 번호도 내림차순으로 출력
	
		for(int i=4;i>=0; i--) {
			for(int j=4; j>=0; j--) {
				System.out.print(a[i][j]+"\t");
				
		}
		System.out.println();
	}
	}
}
//열과 행의 모든수치가 나오게 하려면 최대값은 4이므로 4로 지정하고 i와 j의 값이 줄어들게 --사용