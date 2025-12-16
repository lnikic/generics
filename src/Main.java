import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);

//        List<Dog> dogs = List.of(new Dog(), new Dog());
        var vacinatedAimals = takeAnimalsT(animals);
        System.out.println(vacinatedAimals);

        List<Dog> dogs1 = List.of(new Dog(), new Dog());
        var vaccinatedAnimals =  takeAnimalsT(dogs1);
        System.out.println(vaccinatedAnimals);

    }

    private static List<? extends Animal> takeAnimals(List<? extends Animal> animals) {
        return animals;
    }

    public static <T extends Animal> List<T> takeAnimalsT(List<T> list) {
        return list;
    }

//    private static void takeAnimals(List<Animal> animals) {
//        for(Animal a : animals) {
//            a.eat();
//        }
//    }
}