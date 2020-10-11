package Operators.task2;

public class Homework2 {
    public static void main(String[] args) {
        boolean booleanResult;
        int result;
        int a;
        int b;

        /* Сначала выполняем деление 2 / 8 получаем 0.25
         * складываем 5 + 0.25
         * поскольку результат записываем в переменную типа int ответ получаем: 5
         */
        result = 5 + 2 / 8;
        System.out.println(result);

        /* Сначала выполняем действие сложения в скобках (5 + 2) = 7
         * делим 8 / 7 = 0.875
         * поскольку результат записываем в переменную типа int ответ получаем: 0
         */
        result = (5 + 2) / 8;
        System.out.println(result);


        /* Сначала выполним действие сложения в скобках (5 + 2) = 7
         * затем выполняется действие пост-инкремента и к переменной a прибавляется 1 (2 + 1) = 3
         * теперь в переменной a хранится значение 3, но у нас в выражении оно по прежнему 2 так как это пост-инкремент
         * выполяем деление 7 / 8 = 0.875
         * поскольку результат записываем в переменную типа int ответ получаем: 0
         */
        a = 2;
        result = (5 + a++) / 8;
        System.out.println(result);

        /* Сначала выполним действие сложения в скобках (5 + 2) = 7
         * затем выполняется действие пост-инкремента и к переменной a прибавляется 1 (2 + 1) = 3
         * теперь в переменной a хранится значение 3, но у нас в выражении оно по прежнему 2 так как это пост-инкремент
         * затем выполняем действие пре-декремента и от переменной 8 отнимаем 1 (8 - 1) = 7
         * так-как это пре-инкремент в переменную b записывается результат 7 и он передаётся в выражение
         * далее выполняем деление 7 / 7 = 1
         */
        a = 2;
        b = 8;
        result = (5 + a++) / --b;
        System.out.println(result);

        /* Сначала выполним действие умножения в скобках (5 * 2) = 10
         * затем выполняется действие пост-инкремента и к переменной a прибавляется 1 (2 + 1) = 3
         * теперь в переменной a хранится значение 3, но у нас в выражении оно по прежнему 2 так как это пост-инкремент
         * далее выполняем операции побитового сдвига 10 >> 2 = 2
         * затем выполняем действие пре-декремента и от переменной 8 отнимаем 1 (8 - 1) = 7
         * так-как это пре-инкремент в переменную b записывается результат 7 и он передаётся в выражение
         * далее выполняем деление 2 / 7 = 0.286
         * поскольку результат записываем в переменную типа int ответ получаем: 0
         */
        a = 2;
        b = 8;
        result = (5 * a >> a++) / --b;
        System.out.println(result);

        /* Начинаем работать с выражением в скобках (5 + 7 > 20 ? 68 : 22 * a >> a++)
         * сначала выполняется действие пост-инкремента и к переменной a прибавляется 1 (2 + 1) = 3
         * теперь в переменной a хранится значение 3, но у нас в выражении оно по прежнему 2 так как это пост-инкремент
         * далее выполняем операцию умножения 22 * a (2) = 44
         * складываем 5 + 7 = 12
         * делаем побитовый сдвиг 44 >> a++ (2) = 11
         * сравниваем условие 12 > 20 получаем false, значит выбираем второе значение тернарного оператора (11)
         * далее выполняем пре-декремент b, получаем 7
         * 11/7 = 1 так как ответ кладём в перемменную с целочисленным значением int
         */
        a = 2;
        b = 8;
        result = (5 + 7 > 20 ? 68 : 22 * a >> a++) / --b;
        System.out.println(result);

        /* Результат ошибка компиляции из-за записи 68 >= 68 в тернарном операторе
         * из-за написания в выражении тернарный оператор не может выдавать разнотипные значения
         *
         * result = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++)  / --b;
         */

        /* Сначала производим операцию умножения 12 * 12 = 144
         * далее 6 - 2 = 4
         * проверяем первое условие 4 > 3 получаем (true)
         * проверяем второе условие 144 <= 119 получаем (false)
         * true && false = false получаем ответ false
         */
        a = 2;
        booleanResult = 6 - a > 3 && 12 * 12 <= 119;
        System.out.println(booleanResult);
    }
}