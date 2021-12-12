package day8;

import lombok.Getter;
import lombok.ToString;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@ToString
public class InputDigit {
    private final String value;
    private final int line;
    private final Set<Integer> set;

    public InputDigit(String value, int line) {
        this.value = value;
        this.line = line;
        this.set = value.chars().boxed().collect(Collectors.toSet());
    }
}
