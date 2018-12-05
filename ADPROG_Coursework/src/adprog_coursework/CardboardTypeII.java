package adprog_coursework;

/**
 * 
 * @author @UP811334
 */

public class CardboardTypeII extends NewCardboard {
    
    /**
     * Creates a new Type 2 Pipe
     * 
     * @param length length of cardboard
     * @param width width of cardboard
     * @param height height of cardboard 
     * @param grade garde of cardboard
     * @param sealableTop if sealableTop
     */
    
    public CardboardTypeII (double length, double width, double height, int grade, boolean sealableTop) {
        super (length, width, height, grade, 1, false, false, sealableTop);
        priceMultiplier = 0.12;
    }
}
