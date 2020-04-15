package flappyFuck;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

 public class EngineGame  extends FlappyFuck{
		
		public void addColumn(boolean start) {
			
			int space = 250;
			int width = 45;
			int height = 50 + rand.nextInt(100);
			
			if(start) {
			
			columns.add(new Rectangle(WIDTH +width*2 + columns.size() * 150, HEIGHT - height - 20 , width, height));
			columns.add(new Rectangle(WIDTH +width*2 + (columns.size()-1) * 50 ,0 , width , HEIGHT- height - space));
			
			}else {
				columns.add(new Rectangle(columns.get(columns.size() -1 ).x + 500, HEIGHT - height - 20 , width, height));
				columns.add(new Rectangle(columns.get(columns.size() -1 ).x ,0 , width , HEIGHT- height - space));
				
				
			}
			
		}
		
		
		
		
		// adicionando velocidade das colunas verificacao e colisao
		
		public void engine (ActionEvent e) {
		
		int speed = 5;
		
		ticks ++;
		
		if(started) {
		
		// velocidade e aproximação das colunas frente ao player
		for (int i = 0 ; i < columns.size(); i++) {
			
			Rectangle column = columns.get(i);
			column.x -= speed;
			
		}
		
		if(ticks % 2 == 0 && yMotion < 15) {
			
			yMotion += 2;
		
		}
		
		// verifica se o tamanho da coluna é menor que zero se sim remove todas
		for (int i = 0 ; i < columns.size(); i++) {
				
			//verifica
				Rectangle column = columns.get(i);
				
				if(column.x + column.width < 0) {
					
					columns.remove(column);
				
					if(column.y == 0) {	
					
						addColumn(false);
				}		
			}	
		}
	
		bird.y += yMotion;
		
		for(Rectangle column : columns) {
			
			if(column.y== 0 && bird.x + bird.width / 2 > column.x + column.width / 2 - 5 
					&& bird.x + bird.width / 2 < column.x + column.width / 2 + 10)
			{
				 score ++;
			}
			if(column.intersects(bird)) {
				gameOver = true;
	
				if(bird.x <= column.x) {
		// se game over for verdadeiro passaro = colisao 
				bird.x = column.x - bird.width;
			
			}
				else {
					if(column.y != 0) {
						bird.y = column.y - bird.height;
					}
					else if(bird.y < column.height) {
						bird.y = column.height;
					}
				}
		}
	}
		
		// verificação de colisao com as colunas
		if(bird.y > HEIGHT - 120 || bird.y < 0) {
			
			gameOver = true;
		}
		
		if(bird.y + yMotion >= HEIGHT - 120) {
			
			bird.y = HEIGHT - 120 - bird.height;
		}
	}	
		renderer.repaint();	
	
}
		}
