package Cats;

public class Cat {

    private int age = 4;

    private String name = "Barsik";
    private String lastName = "Котиков";


    @Override
    public String toString() {
        return "коту " + age + ", лет";
    }
}
