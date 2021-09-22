package SelfEd1;

public class ConvertToBinary {
    public static void main(String[] args) {
        //test numbers
        int[] testNumbers = new int[]{10, 1, 8, 65, 255};
        //go through the test numbers array
        for (int i = 0; i < testNumbers.length; i++) {                  // till it reach '.length'
            //each number convert to binary
            String binaryString = toBinary(testNumbers[i]);            // <---- 'testNumber' to 'toBinary' through cycle 'for'              +    Why we use STRING and not INTEGER tho???
            //compare converter results with correct result
            if (!Integer.toBinaryString(testNumbers[i]).equals(binaryString)) {
                //incorrect result is printed and program stops
                System.out.println("Incorrect converting of " + testNumbers[i]);
                System.out.println("Expected: " + Integer.toBinaryString(testNumbers[i]));
                System.out.println("Actual: " + binaryString);
                break;
            } else {
                System.out.print("In decimal notation " + testNumbers[i]);
                System.out.println("  in binary notation  " + binaryString);
            }
        }
        System.out.println("Successfully executed");
    }

    private static String toBinary(int n) {                             // <---- 'testNumber' to 'toBinary' through cycle 'for'
        String S = "";
        if (n == 0) {
            return "0";
        }
        while (n > 0) {
            S = Integer.toString(n % 2) + S;
            n = n / 2;
        }
        return S;
    }
}
