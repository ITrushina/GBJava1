/**
 * Java 1. Home work 
 *
 * @author Trushina Irina
 * @version 04.10.2021
 */
class Cat {
    private int appetite;
    private boolean satiety;

    Cat(int appetite, boolean satiety) {
        this.appetite = appetite;
        this.satiety = satiety;
    }

    boolean getSatiety() {
        return satiety;
    }

    void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    void eat(Plate plate) {
        if (satiety) {
            System.out.println("The cat is not hungry");
        } else {
            setSatiety(plate.decreaseFood(appetite));  
        }
    }
}