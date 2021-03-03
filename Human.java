package Person;

public class Human {
    private String name;
    private int age;
    private char gen;

    public Human(String name, int age, char gen) {
        super();
        this.name = name;
        this.age = age;
        this.gen = gen;

    }

    public Human() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGen() {
        return gen;
    }

    @Override
    public String toString(){
     return " Имя " +name+ " возраст " +age +" пол "+gen  ;
    }
}