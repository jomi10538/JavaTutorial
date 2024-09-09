package testpm;

public class Test12 {

	public static void main(String[] args) {
		int[] jobTime= {40,32,4,16,5,8};
		for(int a=0; a<10; a++) {
		for(int b=0; b<6; b++) {
			jobTime[b]=jobTime[b]-4;
			if(jobTime[b]>=0){
				System.out.println(b+"번 사랑이 사용, 남은 시간:"+(jobTime[b]));
			}else 
				if(jobTime[b]>= -3) {
					System.out.println(b+"번 사람이 사용, 남은 시간:"+0);
			}
		}
		}

	}

}
