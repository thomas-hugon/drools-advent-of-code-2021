package day12;

public record Cave(String name) {

    public boolean isStartCave() {
        return name.equals("start");
    }

    public boolean isEndCave() {
        return name.equals("end");
    }

    public boolean isSmall() {
        return !isStartCave() && !isEndCave() && name.toLowerCase().equals(name);
    }

    public boolean isBig() {
        return !isStartCave() && !isEndCave() && name.toUpperCase().equals(name);
    }

}
