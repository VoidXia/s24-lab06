package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean isOccupied(int pos) {
        return this.occupied[pos];
    }

    public int length() {
        return this.occupied.length;
    }
}
