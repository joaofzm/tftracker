package tftracker;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Buttons implements ActionListener {

	JButton rename;
	JButton undo;
	JButton eliminate;
	JButton startGame;
	JButton returnToMenu;

	int playersAlive = 8;

	static boolean player1Alive = true;
	static boolean player2Alive = true;
	static boolean player3Alive = true;
	static boolean player4Alive = true;
	static boolean player5Alive = true;
	static boolean player6Alive = true;
	static boolean player7Alive = true;
	static boolean player8Alive = true;

	static boolean userFound = false;

	ArrayList<Integer> player1Counter = new ArrayList<Integer>();
	ArrayList<Integer> player2Counter = new ArrayList<Integer>();
	ArrayList<Integer> player3Counter = new ArrayList<Integer>();
	ArrayList<Integer> player4Counter = new ArrayList<Integer>();
	ArrayList<Integer> player5Counter = new ArrayList<Integer>();
	ArrayList<Integer> player6Counter = new ArrayList<Integer>();
	ArrayList<Integer> player7Counter = new ArrayList<Integer>();
	ArrayList<Integer> player8Counter = new ArrayList<Integer>();
	
	void killPlayer1() {
		player1Alive = false;
		playersAlive--;
		player1Button.setBackground(Color.lightGray);
		player1Button.setEnabled(false);
		resetCounters();
		paintSquaresIf8PlayersAlive();
	}

	void killPlayer2() {
		player2Alive = false;
		playersAlive--;
		player2Button.setBackground(Color.lightGray);
		player2Button.setEnabled(false);
		resetCounters();
		paintSquaresIf8PlayersAlive();
	}

	void killPlayer3() {
		player3Alive = false;
		playersAlive--;
		player3Button.setBackground(Color.lightGray);
		player3Button.setEnabled(false);
		resetCounters();
		paintSquaresIf8PlayersAlive();
	}

	void killPlayer4() {
		player4Alive = false;
		playersAlive--;
		player4Button.setBackground(Color.lightGray);
		player4Button.setEnabled(false);
		resetCounters();
		paintSquaresIf8PlayersAlive();
	}

	void killPlayer5() {
		player5Alive = false;
		playersAlive--;
		player5Button.setBackground(Color.lightGray);
		player5Button.setEnabled(false);
		resetCounters();
		paintSquaresIf8PlayersAlive();
	}

	void killPlayer6() {
		player6Alive = false;
		playersAlive--;
		player6Button.setBackground(Color.lightGray);
		player6Button.setEnabled(false);
		resetCounters();
		paintSquaresIf8PlayersAlive();
	}

	void killPlayer7() {
		player7Alive = false;
		playersAlive--;
		player7Button.setBackground(Color.lightGray);
		player7Button.setEnabled(false);
		resetCounters();
		paintSquaresIf8PlayersAlive();
	}

	void killPlayer8() {
		player8Alive = false;
		playersAlive--;
		player8Button.setBackground(Color.lightGray);
		player8Button.setEnabled(false);
		resetCounters();
		paintSquaresIf8PlayersAlive();
	}

	void resetCounters() {
		player1Counter.add(6);
		player2Counter.add(6);
		player3Counter.add(6);
		player4Counter.add(6);
		player5Counter.add(6);
		player6Counter.add(6);
		player7Counter.add(6);
		player8Counter.add(6);
	}

	void increaseCounters(ArrayList<Integer> clickedPlayer) {
		player1Counter.add(player1Counter.get(player1Counter.size() - 1) + 1);
		player2Counter.add(player2Counter.get(player2Counter.size() - 1) + 1);
		player3Counter.add(player3Counter.get(player3Counter.size() - 1) + 1);
		player4Counter.add(player4Counter.get(player4Counter.size() - 1) + 1);
		player5Counter.add(player5Counter.get(player5Counter.size() - 1) + 1);
		player6Counter.add(player6Counter.get(player6Counter.size() - 1) + 1);
		player7Counter.add(player7Counter.get(player7Counter.size() - 1) + 1);
		player8Counter.add(player8Counter.get(player8Counter.size() - 1) + 1);
		clickedPlayer.set(clickedPlayer.size() - 1, 1);
	}

	static void findUser() {
	if (userFound == false) {
		if (player1Button.getText().equals("")) {
			player1Button.setBackground(Color.yellow);
			player1Button.setEnabled(false);
			player1Alive = false;
			userFound = true;
		}
		if (player2Button.getText().equals("")) {
			player2Button.setBackground(Color.yellow);
			player2Button.setEnabled(false);
			player2Alive = false;
			userFound = true;
		}
		if (player3Button.getText().equals("")) {
			player3Button.setBackground(Color.yellow);
			player3Button.setEnabled(false);
			player3Alive = false;
			userFound = true;
		}
		if (player4Button.getText().equals("")) {
			player4Button.setBackground(Color.yellow);
			player4Button.setEnabled(false);
			player4Alive = false;
			userFound = true;
		}
		if (player5Button.getText().equals("")) {
			player5Button.setBackground(Color.yellow);
			player5Button.setEnabled(false);
			player5Alive = false;
			userFound = true;
		}
		if (player6Button.getText().equals("")) {
			player6Button.setBackground(Color.yellow);
			player6Button.setEnabled(false);
			player6Alive = false;
			userFound = true;
		}
		if (player7Button.getText().equals("")) {
			player7Button.setBackground(Color.yellow);
			player7Button.setEnabled(false);
			player7Alive = false;
			userFound = true;
		}
		if (player8Button.getText().equals("")) {
			player8Button.setBackground(Color.yellow);
			player8Button.setEnabled(false);
			player8Alive = false;
			userFound = true;
		}
	}

	}

	void paintSquaresIf8PlayersAlive() {
		if (player1Alive) {
			if (player1Counter.get(player1Counter.size() - 1) < 5) {
				player1Button.setBackground(new Color(0x1E710E));
			} else if (player1Counter.get(player1Counter.size() - 1) >= 5) {
				player1Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player2Alive) {
			if (player2Counter.get(player2Counter.size() - 1) < 5) {
				player2Button.setBackground(new Color(0x1E710E));
			} else if (player2Counter.get(player2Counter.size() - 1) >= 5) {
				player2Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player3Alive) {
			if (player3Counter.get(player3Counter.size() - 1) < 5) {
				player3Button.setBackground(new Color(0x1E710E));
			} else if (player3Counter.get(player3Counter.size() - 1) >=5) {
				player3Button.setBackground(new Color(96, 9, 9));
			}
		}
	
		if (player4Alive) {
			if (player4Counter.get(player4Counter.size() - 1) < 5) {
				player4Button.setBackground(new Color(0x1E710E));
			} else if (player4Counter.get(player4Counter.size() - 1) >= 5) {
				player4Button.setBackground(new Color(96, 9, 9));
			}
		}
	
		if (player5Alive) {
			if (player5Counter.get(player5Counter.size() - 1) < 5) {
				player5Button.setBackground(new Color(0x1E710E));
			} else if (player5Counter.get(player5Counter.size() - 1) >= 5) {
				player5Button.setBackground(new Color(96, 9, 9));
			}
		}
	
		if (player6Alive) {
			if (player6Counter.get(player6Counter.size() - 1) < 5) {
				player6Button.setBackground(new Color(0x1E710E));
			} else if (player6Counter.get(player6Counter.size() - 1) >= 5) {
				player6Button.setBackground(new Color(96, 9, 9));
			}
		}
	
		if (player7Alive) {
			if (player7Counter.get(player7Counter.size() - 1) < 5) {
				player7Button.setBackground(new Color(0x1E710E));
			} else if (player7Counter.get(player7Counter.size() - 1) >= 5) {
				player7Button.setBackground(new Color(96, 9, 9));
			}
		}
	
		if (player8Alive) {
			if (player8Counter.get(player8Counter.size() - 1) < 5) {
				player8Button.setBackground(new Color(0x1E710E));
			} else if (player8Counter.get(player8Counter.size() - 1) >= 5) {
				player8Button.setBackground(new Color(96, 9, 9));
			}
		}
	}

	void paintSquaresIf7PlayersAlive() {
		if (player1Alive) {
			if (player1Counter.get(player1Counter.size() - 1) < 4) {
				player1Button.setBackground(new Color(0x1E710E));
			} else if (player1Counter.get(player1Counter.size() - 1) >= 4) {
				player1Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player2Alive) {
			if (player2Counter.get(player2Counter.size() - 1) < 4) {
				player2Button.setBackground(new Color(0x1E710E));
			} else if (player2Counter.get(player2Counter.size() - 1) >= 4) {
				player2Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player3Alive) {
			if (player3Counter.get(player3Counter.size() - 1) < 4) {
				player3Button.setBackground(new Color(0x1E710E));
			} else if (player3Counter.get(player3Counter.size() - 1) >= 4) {
				player3Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player4Alive) {
			if (player4Counter.get(player4Counter.size() - 1) < 4) {
				player4Button.setBackground(new Color(0x1E710E));
			} else if (player4Counter.get(player4Counter.size() - 1) >= 4) {
				player4Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player5Alive) {
			if (player5Counter.get(player5Counter.size() - 1) < 4) {
				player5Button.setBackground(new Color(0x1E710E));
			} else if (player5Counter.get(player5Counter.size() - 1) >= 4) {
				player5Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player6Alive) {
			if (player6Counter.get(player6Counter.size() - 1) < 4) {
				player6Button.setBackground(new Color(0x1E710E));
			} else if (player6Counter.get(player6Counter.size() - 1) >= 4) {
				player6Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player7Alive) {
			if (player7Counter.get(player7Counter.size() - 1) < 4) {
				player7Button.setBackground(new Color(0x1E710E));
			} else if (player7Counter.get(player7Counter.size() - 1) >= 4) {
				player7Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player8Alive) {
			if (player8Counter.get(player8Counter.size() - 1) < 4) {
				player8Button.setBackground(new Color(0x1E710E));
			} else if (player8Counter.get(player8Counter.size() - 1) >= 4) {
				player8Button.setBackground(new Color(96, 9, 9));
			}
		}
	}

	void paintSquaresIf6PlayersAlive() {
		if (player1Alive) {
			if (player1Counter.get(player1Counter.size() - 1) < 3) {
				player1Button.setBackground(new Color(0x1E710E));
			} else if (player1Counter.get(player1Counter.size() - 1) >= 3) {
				player1Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player2Alive) {
			if (player2Counter.get(player2Counter.size() - 1) < 3) {
				player2Button.setBackground(new Color(0x1E710E));
			} else if (player2Counter.get(player2Counter.size() - 1) >= 3) {
				player2Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player3Alive) {
			if (player3Counter.get(player3Counter.size() - 1) < 3) {
				player3Button.setBackground(new Color(0x1E710E));
			} else if (player3Counter.get(player3Counter.size() - 1) >= 3) {
				player3Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player4Alive) {
			if (player4Counter.get(player4Counter.size() - 1) < 3) {
				player4Button.setBackground(new Color(0x1E710E));
			} else if (player4Counter.get(player4Counter.size() - 1) >= 3) {
				player4Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player5Alive) {
			if (player5Counter.get(player5Counter.size() - 1) < 3) {
				player5Button.setBackground(new Color(0x1E710E));
			} else if (player5Counter.get(player5Counter.size() - 1) >= 3) {
				player5Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player6Alive) {
			if (player6Counter.get(player6Counter.size() - 1) < 3) {
				player6Button.setBackground(new Color(0x1E710E));
			} else if (player6Counter.get(player6Counter.size() - 1) >= 3) {
				player6Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player7Alive) {
			if (player7Counter.get(player7Counter.size() - 1) < 3) {
				player7Button.setBackground(new Color(0x1E710E));
			} else if (player7Counter.get(player7Counter.size() - 1) >= 3) {
				player7Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player8Alive) {
			if (player8Counter.get(player8Counter.size() - 1) < 3) {
				player8Button.setBackground(new Color(0x1E710E));
			} else if (player8Counter.get(player8Counter.size() - 1) >= 3) {
				player8Button.setBackground(new Color(96, 9, 9));
			}
		}
	}

	void paintSquaresIf5or4PlayersAlive() {
		if (player1Alive) {
			if (player1Counter.get(player1Counter.size() - 1) < 2) {
				player1Button.setBackground(new Color(0x1E710E));
			} else if (player1Counter.get(player1Counter.size() - 1) >= 2) {
				player1Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player2Alive) {
			if (player2Counter.get(player2Counter.size() - 1) < 2) {
				player2Button.setBackground(new Color(0x1E710E));
			} else if (player2Counter.get(player2Counter.size() - 1) >= 2) {
				player2Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player3Alive) {
			if (player3Counter.get(player3Counter.size() - 1) < 2) {
				player3Button.setBackground(new Color(0x1E710E));
			} else if (player3Counter.get(player3Counter.size() - 1) >= 2) {
				player3Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player4Alive) {
			if (player4Counter.get(player4Counter.size() - 1) < 2) {
				player4Button.setBackground(new Color(0x1E710E));
			} else if (player4Counter.get(player4Counter.size() - 1) >= 2) {
				player4Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player5Alive) {
			if (player5Counter.get(player5Counter.size() - 1) < 2) {
				player5Button.setBackground(new Color(0x1E710E));
			} else if (player5Counter.get(player5Counter.size() - 1) >= 2) {
				player5Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player6Alive) {
			if (player6Counter.get(player6Counter.size() - 1) < 2) {
				player6Button.setBackground(new Color(0x1E710E));
			} else if (player6Counter.get(player6Counter.size() - 1) >= 2) {
				player6Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player7Alive) {
			if (player7Counter.get(player7Counter.size() - 1) < 2) {
				player7Button.setBackground(new Color(0x1E710E));
			} else if (player7Counter.get(player7Counter.size() - 1) >= 2) {
				player7Button.setBackground(new Color(96, 9, 9));
			}
		}

		if (player8Alive) {
			if (player8Counter.get(player8Counter.size() - 1) < 2) {
				player8Button.setBackground(new Color(0x1E710E));
			} else if (player8Counter.get(player8Counter.size() - 1) >= 2) {
				player8Button.setBackground(new Color(96, 9, 9));
			}
		}
	}

	public static JButton player1Button = new JButton();
	public static JButton player2Button = new JButton();
	public static JButton player3Button = new JButton();
	public static JButton player4Button = new JButton();
	public static JButton player5Button = new JButton();
	public static JButton player6Button = new JButton();
	public static JButton player7Button = new JButton();
	public static JButton player8Button = new JButton();

	public Buttons() {

		resetCounters();

		startGame = new JButton();
		startGame.setBounds(350, 400, 200, 100);
		startGame.addActionListener(this);
		startGame.setText("START GAME");
		startGame.setFont(new Font("Comic sans", Font.BOLD, 22));
		startGame.setForeground(Color.white);
		startGame.setFocusable(true);
		startGame.setBackground(new Color(0x1E710E));
		startGame.setVisible(true);

		rename = new JButton();
		rename.setBounds(325, 313, 250, 50);
		rename.addActionListener(this);
		rename.setText("RENAME");
		rename.setFont(new Font("Comic sans", Font.BOLD, 22));
		rename.setForeground(Color.white);
		rename.setBackground(new Color(0x1E710E));
		rename.setFocusable(true);
		rename.setVisible(false);

		undo = new JButton();
		undo.setBounds(325, 388, 250, 50);
		undo.addActionListener(this);
		undo.setText("UNDO");
		undo.setFont(new Font("Comic sans", Font.BOLD, 22));
		undo.setForeground(Color.white);
		undo.setBackground(Color.blue);
		undo.setFocusable(false);
		undo.setVisible(false);

		eliminate = new JButton();
		eliminate.setBounds(325, 462, 250, 50);
		eliminate.addActionListener(this);
		eliminate.setText("ELIMINATE");
		eliminate.setFont(new Font("Comic sans", Font.BOLD, 22));
		eliminate.setForeground(Color.white);
		eliminate.setBackground(new Color(96, 9, 9));
		eliminate.setFocusable(false);
		eliminate.setVisible(false);

		returnToMenu = new JButton();
		returnToMenu.setBounds(325, 537, 250, 50);
		returnToMenu.addActionListener(this);
		returnToMenu.setText("RETURN TO MENU");
		returnToMenu.setFont(new Font("Comic sans", Font.BOLD, 22));
		returnToMenu.setForeground(Color.white);
		returnToMenu.setBackground(new Color(100, 65, 165));
		returnToMenu.setFocusable(false);
		returnToMenu.setVisible(true);

		player1Button = new JButton();
		player1Button.setBounds(300, 0, 300, 300);
		player1Button.addActionListener(this);
		player1Button.setFont(new Font("Impact", Font.BOLD, 30));
		player1Button.setForeground(Color.white);
		player1Button.setBackground(new Color(96, 9, 9));
		player1Button.setFocusable(false);
		player1Button.setVisible(false);

		player2Button = new JButton();
		player2Button.setBounds(600, 0, 300, 300);
		player2Button.addActionListener(this);
		player2Button.setFont(new Font("Impact", Font.BOLD, 30));
		player2Button.setForeground(Color.white);
		player2Button.setBackground(new Color(96, 9, 9));
		player2Button.setFocusable(false);
		player2Button.setVisible(false);

		player3Button = new JButton();
		player3Button.setBounds(600, 300, 300, 300);
		player3Button.addActionListener(this);
		player3Button.setFont(new Font("Impact", Font.BOLD, 30));
		player3Button.setForeground(Color.white);
		player3Button.setBackground(new Color(96, 9, 9));
		player3Button.setFocusable(false);
		player3Button.setVisible(false);

		player4Button = new JButton();
		player4Button.setBounds(600, 600, 300, 300);
		player4Button.addActionListener(this);
		player4Button.setFont(new Font("Impact", Font.BOLD, 30));
		player4Button.setForeground(Color.white);
		player4Button.setBackground(new Color(96, 9, 9));
		player4Button.setFocusable(false);
		player4Button.setVisible(false);

		player5Button = new JButton();
		player5Button.setBounds(300, 600, 300, 300);
		player5Button.addActionListener(this);
		player5Button.setFont(new Font("Impact", Font.BOLD, 30));
		player5Button.setForeground(Color.white);
		player5Button.setBackground(new Color(96, 9, 9));
		player5Button.setFocusable(false);
		player5Button.setVisible(false);

		player6Button = new JButton();
		player6Button.setBounds(0, 600, 300, 300);
		player6Button.addActionListener(this);
		player6Button.setFont(new Font("Impact", Font.BOLD, 30));
		player6Button.setForeground(Color.white);
		player6Button.setBackground(new Color(96, 9, 9));
		player6Button.setFocusable(false);
		player6Button.setVisible(false);

		player7Button = new JButton();
		player7Button.setBounds(0, 300, 300, 300);
		player7Button.addActionListener(this);
		player7Button.setFont(new Font("Impact", Font.BOLD, 30));
		player7Button.setForeground(Color.white);
		player7Button.setBackground(new Color(96, 9, 9));
		player7Button.setFocusable(false);
		player7Button.setVisible(false);

		player8Button = new JButton();
		player8Button.setBounds(0, 0, 300, 300);
		player8Button.addActionListener(this);
		player8Button.setFont(new Font("Impact", Font.BOLD, 30));
		player8Button.setForeground(Color.white);
		player8Button.setBackground(new Color(96, 9, 9));
		player8Button.setFocusable(true);
		player8Button.setVisible(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == player1Button) {
			increaseCounters(player1Counter);
			if (playersAlive == 8) {
				paintSquaresIf8PlayersAlive();
			} else if (playersAlive == 7) {
				paintSquaresIf7PlayersAlive();
			} else if (playersAlive == 6) {
				paintSquaresIf6PlayersAlive();
			} else if (playersAlive == 5 || playersAlive == 4) {
				paintSquaresIf5or4PlayersAlive();
			}
		}

		if (e.getSource() == player2Button) {
			increaseCounters(player2Counter);
			if (playersAlive == 8) {
				paintSquaresIf8PlayersAlive();
			} else if (playersAlive == 7) {
				paintSquaresIf7PlayersAlive();
			} else if (playersAlive == 6) {
				paintSquaresIf6PlayersAlive();
			} else if (playersAlive == 5 || playersAlive == 4) {
				paintSquaresIf5or4PlayersAlive();
			}
		}

		if (e.getSource() == player3Button) {
			increaseCounters(player3Counter);
			if (playersAlive == 8) {
				paintSquaresIf8PlayersAlive();
			} else if (playersAlive == 7) {
				paintSquaresIf7PlayersAlive();
			} else if (playersAlive == 6) {
				paintSquaresIf6PlayersAlive();
			} else if (playersAlive == 5 || playersAlive == 4) {
				paintSquaresIf5or4PlayersAlive();
			}
		}

		if (e.getSource() == player4Button) {
			increaseCounters(player4Counter);
			if (playersAlive == 8) {
				paintSquaresIf8PlayersAlive();
			} else if (playersAlive == 7) {
				paintSquaresIf7PlayersAlive();
			} else if (playersAlive == 6) {
				paintSquaresIf6PlayersAlive();
			} else if (playersAlive == 5 || playersAlive == 4) {
				paintSquaresIf5or4PlayersAlive();
			}
		}

		if (e.getSource() == player5Button) {
			increaseCounters(player5Counter);
			if (playersAlive == 8) {
				paintSquaresIf8PlayersAlive();
			} else if (playersAlive == 7) {
				paintSquaresIf7PlayersAlive();
			} else if (playersAlive == 6) {
				paintSquaresIf6PlayersAlive();
			} else if (playersAlive == 5 || playersAlive == 4) {
				paintSquaresIf5or4PlayersAlive();
			}
		}

		if (e.getSource() == player6Button) {
			increaseCounters(player6Counter);
			if (playersAlive == 8) {
				paintSquaresIf8PlayersAlive();
			} else if (playersAlive == 7) {
				paintSquaresIf7PlayersAlive();
			} else if (playersAlive == 6) {
				paintSquaresIf6PlayersAlive();
			} else if (playersAlive == 5 || playersAlive == 4) {
				paintSquaresIf5or4PlayersAlive();
			}
		}

		if (e.getSource() == player7Button) {
			increaseCounters(player7Counter);
			if (playersAlive == 8) {
				paintSquaresIf8PlayersAlive();
			} else if (playersAlive == 7) {
				paintSquaresIf7PlayersAlive();
			} else if (playersAlive == 6) {
				paintSquaresIf6PlayersAlive();
			} else if (playersAlive == 5 || playersAlive == 4) {
				paintSquaresIf5or4PlayersAlive();
			}
		}

		if (e.getSource() == player8Button) {
			increaseCounters(player8Counter);
			if (playersAlive == 8) {
				paintSquaresIf8PlayersAlive();
			} else if (playersAlive == 7) {
				paintSquaresIf7PlayersAlive();
			} else if (playersAlive == 6) {
				paintSquaresIf6PlayersAlive();
			} else if (playersAlive == 5 || playersAlive == 4) {
				paintSquaresIf5or4PlayersAlive();
			}
		}


		if (e.getSource() == startGame) {
			startGame.setVisible(false);
			rename.setVisible(true);
			undo.setVisible(true);
			eliminate.setVisible(true);

			player1Button.setVisible(true);
			player1Button.setText(TextFields.player1TextField.getText());
			player2Button.setVisible(true);
			player2Button.setText(TextFields.player2TextField.getText());
			player3Button.setVisible(true);
			player3Button.setText(TextFields.player3TextField.getText());
			player4Button.setVisible(true);
			player4Button.setText(TextFields.player4TextField.getText());
			player5Button.setVisible(true);
			player5Button.setText(TextFields.player5TextField.getText());
			player6Button.setVisible(true);
			player6Button.setText(TextFields.player6TextField.getText());
			player7Button.setVisible(true);
			player7Button.setText(TextFields.player7TextField.getText());
			player8Button.setVisible(true);
			player8Button.setText(TextFields.player8TextField.getText());
			findUser();
		}


		if (e.getSource() == rename) {
			startGame.setText("RESUME GAME");
			startGame.setVisible(true);
			rename.setVisible(false);
			undo.setVisible(false);
			eliminate.setVisible(false);
			player1Button.setVisible(false);
			player2Button.setVisible(false);
			player3Button.setVisible(false);
			player4Button.setVisible(false);
			player5Button.setVisible(false);
			player5Button.setVisible(false);
			player6Button.setVisible(false);
			player7Button.setVisible(false);
			player8Button.setVisible(false);
		}

		if (e.getSource() == undo) {
			player1Counter.remove(player1Counter.get(player1Counter.size() - 1));
			player2Counter.remove(player2Counter.get(player2Counter.size() - 1));
			player3Counter.remove(player3Counter.get(player3Counter.size() - 1));
			player4Counter.remove(player4Counter.get(player4Counter.size() - 1));
			player5Counter.remove(player5Counter.get(player5Counter.size() - 1));
			player6Counter.remove(player6Counter.get(player6Counter.size() - 1));
			player7Counter.remove(player7Counter.get(player7Counter.size() - 1));
			player8Counter.remove(player8Counter.get(player8Counter.size() - 1));
			System.out.println(player1Counter);
			if (playersAlive == 8) {
				paintSquaresIf8PlayersAlive();
			} else if (playersAlive == 7) {
				paintSquaresIf7PlayersAlive();
			} else if (playersAlive == 6) {
				paintSquaresIf6PlayersAlive();
			} else if (playersAlive == 5 || playersAlive == 4) {
				paintSquaresIf5or4PlayersAlive();
			}
		}

		if (e.getSource() == eliminate) {
			ArrayList<String> listOfOptions = new ArrayList<String>();
			if (player1Alive) {
				listOfOptions.add(player1Button.getText());
			}
			if (player2Alive) {
				listOfOptions.add(player2Button.getText());
			}
			if (player3Alive) {
				listOfOptions.add(player3Button.getText());
			}
			if (player4Alive) {
				listOfOptions.add(player4Button.getText());
			}
			if (player5Alive) {
				listOfOptions.add(player5Button.getText());
			}
			if (player6Alive) {
				listOfOptions.add(player6Button.getText());
			}
			if (player7Alive) {
				listOfOptions.add(player7Button.getText());
			}
			if (player8Alive) {
				listOfOptions.add(player8Button.getText());
			}
			listOfOptions.add("Cancel");
			String[] arrayOfOptions = new String[listOfOptions.size()];
			listOfOptions.toArray(arrayOfOptions);

			int action = JOptionPane.showOptionDialog(null,
					"Click the player you want to eliminate! THIS ACTION CAN'T BE UNDONE!", "ELIMINATE!",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, arrayOfOptions, 0);

			if (action == 0 && arrayOfOptions[0] == player1Button.getText()) {
				killPlayer1();
			} else if (action == 0 && arrayOfOptions[0] == player2Button.getText()) {
				killPlayer2();
			} else if (action == 0 && arrayOfOptions[0] == player3Button.getText()) {
				killPlayer3();
			} else if (action == 0 && arrayOfOptions[0] == player4Button.getText()) {
				killPlayer4();
			} else if (action == 0 && arrayOfOptions[0] == player5Button.getText()) {
				killPlayer5();
			} else if (action == 0 && arrayOfOptions[0] == player6Button.getText()) {
				killPlayer6();
			} else if (action == 0 && arrayOfOptions[0] == player7Button.getText()) {
				killPlayer7();
			} else if (action == 0 && arrayOfOptions[0] == player8Button.getText()) {
				killPlayer8();
			}

			if (action == 1 && arrayOfOptions[1] == player2Button.getText()) {
				killPlayer2();
			} else if (action == 1 && arrayOfOptions[1] == player3Button.getText()) {
				killPlayer3();
			} else if (action == 1 && arrayOfOptions[1] == player4Button.getText()) {
				killPlayer4();
			} else if (action == 1 && arrayOfOptions[1] == player5Button.getText()) {
				killPlayer5();
			} else if (action == 1 && arrayOfOptions[1] == player6Button.getText()) {
				killPlayer6();
			} else if (action == 1 && arrayOfOptions[1] == player7Button.getText()) {
				killPlayer7();
			} else if (action == 1 && arrayOfOptions[1] == player8Button.getText()) {
				killPlayer8();
			}

			if (action == 2 && arrayOfOptions[2] == player3Button.getText()) {
				killPlayer3();
			} else if (action == 2 && arrayOfOptions[2] == player4Button.getText()) {
				killPlayer4();
			} else if (action == 2 && arrayOfOptions[2] == player5Button.getText()) {
				killPlayer5();
			} else if (action == 2 && arrayOfOptions[2] == player6Button.getText()) {
				killPlayer6();
			} else if (action == 2 && arrayOfOptions[2] == player7Button.getText()) {
				killPlayer7();
			} else if (action == 2 && arrayOfOptions[2] == player8Button.getText()) {
				killPlayer8();
			}

			if (action == 3 && arrayOfOptions[3] == player4Button.getText()) {
				killPlayer4();
			} else if (action == 3 && arrayOfOptions[3] == player5Button.getText()) {
				killPlayer5();
			} else if (action == 3 && arrayOfOptions[3] == player6Button.getText()) {
				killPlayer6();
			} else if (action == 3 && arrayOfOptions[3] == player7Button.getText()) {
				killPlayer7();
			} else if (action == 3 && arrayOfOptions[3] == player8Button.getText()) {
				killPlayer8();
			}

			if (action == 4 && arrayOfOptions[4] == player5Button.getText()) {
				killPlayer5();
			} else if (action == 4 && arrayOfOptions[4] == player6Button.getText()) {
				killPlayer6();
			} else if (action == 4 && arrayOfOptions[4] == player7Button.getText()) {
				killPlayer7();
			} else if (action == 4 && arrayOfOptions[4] == player8Button.getText()) {
				killPlayer8();
			}

			if (action == 5 && arrayOfOptions[5] == player6Button.getText()) {
				killPlayer6();
			} else if (action == 5 && arrayOfOptions[5] == player7Button.getText()) {
				killPlayer7();
			} else if (action == 5 && arrayOfOptions[5] == player8Button.getText()) {
				killPlayer8();
			}

			if (action == 6 && arrayOfOptions[6] == player7Button.getText()) {
				killPlayer7();
			} else if (action == 6 && arrayOfOptions[6] == player8Button.getText()) {
				killPlayer8();
			}

			if (action == 7 && arrayOfOptions[7] == player8Button.getText()) {
				killPlayer8();
			}

		}

		if (e.getSource() == returnToMenu) {
			StartFrame.gui.dispose();
			new StartFrame();
		}
	}
}
