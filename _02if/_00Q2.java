package _02if;

public class _00Q2 {

	public static void main(String[] args) {
		// 수강관리 프로젝트를 진행한다.
		// 학생의 정보는 이름 학번 나이 성적이다.
		// 나이가 18세 미만은 수강신청을 할 수 있다.
		// 성적이 60점 이상이면서 70점 미만인 학생은 수강 신청을 할 수 있지만.
		// 이름 뒤에 별표를 추가한다.
		// 학생의 성적을 기준으로 
		// 90점 이상이면 A
		// 80점 이상이면 B
		// 70점 이상이면 C
		// 60점 이상이면 D
		// 60점 미만이면 F라고 출력한다.
		// Student data
		String studentName = "Chulsu";
		int studentID = 24;
		int studentAge = 18;
		int point = 89;
		
		if(studentAge >18) {
			if(point >= 90) {
				System.out.println("A"+"수강신청 불가능");	
			}
		}else if(point >=80) {
			    System.out.println("B"+"수강신청 불가능");
		}else if(point >=70) {
			    System.out.println("C"+"수강신청 불가능");
	    }else if(point >=60) {
	    	    System.out.println("D"+"수강신청 가능");
	    }else if(point >=50) {
    	    System.out.println("F"+"수강신청 불가능");
	    	    
		}
   	}
}

