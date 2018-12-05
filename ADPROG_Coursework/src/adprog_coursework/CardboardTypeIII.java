package adprog_coursework;

/**
 * 
 * @author UP811334, UP853434, UP812191, UP880323
 */

public class CardboardTypeIII extends NewCardboard {
    
    /**
     * Creates a new Type 3 Pipe
     * 
     * @param length length of cardboard
     * @param width width of cardboard
     * @param height height of cardboard 
     * @param grade garde of cardboard
     * @param sealableTop if sealableTop
     */
    
    public CardboardTypeIII(double length, double width, double height, int grade, boolean sealableTop) {
        super(length, width, height, grade, 2, false, false, sealableTop);
        priceMultiplier = 0.15;
    }
    
}
