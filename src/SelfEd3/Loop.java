package SelfEd3;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("It's so freaking cold!!");
        }
        System.out.println("_____________");

        String[] colors = {"red", "Blue", "gReen"};

        for (int i = 0; i < 3; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("_____________");

        String[][] fancyColors = {{"red", "Blue", "gReen"},
                {
                        "Cyan", "Magenta", "Turquise"
                }};
        for (int row=0;row<2;row++){
            for (int column=0;column<3;column++){
                System.out.println(fancyColors[row][column]);
            }
        }

        System.out.println("_____________");

        for (int a=0;a<5;a++){
            for (int b=0;b<10;b++){
                System.out.println("a: " +a+" "+"b: "+b);
            }
        }
    }
}
