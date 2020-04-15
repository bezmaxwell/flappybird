package flappyFuck;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class ColumnsColor extends FlappyFuck {
	
	public void repaint(Graphics g) {
		
		// repintando o cenário
					// background color  
					g.setColor(Color.cyan);
					g.fillRect(0, 0, WIDTH, HEIGHT);
					
					
					//down background
					g.setColor(Color.orange);
					g.fillRect(0, HEIGHT - 120, WIDTH, 120);
					
					// up background
					g.setColor(Color.green);
					g.fillRect(0, HEIGHT - 120 , WIDTH, 20);
					
					// bird color
					g.setColor(Color.RED);
					g.fillRect(bird.x, bird.y, bird.width, bird.height);
				
				
					for (Rectangle column : columns) {
						paintColumn(g, column);
					}
				
					g.setColor(Color.white);
					g.setFont(new Font("Arial", 1 , 50));
				
					
					if(!started) {
						
						g.drawString("Click to Start...", 75, HEIGHT / 2 - 30);
						
					}
					
					if(gameOver) {
						g.drawString("Game Over !!!", 100, HEIGHT / 2 - 100);
						
					}
					
					if(!gameOver && started) {
						g.drawString(String.valueOf(score), WIDTH / 2 
								-25, 100);
					}
		}
	}
	
