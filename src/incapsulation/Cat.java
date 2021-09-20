package incapsulation;

public class Cat {
    private String name;
    private int age;

    public Cat(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName() {
        return "the name is " + this.name;
    }

    public void setName(String name) {
        if (name != "") {
            this.name = name;
        }
    }

    public void newYear() {
        age++;
    }

    private String getMur() {
        return "Mur-mur";
    }

    public void pusico() {
        System.out.println(getMur());
    }

    public String seePassport() {
        return "Cat{"+name+", "+ age +"}";
    }




}
