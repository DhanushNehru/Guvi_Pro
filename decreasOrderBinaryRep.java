import java.util.Scanner;
public class decreasOrderBinaryRep {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int arr[]=new int[num];
		int i,j;
		for(i=0;i<num;i++){
			arr[i]=in.nextInt();
		}		
		int temp=0;
		int arr2[]=new int[num];
		int len=arr.length;
		int len1=len;
		int sum=0;
		int a=1;
		i=0;
		while(len>0){
			while(arr[i]!='\0'){
				temp=arr[i]%2;
				sum=sum+(temp*a);
				a=a*10;
				arr[i]=arr[i]/2;
			}
			arr2[i]=sum;
			sum=0;
			a=1;
			++i;
			len--;
		}
//		len=len1;
//		for(i=0;i<len;i++){
//			System.out.println(arr2[i]);
//		}
		temp=0;
		len=len1;
		for(i=0;i<len;i++)
		{
			for(j=0;j<len;j++){
				if(arr2[i]>arr2[j]){
					temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		len=len1;
		int decimal=0;
		int power=0;
		i=0;
		while(len>0){
			while(arr2[i]>0){
				temp=arr2[i]%10;
				decimal+=(temp*Math.pow(2,power));
				++power;
				arr2[i]=arr2[i]/10;
			}
			System.out.println(decimal);
			power=0;
			decimal=0;
			++i;
			len--;
		}
	}
}
