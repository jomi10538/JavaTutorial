package testpm;

import java.util.Arrays;

public class Test09 {

	public static void main(String[] args) {
		//Q1
		//int[] arr = {3,45,26,50,74};
		//int a = 5;
		//a로 나누어 떨어지는 배열의 값을 모두 출력하시오.
        System.out.println("Q1.");
        int[] arr = {3,45,26,50,74};
		int a = 5;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % a == 0) {
				System.out.println(arr[i]);
			}
		}
		//Q2
		//int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		//배열의 평균값을 구하시오. 소수점 표현하시오. 
		System.out.println("Q2.");
		int[] arr1 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		int sum = 0; // 평균을 구하기위한 합을 저장할 변수 생성
		for (int b = 0; b < arr1.length; b++) {
			sum += arr1[b];
		}
		System.out.println((double) sum / arr.length);
		
		//Q3. 팩토리얼의 합 구하기 (2중 for로 해결)
		//1부터 10까지 숫자의 각패토리얼의 합을 구하시오
		//예를들어 4의 팩토리얼은  1*2*3*4
		//             5의 팩토리얼은 1*2*3*4*5
		System.out.println("Q3.");
		int sum1 = 0; 
		int factorial = 1; 
		for (int c = 1; c <= 10; c++) {
			for (int d = 1; d <= c; d++) {
				factorial *= d;
			}
			sum1 += factorial;
		}
		System.out.println(sum);

		//Q4. int[] b = {93,45,83,58,75,56}
		//다음조건에 따라 오름차순으로 정렬하시오.
		//1. 가장큰 값을 찾아서 맨뒤 값과 교환한다.. 결과  {56,45,83,58,75,93}
		//2. 두번째로 큰 값을 찾아서 맨뒤에서 두번째 자리의 값과 교환한다.  결과  {56,45,75,58,83,93}
		//3. 세번째로 큰 값을 찾아서 맨뒤에서 세번째 자리의 값과 교환한다.  결과  {56,45,58,75,83,93}
		//오름차순으로 정렬이 될때 까지 반복한다.
		System.out.println("Q4.");
		int[] b = {93,45,83,58,75,56};
		int change = 0; // 배열 순서를 바꾸기위해 배열의 값을 임시로 저장할 변수 필요
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = 0; j < b.length - 1 - i; j++) {
				if (b[j] > b[j+1]) {
					change = b[j+1];
					b[j+1] = b[j];
					b[j] = change;
				}
			}
		}
		System.out.println(Arrays.toString(b));

		//Q5.
		//int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599}
		//int[] parking = new int[10];
		//   carnum배열의 인덱스가 0인 값부터 주차장에 들어온다. // carnum배열은 자동차 번호를 의미합니다. 
		//   parking의 인덱스 번호가 주차번호이다. 
		//   자동차 번호의 마지막 번호는 해당 차량이 주차할 주차번호이다.
		//   만약 주차번호에 다른 차량이 주차되어 있으면 다음 주차번호에 주차를 한다.
		//   (이때, 다음 주차번호에도 차량이 있으면 주차불가이다.)

		//   주차가 끝난 후 주차번호와 주차항 차량 번호를 출력하시오.
		//--------------------------------------------------------------------------------------------
		//<이번 저희회사에서는 회원관리 프로젝트를 담당하게 되었습니다.
		//회원관리 프로젝트 중 회원의 아이디 유효성 체크를 미션으로 드립니다>
		System.out.println("Q5.");
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599};
		int[] parking = new int[10];
		for(int i1 = 0 ; i1 < carnum.length; i1++) {
			int parkNum = carnum[i1]%10;
			if(i1 == parkNum) {
				
			}
		}

		//Q6.
		//키보드로 아이디를 입력받는다.
		//입력 받은아이디에 특수 문자가 포함 되었는지 확인한다. (유효성)
		//특수 문자는 @한개로 정의한다.
		//특수문자가 몇 개 포함되었는지 출력합니다.

		//Q7.
		//키보드로 아이디를 입력 받는다.
		//입력 받은 아이디에 특수문자가 포함되었는지 확인한다. (유효성)
		//특수문자는 String sign="!@#$%^&*"로 정의한다.
		//특수문자가 몇 개 포함되었는지 출력합니다. 




	}

}
