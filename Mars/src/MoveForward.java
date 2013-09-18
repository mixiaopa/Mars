public class MoveForward implements Move {
    private Rover rover;
    private int step;

    public MoveForward(Rover rover, int step) {
        this.rover = rover;
        this.step = step;
    }

    @Override
    public void execute() {
        rover.moveOneStep(step);
    }
}
