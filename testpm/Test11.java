package testpm;

public class Test11 {

	public static void main(String[] args) {
		String a=new String("aabbccddeeeaaaa");
				int cnt=0;
		int sumcnt=0;
		
		for(int i=0; i<a.length(); i++) {
			if (a.charAt(i)=='a') {
				cnt++;
			}else {
				cnt=0;
			}
			if(sumcnt<cnt) {
				sumcnt=cnt;
			}
		}
System.out.println("길이"+sumcnt);
	}

}
