package _03For_3_final;

public class _00_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 0 선택받은너
		int[] letter={8,12,4,13,2,14,4,5}
		짝수만 출력하시오.
		 */
				/*
				 * 분석
				 * 1. 배열을 순회하면서 짝수만 출력한다.
				 * 
				 * 단계를 세부적으로 나누어 봅니다.
				 * 가. 배열의 값이 짝수인지를 출력하기 위해서는 
				 *    배열의 모든 값을 순회해야 합니다.
				 *    배열을 순회하기 위한 For문을 작성합니다.
				 *    이때, 배열을 순회하기 위한 초기값 조건 증감식을 결정합니다.
				 *    
				 * 나. 짝수인지 판별을 합니다.
				 *    어떤 수를 짝수로 판별할지 결정하고
				 *    짝수를 판별하는 조건식을 만들고
				 *    조건식을 사용하여 참과 거짓을 구분하여 
				 *    참일 경우는 출력, 거짓일 경우는 문제에 정의 된 것이 없으므로 아무 코드도 하지 않습니다.
				 * 
				 * 
				 */
				int[] letter={8,12,4,13,2,14,4,5};
				//가 코드
				for(int i=0; i < letter.length; i++) {
					
				}
				
				//나 코드
				for(int i=0; i < letter.length; i++) {
					// 어떤 수는 i
					if(i%2==0) {
						System.out.println(i);
					}
				}
	}

}
