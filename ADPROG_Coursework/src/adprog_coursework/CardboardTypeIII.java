package adprog_coursework;

/**
 * 
 * @author @UP811334
 */

public class CardboardTypeIII extends NewCardboard {
    
    /**
     * Creates a new Type 3 Pipe
     * @param length
     * @param width
     * @param height
     * @param grade
     * @param sealableTop
     */
    
    public CardboardTypeIII(double length, double width, double height, int grade, boolean sealableTop) {
        super(length, width, height, grade, 2, false, false, sealableTop);
        priceMultiplier = 0.15;
    }
    
}
