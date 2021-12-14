package day12;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@EqualsAndHashCode(of = "path")
@ToString
public class Path {

    private final List<Cave> path;
    private final Cave current;
    private final boolean duplicateSmallCave;

    public Path(List<Cave> caves) {
        if(caves.isEmpty()){
            throw new IllegalArgumentException("empty caves");
        }
        path = caves;
        current = caves.get(caves.size() - 1);
        duplicateSmallCave = path.stream()
                .filter(Cave::isSmall)
                .collect(Collectors.groupingBy(Function.identity()))
                .values().stream()
                .anyMatch(caves1 -> caves1.size() > 1);
    }

    public Path appending(Cave cave){
        ArrayList<Cave> caves = new ArrayList<>(path);
        caves.add(cave);
        return new Path(Collections.unmodifiableList(caves));
    }
}
