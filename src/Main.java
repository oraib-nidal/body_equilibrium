import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum_x = 0, sum_y =0, sum_z=0;

        if ( n > 0 ){
            for ( int x = 0 ; x < n ; x++){
                int[] main = new int[3];
                for (int i = 0; i < 3 ; i++ ) {
                    main[i] = scanner.nextInt();
                }
                sum_x += main[0];
                sum_y += main[1];
                sum_z += main[2];
            }
            if (sum_x == 0 && sum_y==0 && sum_z==0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    }
