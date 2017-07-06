import java.util.Scanner;
public class getInputByAdding2PrimeNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		int i,j;
		int flag=0;
		int k=0;
		int f1=0,f2=0;
		int count=0;
		for(i=10;i<n;i++){
			for(j=10;j<n;j++){
				for(k=2;k<=i/2 || k<=j/2;k++){
					if(i%k==0 || j%k==0){
						flag=1;
						break;
					}
				}
				if(flag==0){
					if(n==i+j){
						f1=i;
						f2=j;
						++count;
						break;
					}
				}
				flag=0;
			}
			flag=0;
		}
		if(count!=0){
			System.out.println(f2+" "+f1);
		}
		else{
			System.out.println("No two digit prime number adds up to the given number");
		}
		sc.close();
	}
}
