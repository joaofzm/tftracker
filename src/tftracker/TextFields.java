package tftracker;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class TextFields implements ActionListener {
	
	static JTextField player1TextField = new JTextField();
	static JTextField player2TextField = new JTextField();
	static JTextField player3TextField = new JTextField();
	static JTextField player4TextField = new JTextField();
	static JTextField player5TextField = new JTextField();
	static JTextField player6TextField = new JTextField();
	static JTextField player7TextField = new JTextField();
	static JTextField player8TextField = new JTextField();
	static JTextField extra = new JTextField();

	public TextFields() {

	player1TextField.setBounds(300, 0, 300, 300);
	player1TextField.setFont(new Font("Consolas", Font.PLAIN, 35));
	player1TextField.setForeground(Color.white);
	player1TextField.setBackground(Color.lightGray);
	player1TextField.setCaretColor(Color.white);
	player1TextField.setText("Player 1");
	player1TextField.addActionListener(this);
	player1TextField.setHorizontalAlignment(JTextField.CENTER);
	player1TextField.addFocusListener(new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			player1TextField.setText(null); // Empty the text field when it receives focus
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

		}

	});


	player2TextField.setBounds(600, 0, 300, 300);
	player2TextField.setFont(new Font("Consolas", Font.PLAIN, 35));
	player2TextField.setForeground(Color.white);
	player2TextField.setBackground(Color.lightGray);
	player2TextField.setCaretColor(Color.white);
	player2TextField.setText("Player 2");
	player2TextField.setHorizontalAlignment(JTextField.CENTER);
	player2TextField.addFocusListener(new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			player2TextField.setText(null); // Empty the text field when it receives focus
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

		}

	});

	player3TextField.setBounds(600, 300, 300, 300);
	player3TextField.setFont(new Font("Consolas", Font.PLAIN, 35));
	player3TextField.setForeground(Color.white);
	player3TextField.setBackground(Color.lightGray);
	player3TextField.setCaretColor(Color.white);
	player3TextField.setText("Player 3");
	player3TextField.setHorizontalAlignment(JTextField.CENTER);
	player3TextField.addFocusListener(new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			player3TextField.setText(null); // Empty the text field when it receives focus
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

		}

	});

	player4TextField.setBounds(600, 600, 300, 300);
	player4TextField.setFont(new Font("Consolas", Font.PLAIN, 35));
	player4TextField.setForeground(Color.white);
	player4TextField.setBackground(Color.lightGray);
	player4TextField.setCaretColor(Color.white);
	player4TextField.setText("Player 4");
	player4TextField.setHorizontalAlignment(JTextField.CENTER);
	player4TextField.addFocusListener(new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			player4TextField.setText(null); // Empty the text field when it receives focus
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

		}

	});

	player5TextField.setBounds(300, 600, 300, 300);
	player5TextField.setFont(new Font("Consolas", Font.PLAIN, 35));
	player5TextField.setForeground(Color.white);
	player5TextField.setBackground(Color.lightGray);
	player5TextField.setCaretColor(Color.white);
	player5TextField.setText("Player 5");
	player5TextField.setHorizontalAlignment(JTextField.CENTER);
	player5TextField.addFocusListener(new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			player5TextField.setText(null); // Empty the text field when it receives focus
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

		}

	});

	player6TextField.setBounds(0, 600, 300, 300);
	player6TextField.setFont(new Font("Consolas", Font.PLAIN, 35));
	player6TextField.setForeground(Color.white);
	player6TextField.setBackground(Color.lightGray);
	player6TextField.setCaretColor(Color.white);
	player6TextField.setText("Player 6");
	player6TextField.setHorizontalAlignment(JTextField.CENTER);
	player6TextField.addFocusListener(new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			player6TextField.setText(null); // Empty the text field when it receives focus
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

		}

	});

	player7TextField.setBounds(0, 300, 300, 300);
	player7TextField.setFont(new Font("Consolas", Font.PLAIN, 35));
	player7TextField.setForeground(Color.white);
	player7TextField.setBackground(Color.lightGray);
	player7TextField.setCaretColor(Color.white);
	player7TextField.setText("Player 7");
	player7TextField.setHorizontalAlignment(JTextField.CENTER);
	player7TextField.addFocusListener(new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			player7TextField.setText(null); // Empty the text field when it receives focus
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

		}

	});

	player8TextField.setBounds(1, 0, 299, 300);
	player8TextField.setFont(new Font("Consolas", Font.PLAIN, 35));
	player8TextField.setForeground(Color.white);
	player8TextField.setBackground(Color.lightGray);
	player8TextField.setCaretColor(Color.white);
	player8TextField.setText("Player 8");
	player8TextField.setHorizontalAlignment(JTextField.CENTER);
	player8TextField.addFocusListener(new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			player8TextField.setText(null); // Empty the text field when it receives focus
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

		}

	});

	extra.setBounds(0, 0, 1, 1);
}


@Override
public void actionPerformed(ActionEvent e) {


}

}
