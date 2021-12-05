package day3;

import lombok.Getter;

@Getter
public class IndexedBits {
    final String bitsAsString;
    final int[] bits;
    int currentIndex = 0;
    final int len;

    public IndexedBits(String bitsAsString) {
        this.bitsAsString = bitsAsString;
        this.bits = bitsAsString.chars().map(i -> i - '0').toArray();
        this.len = bits.length;
    }

    public void inc(){
        currentIndex++;
    }
}
