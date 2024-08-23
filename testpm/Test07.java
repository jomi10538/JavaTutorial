package testpm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test07 {

	private static int i;

	public static void main(String[] args) {
		//Q0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		System.out.println("Q0.");
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = input.nextInt();		
			
			if(num%2==0) {
				System.out.println("짝수입니다");
			}else {
				System.out.println("홀수입니다");
			}
		//Q1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
			System.out.println("Q1");
			int s;
		    int t;
			System.out.println("첫번째 숫자를 입력하세요");
			s=input.nextInt();
			System.out.println("두번째 숫자를 입력하세요");
			t=input.nextInt();
			int sum;
			sum=s+t;
			System.out.println(s+"와"+t+"을 더하면"+sum+"입니다");
			
		//Q2. 행운의 숫자 인지를 판별해 보자.1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
			System.out.println("Q2");
			Random a = new Random();
			// 1부터 100 사이에서 무작위 수를 추출하는 변수 생성
			int b = a.nextInt(100) + 1;
			if(b % 7 == 0) {
				System.out.println(b + "은/는 행운의 숫자.");
			}else {
				System.out.println("현재 숫자 : " + b);
				System.out.println("다시 뽑으시오.");
			}
	
		//Q3. 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다.7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		   System.out.println("Q3");
		   for(int i=0; i<1000; i++) {
			   System.out.println(i+"번째 추첨");
		  int b1 = input.nextInt() +1;
		  System.out.println(b1);
		  if(b1%7!=0) {
			  System.out.println(b1+"은/는 조심해야 숫자.");
			  continue;
		  }else {
			  System.out.println(b1+"은/는 행운의 숫자.");
			  break;
		  }
		 } 

		//Q4. . 숫자 10개를 저장할수 있는 배열을 만들고 0부터 99숫자중 랜덤으로 10개를 뽑습니다.
		//이중 짝수만 저장하고 홀수는 무시합니다.(다시 뽑지 않습니다.)
		//0번째 번호 98이라면   0번 인덱스에 저장
		//1번째 번호 97이라면   무시  1번 인덱스는 선언시 초기값
		//2번째 번호 88이라면   2번  인덱스에 저장
		   System.out.println("Q4");
		   int[] arr = new int[10];
		   Random a1=new Random();
		   
			for(int c=0; c<10; c++) {
				int d = a.nextInt(100);
				System.out.println(c+"번째 값은"+d);
				if(d % 2 == 0) {
					arr[c] = d;
					}
			    System.out.println(c+"번째 번호"+arr[c]);
			}
		   
		//------------------------------------------
		//Random r = new Random();   //변수이름은 r이며 랜덤한 숫자를 추출하는 기능인 Random이라는 자료형을 선언함
		//int num = r.nextInt(45)+1;     // 변수 r을 참조하여 nextInt 메서드를 호출함. 매개변수는 랜덤한 숫자의 범위를 지정함
		                                     // 즉 0 - 44까지 중 랜덤한 숫자 하나를 선택하여 리턴함.
		                                     // 로또 번호는 1-45까지 이므로 리턴값이 +1로 보정함
		                                     // 리턴값을 보정하여  num변수의 값에 대입

		//위 코드를 이용하여
		//Q5.로또번호를 자동으로 생성하는 게임을 작성하시오.중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
			System.out.println("Q5");
			Random r1 = new Random();
			int[] lotto = new int[6];
			
			for(int i=0; i<6; i++) {
				int num1 = r1.nextInt(45)+1;
				lotto[i]=num1;
				System.out.println((i+1)+"번째는 "+lotto[i]);
			}
			
		//Q6. 컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다. 
          System.out.println("Q6");
          int maxcnt=0;
          int maxlotto=0;
          int[] lottonum = new int[45];
          for(int i=0; i<10000; i++) {
        	  int num1 = r1.nextInt(45);
        	  lottonum[num1]++;
          }
          for(int i=0; i<45; i++) {
        	  if(maxcnt<=lottonum[i]) {
        		  maxcnt =lottonum[i];
        		  maxlotto=i;
        		  System.out.println("오늘의 추천 로또 번호는"+(maxlotto+1)+"뽑힌 횟수"+maxcnt);
        	  }
          }
		//-------------------------------------------------------
		//Q7. int jobTime ={40,32,4,16,5,8};위 배열에서 인덱스를 사람의 번호로 가정한다.
        //jobTime[2] 의 의미는 2번 사람이 업무를 마치기 위한 시간이다.작업장을 사용할 수 있는 시간은 최대  4시간이다.
        //작업장은 한 사람만 사용할 수 있고. 사용이 끝나면 작업장을 나와야 하고다음 사람이 작업장을 사용한다. 
        //(만약,다음 사람의 업무가 종료 되었다면, 그 다음 사람이 사용이 가능하다)0번 부터 1 2 3 4 5번 순으로 작업장을 사용한다면
        //실제 작업장을 사용한 사람의 기록을 순서대로 출력하시오.
          System.out.println("Q7");
          int[] jobTime ={40,32,4,16,5,8};
          int workTime=4;
          int index=0;
          int maxNum =0;
          int maxIndex=0;
          
          for(int i=0; i<maxNum; i++) {
        	  if(jobTime[i] > maxNum){
        		  maxNum=jobTime[i];
        		  maxIndex=i;
        	  }
          }
          for(;;) {
        	  if(jobTime[index%6]<=0) {
              }else {
        	  jobTime[index%6]-=workTime;
        	  System.out.println((index%6)+"번째 사람 작업장 사용");
              }
        	  index++;
        	  if(jobTime[maxIndex]<=0) {
        		  break;
        	  }
        	  
         } 

		//Q8.
		// 배열 저장 변수
          System.out.println("Q8");
				int[] lotto2 = new int[6];
				// 키보드로 부터 입력받기 위한 객체 만들기.
			Scanner in = new Scanner(System.in); // ctrl shift o
				// 0번째 번호부터 로또 번호 입력받기
				for (int i = 0; i < lotto2.length; i++) {
				System.out.println((i + 1) + "번 입력하세요");
				int k = in.nextInt();  // nextInt는 키보드로 숫자만 가져온다.
					in.nextLine();  // 버퍼 지우기
					lotto2[i] = k;
				}
				// 로또 번호를 출력하는 반복문
				for (int i = 0; i < lotto2.length; i++) {
					if (i == lotto2.length - 1) { // 마지막 번호
						System.out.println("보너스 : " + lotto[i]);
					} else {
						System.out.println(lotto2[i]);
					}
				}

	}

}

