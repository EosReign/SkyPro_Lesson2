public class Main {
    public static void main(String[] args) {
        //First Task.
        byte digit1 = 127;
        short digit2 = 32767;
        int digit3 = 2147483647;
        //long digit4 = 9223372036854775807;
        // ammm WTF? Why is long digit wrong?
        long digit4 = 999999999;
        //Its max of symbols in number
        float digitFloat = 5974343f;
        double digitDouble = 39.2932931;


        //Second Task
        System.out.println("----------SecondTask-------------");

        double firstFighter = 78.2;
        double secondFighter = 82.7;
        double differenceOfWeight = secondFighter - firstFighter;
        System.out.println("Разница в весе составляет " + differenceOfWeight + " кг.");
        double totalWeight = secondFighter + firstFighter;
        System.out.println("Общий вес составляет " + totalWeight + " кг.");

        //Это бы задание в функцию, дабы переменные были локальными... эхх... Java.
        //Если бы я только умел обращаться с классами. Печаль, беда.

        //Third Task
        System.out.println("----------ThirdTask-------------");

        short banana = 80;
        short milk = 105;
        short iceCream = 100;
        short egg = 70;
        double sportComplex = ((banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4));
        double sportComplexKg = sportComplex / 1000;
        System.out.println("Вес продукта 'Спортяшка' составляет: " + sportComplexKg + " кг.");

        //Fourth Task
        System.out.println("----------FourthTask-------------");

        double FastF7ckBoyCalculate = 7 / 0.250;
        System.out.println("По результатам легких пробежек за салом по жд испытуемый потерял 7кг за: " + Math.round(FastF7ckBoyCalculate) + " дней.");
        double FastestF7ckBoyCalculate = 7 / 0.500;
        System.out.println("По результатам серьезных пробежек за мясом по рынку испытуемый потерял 7кг за: " + Math.round(FastestF7ckBoyCalculate) + " дней.");
        double MiddyFastF7ckBoyCalculate = (FastF7ckBoyCalculate + FastestF7ckBoyCalculate) / 2;
        System.out.println("В среднем испытуемый под кликухой 'Мумия' потерял 14 кг веса за: " + Math.round(MiddyFastF7ckBoyCalculate) + " день.");

        //Fifth Task
        System.out.println("----------FifthTask-------------");
        // Нифигасе задачка. А массивы и объекты мне где брать для хранения инфы? я же здесь классов то незнаю...
        // Ладно, так и быть. Будем делать одноразовый велосипед.

        double dasha = 67760;
        double denis = 83690;
        double christine = 76230;
        double annualPayroll = (dasha + denis + christine) * 12;
        System.out.println("Выдача зарплат за год обходится компашке в: " + annualPayroll + " Руб.");
        double dashaNow = (dasha * 0.10) + dasha;
        double denisNow = (denis * 0.10) + denis;
        double christineNow = (christine * 0.10) + christine;
        double annualPayrollNow = (dashaNow + denisNow + christineNow) * 12;
        System.out.println("Выдача зарплат за год сейчас обойдется компашке в: " + annualPayrollNow + " Руб.");
    }
}