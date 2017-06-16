import java.util.Scanner;

public class HourGlass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int i,j,h=0;
        int sum[]=new int[16];
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                sum[h] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
                        + arr[i+2][j+2];
                h++;
            }
        }      	
        int temp=sum[0];
        for(i=0;i<16;i++)
        {
        	if(sum[i]>temp){
        		temp=sum[i];
        	}
        }
        System.out.println(temp);
        in.close();
    }
}
