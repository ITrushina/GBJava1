/**
 * Java 1. Home work 
 *
 * @author Trushina Irina
 * @version 04.10.2021
 */
class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    void setFood(int food) {
        this.food = food;
    }

    boolean decreaseFood(int app) {
            if (app > food) {
                System.out.println("The cat needs more food!");
                return false;
            } else {
                this.food -= app;
                System.out.println(this.food + " food left in the plate");
                return true;
            }
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}