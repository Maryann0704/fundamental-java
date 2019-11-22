/* Создайте в пакете by.it.familiya.jd01_02 класс TaskA.
В методе main введите10 чисел с консоли в массив mas через объект типа Scanner.
В классе TaskA создайте статические методы
static void step1(int[] mas)
static void step2(int[] mas)
static void step3(int[] mas)
и вызовите их из метода main.Эти методы решают такие задачи:
1.Найти самое маленькое и самое большое число массива. Вывести на консоль
найденные минимум и максимум в одну строку через пробел.
2.Вывести на консоль те числа, значение которых строго меньше
среднегоарифметического(типа double) в этом массиве.
3.Найти и вывести номер (т.е. индекс) самого маленького числа.
Если же таких чисел будет несколько, вывести все найденные индексы минимума
через пробел в порядке убывания.
*/

package by.it.narushevich.jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        step1(mas);
        step2(mas);
        step3(mas);
    }

    private static void step1(int[] mas) {
        int min = mas[0];
        int max = mas[0];
        for (int element : mas) {
            if (min > element) min = element;
            if (max < element) max = element;
        }
        System.out.print("Минимальное и максимальное числа в массиве: ");
        System.out.println(min + " " + max + "\n");

    }

    private static void step2(int[] mas) {
        double sum = 0;
        for (int element : mas) sum = sum + element;
        double avg = sum / mas.length;
        System.out.print("Элементы массива, величина которых меньше среднего арифметического: ");
        for (int element : mas)
            if (element < avg)
                System.out.print(element + " ");
        System.out.println("\n");
    }

    private static void step3(int[] mas) {
        int min = mas[0];
        for (int element : mas)
            if (min > element) min = element;
        System.out.print("Индекс(ы) наименьшего(ших) элемента(ов) в массиве: ");
        for (int i = mas.length - 1; i >= 0; i--)
            if (mas[i] == min)
                System.out.print(i + " ");
    }
}
