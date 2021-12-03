package day2;

public class SubmarineStatusPart2 {
    int forward = 0;
    int depth = 0;
    int aim = 0;

    public void forward(int forward) {
        this.forward += forward;
        this.depth += this.aim * forward;
    }

    public void down(int aim) {
        this.aim += aim;
    }

    public void up(int aim) {
        this.aim -= aim;
    }

    public int result() {
        return forward * depth;
    }
}
