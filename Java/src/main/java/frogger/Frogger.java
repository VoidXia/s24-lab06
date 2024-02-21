package frogger;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {

    // The Frogger.java class represents the Frogger game. It has fields for the road, Frogger's position, and records. The move method allows Frogger to move forward or backward on the road based on the provided boolean parameter. The isOccupied method checks if a specific position on the road is occupied, and the isValid method checks if a position is within the valid range of the road.

    // The anti-pattern present in the code is that the Frogger class has fields and methods related to recording personal information (firstName, lastName, phoneNumber, zipCode, state, gender), which seems unrelated to the purpose of the Frogger game.

    // Field for task 1.
    private final Road road;
    private int position;
    
    // Field for task 2. Anything to add/change?
    private final Records records;
    private String firstName, lastName, phoneNumber, zipCode, state, gender;

    public Frogger(Road road, int position, Records records) {
        this.road = road;
        this.position = position;
        this.records = records;
    }

    /**
     * Moves Frogger.
     *
     * @param forward true is move forward, else false.
     * @return true if move successful, else false.
     */
    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!isValid(nextPosition) || isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    // TODO: Do you notice any issues here?
    public boolean isOccupied(int position) {
        return this.road.isOccupied(position);
    }
    
    public boolean isValid(int position) {
        if (position < 0) return false;
        return position < road.length();
    }

    /**
     * Records Frogger to the list of records.
     * 
     * @return true if record successful, else false.
     */
    public boolean recordMyself() {
      boolean success = records.addRecord(firstName, lastName, phoneNumber, zipCode, state, gender);
      return success;
    }

}
