public class Duck {
    String name;
    Duck(String name) {
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
        return name.equals(((Duck)o).name);
    }
}
