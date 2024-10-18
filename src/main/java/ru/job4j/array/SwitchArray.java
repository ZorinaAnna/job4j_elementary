package ru.job4j.array;

public class SwitchArray {
<<<<<<< HEAD
=======

>>>>>>> 6a900feceaf6d764e0db98799e14d216a6d8be50
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[ array.length - 1];
        array[ array.length - 1] = temp;
        return array;
    }
<<<<<<< HEAD
=======

>>>>>>> 6a900feceaf6d764e0db98799e14d216a6d8be50
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 6a900feceaf6d764e0db98799e14d216a6d8be50
