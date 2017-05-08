import java.util.Scanner;

public class TowerOfHanoi {
	public void move(int noOfDisks,char start,char end,char intermediate){
		if(noOfDisks == 1){
			System.out.println("Moving disks "+noOfDisks+" from "+start+" to "+end);
		}
		else
		{
			move(noOfDisks-1,start,intermediate,end);
			System.out.println("Moving disks "+noOfDisks+" from "+start+" to "+end);
			move(noOfDisks-1,intermediate,end,start);
		}
	}
	
	public static void main(String args[]){
		TowerOfHanoi toh=new TowerOfHanoi();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of disks");
		int num=input.nextInt();
		toh.move(num,'A','C','B');
		input.close();
	}
}
