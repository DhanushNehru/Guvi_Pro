import java.util.Scanner;
public class AnnaBrianBonAppetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k= sc.nextInt();
		int i;
		int sum=0;
		int arr[]=new int[n];
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(i!=k){
				sum=sum+arr[i];
			}
		}
		int b=sc.nextInt();//charged
		sum=sum/2;
		if(sum==b){
			System.out.println("Bon Appetit");
		}
		else{
			System.out.println(Math.abs(sum-b));
		}

	}

}
