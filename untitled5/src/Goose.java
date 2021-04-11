public class Goose {

    String name;
    Goose(String name) {
        this.name = name;
    }
    void swim() {
        System.out.println("Swim like a duck");
    }
    void quack(){
        System.out.println("Quack like a duck");
    }
    void walk() {
        System.out.println("Walk like a duck");
    }
    @Override
    public boolean equals(Object o) {
        return name.equals(((Goose)o).name);
    }


}
