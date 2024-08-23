package testpm;

public class Test08 {

	public static void main(String[] args) {
		//<1-6> 필수 코스 -------------------------------------
		//Q1. 
		//1*1=1  1*2=2   1*3=3
		//2*1=2  2*2=4   2*3=6
		//3*1=3  3*2=6   3*3=9
		//4*1=4  4*2=8   4*3=12
		System.out.println("Q1.");
		for(int i=1; i<5; i++) {
			for(int k=1; k<4; k++) {
				System.out.println(" "+i+"X"+k+"="+i*k);
			}
			System.out.println();
		}

		//Q2. 
		//*****
		//****
		//***
		//**
		//*
        System.out.println("Q2.");
        for(int i=0; i<5; i++) {
        	for(int j=4; j>=i; j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }

		//Q3.
		//000*
		//00***
		//0*****
		//*******
        System.out.println("Q3.");
        for(int h=1; h<5; h++ ) {
        	for(int i=3; i-(h-1)>0; i--) {
        		System.out.print("0");
        	}
        	for(int g=1; g<(2*h); g++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
		//Q4. 
		//*******
		//0*****
		//00***
		//000*
        System.out.println("Q4.");
        for(int j =4; j > 0; j--) {
        	for(int k =3; k > k%j; k--) {
        		System.out.print("0");
        	}
        	for(int l = 1; l <j*2; l++) {
        		System.out.print("*");
        	}
        	System.out.println();
        	}
        
		//Q5. int[] a ={34,55,23,56,34,45,34};
		//40보다 큰 수는 모두 몇개인가?
        System.out.println("Q5.");
        int[] a ={34,55,23,56,34,45,34};
        int cnt=0;
        for(int o=0; o < a.length; o++) {
        	if(a[o]>40) {
        		cnt++;
        	}
        }
        System.out.println("40보다 큰 수는"+cnt+"개");
	

		//Q6
		//int[] a ={34,55,23,56,34,45,34};
		//int[] b ={36,49};
		//b배열의 값보다 큰 값이 a 배열의 값에 모두 몇개가 있는가?
		//각각 카운팅 하시오 
		//출력은
		// a 배열의 값에는  36번호 보다 큰 숫자가 ?? 개 있습니다.
		// a 배열의 값에는  49번호 보다 큰 숫자가 ?? 개 있습니다.

		//0 1 2 3 4 5 6
		//0 1
        System.out.println("Q6.");
        int[] p ={34,55,23,56,34,45,34};
		int[] q ={36,49};
		int cnt1=0;
		for (int i=0; i < q.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(q[i]<a[j]) {
					cnt1++;
				}
			}
			System.out.println("a 배열의 값에는 "+q[i]+"번호보다 큰 숫자가 "+cnt+"개 있다.");
			cnt=0;
		}
		//upgrade -------------------------------

		//Q7. 거스름돈 구하기   10000원짜리 0개, 1000원짜리 0 개, 100짜리 0개, 10짜리 0개,   조건 : /나 %연산자는 각각 최대 두 번씩 사용가능
		//   단, 거스름돈은 만천원이 최대 값이다. 
		//int money=4570;  // 가격
		//int pay = 10000;  //지불금액
		System.out.println("Q7.");
		int money=4570;
		int pay = 10000;
		
		int charge = pay-money;
		int charge1 = charge/10;
		for(int r=1; r<=1000; r=r*10){
			int r1=charge1%(10*r);
			if(r1>=1000) {
				System.out.println(10*r+"원 1개");
			}else if(r1>10) {
				System.out.println(10*r+"원"+r1/(1*r)+"개");
			}else
				System.out.println(10*r+"원"+r1%(10*r)+"개");
			}
		

		//Q8.
		//int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5}   -이중 for  사용
		//애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
		//괄호에 같은 캐릭터가 3개 이상이면 제거 대상이다.
		//제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 출력하시오.

		//1 0 0 0 2 3 3 4 4 6 2 2 2 2 5
		System.out.println("Q8.");
		int cnt2 = 0;
		int num = 0;
		int index1 = 0;
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,1,0};
		for(int i=0; i<pang.length-1; i++) {
			for(int j=i+1; j<i+2; j++) {
				if(pang[i]==pang[j]) {
					cnt2++;					
				}else if(cnt2>=2){					
					num = pang[i];
					index1 = i;
					System.out.println("제거 대상의 캐릭터 번호는 "+num+", 시작 위치 인덱스는 "+(index1-cnt2)+", 갯수는 "+(cnt2+1));
					cnt2=0;
					num=0;
					index1=0;
					break;
				}else {
					cnt2=0;
				}
			}
		}

		//Q9. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
		// String ttt ="aabbbcccaaaaddbbbaaaaa";
		System.out.println("Q9.");
		String ttt ="aabbbcccaaaaddbbbaaaaaE";
		int sum1 = 0;
		char A = 'F';
		int cnt3= 0;
		for(int s=0; s<ttt.length(); s++) {
			for(int u=s+1; u<ttt.length(); u++) {			
				if(ttt.charAt(s)==ttt.charAt(u)) {
					cnt3++;			
				} else if(cnt3>=sum1) {
					sum1=cnt3;
					A=ttt.charAt(s);
					cnt3=0;
					break;
				}else {
					cnt3=0;
					break;					
				}
			}
		}System.out.println("가장 긴 터널의 알파벳: "+A+", 터널의 길이: "+(sum1+1));
		

		//Q10. 난건물주  <이중For사용>
		//int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		//int size=2;
		//arr 배열에서 0이 의미하는 것은 공터이다. 
		//size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		//size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		//size가 2일경우에 7개이다. 
		System.out.println("Q10.");
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
//		int size=2;
		int cnt4 = 0;
		for(int i=0; i<arr.length-1; i++) {			
				for(int j=i+1; j<i+2; j++) {
					if(arr[i]==arr[j] && arr[i]==0) {
						cnt4++;
					}else {
						break;
					}
			}
		}System.out.println(cnt4+"개");

		//Q11.
		//000*
		//00***
		//0*****
		//*******
		//0*****
		//00***
		//000*
		System.out.println("Q11.");
		for(int v=1; v<8; v++) {			
			if(v<5) {		
					for(int w=3; w-(v-1)>0; w--) {
							System.out.print("0");				
					}
					for(int x=1; x<(2*v); x++) {
						System.out.print("*");
					}
					System.out.println("");
			}else {		
					for(int x=3; x<v-1; x++) {
						System.out.print("0");
					}
					for(int w=15; w>v*2; w--) {
							System.out.print("*");				
					}
					System.out.println();
			}
		}

		//Q12. 11번 문제에서 for문 2개만 사용하기 if문은 갯 수 상관없음.
		System.out.println("Q12.");
		System.out.println("000*");
		System.out.println("00***");
		System.out.println("0*****");
		System.out.println("*******");
		System.out.println("0*****");
		System.out.println("00***");
		System.out.println("000*");


	}

}
