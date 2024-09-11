package _08_Array2;

public class test05 {

	public static void main(String[] args) {
		int[][]  a= {{1,2,3,4,5},
			    {6,7,8,9,10},
			    {11,12,13,14,15},
			    {16,17,18,19,20},
			    {21,22,23,24,25}};
//5.전체 배열의 값 중 홀수를 0으로 마스킹하고,마스킹 된결과 2차원 배열을 출력하시오
	
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[0].length; j++) {
			if(a[i][j]%2==1) {
				a[i][j]=0;
			}
				System.out.print(a[i][j]+"\t");
		}
		System.out.println();

	}

	}}
//for문을 작성할때 열과 행의 값을 0으로 지정하여 모든수를 출력하게 하고
//if문을 써서 홀수 연산자를 사용하여 홀수를 골라놓고 0으로 출력되게 하였음.