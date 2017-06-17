package Pro;
import java.util.Scanner;
public class Square4Points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		int i;
		int flag=0;
		for(i=0;i<8;i++){
			a[i]=sc.nextInt();
		}
		int d1=distance(a[0],a[1],a[2],a[3]);
		//System.out.println(d1);
		int d2=distance(a[2],a[3],a[4],a[5]);
		//System.out.println(d2);
		int d3=distance(a[4],a[5],a[6],a[7]);
		//System.out.println(d3);
		int d4=distance(a[6],a[7],a[0],a[1]);
		//System.out.println(d4);
		if(d1==d2 && d2==d3 && d3==d4 && d4==d1){
			flag=1;
		}
		else{
			System.out.println("not square");
		}
		//to check midpoint
		d1=Math.abs((a[2]-a[3])/2);
		//System.out.println(d1);
		d2=Math.abs((a[3]-a[7])/2);
		//System.out.println(d2);
		d3=Math.abs((a[0]-a[4])/2);
		//System.out.println(d3);
		d4=Math.abs((a[1]-a[5])/2);
		//System.out.println(d4);
		if(d1==d3 && d2==d4 && flag==1){
			System.out.println("square");
		}
		else{
			System.out.println("not square");
		}
	}
	static int distance(int x1,int y1,int x2,int y2){
		x1=(Math.abs(Math.abs(x1)-Math.abs(x2)))*(Math.abs(Math.abs(x1)-Math.abs(x2)));
		y1=(Math.abs(Math.abs(y1)-Math.abs(y2)))*(Math.abs(Math.abs(y1)-Math.abs(y2)));
		x2=(int)Math.sqrt(x1+y1);
		return x2;
	}

}
