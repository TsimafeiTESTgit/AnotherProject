package SelfEd1;

import java.util.Scanner;

/**
 * Switch??
 */
public class SwitchClass {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = scanner.nextLine();
        switch(age){
            case "ноль":
            System.out.println("ты родился");
            break;
            case "семь":
                System.out.println("пошёл в школу");
                break;
            case "восемнадцать":
                System.out.println("закончил школу");
                break;
            default:
                System.out.println("не подошло...");
        }
    }
}
