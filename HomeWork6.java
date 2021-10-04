/**
 * Java 1. Home work 6
 *
 * @author Trushina Irina
 * @version 30.09.2021
 */
class HomeWork6 {
    public static void main (String[] args) {
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500, 10);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(300));
            System.out.println(animal.run(600));
            System.out.println(animal.swim(3));
            System.out.println(animal.swim(20));
        }
    }
}