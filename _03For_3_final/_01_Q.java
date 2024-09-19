package _03For_3_final;

public class _01_Q {
	/**
	 * 1 큰놈
	int[] letter={8,12,4,13,2,14,4,5}
	배열의 가장 큰수가 있는 인덱스를 출력하시오.
	 */

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/*
			 * 분석 : 배열이 하나 있고 배열의 길이와 인덱스의 범위와 
			 * 배열이 값으로 가질 수 있는 값의 타입을 분석합니다.
			 * 배열에 저장된 값 중 가장 큰수가 있는 배열의 인덱스를 출력하는 문제
			 * 
			 * 이것도 단계별로 나누어서 생각을 합니다.
			 * 1. 배열을 순회할 필요가 있습니다. 초기값, 조건, 증감식을 이용해 작성합니다.
			 * 2. 현재 i 값에 해당되는 배열의 값이 가장 큰수인지 알 수가 없습니다.
			 *    가장 큰 값을 저장하는 변수를 하나 선언하면 해결이 가능합니다.
			 *    그래서 가장 큰수를 저장하는 변수 int max=0;을 선언합니다.
			 *    
			 *    이렇게 되면 현재 i에 해당되는 배열의 값 >> letter[i]
			 *    과 max변수의 값이 비교가 가능합니다.
			 *    max 변수는 최대값을 저장하는 변수입니다.
			 *    letter[i]와 max 값을 비교했을 때 letter[i]값이 더 크다면
			 *    최대값은 갱신이 되어야 합니다. 		    
			 *    이렇게 i가 0 1 2 3 4 반복되면서 최대값은 갱신이 될 것이고 모든 배열의 
			 *    인덱스를 비교했다면  max에는 최대값을 저장하고 있을 것입니다.
			 *    
			 *    
			 * 
			 */
			int[] letter={8,12,4,13,2,14,4,5};
			//가 코드
			for(int i=0; i < letter.length; i++) {
				
			}
			
			// 나 코드
			int max=0;
			for(int i=0; i < letter.length; i++) {
				if(max < letter[i]) {
					max=letter[i];
				}
			}
			System.out.println(max);
	}

}
