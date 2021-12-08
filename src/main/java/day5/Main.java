package day5;

import common.DroolsHelper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        DroolsHelper.execute("/day5/part1.drl", "/day5/input.txt");
        DroolsHelper.execute("/day5/part2.drl", "/day5/input.txt");
    }


}
