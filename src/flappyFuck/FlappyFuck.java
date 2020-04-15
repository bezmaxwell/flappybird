package flappyFuck;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Timer;

import javajframe.JavaJFrame;

public class FlappyFuck  extends JavaJFrame  {

		public static FlappyFuck flappyFuck;
		
		public  Renderer renderer;
		
		public Rectangle bird;
		
		public int ticks, yMotion, score;

		public ArrayList<Rectangle> columns;
		
		public boolean gameOver,started;
		
		public Random rand;
		
		
		
	
		public FlappyFuck() {
			
			JavaJFrame javajframe = new JavaJFrame();
			Timer timer = new Timer(20, this);
			renderer = new Renderer();
			rand = new Random();
			javajframe.executaJFrame();
			
			
			
		

			bird = new Rectangle( WIDTH/2 -10 ,HEIGHT/2 - 10 , 20, 20);
			
			columns = new ArrayList<Rectangle>();
				
				addColumn(true);
				addColumn(true);
				addColumn(true);
				addColumn(true);
			
			timer.start();
		}
		
		
		// adiciona colunas para o jogo
	  // colocar aqui o enginegame
		public void addColumn(boolean start) {
		
		  EngineGame engine = new EngineGame();
		  engine.addColumn(start);
		}
		
			
		
		// pintura das colunas 
		public void paintColumn(Graphics g, Rectangle column) {
			g.setColor(Color.green.darker());
			g.fillRect(column.x , column.y , column.width, column.height);
		}
		
		public void jump() {
			Player player = new Player();
			player.jumpPlayer();
		}
		
		@Override
		
		public void actionPerformed(ActionEvent e) {
			EngineGame engine = new EngineGame();
			engine.engine(e);
		}
		
		// uso de cores no jogo tanto no fundo como no personagem
		
		public void repaint(Graphics g) {
			ColumnsColor color = new ColumnsColor();
			color.repaint(g);
		
		}
	}
	
	
		


