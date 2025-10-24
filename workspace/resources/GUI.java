package resources;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;


public class GUI extends JFrame implements ActionListener, MouseListener, MouseMotionListener{

	// What game the GUI is apart of:
	Solitaire game;

	// Constructor for a GUI
	public GUI(Solitaire game){
		// a GUI IS A J FRAME! All this info is something you would change of a JFrame, but here we do it as a GUI which has set settings
		this.game= game;

        //Create and set up the window.
       	setTitle("Game");
       	setSize(900,700);
		getContentPane().setLayout(new FlowLayout());
       	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//getContentPane().setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);

       
    //    this supplies the background
	// CURRENTLY THE BACKGROUND CAUSES ERRORS!!!!!!!!!!!!!!!!!!
       try {
		System.out.println(getClass().toString());
		ImageIcon backImage = new ImageIcon();
		Image blackImg = ImageIO.read(getClass().getResource("background.jpg"));
		setContentPane(new ImagePanel(blackImg));

       }catch(IOException e) {
    	   e.printStackTrace();
       }
       
       /*******
        * This is just a test to make sure images are being read correctly on your machine. Please replace
        * once you have confirmed that the card shows up properly. The code below should allow you to play the solitare
        * game once it's fully created.
        */

	   //Card is a custom JComponent
    //    Card card = new Card(2, Card.Suit.Diamonds);
    //   // System.out.println(card);
	//   JPanel newPanel = new JPanel();
	//   card.setPreferredSize(new Dimension(200, 200));

		JPanel gameArea = new JPanel();
		gameArea.setSize(new Dimension(800,600));
		gameArea.setOpaque(false);
		gameArea.setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.BLUE));
		gameArea.setLayout(new GridBagLayout());


		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.NORTHWEST;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx=1;
		constraints.weighty=1;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		gameArea.add(button1, constraints);
		constraints.gridx = 1;   
		gameArea.add(button2, constraints);    
		constraints.gridx = 2;
		gameArea.add(button3, constraints);    

		constraints.gridx = 0;
		constraints.gridy = 1;		
		gameArea.add(button4,constraints);    
		constraints.gridx = 1;
		constraints.gridwidth = 2;
		gameArea.add(button5, constraints);    

		this.getContentPane().add(gameArea);
        this.setVisible(true);
    }


	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
