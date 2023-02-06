package harbour.lecture2;

/**
 * Represents a point in 2-dimensional space
 */
public class Square {

    public int[] getX() {
        return x;
    }

    public final int[] x;
    public final String y;

    public Square(int[] x, String y) {
        this.x = x;
        this.y = y;
    }

}
