package day13;

import common.DroolsHelper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        DroolsHelper.execute("/day13/part1.drl", "/day13/input.txt");
        DroolsHelper.execute("/day13/part2.drl", "/day13/input.txt");
    }
}
