package day3;

import lombok.Getter;

@Getter
public class Index {
    int count = 0;
    final Bits bits;
    final int len;

    public Index(Bits bits) {
        this.bits = bits;
        this.len = bits.getBits().length;
    }


    public void inc(){
        count++;
    }

}
