package day7;

import common.DroolsHelper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        DroolsHelper.execute("/day7/part1.drl", "/day7/input.txt");
        DroolsHelper.execute("/day7/part2.drl", "/day7/input.txt");
    }
}
