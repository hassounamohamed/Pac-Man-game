package Pac;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;


public class Pac extends JPanel {
	
	class Block {
		int x;
		int y;
		int width;
		int heigth;
		Image image;
	}
	private int rowCount = 21;
	private int columnCount = 19;
	private int tileSize = 32;
	private int boardWidth = columnCount * tileSize;
	private int boardHeight = rowCount * tileSize;
	
	private Image wallImage;
	private Image blueGhostImage;
	private Image orangeGhostImage;
	private Image pinkGhostImage;
	private Image redGhostImage;
	
	private Image pacmanUpImage;
	private Image pacmanDownImage;
	private Image pacmanLeftImage;
	private Image pacmanRightImage;
	
	Pac(){
		setPreferredSize(new Dimension(boardWidth , boardHeight ));
		setBackground(Color.BLACK);
		
		//load images3
		wallImage =new ImageIcon (getClass().getResource("./wall.png")).getImage();
		blueGhostImage =new ImageIcon (getClass().getResource("./blueGhost.png")).getImage();
		orangeGhostImage =new ImageIcon (getClass().getResource("./orangeGhost.png")).getImage();
		pinkGhostImage =new ImageIcon (getClass().getResource("./pinkGhost.png")).getImage();
		redGhostImage =new ImageIcon (getClass().getResource("./redGhost.png")).getImage();
		
		pacmanUpImage =new ImageIcon (getClass().getResource("./pacmanUp.png")).getImage();
		pacmanDownImage =new ImageIcon (getClass().getResource("./pacmanDown.png")).getImage();
		pacmanLeftImage =new ImageIcon (getClass().getResource("./pacmanLeft.png")).getImage();
		pacmanRightImage =new ImageIcon (getClass().getResource("./pacmanRight.png")).getImage();
	}

}
