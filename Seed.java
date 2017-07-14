package Pro;
import java.util.Scanner;
public class Seed {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int storeNum=num;
		int i;
		int mult=1;
		int fla=0;
		for(i=num;i>=1;i--) {
			int temp=i;
			int a=i;
			while(temp!='\0') {
				mult=mult*a;
				a=temp%10;
				temp=temp/10;
			}
			if(mult==storeNum) {
				System.out.println(i +" ");
				++fla;
			}
			mult=1;
		}
		if(fla==0) {
			System.out.println("No seed found");
		}
		sc.close();
	}
}