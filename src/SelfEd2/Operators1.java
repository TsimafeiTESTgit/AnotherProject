package SelfEd2;

import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
        int x, y, z;
        Operators1 oper=new Operators1();
        oper.check(1,2,4);

    }

    private void check(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0) {
            System.out.println("excellent");
        } else if (x>0&&y>0||x>0&&z>0||y>0&&z>0){
            System.out.println("good");
        } else if (x>0||y>0||z>0){
            System.out.println("fine");
        }else if (x<=0&&y<=0&&z<=0){
            System.out.println("bad");
        }
    }


}
