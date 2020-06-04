import java.util.Scanner;


public class EXAM {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		int t=8000 , p=0;
		
		System.out.println("아동 수:");
		a=sc.nextInt();
		
		System.out.println("성인 수:");
		b=sc.nextInt();
		
		p=(t-2000)*a+t*b;
		System.out.println("총 수량:"+(a+b));
		System.out.println("금액:"+p);
		
	}

}
