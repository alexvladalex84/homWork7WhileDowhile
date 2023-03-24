public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        int monthlySum = 15000;
        int target = 100000;
        int mount = 0;
        int month = 0;

        while (mount < target) {
            mount = mount + monthlySum;

            month = month + 1;

            System.out.println("Месяц " + month + " сумма накоплений равна " + mount + " рублей.");
        }
        System.out.println("Чтобы накопить " + target + " понадобится " + month + " месяцев.");

        System.out.println("Task 2");

        int number1 = 1;
        int number10 = 10;
        int result = 0;
        while (number1 <= number10) {
            result = number1++;

            System.out.print(" " + result);


        }
        System.out.println(" ");
        for (int i = number10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println(" ");
        System.out.println("Task 3");
        int countryPopulation = 12_000_000; // население страны
        int birth = 17;                    //рождаемось
        int death = 8;                   //смертность
        int perNumberOfPeople = 1000;     // рождаемость и смертность на количество человек
        int population = birth - death; // прибавка или отбавка населения
        int populationOneYear = countryPopulation / perNumberOfPeople * population;//прибавка или отбавка в год
        int populationForFutureYears = 10; // популяция за будующие годы
        int totalPopulation = 0;

        for (int i = 1; i <= populationForFutureYears; i++) {
            totalPopulation = totalPopulation + populationOneYear;

            System.out.println("Год " + i + ", численность населения составляет " + totalPopulation);
        }

        System.out.println("Task 4 and 5 and 6");

        int deposit = 15000;
        int target1 = 12_000_000;// сумма к накоплению
        double mount1 = deposit;// общая сумма накоплений
        int totalMonth  = 108;    //количество месяцев для накопления
        int month1 = 0;
        double percent1 = 1.07;
        while (month1 < totalMonth) {
            mount1 = mount1 * percent1;


            month1 = month1 + 1;
            //if (month1 % 6 == 0 ) {


                System.out.println("Месяц " + month1 + " сумма накоплений равна " + mount1 + " рублей.");

        }

        System.out.println("Task 7");

        int friday = 5;
        int beginningOfMonth =1;
        int endOfMonth =31;
        for (int i = friday; i < endOfMonth; i = i + 7){
            System.out.println("Сегодня пятница," +i+"-е число. Необходимо подготовить отчет");
        }

        System.out.println("Task 8");

        int last = 1896;
       int future =2054;
       for (int i = last ; i <=future ; i = i + 79){
           System.out.println(i);
       }





    }


    }
