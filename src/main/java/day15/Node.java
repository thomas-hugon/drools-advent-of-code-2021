package day15;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Node {
    int x;
    int y;
    int risk;
    boolean finalized;
    int riskFromSource;
}
