package day10;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public final class IncompleteLine {
    private int lineNumber;
    private long score = 0;
    public IncompleteLine(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}
