package _08_Array2;

public class test02 {

	public static void main(String[] args) {
		int[][]  a= {{1,2,3,4,5},
			        {6,7,8,9,10},
			        {11,12,13,14,15},
			        {16,17,18,19,20},
			        {21,22,23,24,25}};
//2.2차원배열 a의 3번째 행의 짝수의 값을 출력하시오
	
	for(int j=0;j<a.length; j++) {
		for(int i=2; j<a[0].length; j++) {
			if(j%2==1)
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	}

}
//a의 값을 1부터 25까지 설정하고 a의 3번째 행은 11,12,13,14,15이므로 i의 값은 2로 설절,
//짝수의 값을 정해야 하므로 if구문을 사용하여 j%2==1짝수 연산자 사용 0으로 설정하면 홀수의 값이 나오고
//1로 설정하면 짝수의 값이 나왔다.