public class Main {
    public static void main(String[] args) {
        task1();// задача 1
        task2();// задача 2
        task3();// задача 3
        task4();// задача 4
        task5();// задача 5
        task6();// задача 6
        task7();// задача 7
        task8();// задача 8
    }


    public static void task1() {
        System.out.println("Задание 1");
        {

            int salary = 15000;
            int total = 0;
            int i = 0;
                while (total <= 2_459_000) {
                    i = i+1;
                    total = total + salary;
                    System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
                }
            }
        }

        public static void task2() {
            System.out.println("Задание 2");

            for (int x = 1; x < 11; x++) {
                System.out.print(x + " ");
            }
            System.out.println();

            int y = 11;
            while (y > 1) {
                y = y - 1;
                System.out.print(y + " ");
            }
            System.out.println(" ");
         }

        public static void task3() {
            System.out.println("Задание 3");

            int totalNumber = 12_000_000;
            int birthRate = 17 * 12000;
            int mortality = 8 * 12000;
            int population = birthRate - mortality + totalNumber;
            for (int i = 1; i <= 10; i++) {
                System.out.println("Год " + i + ", численность населения составляет " + population );
        }
    }
        public static void task4() {
            System.out.println("Задача 4");

            double money = 15_000;
            int i = 0;
            double bankPercent = 0.07;
            int all = 12_000_000;
            while (money < all) {
                i = i +1;
                money = money + (money * bankPercent);
                System.out.println("Сумма " + money + ", количество месяцев " + i);
            }
        }
        public static void task5 () {
            System.out.println("Задача 5");

            double money = 15000;
            double bankPercent = 0.07;
            int all = 12_000_000;
            int period = 6;
            for (int i = 0; money < all; i++) {
            money = money + money * bankPercent;
            if (i % period == 0) {
                System.out.println("Сумма " + money + ", количество месяцев " + i);
            }
        }
    }
        public static void task6 () {
            System.out.println("Задача 6");

            double money = 15000;
            int period = 6;
            int years = 9;
            int allMonth = years * 12;
            double bankPercent = 0.07;
            for (int i = 0; i <= allMonth; i++) {
            money = money + money * bankPercent;
            if (i % period == 0) {
                System.out.println("Сумма " + money + " , количество месяцев " + i);
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int fr = 1; fr < 31; fr += 7) {
            System.out.println("Сегодня пятница " + fr + " необходимо подготовить отчет");
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int currentYear = 2023;
        for (int i = 0; i < currentYear + 100; i += 79) {
            if (i > currentYear - 200) {
                System.out.println(i);
            }
        }
    }
}
///