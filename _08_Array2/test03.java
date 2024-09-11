package _08_Array2;

public class test03 {

	public static void main(String[] args) {
		int[][]  a= {{1,2,3,4,5},
			    {6,7,8,9,10},
			    {11,12,13,14,15},
			    {16,17,18,19,20},
			    {21,22,23,24,25}};
//3.2차원배열의 2열의 모든 값을 행의 순서대로 출력하시오 3 8 13 18 23
	
	for(int i=0;i<a.length; i++) {
		for(int j=1; j+3<a[0].length; j++) {
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	}

}
//2열의 값은 열은 j의 값이므로 2열은 두번째 숫자인 1로 설정.a의 값이 j에 3을 더했더니,이 수치가 나왔다.