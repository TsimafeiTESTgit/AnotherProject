package SelfEd1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter digit");
        int x = scan.nextInt();
        System.out.println("you entered "+x);
    }
}
