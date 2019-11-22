/* A1. Создайте в пакете by.it.familiya.jd01_04 класс TaskA и напишите в нем метод
static void printMulTable() для вывода на консоль таблицы умножения.
A2. Напишите также метод static void buildOneDimArray(String line), который:
-- формирует из строки line массив вещественных чисел,
-- выводит в 5 колонок этот массив с названием V и индексами,
-- сортирует этот массив по возрастанию,
-- еще раз выводит его, но уже в 4 колонки с заголовками и тем же названием
-- выполняет вычисление новых (после сортировки) индексов первого и последнего
элемента исходного массива и печатает их в виде:
    Index of first element=2
    Index of last element=7
A3. В основном методе public static void main(String[ ] args) класса TaskA
-- вызовите printMulTable
-- прочитайте с консоли строку из чисел, введенных через пробел,
-- вызовите buildOneDimArray с этой строкой в качестве аргумента
*/

package by.it.narushevich.jd01_04;

import java.util.Scanner;

class TaskA {

    /**
     * Метод выводит в консоль таблицу умножения начиная с 2*2=4 до 9*9=81
     */
    private static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) System.out.printf("%1d*%1d=%-2d ", i, j, i * j);
            System.out.println();
        }
    }

    private static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        double start = array[0];
        double last = array[array.length - 1];
        InOut.printArray(array, "V", 5);
        Helper.sort(array);
        System.out.println();
        InOut.printArray(array, "V", 4);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == start) {
                System.out.println("Index of first element=" + i);
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == last) {
                System.out.println("Index of last element=" + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        printMulTable();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        buildOneDimArray(s);
    }
}
