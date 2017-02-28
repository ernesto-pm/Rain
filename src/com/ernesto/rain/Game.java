package com.ernesto.rain;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

import com.ernesto.rain.graphics.Screen;

public class Game extends Canvas implements Runnable{
	
	private static final long serialVersionUID = 1L;
	
	// Static means that for this class this value won't change
	public static int width = 300;
	public static int height = width / 16 * 9;
	public static int scale = 3;
	
	private Thread thread;
	private JFrame frame;
	private boolean running = false;
	
	private Screen screen;
	
	// Create the image that we are going to use
	private BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
	// Contact the image, get the array of pixels that make the image (raster) then get the data buffer that contains the data
	private int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();  // Create the array of pixels we are going to modify
	
	public Game(){
		Dimension size = new Dimension(width*scale,height*scale);
		setPreferredSize(size); 				//This method is in Canvas class
		screen = new Screen(width,height);
		frame = new JFrame();
	}
	
	public synchronized void start(){
		running =  true;
		thread = new Thread(this, "Display");
		thread.start();
	}
	
	public synchronized void stop(){
		running = false;
		try{
			thread.join(); 
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public void run(){
		while(running){
			update();  // Limited to 60 times per second
			render();  // Limited by computer's hardware
		}
	}
	
	public void update(){
		
	}
	
	public void render(){
		BufferStrategy bs = getBufferStrategy();
		if(bs == null){
			createBufferStrategy(3); // If getbufferstrategy is returning null, create it with triple buffering
			return;
		}
		
		Graphics g = bs.getDrawGraphics();  // Creates a link between Graphics and the BS
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, getWidth(), getHeight()); // Renders black square at 0,0 from top left
		
		g.dispose(); // Disposes the resources occupied by the graphics
		bs.show(); // Shows the buffer tha has been calculated
		
	}
	
	public static void main(String[] args){
		Game game = new Game();
		
		game.frame.setResizable(false);	 		// We don't want our window to be resized
		game.frame.setTitle("Rain Engine");
		game.frame.add(game);   				// Add a component to our frame
		game.frame.pack();						// Sizes up the frame to be the same as the component
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		game.frame.setLocationRelativeTo(null); // Center screen by passing null
		game.frame.setVisible(true);			// Shows window
		
		game.start();
	}
	
	

}
