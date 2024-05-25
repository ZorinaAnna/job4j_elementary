package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 86;
    }

    public static float rubleToDollar(float value) {
        return value / 73.5f;
    }

    public static float euroToDollar(float value) {
        return value * 1.17f;
    }

    public static float dollarToEuro(float value) {
        return value * 0.85f;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles is " + euro + " euro.");
        euro = dollarToEuro(17);
        System.out.println("17 dollars is " + euro + " euro.");
        float dollars = rubleToDollar(567);
        System.out.println("567 rubles is " + dollars + " dollars.");
        dollars = euroToDollar(18);
        System.out.println("18 euro is " + dollars + " dollars.");

        float input = 140;
        float expected = 1.6279069F;
        float output = rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 1.6279069. Test result : " + passed);

        input = 17;
        expected = 14.450001F;
        output = rubleToDollar(input);
        passed = expected == output;
        System.out.println("17 rubles are 14.450001. Test result : " + passed);

        input = 567;
        expected = 7.714286F;
        output = euroToDollar(input);
        passed = expected == output;
        System.out.println("567 rubles are 7.714286. Test result : " + passed);

        input = 18;
        expected = 21.06F;
        output = dollarToEuro(input);
        passed = expected == output;
        System.out.println("18 rubles are 21.06. Test result : " + passed);
    }
}