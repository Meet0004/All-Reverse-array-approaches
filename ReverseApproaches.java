import java.util.*;

class ReverseApproaches {
    public static void cut() {
        System.out.println("-------------------------------------------------------");
    }

    public static void printKar(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void reverseKar_Approach1(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            reversedArray[i] = array[array.length - i - 1];

        System.out.print("Original array : ");
        printKar(array);
        System.out.print("Reversed Array : ");
        printKar(reversedArray);
        cut();
    }

    public static void reverseKar_Approach2(int[] array) {
        System.out.print("Original array : ");
        printKar(array);
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int j = n - i - 1;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.print("Reversed Array : ");
        printKar(array);
        cut();
    }

    public static void reverseKar_Approach2_1(int[] array) {
        System.out.print("Original array : ");
        printKar(array);

        int temp;
        int start = 0, end = array.length - 1;

        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array : ");
        printKar(array);
        cut();
    }

    public static void reverseKar_Approach3(int[] array, int start, int end) {
        System.out.print("Original array : ");
        printKar(array);

        int temp;
        if (start >= end)
            return;
        temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverseKar_Approach3(array, start + 1, end - 1);

        System.out.print("Reversed Array : ");
        printKar(array);
        cut();
    }

    public static void reverseKar_Approach4(int[] array) {
        System.out.print("Original array : ");
        printKar(array);

        Stack<Integer> stack = new Stack<>();
        for (int i : array)
            stack.push(i);

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        // for(int i : stack)
        // array[i]=stack.pop();
        // above 2 lines actually gave and error of ConcurrentModifocation cz i was
        // iterating stack and simultaneously modifying it;

        System.out.print("Reversed Array : ");
        printKar(array);

        /*
         * java.util.ConcurrentModificationException is a runtime exception that occurs
         * when a collection is modified while it is being iterated over using methods
         * other than the
         * iterator's own remove or add methods. This is often seen when you are
         * iterating over a collection
         * and simultaneously modifying it in another part of your code.
         */
        cut();
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 3, 2, 6 };
        reverseKar_Approach1(array1); // array to array

        int[] array2 = { 2, 3, 4, 5, 6 };
        reverseKar_Approach2(array2); // 2 pointer approach --swap through iterate -for loop

        int[] array2_1 = { 2, 3, 4, 5 };
        reverseKar_Approach2_1(array2_1); // 2 pointer approach --swap through iterate -while loop

        int[] array3 = { 4, 8, 2, 5 };
        reverseKar_Approach3(array3, 0, 3); // Recursion approach --no loops

        int[] array4 = { 1, 2, 3 };
        reverseKar_Approach4(array4); // Stack approach --array->(pushed)stack(poped)->array
    }
}