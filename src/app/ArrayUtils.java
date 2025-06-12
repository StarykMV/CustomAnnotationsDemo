package app;

public class ArrayUtils {

    @MethodInfo(
            name = "sumArray",
            returnType = "int",
            description = "Обчислює суму всіх елементів у масиві"
    )
    @Author(
            firstName = "Ivan",
            lastName = "Petrenko"
    )
    public int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    @MethodInfo(
            name = "maxElement",
            returnType = "int",
            description = "Повертає максимальний елемент масиву"
    )
    @Author(
            firstName = "Olena",
            lastName = "Kovalenko"
    )
    public int maxElement(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

