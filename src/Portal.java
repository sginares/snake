
import java.awt.Point;
import java.util.Random;

/**
 * Portal class
 *
 * @author Silvia Estrella Ginares Pintos
 * @version v1.0
 */
public class Portal {

    private int nature; //-1 for snake , +1 for ladder
    private int start;
    private int end;

    /**
     * 
     * @param maxCells int
     */
    public Portal(int maxCells) {   //creates random portals
        Random luck = new Random();
        start = luck.nextInt(maxCells);
        end = luck.nextInt(maxCells);
        if (start < end) {
            nature = 1;
        } else {
            nature = -1;
        }
    }

    /**
     * 
     * @return nature
     */
    public int returnNature() {
        return nature;
    }

    /**
     * 
     * @return start
     */
    public int returnStart() {
        return start;
    }

    /**
     * 
     * @return end
     */
    public int returnEnd() {
        return end;
    }

}
