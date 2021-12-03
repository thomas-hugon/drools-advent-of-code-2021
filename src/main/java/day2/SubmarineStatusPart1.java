package day2;

public class SubmarineStatusPart1 {
    private int forward = 0;
    private int depth = 0;

    public void forward(int forward) {
        this.forward += forward;
    }

    public void down(int depth) {
        this.depth += depth;
    }

    public void up(int depth) {
        this.depth -= depth;
    }

    public int result() {
        return forward * depth;
    }
}
