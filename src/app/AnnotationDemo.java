package app;

import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) {
        Class<ArrayUtils> clazz = ArrayUtils.class;
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodInfo.class) && method.isAnnotationPresent(Author.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                Author author = method.getAnnotation(Author.class);

                System.out.println("Метод: " + methodInfo.name());
                System.out.println("Тип повернення: " + methodInfo.returnType());
                System.out.println("Опис: " + methodInfo.description());
                System.out.println("Автор: " + author.firstName() + " " + author.lastName());
                System.out.println("--------------------------");
            }
        }

        // Демонстрація виклику методів
        ArrayUtils utils = new ArrayUtils();
        int[] array = {3, 7, 2, 9, 1};
        System.out.println("Сума: " + utils.sumArray(array));
        System.out.println("Максимум: " + utils.maxElement(array));
    }
}

