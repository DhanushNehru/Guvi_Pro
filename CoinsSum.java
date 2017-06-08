import java.util.Arrays;
import java.util.Scanner;
public class CoinsSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of coins");
		int num=in.nextInt();
		int i,j;
		int arr[]=new int[num];
		System.out.println("Enter the values of coins");
		for(i=0;i<num;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the sum value");
		int sum=in.nextInt();
		for(i=0;i<num;i++){
			for(j=0;j<num;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int count=0;
		int arr1[]=new int[num];
		i=0;j=0;
		int flag=0;
		Arrays.sort(arr);
		while(j<num*num){
			if(sum>=arr[i]){
				sum=sum-arr[i];
				++count;
			}
			arr1[i]+=count;
			if(sum==0){
				++flag;
				break;
			}
			++i;
			++j;
			if(i==num){
				i=0;
			}
			count=0;				
		}
		if(flag>0){
			for(i=0;i<num;i++){
				System.out.println("Value "+arr[i]+" = "+arr1[i]);
			}
		}
		else{
			System.out.println("Not possible to select coins is such a way");
		}
		in.close();
	}
}
