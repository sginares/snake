
import java.awt.Color;

/**
 * Player class
 *
 * @author Silvia Estrella Ginares Pintos
 * @version v1.0
 */
public class Player {

    private String name;
    private int playerPosn;
    private int playerScore;
    private Color playerColor;

    /**
     *
     * @param no int
     */
    public Player(int no) {
        name = "Player " + no;
        playerPosn = 0;
    }

    /**
     *
     * @return playerPosn
     */
    public int getPosition() {
        return playerPosn;
    }

    /**
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param posn int
     */
    public void setPosition(int posn) {
        playerPosn = posn;
    }

    /**
     * 
     * @param posn int
     */
    public void incPosition(int posn) {
        playerPosn += posn;
    }

    /**
     * 
     * @param c Color
     */
    public void setPlayerColor(Color c) {
        playerColor = c;
    }

    /**
     * 
     * @return playerColor
     */
    public Color getPlayerColor() {
        return playerColor;
    }

    /**
     * 
     * @param a int
     */
    public void incPlayerScore(int a) {
        playerScore += a;
    }

    /**
     * 
     * @return playerScore
     */
    public int getPlayerScore() {
        return playerScore;
    }

}
