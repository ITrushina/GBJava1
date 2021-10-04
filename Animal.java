/**
 * Java 1. Home work 6
 *
 * @author Trushina Irina
 * @version 30.09.2021
 */
abstract class Animal implements IAnimal {
    protected int distRun;
    protected int distSwim;

    Animal (int distRun, int distSwim) {
        this.distRun = distRun;
        this.distSwim = distSwim;
    }

    @Override
    public String toString() {
        return "The " + this.getClass().getSimpleName() + " can run " + distRun + " meters and can swim " + distSwim + " meters";
    }

    @Override
    public String run(int dist) {
        if (dist > distRun) {
            return "The " + this.getClass().getSimpleName() + " can't run " + dist + " meters";
        } else {
            return "The " + this.getClass().getSimpleName() + " can run " + dist + " meters";
        }
    }

    @Override
    public String swim(int dist) {
        if (dist > distSwim) {
            return "The " + this.getClass().getSimpleName() + " can't swim " + dist + " meters";
        } else {
            return "The " + this.getClass().getSimpleName() + " can swim " + dist + " meters";
        }
    }
}