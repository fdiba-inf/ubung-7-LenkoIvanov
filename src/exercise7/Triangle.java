package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int line = 1; line <= n; line++) {
            printLine(1, line);
        }

        for(int below = n - 1; below > 0; below--){
          printLine(n - 1, below);
        }
    }

    public static void printLine(int start , int end) {
        for(start = 1; start <= end; start++ ){
          System.out.print(start + " ");
          }
          System.out.println();
        }

   
   
}
