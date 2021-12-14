package day11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Octopus {
    private final int vPos;
    private final int hPos;
    private int energy;
    private int step;
    private int flash;

    public static void display(List<Octopus> octopi){
        System.out.println("-----START----");
        octopi.stream().collect(Collectors.groupingBy(Octopus::getVPos))
                .values()
                .stream()
                .sorted(Comparator.comparingInt(value -> value.get(0).getVPos()))
                .forEach(octopi1 -> {
                    octopi1.stream()
                            .sorted(Comparator.comparingInt(Octopus::getHPos))
                            .map(Octopus::getEnergy)
                            .map(e -> e > 9 ? "X" : ""+e)
                            .forEach(System.out::print);
                    System.out.println();
                });
        System.out.println("-----END------");
    }
}
