package _03for;

public class _0203_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 3. 1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		 */
				int cnt=0;
				for(int i=0; i <= 100; i++) {
					if(i%2==1) {
						cnt++;
					}
				}
				System.out.println(cnt);
	}

}
