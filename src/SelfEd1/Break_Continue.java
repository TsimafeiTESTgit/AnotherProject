package SelfEd1;

public class Break_Continue {
    public static void main(String[] args) {
//        int i=0;
//        while(true){
//            if (i==15){
//                break;
//            }
//            i++;
//            System.out.println(i);
//        }
//        System.out.println("вы вышли из цикла");

        for(int i=0;i<=15;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("это нечётное число "+i+" ");
        }

    }
}
