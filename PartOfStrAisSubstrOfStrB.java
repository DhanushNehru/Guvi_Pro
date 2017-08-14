import java.util.Scanner;
public class PartOfStrAisSubstrOfStrB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1=sc.next();
		System.out.println("Enter String 2");
		String str2=sc.next();
		System.out.println(evaluate(str1,str2));
		sc.close();
	}
	public static boolean evaluate(String str1,String str2) {
		int i,j;
		boolean bool=false;
		for(i=0;i<str1.length()-2;i++) {
			for(j=0;j<str2.length()-2;j++) {
				if(str1.substring(i,i+2).equals(str2.substring(j,j+2))) {
					bool=true;
					break;
				}
			}
			if(bool==true) {
				break;
			}
		}
		return bool;
	}
}
