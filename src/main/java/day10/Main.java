package day10;

import common.DroolsHelper;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        DroolsHelper.execute("/day10/part1_2.drl", "/day10/input.txt");
    }
}
