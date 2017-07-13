import java.util.Scanner;
public class ChocolatesCut {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		int output=(M>0 && N>0)? (M*N)-1 : 0;
		System.out.println(output);
	}
}
