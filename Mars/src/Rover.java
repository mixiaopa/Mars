import java.util.Arrays;
import java.util.List;

public class Rover {
    public String direction;
    public int positionX;
    public int positionY;

    public Rover(String direction, int positionX, int positionY) {
        this.direction = direction;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Rover moveOneStep(int step) {
        System.out.println("Move " + step + " step");
        if (direction.equals("N")) {
            positionY += step;
        } else if (direction.equals("S")) {
            positionY -= step;
        } else if (direction.equals("W")) {
            positionX += step;
        } else if (direction.equals("E")) {
            positionX -= step;
        } else {
            System.out.println("Order is wrong! Please input again!");
        }
        return this;
    }

    public String changeDirection(String turnDirection) {
        System.out.println("Change direction");
        List<String> all = Arrays.asList("N", "E", "S", "W");
        if (turnDirection.equals("L")) {
            direction = all.get((all.indexOf(direction) + 1) % all.size());
        } else if (turnDirection.equals("R")) {
            direction = all.get((all.indexOf(direction) + 3) % all.size());
        }
        return direction;
    }
}
