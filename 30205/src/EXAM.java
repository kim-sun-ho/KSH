import java.util.Scanner;


public class EXAM {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		int t=8000 , p=0;
		
		System.out.println("�Ƶ� ��:");
		a=sc.nextInt();
		
		System.out.println("���� ��:");
		b=sc.nextInt();
		
		p=(t-2000)*a+t*b;
		System.out.println("�� ����:"+(a+b));
		System.out.println("�ݾ�:"+p);
		
	}

}
