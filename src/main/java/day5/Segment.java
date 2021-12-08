package day5;

public class Segment {
    private final Point origin;
    private final Direction direction;
    private final int norm;

    public Segment(Point origin, Direction direction, int norm) {
        this.origin = origin;
        this.direction = direction;
        this.norm = norm;
    }

    public Point origin() {
        return origin;
    }

    public Direction direction() {
        return direction;
    }

    public int norm() {
        return norm;
    }

    @Override
    public String toString() {
        return "Segment[" +
                "origin=" + origin + ", " +
                "direction=" + direction + ", " +
                "norm=" + norm + ']';
    }

}
