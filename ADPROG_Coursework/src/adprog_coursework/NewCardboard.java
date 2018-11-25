package adprog_coursework;

/**
 * 
 * @author UP811334, UP853434, UP812191, UP880323
 */

public abstract class NewCardboard {

    private final double cardboardLength;
    private final double cardboardWidth;
    private final double cardboardHeight;
    private final int cardboardGrade;
    private final int cardboardColour;
    private final boolean cardboardBottom;
    private final boolean cardboardCornor;
    private final boolean cardboardSealableTop;
    
    private double cardboardPrice;
    
    protected double priceMultiplier;
    
    /**
     * Create a new cardboard
     * 
     * @param length cardboard length
     * @param width cardboard width
     * @param height cardboard height
     * @param grade cardboard grade
     * @param colour cardboard colour
     * @param reinforcedBottom cardboard reinforced bottom
     * @param reinforcedCornor cardboard reinforced cornor
     * @param sealableTop cardboard sealable top
     */ 
    public NewCardboard (double length, double width, double height, int grade, int colour, boolean reinforcedBottom, boolean reinforcedCornor, boolean sealableTop) {
        cardboardLength = length;
        cardboardWidth = width;
        cardboardHeight = height;
        cardboardGrade = grade;
        cardboardColour = colour;
        cardboardBottom = reinforcedBottom;
        cardboardCornor = reinforcedCornor;
        cardboardSealableTop = sealableTop;
    }
    
    /**
     * Calculates the price based on surface area and grade of cardboard
     */
    private void calculatePrice () {
        /**  2*((w*l)+(l*h)+(h*w))  */
        double [] prices = {0.55, 0.65, 0.82, 0.98, 1.5};
        double surfaceArea = 2 * ((cardboardWidth * cardboardLength) + (cardboardLength * cardboardHeight) + (cardboardHeight * cardboardWidth)); 
        double totalPrice = surfaceArea * prices[cardboardGrade-1];
        cardboardPrice = totalPrice + (totalPrice * priceMultiplier);
        if(cardboardSealableTop)
            cardboardPrice += totalPrice * 0.10;
    }
    
    /**
     * 
     * @return cardboard length
     */
    public double getCardboardLength() {
        return cardboardLength;
    }
    
    /**
     * 
     * @return cardboard width
     */
    public double getCardboardWidth() {
        return cardboardWidth;
    }
    
    /**
     * 
     * @return cardboard height
     */
    public double getCardboardHeight () {
        return cardboardHeight;
    }
    
    /**
     * 
     * @return cardboard grade
     */
    public int getCardboardGrade () {
        return cardboardGrade;
    }
    
    /**
     * 
     * @return cardboard color
     */
    public int getCardboardColour () {
        return cardboardColour;
    }
    
    /**
     * 
     * @return true if reinforced bottom
     */
    public boolean isCardboardReinforcedBottom () {
        return cardboardBottom;
    }
    
    /**
     * 
     * @return true if reinforced cornors
     */
    public boolean isCardboardReinforcedCornor () {
        return cardboardCornor;
    }
    
    /**
     * 
     * @return true if sealable top
     */
    public boolean isCardboardSealableTop () {
        return cardboardSealableTop;
    }
    
    /**
     * 
     * @return price
     */
    public double getPrice () {
        calculatePrice();
        return cardboardPrice;
    }
}