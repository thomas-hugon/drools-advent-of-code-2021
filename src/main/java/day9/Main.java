package day9;

import common.DroolsHelper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        DroolsHelper.execute("/day9/part1.drl", "/day9/input.txt");
        DroolsHelper.execute("/day9/part2.drl", "/day9/input.txt");
    }
}
