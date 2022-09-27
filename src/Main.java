public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte symbol3 = 123;
        short symbol5 = 12345;
        int symbolMnogo = 123456789;
        long symbolOchenMnogo = 1234567891;
        float symbolDrob2 = 3.5f;
        double symbolDrobMnogo = 3.14567;
        System.out.println("Значение переменной byte с типом");

        // Задание 2
        double symbol2712 = 27.12;
        long symbol978678965 = 978678965549L;
        byte symbol2 = 2;
        short symbol786 = 786;
        short symbol569 = 569;
        short symbol159 = -159;
        short symbol27897 = 27897;
        byte symbol67 = 67;

        // Задание 3
        byte lydkaChildren = 23;
        byte annaChildren = 27;
        byte katyaChildren = 30;
        short paper = 480;
        int allChildren = lydkaChildren + annaChildren + katyaChildren;
        int childrenPerOneClass = allChildren / 3;
        int paperPerChildren = paper / allChildren;
        System.out.println("На каждого ученика рассчитано " + paperPerChildren + " листов бумаги");

        // Задание 4
        byte bottlesPer2Minutes = 16;
        int bottlesPer20Minutes = bottlesPer2Minutes * 10;
        System.out.println("За 20 минут машина произвела бутылок " + bottlesPer20Minutes + " штук");
        int bottlesPerDay = (bottlesPer2Minutes / 2) * 1440;
        System.out.println("За один день машина производит " + bottlesPerDay + " бутылок");
        int bottlesPer3Day = bottlesPerDay * 3;
        System.out.println("Za 3 dnya machina proizvodit " + bottlesPer3Day + " butilok");
        int bottlesPerOneMoth = bottlesPerDay * 31;
        System.out.println("V mesyats machina proizvodit " + bottlesPerOneMoth + " butilok");

        // Задание 5
        byte totalPaint = 120;
        byte whitePaintPerOneClass = 2;
        byte brownPaintPerOneClass = 4;
        int totalClasses = totalPaint / (whitePaintPerOneClass + brownPaintPerOneClass);
        System.out.println(totalClasses + " classov");
        int totalWhitePaint = totalClasses * whitePaintPerOneClass;
        System.out.println(totalWhitePaint + " banok belih vsego nada");
        int totalBrownPaint = totalClasses * brownPaintPerOneClass;
        System.out.println(totalBrownPaint + " banok brown nada");
        System.out.println("V shkole, gde 20 classov, nujno " + totalWhitePaint + " white kraski i " + totalBrownPaint + " banok brown kraski");

        // Задание 6
        byte bananasGram = 80;
        short milkGram = 105;
        byte iceCreamGram = 100;
        byte eggGram = 70;
        int bananas5S = bananasGram * 8;
        int milk200Ml = milkGram * 2;
        int iceCream2br = iceCreamGram * 2;
        int egg4 = eggGram * 4;
        int breakfast = bananas5S + milk200Ml + iceCream2br + egg4;
        System.out.println("Zavtrak sportsmena v Gram = " + breakfast);
        float breakfastKg = breakfast / 1000f;
        System.out.println("Zavtrak v kg = " + breakfastKg);

        // Задание 7


        // Задание 8

    }
}