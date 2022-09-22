public class Main {
    public static void main(String[] args) {
        // С помощью цикла for выведите в консоль все числа от 1 до 10.
        System.out.println("Задание 1-1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация " + i);
        }
        // С помощью цикла for выведите в консоль все числа от 10 до 1.
        System.out.println("");
        System.out.println("Задание 1-2");
        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация " + i);
        }
        // Выведите в консоль все четные числа от 0 до 17.
        System.out.println("");
        System.out.println("Задание 1-3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println("Итерация " + i);
        }

        // Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
        System.out.println("");
        System.out.println("Задание 1-4");
        for (int i = 10; i > -11; i--) {
            System.out.println("Итерация " + i);
        }

        // все високосные года, начиная с 1904 года до 2096
        System.out.println("");
        System.out.println("Задание 2-1");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            }
        }

        // последовательность цифр +7
        System.out.println("");
        System.out.println("Задание 2-2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // последовательность цифр *2
        System.out.println("");
        System.out.println("Задание 2-3");
        int num = 1;
        System.out.print(num + " ");
        for (int i = 0; i < 9; i++) {
            num = num * 2;
            System.out.print(num + " ");
        }
        System.out.println();

        // сумма годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей "в банку"
        System.out.println("");
        System.out.println("Задание 3-1");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // в банк под проценты – 12% годовых
        System.out.println("");
        System.out.println("Задание 3-2");
        salary = 29000;
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}