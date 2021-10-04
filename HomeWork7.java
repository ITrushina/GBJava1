/**
 * Java 1. Home work 7
 *
 * @author Trushina Irina
 * @version 04.10.2021
 */
class HomeWork7 {
    public static void main (String[] args) {
        Cat [] cats = new Cat [5];
        cats[0] = new Cat (5, false);
        cats[1] = new Cat (7, false);
        cats[2] = new Cat (1, false);
        cats[3] = new Cat (10, false);
        cats[4] = new Cat (3, false);
        Plate plate = new Plate(17);
        System.out.println(plate);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println("Satiety of the cat " + i + " : " + cats[i].getSatiety());
        }
        plate.setFood(20);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println("Satiety of the cat " + i + " : " + cats[i].getSatiety());
        }
    }
}