import java.util.Scanner;
public class StringArraysDemo1 {
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
                s[i][j] = sc.nextLine();
            }
        }
        System.out.println("Elements in the array:");
        for (String[] k : s) {
            for (String val : k) {
                System.out.println(val);
            }
        }
    }
}

