public class Solution {
    public static int[] reverseArray(int[] numbers) {

        ArrayStack stack = new ArrayStack(2);

        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = stack.pop();
        }

        return reversed;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int[] result = reverseArray(numbers);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
