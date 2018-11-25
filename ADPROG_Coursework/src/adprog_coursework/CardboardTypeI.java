package adprog_coursework;

/**
 *
 * @author UP811334
 */

public class CardboardTypeI extends NewCardboard {

    /**
     * Creates a new Type 1 Pipe
     * 
     * @param length
     * @param width
     * @param height
     * @param grade
     * @param sealableTop
     */
    
    public CardboardTypeI (double length, double width, double height, int grade, boolean sealableTop) {
        super (length, width, height, grade, 0, false, false, sealableTop);
        priceMultiplier = 0;
    }
}
