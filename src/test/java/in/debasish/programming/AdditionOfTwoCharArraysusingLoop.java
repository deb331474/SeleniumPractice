package in.debasish.programming;

public class AdditionOfTwoCharArraysusingLoop {

    public static void main(String[] args) {

        char[] charArray1 = {'H', 'e', 'l', 'l', 'o'};
        char[] charArray2 = {' ', 'W', 'o', 'r', 'l', 'd'};

        int length1 = charArray1.length;
        int length2 = charArray2.length;

        char[] resultArray = new char[length1 + length2];

        for (int i = 0; i < length1; i++) {
            resultArray[i] = charArray1[i];
        }

        for (int i = 0; i < length2; i++) {
            // Update the index to start at length1
            resultArray[length1 + i] = charArray2[i];
        }

        System.out.println("Concatenated char array: " + new String(resultArray));
    }
}
