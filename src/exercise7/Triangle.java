package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.println();

        for (int line = 1; line <= n; line++) {
            printLine(1, line);
        }

        for(int below = n - 1; below > 0; below--){
          printLine(n - 1, below);
        }
    }

    public static void printLine(int start , int end) {
      String spaces = "";
        for(start = 1; start <= end; start++ ){
        if(start == end){
          System.out.print(start);
        }
        else{
          spaces = " ";
          System.out.print(start + spaces);
       }
      }
      System.out.println();
 } 
   
   
}
