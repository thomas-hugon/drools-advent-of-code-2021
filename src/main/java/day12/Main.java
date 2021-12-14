package day12;

import common.DroolsHelper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        DroolsHelper.execute("/day12/part1.drl", "/day12/input.txt");
        DroolsHelper.execute("/day12/part2.drl", "/day12/input.txt");
    }
}
