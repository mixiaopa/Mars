public class Turn implements Move {
    private Rover rover;
    private String turnDirection;

    public Turn(Rover rover, String turnDirection) {
        this.rover = rover;
        this.turnDirection = turnDirection;
    }

    @Override
    public void execute() {
        rover.changeDirection(turnDirection);
    }
}
