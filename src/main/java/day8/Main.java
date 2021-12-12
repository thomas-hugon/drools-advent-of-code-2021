package day8;

import common.DroolsHelper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        DroolsHelper.execute("/day8/part1.drl", "/day8/input.txt");
        DroolsHelper.execute("/day8/part2.drl", "/day8/input.txt");
    }
}
