package com.ernesto.rain.graphics;

public class Screen {

	private int width,height;
	public int[] pixels;
	
	public Screen(int width,int height){
		this.width = width;
		this.height = height;
		pixels = new int[width*height]; // Create one integer for each pixel in our screen
	}
	
	public void render(){
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				//pixels[x+y*width] = 0xff00ff;
				
				// 'T'
				pixels[20 + 30 * width] = 0xff00ff;
				pixels[21 + 30 * width] = 0xff00ff;
				pixels[22 + 30 * width] = 0xff00ff;
				pixels[23 + 30 * width] = 0xff00ff;
				pixels[24 + 30 * width] = 0xff00ff;
				
				pixels[22 + 31 * width] = 0xff00ff;
				pixels[22 + 32 * width] = 0xff00ff;
				pixels[22 + 33 * width] = 0xff00ff;
				pixels[22 + 34 * width] = 0xff00ff;
				// 'End T'
				
				// 'E'
				pixels[27 + 30 * width] = 0xff00ff;
				pixels[28 + 30 * width] = 0xff00ff;
				pixels[29 + 30 * width] = 0xff00ff;
				pixels[30 + 30 * width] = 0xff00ff;
				pixels[31 + 30 * width] = 0xff00ff;
				
				pixels[27 + 32 * width] = 0xff00ff;
				pixels[28 + 32 * width] = 0xff00ff;
				pixels[29 + 32 * width] = 0xff00ff;
				pixels[30 + 32 * width] = 0xff00ff;
				pixels[31 + 32 * width] = 0xff00ff;
				
				pixels[27 + 34 * width] = 0xff00ff;
				pixels[28 + 34 * width] = 0xff00ff;
				pixels[29 + 34 * width] = 0xff00ff;
				pixels[30 + 34 * width] = 0xff00ff;
				pixels[31 + 34 * width] = 0xff00ff;
				
				pixels[27 + 31 * width] = 0xff00ff;
				pixels[27 + 32 * width] = 0xff00ff;
				pixels[27 + 33 * width] = 0xff00ff;
				pixels[27 + 34 * width] = 0xff00ff;
				// 'End E'
				
				// 'A'
				pixels[36 + 30 * width] = 0xff00ff;
				pixels[36 + 31 * width] = 0xff00ff;
				pixels[36 + 32 * width] = 0xff00ff;
				pixels[36 + 33 * width] = 0xff00ff;
				pixels[36 + 34 * width] = 0xff00ff;
				
				pixels[37 + 30 * width] = 0xff00ff;
				pixels[38 + 30 * width] = 0xff00ff;
				pixels[39 + 30 * width] = 0xff00ff;
				
				pixels[40 + 30 * width] = 0xff00ff;
				pixels[40 + 31 * width] = 0xff00ff;
				pixels[40 + 32 * width] = 0xff00ff;
				pixels[40 + 33 * width] = 0xff00ff;
				pixels[40 + 34 * width] = 0xff00ff;
				
				pixels[38 + 33 * width] = 0xff00ff;
				pixels[37 + 33 * width] = 0xff00ff;
				pixels[39 + 33 * width] = 0xff00ff;
				// End 'A'
				
				// 'M'
				pixels[43 + 30 * width] = 0xff00ff;
				pixels[43 + 31 * width] = 0xff00ff;
				pixels[43 + 32 * width] = 0xff00ff;
				pixels[43 + 33 * width] = 0xff00ff;
				pixels[43 + 34 * width] = 0xff00ff;
				
				pixels[44 + 30 * width] = 0xff00ff;
				pixels[45 + 30 * width] = 0xff00ff;
				pixels[46 + 30 * width] = 0xff00ff;
				
				pixels[45 + 30 * width] = 0xff00ff;
				pixels[45 + 31 * width] = 0xff00ff;
				pixels[45 + 32 * width] = 0xff00ff;
				pixels[45 + 33 * width] = 0xff00ff;
				pixels[45 + 34 * width] = 0xff00ff;
		
				pixels[47 + 30 * width] = 0xff00ff;
				pixels[47 + 31 * width] = 0xff00ff;
				pixels[47 + 32 * width] = 0xff00ff;
				pixels[47 + 33 * width] = 0xff00ff;
				pixels[47 + 34 * width] = 0xff00ff;
				// End 'M'
				
				// 'O'
				pixels[50 + 30 * width] = 0xff00ff;
				pixels[50 + 31 * width] = 0xff00ff;
				pixels[50 + 32 * width] = 0xff00ff;
				pixels[50 + 33 * width] = 0xff00ff;
				pixels[50 + 34 * width] = 0xff00ff;
				
				pixels[51 + 30 * width] = 0xff00ff;
				pixels[52 + 30 * width] = 0xff00ff;
				pixels[53 + 30 * width] = 0xff00ff;
				
				pixels[51 + 34 * width] = 0xff00ff;
				pixels[52 + 34 * width] = 0xff00ff;
				pixels[53 + 34 * width] = 0xff00ff;
				
				pixels[54 + 30 * width] = 0xff00ff;
				pixels[54 + 31 * width] = 0xff00ff;
				pixels[54 + 32 * width] = 0xff00ff;
				pixels[54 + 33 * width] = 0xff00ff;
				pixels[54 + 34 * width] = 0xff00ff;
				// End 'O'
			}
		}
	}
}
