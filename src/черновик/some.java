import java.util.*;

 class AMJavaOwnClassCar {

    private String brand;
    private String model;
    private int age;

    public String get_brand () {
        return this.brand;
    }

    public String get_model () {
        return this.model;
    }

    public int get_age () {
        return this.age;
    }

    // do not delete
    public AMJavaOwnClassCar() {}

    // do not delete
    public AMJavaOwnClassCar(String brand, String model, int age) {
        this.brand = brand;
        this.model = model;
        this.age = age;
    }

    public static List<AMJavaOwnClassCar> filter(List<AMJavaOwnClassCar> list) {
        // implement the filter method and return new filtered list
        return null;
    }
}