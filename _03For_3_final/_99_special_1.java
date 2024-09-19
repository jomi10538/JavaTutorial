package _03For_3_final;

public class _99_special_1 {
	/**
	 * 
	 * 특별1
	String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
	문자열 a는 한자릿수의 숫자를 수집한 문자열이다.
	숫자별로 수집된 수만큼 카운팅하세요.
	카운팅 배열은
	int[] a = new int[10]; 
	// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
	// 인덱스 0 - 9까지를 숫자로 정의한다.
	조건 : 형변환은 사용하지 않는다. 메서드는  charAt()만 사용한다. 
	 * @param args
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// 분석
			/**
			 * 문자열이네.. 패턴을 보니 한자리 숫자 다음에  문자 / 가 있군
			 * 카운팅을 하라고 하네..
			 * 1번이 몇개인지 2번이 몇개인지?? 이렇게
			 * 카운팅 정보를 변수에 저장해도 되지만 .. 배열에 저장을 하라고 하는군
			 * 
			 * 배열은 길이가 10이라면 인덱스는 0부터 9까지네..
			 * 오호, 숫자를 카운팅하기 딱 좋군..
			 * 숫자를 카운팅해서 카운팅 한 결과를 어떻게 저장할지 생각해 내면 되겠네요~~
			 * 
			 * 자 이제 카운팅하는 부분까지 분석이 되었으니..
			 * 카운팅 해 봅시다.
			 * 카운팅을 하라면  a 문자열을 0번 부터 순회해야 합니다.
			 * 처음 가져오는 숫자는 6. 그러나 이것은 문자.. 정수로 바꿔야 하는데? 
			 * 그리고 이 6을 카운팅 합시다. 
			 * 
			 * 
			 */
			String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
			int[] aa = new int[10]; 
			for(int i=0; i< a.length(); i++) {
				char temp = a.charAt(i);
				if(temp != '/') {
					aa[temp-48]++;
				}
			}
			for(int i=0; i< aa.length; i++) {
				System.out.println(i+"숫자 : "+aa[i]);
			}

	}

}
