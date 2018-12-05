package adprog_coursework;

/**
 * 
 * @author @UP811334
 */

public class CardboardTypeIV extends NewCardboard {
    
    /**
     * Creates a new Type 4 Pipe
     * 
     * @param length length of cardboard
     * @param width width of cardboard
     * @param height height of cardboard 
     * @param grade garde of cardboard
     * @param sealableTop if sealableTop
     */

    public CardboardTypeIV(double length, double width, double height, int grade,boolean sealableTop) {
        super(length, width, height, grade, 2, true, false, sealableTop);
        priceMultiplier = 0.15 + 0.13;
    }
   
}
