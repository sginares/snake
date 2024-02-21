
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//needs massive aesthetic rewrites
public class PlayerSelectScreen extends JPanel {

    JButton go;
    JButton quit;
    MainWindow mw;

    JRadioButton opt1;
    JRadioButton opt2;
    JRadioButton opt3;

    public void quitButtonActionListener() {
        mw.showCard("One");
    }

    public void goButtonActionListener() {
        playerOptions();
        mw.s4.setUpPlayers();
        mw.showCard("Three");
    }

    public void playerOptions() {
        int m = 5;
        if (opt1.isSelected() == true) {
            m = 1;
        } else if (opt2.isSelected() == true) {
            m = 2;
        } else if (opt3.isSelected() == true) {
            m = 3;
        }
        mw.s4.setMaxPlayers(m);
    }

    public PlayerSelectScreen(MainWindow mw) {
        this.mw = mw;

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        final String select_Players_ = "Select Players: ";

        JLabel mess = new JLabel(select_Players_);
        add(mess);

        JLabel uc = new JLabel("Default: 1Player");
        add(uc);

        //set up radio buttons
        opt1 = new JRadioButton("1 Player(Default)");
        opt1.setSelected(true);

        opt2 = new JRadioButton("2 Players");
        opt3 = new JRadioButton("3 Players");

        ButtonGroup grp = new ButtonGroup();
        grp.add(opt1);
        grp.add(opt2);
        grp.add(opt3);

        add(opt1);
        add(opt2);
        add(opt3);
        final ActionListener actionListener_PlayerOptions = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                playerOptions();
            }
        };

        opt1.addActionListener(actionListener_PlayerOptions);
        opt2.addActionListener(actionListener_PlayerOptions);

        opt3.addActionListener(actionListener_PlayerOptions);

        go = new JButton("Customize Board");
        quit = new JButton("Back");

        final ActionListener actionListener_goButton = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                goButtonActionListener();
            }
        };

        go.addActionListener(actionListener_goButton);

        final ActionListener actionListener_Quit = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                quitButtonActionListener();
            }
        };

        quit.addActionListener(actionListener_Quit);

        add(go);
        add(quit);

    }

}
