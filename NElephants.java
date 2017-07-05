import java.util.Scanner;
public class NElephants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int elephants=sc.nextInt();
		int weight=sc.nextInt();
		int i;
		int arr1[]=new int[weight];
		for(i=0;i<elephants;i++){
			arr1[i]=sc.nextInt();
		}
		int sum=0;
		int count=0;
		for(i=0;i<elephants;i++){
			sum=sum+arr1[i];
			if(sum<=weight){
				++count;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
