package adprog_coursework;

/**
 * 
 * @author @UP811334
 */

public class CardboardTypeII extends NewCardboard {
    
    /**
     * Creates a new Type 2 Pipe
     * 
     * @param length
     * @param width
     * @param height
     * @param grade
     * @param sealableTop
     */
    
    public CardboardTypeII (double length, double width, double height, int grade, boolean sealableTop) {
        super (length, width, height, grade, 1, false, false, sealableTop);
        priceMultiplier = 0.12;
    }
}
