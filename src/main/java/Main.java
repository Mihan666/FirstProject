


import Cats.Cat;
import people.Chuvak;
import people.Patsan;


public class Main {

   static Cat cat;
   static Chuvak chel;
   static Patsan vasia;

    public static void main(String args[]) {


        cat = new Cat();
        chel = new Chuvak("Валера", "Иванов", cat);
        System.out.println(chel);
        vasia = new Patsan("vasia","s gori",cat, "her");
        System.out.println(vasia);
}
}