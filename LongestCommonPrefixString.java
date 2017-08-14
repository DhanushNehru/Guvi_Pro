import java.util.Scanner;
public class LongestCommonPrefixString {
	static String smallStr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int i;
		String arr[]=new String[n];
		System.out.println("Enter array elements");
		for(i=0;i<n;i++) {
			arr[i]=sc.next();
			if(i==0) {
				smallStr=arr[0];
			}
			if(arr[i].length()<smallStr.length()) {
				smallStr=arr[i];
			}
		}
		System.out.print("The Longest Common Prefix is : ");
		System.out.println(longCommonPrefix(arr));
		sc.close();
	}
	public static String longCommonPrefix(String arr[]) {
		if(arr == null || arr.length==0) {
			return "";
		}
		int i,j;
		char temp='0';
		int flag=0;
		String ans="";
		int len=arr.length;
		for(i=0;i<smallStr.length();i++) {
			char ch=smallStr.charAt(i);
			for(j=0;j<arr.length;j++) {
				if( ch == arr[j].charAt(i) ) {
					temp=ch;
					++flag;
				}
			}
			if(temp!='0' && flag==len) {
				ans=ans+temp;
			}
			else {
				break;
			}
			flag=0;
			temp='0';
		}
		return ans;
	}
}
