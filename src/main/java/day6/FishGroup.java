package day6;

public class FishGroup {
    private long day;
    private int fishTimer;
    private long nbOfFishes;

    public FishGroup(long day, int fishTimer, long nbOfFishes) {
        this.day = day;
        this.fishTimer = fishTimer;
        this.nbOfFishes = nbOfFishes;
    }

    public FishGroup merge(FishGroup other){
        if (this.day != other.day || this.fishTimer != other.fishTimer ){
            throw new RuntimeException("not mergeable");
        }
        this.nbOfFishes += other.nbOfFishes;
        return this;
    }

    public int fishTimer() {
        return fishTimer;
    }

    public void decFishTimer() {
        this.fishTimer = this.fishTimer == 0 ? 6 : this.fishTimer - 1;
    }

    public void incDay() {
        this.day++;
    }

    public long nbOfFishes() {
        return nbOfFishes;
    }

    public long day() {
        return day;
    }

    @Override
    public String toString() {
        return "FishGroup{" +
                "day=" + day +
                ", fishTimer=" + fishTimer +
                ", nbOfFishes=" + nbOfFishes +
                '}';
    }
}