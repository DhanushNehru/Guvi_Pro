import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;
public class BitSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeSet<String> ts1=new TreeSet<String>();
		System.out.println("Enter k value");
		int k=sc.nextInt();
		int bin=(int)Math.pow(2, k);
		int i,j;
		for(i=0;i<bin;i++){
			String str=Integer.toBinaryString(i);
			ts1.add(str);
		}
		Iterator<String> it=ts1.iterator();
		String val;
		int len;
		while(it.hasNext()){
			val=it.next();
			len=val.length();
			String val1="";
			for(j=len;j<k;j++){
				val1=val1+"0";
			}
			val=val1+val;
			System.out.print(val+" ");
			val="";
		}
		sc.close();
	}
}
