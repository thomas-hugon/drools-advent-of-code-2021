package day4;

import java.util.Queue;

public class DrawnNumbers {
    private Queue<String> numbers;

    public DrawnNumbers(Queue<String> numbers) {
        this.numbers = numbers;
    }

    public boolean hasNext() {
        return !numbers.isEmpty();
    }

    public String next() {
        return numbers.poll();
    }
}
