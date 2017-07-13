import java.util.Scanner;
public class CoinGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of coins");
		int num=sc.nextInt();
		int i;
		int arr[]=new int[num];
		System.out.println("Enter coins values");
		for(i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Player1 Name who starts the Game First");
		String p1=sc.next();
		System.out.println("Enter Player2 Name who starts the Game Second");
		String p2=sc.next();
		int Player1=0;
		int Player2=0;
		for(i=0;i<num;i+=2) {
			if(i==num-1) {
				break;
			}
			Player1=Player1+arr[i];
			Player2=Player2+arr[i+1];
		}
		if(Player1>Player2) {
			System.out.println("Player1 "+p1+" won the game");
		}
		else if(Player1==Player2) {
			System.out.println("Game Drawn");
		}
		else {
			System.out.println("Player2 "+p2+" won the game");
		}
	}
}
