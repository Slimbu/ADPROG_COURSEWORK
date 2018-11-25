package adprog_coursework;

/**
 *
 * @author UP811334, UP853434, UP812191, UP880323
 */
public class CardboardValidator {

    /**
     * Creates a new object to validate cardboard
     *
     */
    
    public CardboardValidator() {
    }

    /**
     * Checks if options make a cardboard of a valid type
     *
     * @param grade
     * @param colour
     * @param reinforcedButtom
     * @param reinforcedCornor
     * @return type of cardboard as integer
     */
    
    public int check(int grade, int colour, boolean reinforcedButtom, boolean reinforcedCornor) {
        if (reinforcedCornor) {
            if (check5(grade, colour, reinforcedButtom)) {
                return 5;
            }
        } else if (reinforcedButtom) {
            if (check4(grade, colour)) {
                return 4;
            }
        } else if (colour == 2) {
            if (grade >= 2 && grade <= 5) {
                return 3;
            }
        } else if (colour == 1) {
            if (grade >= 2 && grade <= 4) {
                return 2;
            }
        } else if (colour == 0) {
            if (grade >= 1 && grade <= 3) {
                return 1;
            }
        }
        return 0;
    }

    /**
     *  check if type 5 
     */
    
    private boolean check5(int grade, int colours, boolean reinforcedButtom) {
        if (!reinforcedButtom) {
            return false;
        }
        if (colours != 2) {
            return false;
        }
        return (grade >= 3 && grade <= 5);
    }

    /**
     *  check if type 4
     */
    private boolean check4(int grade, int colour) {
        if (colour != 2) {
            return false;
        }
        return (grade >= 2 && grade <= 5);
    }

}
