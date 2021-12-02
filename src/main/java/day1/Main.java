package day1;

import common.DroolsHelper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        DroolsHelper.execute("/day1/part1.drl", "/day1/input.txt");
        DroolsHelper.execute("/day1/part2.drl", "/day1/input.txt");
    }


}
