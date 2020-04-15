package javajframe;


import javax.swing.JFrame;
import flappyFuck.Renderer;

public class JavaJFrame extends ActionListeners  {

	public  Renderer renderer;
	public final int WIDTH = 700, HEIGHT = 700; 
	public static JavaJFrame javajframe;
		
		
		public void executaJFrame() {
			
	renderer = new Renderer();
	JFrame jframe = new JFrame();
	
	jframe.add(renderer);
	jframe.setTitle("FlappyFuck");
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.setSize( WIDTH , HEIGHT );
	jframe.addMouseListener(this);
	jframe.addKeyListener(this);
	jframe.setResizable(false);
	jframe.setLocationRelativeTo(null);
	jframe.setVisible(true);
	
	
	}
	
}
