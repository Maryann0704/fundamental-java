/* Создайте в пакете by.it.familiya.jd01_04 класс TaskB и напишите в нем код,
со следующей логикой (можно все прямо в main):
B1. Введите с консоли число людей n.
Затем введите одномерный массив их фамилий (next() в сканере).
Введите двумерный массив их зарплат за 4 квартала (N строк и 4 столбца).
    Зарплаты имеют тип int.
    Нужно для каждой фамилии выводить подсказку
    После подсказки можно через пробел вводить с консоли 4 цифры зарплат по кварталам.
    Постройте в консоли таблицу доходов людей по кварталам с фамилиями и итогом за год в последней колонке.
B2. Посчитайте и выведите общую сумму всех выплат и среднеарифметическую квартальную
зарплату с точностью как минимум до 4-го знака .
*/

package by.it.narushevich.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число людей: ");
        int numberOfPeople = scanner.nextInt();

        String[] lastNames = new String[numberOfPeople];
        System.out.println("Введите фамилии: ");

        for (int i = 0; i < lastNames.length; i++) {
            lastNames[i] = scanner.next();
        }

        int[][] salary = new int[numberOfPeople][4];
        int sum = 0;
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Введите зарплату для " + lastNames[i] + ": ");
            for (int j = 0; j < 4; j++) {
                salary[i][j] = scanner.nextInt();
                sum += salary[i][j];
            }
        }

        String[] topOfTab = new String[6];
        topOfTab[0] = "Фамилия";
        topOfTab[1] = "Квартал 1";
        topOfTab[2] = "Квартал 2";
        topOfTab[3] = "Квартал 3";
        topOfTab[4] = "Квартал 4";
        topOfTab[5] = "Итого";

        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-11s%-11s%-11s%-11s%-11s%-7s", topOfTab[0], topOfTab[1], topOfTab[2],
                topOfTab[3], topOfTab[4], topOfTab[5]);
        System.out.println();
        System.out.println("-------------------------------------------------------------------");

        int[] sumSalary = new int[numberOfPeople];
        int sumAllSalary = 0;
        for (int i = 0; i < numberOfPeople; i++) {
            sumSalary[i] = salary[i][0] + salary[i][1] + salary[i][2] + salary[i][3];
            sumAllSalary += sumSalary[i];
        }


        for (int i = 0; i < numberOfPeople; i++) {
            System.out.printf("%-11s%-11d%-11d%-11d%-11d%-7d", lastNames[i],
                    salary[i][0], salary[i][1], salary[i][2], salary[i][3], sumSalary[i]);
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------");

        System.out.println("\n" + "ИТОГО: " + sumAllSalary);
        System.out.println("Средняя квартальная зарплата: " + (double) sum / (numberOfPeople * 4));
    }
}