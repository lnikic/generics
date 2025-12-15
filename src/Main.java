import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);

        List<Dog> dogs = List.of(new Dog(), new Dog());
        takeAnimals(dogs);
    }

    private static void takeAnimals(List<? extends Animal> animals) {
        for(Animal a : animals) {
            a.eat();
        }
    }

    public <T extends Animal> void takeAnimalsT(List<T> list) { }

//    private static void takeAnimals(List<Animal> animals) {
//        for(Animal a : animals) {
//            a.eat();
//        }
//    }
}