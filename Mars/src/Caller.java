public class Caller {
    public static void main(String[] args) {
        Rover rover = new Rover("N", 0, 0);

        MoveForward moveForward = new MoveForward(rover, 3);
        Turn turn = new Turn(rover, "L");

        Control control = new Control();
        control.doMove(moveForward);
        control.doMove(turn);
        System.out.println("( " + rover.positionX + " , " + rover.positionY + " )");
        System.out.println(rover.direction);
    }
}
