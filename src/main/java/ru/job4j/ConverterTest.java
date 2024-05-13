package ru.job4j;

public class ConverterTest {
    public static float rubleToEuro(float value) {
        float rsl = value / 86;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 73.5f;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.17f;
        return rsl;

    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.85f;
        return rsl;
    }

    public static void main(String[]  args) {
        float euro = ConverterTest.rubleToEuro(140);
        System.out.println("140 rubles is " + euro + " euro.");
        euro = ConverterTest.dollarToEuro(17);
        System.out.println("17 dollars is " + euro + " euro.");
        float dollars = ConverterTest.rubleToDollar(567);
        System.out.println("567 rubles is " + dollars + " dollars.");
        dollars = ConverterTest.euroToDollar(18);
        System.out.println("18 euro is " + dollars + " dollars.");
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 1.6279069F;
        float output = ConverterTest.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 1.6279069. Test result : " + passed);
        float input = 17;
        float expected = 14.450001F;
        float output = ConverterTest.rubleToDollar(input);
        boolean passed = expected == output;
        System.out.println("17 rubles are 14.450001. Test result : " + passed);
        float input = 567;
        float expected = 7.714286F;
        float output = ConverterTest.euroToDollar(input);
        boolean passed = expected == output;
        System.out.println("567 rubles are 7.714286. Test result : " + passed);
        float input = 18;
        float expected = 21.06F;
        float output = ConverterTest.dollarToEuro(input);
        boolean passed = expected == output;
        System.out.println("18 rubles are 21.06. Test result : " + passed);
    }

}