package testpm;

public class Test05 {
	
	public static void main(String[] args) {
		// Q1.100부터 999까지의 숫자중에서 홀수만 출력하시오.
		System.out.print("Q1.");
		for(int i=100; i<1000; i++){
			if (i%2 ==1) {
			System.out.println(i);
			}
		}
		// Q2.1부터 100까지 숫자 중에서 홀수의 총합을 구하시오.
		System.out.print("Q2.");
		int s = 0;
		for(int j = 1; j <=100; j++){
			if(j%2==1){
				s += j;
			}
		}	
		     System.out.println(s);
		// Q3. 다음과 같이 출력하시오 10 9 8 7 6 5 4 3 2 1
		     System.out.print("Q3.");
		 for(int a=10; a> 0; a--) {
			 if(a==1) {
				 System.out.println(1);
			 }else
				 System.out.println(a+"");
		 }
		 //Q4.arr배열에서 배열의 값이 짝수인 것만 출력하시오.
		 System.out.print("Q4.");
		 int[] arr= {45,23,25,64,3,24,48};
		 for(int k=0; k < 7; k++) {
			 if(arr[k] %2 == 0) {
				 System.out.println(arr[k]);
			 }
		//Q6.배열에서 배열의 값이 홀수 인 곳의 인덱스만 출력하시오.
			 System.out.println("Q6");
				for (int e = 0; e < 7; e++) {
					if (arr[e] % 2 == 1) {
						System.out.println(e);
					}
				}
	    //Q7.arr배열의 값을 모두 더한 총합을 구하시오.
				System.out.println("Q7");
				int f = 0;
				for (int e = 0; e < 7; e++) {
					f += arr[e];
				}
				System.out.println(f);
					
				
		//Q8.arr배열에서 짝수는 모두 몇개인가요?
	            System.out.println("Q8");
	            int arrCnt = 0;
	            for(int p = 0; p < 7; p++){
	            if (arr[p] % 2 == 0) {
	            	arrCnt++;
	               }
	            }
	            System.out.println(arrCnt);
	         // 9. 아래 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요.
	    		System.out.println("Q9");
	    		String test = "abcdeabce";
	    		int cntA = 0;
	    		for (int i = 0; i < 9; i++) {
	    			char aaa = test.charAt(i);
	    			if (aaa == 'a') {
	    				cntA++;
	    			}
	    		}
	    		System.out.println(cntA);
	    		
	    		// 10. arr배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
	    		System.out.println("Q10");
	    		int g = arr[0];
	    		for (int e = 0; e < 7; e++) {
	    			if (arr[e] > g) {
	    				g = arr[e];
	    				System.out.println(g+", "+e);
	    			}
	    		}
	    		
	    		// 11. 범인 숫자 구하기.
	    		//	   범인은 100부터 999까지 숫자 중에 여러명이다.
	    		//	   범인의 특징은 숫자의 각 자릿수를 더한 값이 짝수이다. 범인의 숫자를 모두 찾으시오.
	    		System.out.println("Q11");
	    		for (int h = 100; h < 1000; h++) {
	    			if (((h/100) + (h%100)/10 + (h%10)) % 2 == 0) {
	    				System.out.println(h);
	    			}
	    		}
	    		
	    		// 12. A배열에서 0은 터널이다. 가장 긴 터널의 길이를 구하시오.
	    		System.out.println("Q12");
	    		int[] A = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,2,2,0,0,0,0,0,3,3};
	    		int i = 0;
	    		int h = 0;
	    		int m = 0;
	    		int n = 0;
	    		for (int l = 0; l < 24; l++) {
	    			if (A[l] == 0 && (A[l] == A[l+1]) && (A[l] != A[l-1])) {
	    				i = l;
	    			} if (A[l] == 0 && (A[l] == A[l-1]) && (A[l] != A[l+1])) {
	    				h = l;
	    			} if (h - i > 0) {
	    				m = h - i;
	    			} if (m > n) {
	    				n = m;
	    			}
	    		}
	    		System.out.println("길이 "+n);
	    		
	    		// 13. A배열에서 숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
	    		System.out.println("Q13");
	    		int o = 0;
	    		int p = 0;
	    		int q = 0;
	    		int r = 0;
	    		int y = 0;
	    		int t = 0;
	    		for (t = 0; t < 24; t++) {
	    			if (t == 0) {
	    				if (A[t] == A[t+1]) {
	    					o = t;
	    				}
	    			} if (t == 23) {
	    				if (A[t] == A[t-1]) {
	    					p = t;
	    				}
	    			} if (t != 0 && t != 23 && A[t] == A[t+1] && (A[t] != A[t-1])) {
	    				o = t;
	    			} if (t != 0 && t != 23 && A[t] == A[t-1] && (A[t] != A[t+1])) {
	    				p = t;
	    			} if ((p - o) > 0) {
	    				q = p - o + 1;
	    			} if (q > r) {
	    				r = q;
	    				y = A[t-1];
	    			}
	    		}
	    		System.out.println("가장 긴 숫자 "+s+" 길이 "+r);
	    		
	    		// 14. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요.
	    		System.out.println("Q14");
	    		String ttt ="aabbbcccaaaaddbbbaaaaa";
	    		int x1 = 0;
	    		int y1 = 0;
	    		int z1 = 0;
	    		int v1 = 0;
	    		char textT = ' ';
	    		for (int u = 0; u < 22; u++) {
	    			char w = ttt.charAt(u);
	    			if (u == 0) {
	    				if (w == ttt.charAt(u+1)) {
	    					x1 = u;
	    				}
	    			}
	    			if (u == 21) {
	    				if (w == ttt.charAt(u-1)) {
	    					y = u;
	    				}
	    			}
	    			if (u != 0 && u != 21) {
	    				if (w == ttt.charAt(u+1) && w != ttt.charAt(u-1)) {
	    					x1 = u;
	    				}
	    			}
	    			if (u != 0 && u != 21) {
	    				if (w == ttt.charAt(u-1) && w != ttt.charAt(u+1)) {
	    					y = u;
	    				}
	    			}
	    			if ((y - x1) > 0) {
	    				z1 = y - x1 + 1;
	    			}
	    			if (z1 > v1) {
	    				v1 = z1;
	    				textT = ttt.charAt(u);
	    			}
	    		}
	    		System.out.println("알파벳 이름 "+textT+" 길이 "+v1);
	    		
	    		// 15 . 아래 문자열을 압축하시오. 압축하는 방법 : a2b3c3a4d2b3a5
	    		System.out.println("Q15");
	    		String text ="aabbbcccaaaaddbbbaaaaa";
	    		
	    		
	    		
	    		
	    		

	    	}

	}
}


    
