public class Main {
    public static void main(String[] args)
    {  //task1();
       task2();
//        task3();
       // task4();
        //task5();
       // task6();
        //task7();
        //task8();


    }

    public static void task1() {
        System.out.println("Task 1");

        int monthlySum = 15000;
        int target = 2459000;
        int mount = 0;
        int month = 0;

        while (mount < target) {
            mount = mount + monthlySum; //mount += monthlySum

            month = month + 1;         // month ++

            System.out.println("Месяц " + month + " сумма накоплений равна " + mount + " рублей.");
        }
        System.out.println("Чтобы накопить " + target + " понадобится " + month + " месяцев.");
    }

    public static void task2() {
        System.out.println("Task 2");

        int number1 = 1;


        while (number1 <= 10) {

            System.out.print(number1 + " ");
            number1++;

        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            number1--;
            System.out.print(" " + number1);
        }



    }
    public static void task3() {
       /* В задаче 3 переменная totalPopulation излишня, в каждую итерацию цикла прирост
        нужно прибавлять к countryPopulation. Долю прироста так же нужно
        рассчитывать внутри цикла, так как она будет изменяться в большую сторону с каждой итерацией*/

        System.out.println("Task 3");
        int countryPopulation = 12_000_000; // население страны
        int birth = 17;                    //рождаемось
        int death = 8;                   //смертность
        int perNumberOfPeople = 1000;     // рождаемость и смертность на количество человек
        int population = birth - death; // прибавка или отбавка населения
       // int populationOneYear = countryPopulation / perNumberOfPeople * population;//прибавка или отбавка в год
        int populationForFutureYears = 10; // популяция за будующие годы
     //   int totalPopulation = 0;

        for (int i = 1; i <= populationForFutureYears; i++) {
//              totalPopulation = totalPopulation + populationOneYear;
            countryPopulation =countryPopulation+  (countryPopulation / perNumberOfPeople * population);;
            System.out.println("Год " + i + ", численность населения составляет " + countryPopulation);
        }
    }
    public static void task4() {
        System.out.println("Task 4 ");

        int deposit = 15000;
        int target1 = 12_000_000;// сумма к накоплению
        double mount1 = deposit;// общая сумма накоплений
        int month1 = 0;
        double percent1 = 1.07;
        while (mount1 < target1) {
            mount1 = mount1 * percent1;

            month1 = month1 + 1;


            System.out.println("Месяц " + month1 + " сумма накоплений равна " + mount1 + " рублей.");

        }


    }

    public static void task5() {
        System.out.println("Task  5");

        int deposit = 15000;
        int target1 = 12_000_000;// сумма к накоплению
        double mount1 = deposit;// общая сумма накоплений
        int month1 = 0;
        double percent1 = 1.07;
        while (mount1 < target1) {
            mount1 = mount1 * percent1;


            month1 = month1 + 1;
            if (month1 % 6 == 0) {


                System.out.println("Месяц " + month1 + " сумма накоплений равна " + mount1 + " рублей.");

            }

        }
    }
    public static void task6() {
        System.out.println("Task  6");

        int deposit = 15000;
        int target1 = 12_000_000;// сумма к накоплению
        double mount1 = deposit;// общая сумма накоплений
        int totalMonth = 108;    //количество месяцев для накопления
        int month1 = 0;
        double percent1 = 1.07;
        while (month1 < totalMonth) {
            mount1 = mount1 * percent1;


            month1 = month1 + 1;
            if (month1 % 6 == 0) {


                System.out.println("Месяц " + month1 + " сумма накоплений равна " + mount1 + " рублей.");

            }
        }
    }
    public static void task7() {
        System.out.println("Task 7");

        int friday = 5;
        int beginningOfMonth = 1;
        int endOfMonth = 31;
        for (int i = friday; i < endOfMonth; i = i + 7) {
            System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Task 8");

        int last = 1896;
        int future = 2054;
        for (int i = last; i <= future; i = i + 79) {
            System.out.println(i);
        }

    }



    }



