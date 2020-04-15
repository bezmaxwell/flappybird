package javajframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import flappyFuck.FlappyFuck;

public class ActionListeners implements ActionListener, MouseListener, KeyListener {
	
	
	@Override
	public void mouseClicked(MouseEvent e) {

		FlappyFuck.flappyFuck.jump();
		
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
	public void keyPressed(KeyEvent e) {
    
		if(e.getKeyCode() == KeyEvent.VK_DELETE) {
    	   
       }
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			
				FlappyFuck.flappyFuck.jump();
		}
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	
		}
	

	
}
