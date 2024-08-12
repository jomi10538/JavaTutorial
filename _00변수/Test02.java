package _00변수;

public class Test02 {
	public static void main(String[] args) {

	//문제1

	int[] Array = new int[5]; 
	Array[0]=30;
	Array[1]=40;
	Array[2]=50;
	Array[3]=60;
	Array[4]=55;
    System.out.println(Array[0]+","+Array[1]+","+Array[2]+","+Array[3]+","+Array[4]+",");
    
	//문제2
    String[] famillyname = new String[3];
    famillyname[0]= "Kim";
    famillyname[1]= "Lee";
    famillyname[2]= "Park";
    System.out.println( famillyname[0]+","+famillyname[1]+","+famillyname[2]);
   
    //문제3
    int[] lotto = new int[6]; 
    lotto[0]=6;
    lotto[1]=12;
    lotto[2]=33;
    lotto[3]=4;
    lotto[4]=5;
    lotto[5]=26;
    System.out.println(lotto[2]+2);
    
    //문제4
    System.out.println(lotto[0]+lotto[2]+lotto[4]);
    
    //문제5
    lotto[0]=(lotto[0]);
    lotto[1]=(lotto[0]+lotto[1]);
    lotto[2]=(lotto[0]+lotto[1]+lotto[2]);
    lotto[3]=(lotto[0]+lotto[1]+lotto[2]+lotto[3]);
    lotto[4]=(lotto[0]+lotto[1]+lotto[2]+lotto[3]+lotto[4]);
    lotto[5]=(lotto[0]+lotto[1]+lotto[2]+lotto[3]+lotto[4]+lotto[5]);
    System.out.println(lotto[0]+","+lotto[1]+","+lotto[2]+","+lotto[3]+","+lotto[4]+","+lotto[5]);
    //문제6
    boolean flag =false;
	flag = (lotto[3]%2 == 1);
	System.out.println(flag);
	
	//문제7
	
	int money=2750;
	int pay=10000;
	int rest = pay -money;
	System.out.println("천원:"+(rest/1000)+"개"+","+"백원"+((rest%1000)/100)+"개"+","+"십원"+((rest%1000)/50)+"개");
	
	//문제8
	
	int xA = 700;
	int yA = 500;
	int xB = 900;
	int yB = 300;
	
	int xC = 650;
	int yC = 150;
	
	boolean value = (xA <= xC && xC <= xB+3) && (yA >= yC && yC>= yB+3);
	System.out.println(value);
	
	
	
	
	
	
	
	
	
	
	
    
   
	}
}