package adprog_coursework;

/**
 * 
 * @author UP811334, UP853434, UP812191, UP880323
 */

public class CardboardTypeIV extends NewCardboard {
    
    /**
     * Creates a new Type 4 Pipe
     * 
     * @param length
     * @param width
     * @param height
     * @param grade
     * @param sealableTop
     */

    public CardboardTypeIV(double length, double width, double height, int grade,boolean sealableTop) {
        super(length, width, height, grade, 2, true, false, sealableTop);
        priceMultiplier = 0.15 + 0.13;
    }
   
}
