package people;

import Cats.Cat;

public class Patsan extends Chuvak {
    public Patsan(String name, String lastName, Cat cat) {
        super(name, lastName, cat);
    }

    private String klikuha;

    public Patsan(String name, String lastName, Cat cat, String klikuha) {
        super(name, lastName, cat);
        this.klikuha = klikuha;
    }

    public String getKlikuha() {
        return klikuha;
    }

    public void setKlikuha(String klikuha) {
        this.klikuha = klikuha;
    }

    @Override
    public String toString() {
        return super.toString()+ " кликуха " + klikuha;
    }
}
