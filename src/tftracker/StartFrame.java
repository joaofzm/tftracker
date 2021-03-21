package tftracker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

	public class StartFrame extends JFrame implements ActionListener {

		JButton startButton;
		JButton optionsButton;
		JButton exitButton;
		static Gui gui;

		JLabel label;
		JLabel example1;
		JLabel example2;

		public StartFrame() {

			example1 = new JLabel();
			ImageIcon example1Image = new ImageIcon(StartFrame.class.getResource("example1.png"));
			example1.setIcon(example1Image);
			example1.setBounds(285, 530, 250, 226);

			example2 = new JLabel();
			ImageIcon example2Image = new ImageIcon(StartFrame.class.getResource("example2.png"));
			example2.setIcon(example2Image);
			example2.setBounds(535, 530, 80, 226);

			label = new JLabel();
			label.setBounds(0, 110, 900, 450);
			label.setBorder(new EmptyBorder(20, 20, 20, 20));
			label.setText(
					"<html><body><br>After you click ''start'', click each of the arenas and fill them up with your opponents "
							+ "names, remember to LEAVE YOURSELF BLANK!<br><br>"
							+ " You can fill the arenas during the loading screen or after the game started, just follow "
							+ "the order in the images bellow:<br><br>"
							+ "After naming all the opponents, and leaving yourself blank, just click the opponent you fight each"
							+ " round, and the app will keep track of your possible next opponents, red squares are your possible opponents. <br><br>"
							+ "When a player is eliminated, click the ''eliminate'' button and eliminate that player, the algorithm will reset, and"
							+ "you can keep using the tracker the same way."
					+ "</body></html>");
			label.setFont(new Font("Arial", Font.BOLD, 22));
			label.setVerticalTextPosition(JLabel.NORTH);
			label.setHorizontalTextPosition(JLabel.CENTER);
			label.setForeground(Color.black);
			label.setFocusable(false);

			startButton = new JButton();
			startButton.setBounds(300, 765, 300, 50);
			startButton.addActionListener(this);
			startButton.setText("S T A R T");
			startButton.setFont(new Font("Impact", Font.BOLD, 22));
			startButton.setForeground(Color.white);
			startButton.setBackground(new Color(0, 28, 255));
			startButton.setFocusable(false);

			exitButton = new JButton();
			exitButton.setBounds(375, 830, 150, 50);
			exitButton.addActionListener(this);
			exitButton.setText("E X I T");
			exitButton.setFont(new Font("Impact", Font.BOLD, 22));
			exitButton.setForeground(Color.white);
			exitButton.setBackground(Color.red);
			exitButton.setFocusable(false);

			this.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("background.jpg"))));
			this.setBackground(new Color(100, 65, 165));
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(null);
			ImageIcon icon = new ImageIcon(StartFrame.class.getResource("icon.png"));
			this.setIconImage(icon.getImage());
			this.setTitle("TFTracker");
			this.setResizable(false);
			this.setSize(900, 900);
			this.setMinimumSize(new Dimension(900, 900));
			this.setVisible(true);
			this.pack();

			this.add(startButton);
			this.add(exitButton);
			this.add(label);
			this.add(example1);
			this.add(example2);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == startButton) {
				dispose();
				gui = new Gui();
			}

			if (e.getSource() == exitButton) {
				dispose();
			}

	}

}
