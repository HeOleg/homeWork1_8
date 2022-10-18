public class Main {


    //Метод к заданию 1
    public static void calculateLeapYear(int year){
        boolean leapYear = (year % 4 == 0&&year%100!=0||year/400==0);
        if (leapYear) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }
    }

    //Метод к заданию 2
    public static void calculateVersion(int clientOS,int yearOfProduction) {
        boolean lightVersion = yearOfProduction < 2015;
        if (lightVersion && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для IOS");
            if (lightVersion && clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите приложение для IOS");
        } else {
            System.out.println("Установите приложение для Android");
        }
    }

    // Метод к заданию 3
    public static int calculateDelivery(int deliveryDistance){
        int standartDelivery=deliveryDistance-20;
        int standartTimeDelivery=1;
        int distanceDifference=standartDelivery/40;
        boolean additionalsDays=deliveryDistance<=20;
        int delivery=distanceDifference+standartTimeDelivery;
        int hardDelivery=distanceDifference+standartTimeDelivery+1;
        if (additionalsDays) {
            return standartTimeDelivery;
        } else if (standartDelivery%40>0) {
            return hardDelivery;
        }
        else {
            return delivery;
        }
    }


    public static void main(String[] args) {

        //Задание 1
        int year = 2021;
        calculateLeapYear(year);

        //Задание 2
        int clientOS = 1;
        int yearOfProduction = 2013;
        calculateVersion(clientOS,yearOfProduction);


        //Задание 3
        int deliveryDistance=60;
        System.out.println("Потребуется дней " + calculateDelivery(deliveryDistance));

    }
}