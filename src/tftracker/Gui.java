package tftracker;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame {

	JButton player1Button;
	JButton player2Button;
	JButton player3Button;
	JButton player4Button;
	JButton player5Button;
	JButton player6Button;
	JButton player7Button;
	JButton player8Button;

	JButton matchRename;
	JButton undo;
	JButton eliminate;

	public Gui() {

		this.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("background.jpg"))));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		ImageIcon icon = new ImageIcon(Gui.class.getResource("icon.png"));
		this.setIconImage(icon.getImage());
		this.setTitle("TFTracker");
		this.setResizable(false);
		this.setSize(900, 900);
		this.setMinimumSize(new Dimension(900, 900));
		this.pack();

		Buttons buttons = new Buttons();
		this.add(buttons.player1Button);
		this.add(buttons.player2Button);
		this.add(buttons.player3Button);
		this.add(buttons.player4Button);
		this.add(buttons.player5Button);
		this.add(buttons.player6Button);
		this.add(buttons.player7Button);
		this.add(buttons.player8Button);
		this.add(buttons.rename);
		this.add(buttons.undo);
		this.add(buttons.eliminate);
		this.add(buttons.startGame);
		this.add(buttons.returnToMenu);

		TextFields textFields = new TextFields();
		this.add(textFields.player1TextField);
		this.add(textFields.player2TextField);
		this.add(textFields.player3TextField);
		this.add(textFields.player4TextField);
		this.add(textFields.player5TextField);
		this.add(textFields.player6TextField);
		this.add(textFields.player7TextField);
		this.add(textFields.player8TextField);
		this.add(textFields.extra);


		this.setVisible(true);

	}

}
