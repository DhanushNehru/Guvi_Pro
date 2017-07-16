package Pro;
import java.util.Scanner;
public class DivideArrayInto2PartsAveragesAreSame {
	static int index=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int arr[]=new int[n];
		int i,j;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum1=0;
		int sum2=0;
		int avg1=0;
		int avg2=0;
		int flag=0;
		int count1=0;
		int count2=n;
		for(i=0;i<n;i++) {
			sum1=sum1+arr[i];
			++count1;
			avg1=sum1/(count1);
			for(j=i+1;j<n;j++) {
				sum2=sum2+arr[j];
				index=j-1;
			}
			--count2;
			if(count2!=0)
				avg2=sum2/(count2);
			//System.out.println("Sum ->"+sum1+" "+sum2);
			//System.out.println("Avg ->"+avg1+" "+avg2);
			//System.out.println("Count->"+count1+" "+count2);
			if(avg1==avg2) {
				++flag;
				break;
			}
			avg1=0;
			avg2=0;
			sum2=0;
		}
		if(flag==0) {
			System.out.println("Not Possible");	
		}
		else {
			int array1[]=new int[index];
			int array2[]=new int[n-index];
			for(i=0;i<index;i++) {
				array1[i]=arr[i];
			}
			int z=0;
			for(i=index;i<n;i++) {
				array2[z++]=arr[i];
			}
			printArray(array1);
			printArray(array2);
		}
		sc.close();
	}
	public static void printArray(int arr[]) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.print(" ]");
		System.out.println();
	}
}
