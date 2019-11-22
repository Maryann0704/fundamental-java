/*  1. Создайте, откомпилируйте и запустите Main с дополнительными отдельными классами
       (Hello для вывода и определения надписи, Args для вывода списка аргументов)
        в пакете by.it.ivanov.jd01_01 (вместо ivanov – ваша фамилия)
    2. Найдите в IntelliJ IDEA способ указания списка аргументов программы в меню Run.
       Укажите там ваши ФИО.
    3. Проверьте, что программа работает и выводит ФИО
*/

package by.it.narushevich.jd01_01;

class Main {

    public static void main(String[] args) {

        Hello hello = new Hello();
        hello.printSlogan();

        hello.setSlogan("Привет мир");
        hello.printSlogan();

        Args argObj = new Args(args);
        argObj.printArgs();

    }
}
