package flappyFuck.colors_game;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Colors_game {
	
	public ArrayList<Color> list ;
	
	public Color Colors_game() {
	
	Random random = new Random();
	int colorA = random.nextInt(256);
	int colorB = random.nextInt(256);
	int colorC = random.nextInt(256);
	
	return new Color(colorA,colorB,colorC);
	
	}
	
	private String gerarCorHexadecimal(Color color) {
		String transfHex = '#'+ this.tratarHexString(Integer.toHexString(color.getRed()))+
			this.tratarHexString(Integer.toHexString(color.getGreen()))+
			this.tratarHexString(Integer.toHexString(color.getBlue())) ;
		
		return transfHex;
	}
	
	private String tratarHexString(String hexString) {
		
		String hex = null;
		if(hexString.length() == 1) {
			hex = '0'+hexString;
		}else {
			hex = hexString;
		}
		
		return hex;
	}
	
	
}