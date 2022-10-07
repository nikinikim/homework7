public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
    }
    public static void Task1(){
        int savings = 15000;
        int annualSavings = 0;
        int months = 0;
        while (annualSavings < 2459000) {
            annualSavings = annualSavings + annualSavings / 100;
            annualSavings += savings;
            months++;
        }
        System.out.println("Месяц " + months + ", сумма накоплений равна " + annualSavings + " рублей");
    }
    public static void Task2(){
        int a = 0;
        while (a < 10){
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void Task3(){
        int population = 12_000_000;
        int birthrate = 17;
        int mortality = 8;
        int year = 0;
        while (year < 10){
            year++;
            population += ((population * (birthrate - mortality)) / 1000);
        }
        System.out.println("Год " + year + " , численность населения составляет " + population);
    }
    public static void Task4(){
        int savings = 15000;
        int annualSavings = 0;
        int months = 0;
        while (annualSavings < 12_000_000) {
            annualSavings += ((annualSavings / 100) * 7);
            annualSavings += savings;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + annualSavings + " рублей");
            }
        }
    }
    public static void Task5() {
        int savings = 15000;
        int annualSavings = 0;
        int months = 0;
        int monthsForSavings = 108;
        while (months < monthsForSavings) {
            annualSavings += ((annualSavings / 100) * 7);
            annualSavings += savings;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + annualSavings + " рублей");
            }
        }
    }
    public static void Task6(){
        int month = 31;
        int fridayReport = 4;
        while (fridayReport <= month) {
            System.out.println("Сегодня пятница, " + fridayReport + "-е число. Необходимо подготовить отчет.");
            fridayReport += 7;
        }
    }
    public static void Task7(){
        int year = 0;
        do {
            year += 79;
            if (year + 200 > 2022) {
                System.out.println(year);
            }
        }while (year < 2022);
    }
    public static void Task8(){
        int number = 2;
        int multiply = 1;
        do {
            System.out.println(number + " * " + multiply + " = " + number * multiply);
            multiply++;
        } while (multiply <= 10);
        }
    public static void Task9() {
        int total = 0;
        for (int i = 1; i <= 30; i++) {
            total++;
            if (total % 3 == 0 && total % 5 != 0) {
                System.out.println(i + ": ping");
            } else if (total % 5 == 0 && total % 3 != 0) {
                System.out.println(i + ": pong");
            } else if (total % 3 == 0 && total % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else {
                System.out.println(i + ":");
            }
        }
    }
    public static void Task10() {
        int a = 0;
        int b = 1;
        int fib;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 10; i++) {
            fib = a + b;
            System.out.print(fib + " ");
            a = b;
            b = fib;
        }
    }
}