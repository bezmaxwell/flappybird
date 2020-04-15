package flappyBirdMusic;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MusicBackground extends JFrame{

	JButton button = new JButton("Reproduzindo som !");
	
	public void MusicBackground() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,200);	
		setLocation(0, 0);
		setVisible(true);

		add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				play("music");
				
			}
		});
		
	}
	
	public void play (String nomeDoAudio) {
		
		URL url = MusicBackground.class.getResource(nomeDoAudio +".wav");
		AudioClip audio = Applet.newAudioClip(url);
		audio.play();
	}
	
	public void stop(String nomeDoAudio) {
		
	}
	
	
	public static void main(String[]args) {
	     new MusicBackground();
		
	}
}
