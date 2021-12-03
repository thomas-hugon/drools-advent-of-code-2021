package day3;

import lombok.Getter;

@Getter
public class Bits {
    final String bitsAsString;
    final int[] bits;

    public Bits(String bitsAsString) {
        this.bitsAsString = bitsAsString;
        this.bits = bitsAsString.chars().map(i -> i - '0').toArray();
    }
}
