/**
 * Java 1. Home work 6
 *
 * @author Trushina Irina
 * @version 30.09.2021
 */
class Cat extends Animal {
    Cat(int distRun, int distSwim) {
        super(distRun, distSwim);
    }

    @Override
    public String swim(int dist) {
        return "The " + this.getClass().getSimpleName() + " can't swim";
    }
}