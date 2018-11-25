package adprog_coursework;

/**
 *
 * @author @UP811334
 */

public class CardboardTypeV extends NewCardboard {

    /**
     * Creates a new Type 5 Pipe
     *
     * @param length
     * @param width
     * @param height
     * @param grade
     * @param sealableTop
     */
    
    public CardboardTypeV(double length, double width, double height, int grade, boolean sealableTop) {
        super(length, width, height, grade, 2, true, true, sealableTop);
        priceMultiplier = 0.15 + 0.13 + 0.12;
    }

}
