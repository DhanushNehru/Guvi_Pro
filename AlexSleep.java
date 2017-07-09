import java.util.Scanner;
public class AlexSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String str=sc.next();
		int i;
		int count=0;
		if(k<=n) 
		{
		for(i=0;i<k;i++) {
			int id=sc.nextInt();
			if(str.charAt(id-1)=='1')
			{
				++count;
			}
			
		}
		if(count!=0) {
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
		}
		}
		else {
			System.out.println("Number of friends exceeds number of students in class");
		}
		sc.close();
	}
}
