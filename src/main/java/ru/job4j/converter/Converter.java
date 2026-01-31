package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 90.55F;
    }

    public static float rubleToDollar(float value) {
        return value / 76.38F;
    }

    public static float rubleToYuan(float value) {
        return value / 10.99F;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
        System.out.println("140 rubles are " + Converter.rubleToYuan(140) + " yuans");

    }

}

