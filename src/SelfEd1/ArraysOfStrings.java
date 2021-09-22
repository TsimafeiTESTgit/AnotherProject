package SelfEd1;

public class ArraysOfStrings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
//    System.out.println(numbers[0]);
//    System.out.println(numbers[1]);
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "люк";
        strings[2] = "я твой отец";
//        System.out.println(strings[0]);
//        System.out.println(strings[2]);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        for (String string : strings) {  // - Интересный функционал!!!!!!
            System.out.println(string); //string берёт первую "string" из strings[], а потом следующую...
        }
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {       //берёт x из массива numbers1
            sum = sum + x;              // и складывает их в for цикле
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
//        String s; // пока в s ничего нет s=null ??? или строка не проинициализированна
        String s = null;
        System.out.println(s);

        
    }
}
