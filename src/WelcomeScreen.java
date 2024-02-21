
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * WelcomeScreen class
 *
 * @author Silvia Estrella Ginares Pintos
 * @version v1.0
 */
public class WelcomeScreen extends JPanel {

    private static final String ARE_YOU_SURE = "Are you sure?";
    private static final String NEW__GAME = "New Game";
    private static final String QUIT = "Quit";
    private static final String TWO = "Two";

    JLabel title;
    JButton go;
    JButton quit;
    MainWindow mw;

    /**
     *
     * @param t
     */
    public void setTitle(String t) {
        title.setText(t);
    }

    /**
     *
     */
    public void quitButtonActionListener() {
        if (JOptionPane.showConfirmDialog(this, ARE_YOU_SURE) == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    /**
     *
     */
    public void goButtonActionListener() {
        mw.showCard(TWO);
    }

    /**
     *
     * @param mw MainWindow
     */
    public WelcomeScreen(MainWindow mw) {
        this.mw = mw;

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        title = new JLabel();
        add(title);

        //add formatting here
        go = new JButton(NEW__GAME);
        quit = new JButton(QUIT);

        go.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                goButtonActionListener();
            }
        });

        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                quitButtonActionListener();
            }
        });

        add(go);
        add(quit);
    }
}
