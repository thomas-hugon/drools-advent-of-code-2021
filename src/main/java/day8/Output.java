package day8;

import lombok.Getter;
import lombok.ToString;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@ToString
public final class Output {
    private final String value;
    private final int line;
    private final int position;
    private final Set<Integer> set;

    public Output(String value, int line, int position) {
        this.value = value;
        this.line = line;
        this.position = position;
        this.set = value.chars().boxed().collect(Collectors.toSet());
    }

}
