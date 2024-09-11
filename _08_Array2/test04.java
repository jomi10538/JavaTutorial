package _08_Array2;

public class test04 {

	public static void main(String[] args) {
		int[][]  a= {{1,2,3,4,5},
			    {6,7,8,9,10},
			    {11,12,13,14,15},
			    {16,17,18,19,20},
			    {21,22,23,24,25}};
//4.전체 배열의 값 중 짝수는 모두 몇 개인가?
	int cnt=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]%2==0){
				  cnt++;
				}
			}
		}
			System.out.println(cnt);
			
		
	}
}

//총 개수를 구하는 문제라 int에 cnt=0;를 설정했고,if구문에 짝수 연산자를 사용하고 그 값을 증가시키는 ++를 사용하니 a안에 있는 짝수의 개수가 출력됨	

