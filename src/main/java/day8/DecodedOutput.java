package day8;

import lombok.Getter;
import lombok.ToString;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@ToString
public final class DecodedOutput {
    private final int line;
    private final int value;

    public DecodedOutput(int line, int value) {
        this.value = value;
        this.line = line;
    }

}
