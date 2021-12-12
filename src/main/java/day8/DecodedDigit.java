package day8;

import lombok.Getter;
import lombok.ToString;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@ToString
public final class DecodedDigit {
    private final int line;
    private final String value;
    private final int number;
    private final Set<Integer> set;

    public DecodedDigit(int line, String value, int number) {
        this.line = line;
        this.value = value;
        this.number = number;
        this.set = value.chars().boxed().collect(Collectors.toSet());
    }

}
