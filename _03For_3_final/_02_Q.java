package _03For_3_final;

public class _02_Q {
	/**
	 * 
	2 현상수배
	int[] letter={8,12,4,13,25,14,4,5}
	범인을찾으시오
	범인은 짝수이면서 가장큰 값이다. 
	범인은 14입니다. 
	 * @param args
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//_00번문제와 _01번 문제와 비슷한 유형입니다.
			
			/** 분석 : 배열이 선언됨. 배열으 길이, 인덱스 범위. 배열의 value type
			 * 
			 * step1: 범인은 배열의 값 중에 있으므로 배열을 순회해야 한다.
			 *     반복문 필요> 초기값, 조건, 증감식 작성
			 *     
			 * 
			 * step2 : 범인은  짝수이면서 가장 큰 값이다.
			 *          이렇게 조건이 있을때, 어떤 조건이 먼저 선행되는지 판단하여
			 *          조건을 다시 나눕니다.
			 *          
			 *          step2-1 : 범인은 짝수이다.
			 *          범인은  짝수이다. 조건을 먼저 분석합니다.
			 *          범인이 짝수이다 이 문제를 해결하기 위해서는 수식이 필요합니다.
			 *          수식을 작성하고
			 *          수식이 참일경우는 범인 후보이고
			 *          아닐 경우는 범인이 아닙니다.
			 *          참일 경우 어떤 처리를 해야 하고 거짓인 경우는 어떤 처리를 해야 할지 작성합니다.          
			 *          
			 *          step2-2 : 범인은 짝수이면서 가장 큰 값이다.
			 *          이번에는 가장 큰 값을 찾습니다.
			 *          가장 큰 값을 찾는 것은 _01문제랑 비슷하다고 해도 무방합니다.
			 *          _01문제를 참고하여서 작성합니다. 
			 *          
			 * step3 : 범인을 출력합니다. 
			 * 
			 * 
			 * 
			 */
			int[] letter={8,12,24,13,2,14,4,5};
			//step1 코드
			for(int i=0; i < letter.length; i++) {
				
			}
			
			// step2 코드
			int max=0;
			for(int i=0; i < letter.length; i++) {
				if(letter[i]%2==0) {
					if(max < letter[i]) {
						max=letter[i];
					}
				}
			}
			System.out.println(max);
	}

}
