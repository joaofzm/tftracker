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

	public class StartFrame extends JFrame implements ActionListener {

		JButton startButton;
		JButton optionsButton;
		JButton exitButton;
		static Gui gui;

		public StartFrame() {

			startButton = new JButton();
			startButton.setBounds(300, 675, 300, 100);
			startButton.addActionListener(this);
			startButton.setText("S T A R T");
			startButton.setFont(new Font("Impact", Font.BOLD, 22));
			startButton.setForeground(Color.white);
			startButton.setBackground(new Color(0x1E710E));
			startButton.setFocusable(false);

			exitButton = new JButton();
			exitButton.setBounds(375, 800, 150, 50);
			exitButton.addActionListener(this);
			exitButton.setText("E X I T");
			exitButton.setFont(new Font("Impact", Font.BOLD, 22));
			exitButton.setForeground(Color.white);
			exitButton.setBackground(new Color(0x982f30));
			exitButton.setFocusable(false);

			this.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource(""))));
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
