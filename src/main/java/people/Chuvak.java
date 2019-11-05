package people;

import Cats.Cat;

public class Chuvak {

    private String name = "Валера";
    private String lastName = "Иванов";
   private Cat cat;

    public Chuvak(String name, String lastName, Cat cat) {
        this.name = name;
        this.lastName = lastName;
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "чувака зовут - " + name + ", фамилия -"+ lastName+ ", есть кот "+ cat;
    }
}


