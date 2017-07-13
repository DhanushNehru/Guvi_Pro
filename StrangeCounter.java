import java.util.Scanner;
public class StrangeCounter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long value=3;
        while(t>value){
            t=t-value;
            value*=2;
        }
        System.out.print(value-t+1);
        in.close();
    }
}
