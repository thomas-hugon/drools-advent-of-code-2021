package day7;

import lombok.Data;

@Data
public class PositionEvaluation {
    int current;
    int limit;
    int fuel;

    public PositionEvaluation(int min, int max) {
        this.current = min;
        this.limit = max;
        this.fuel = Integer.MAX_VALUE;
    }
}
