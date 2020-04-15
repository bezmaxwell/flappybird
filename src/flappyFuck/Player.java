package flappyFuck;

import java.awt.Rectangle;

public class Player extends FlappyFuck {
	
	
	public void jumpPlayer() {
		
		if(gameOver) {
			
			bird = new Rectangle( WIDTH/4 -10 ,HEIGHT/4 - 10 , 20, 20);
			columns.clear();
			yMotion = 0;
			score = 0;
			
			addColumn(true);
			addColumn(true);
			addColumn(true);
			addColumn(true);
			
			gameOver = false;
		}
		
		if(!started) {
			
			started = true;
		
		}else if(!gameOver) {
			
			if(yMotion > 0) {
				yMotion = 0;
			}
				yMotion -= 10;
		}
	}
	
}
