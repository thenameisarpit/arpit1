import java.util.Scanner;
import java.util.Arrays;
public class StringArraysDemo2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row :");
        int r = sc.nextInt();
        System.out.println("Enter size of coloumn :");
        int c = sc.nextInt();
        String[][] s = new String[r][c];
        
        
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.println("Enter String:");
                s[i][j] = sc.next();
            }
        }
       System.out.println(Arrays.deepToString(s)); 
    }
}
