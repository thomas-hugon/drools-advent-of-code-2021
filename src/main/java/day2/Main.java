package day2;

import common.DroolsHelper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        DroolsHelper.execute("/day2/part1.drl", "/day2/input.txt");
        DroolsHelper.execute("/day2/part2.drl", "/day2/input.txt");
    }


}
