package day10;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayDeque;
import java.util.Deque;

@Getter
@Setter
@ToString
public class Stack {
    private int lineNumber;
    private Deque<String> stack = new ArrayDeque<>();

    public Stack(int lineNumber) {
        this.lineNumber = lineNumber;
    }

}
