package SelfEd1;

public class Arrays {
    public static void main(String[] args) {
//        int number=10; //примитивный тип данных
//        char character='a'; //примитивный тип данных
//        String s = "Hello!!!"; // быстрое создание
//        String s1=new String("Hello!")  //равнозначно
        int number = 10; // [10]
        int[] numbers = new int[5]; // Массив размером 5. (0 1 2 3 4)   numbers -> [массив] - Ссылочный тип
//        System.out.println(numbers[0]); //в ячейке #0
        for (int i = 0; i < numbers.length; i++){
            numbers[i]=i*10;
        }
        for (int i=0;i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1,2,3};
        for (int i=0;i<numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
    }
}
