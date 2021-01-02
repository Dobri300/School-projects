package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

import edu.school.FileSystem.FileSystemObject;

public class FileSystemObjectView extends JComponent {
	private FileSystemObject fsObject;
	private int y;
	private int x;
	
	public FileSystemObjectView(Rectangle dimensions, FileSystemObject fsObject )
	{
		this.fsObject = fsObject;
		this.setBounds(dimensions);
	}
	
	
	public void SetX(int x) {
		
		this.x = x;
	}
	
	public void SetY(int y) {
		
		this.y = y;
	}
	public void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		Graphics2D g = (Graphics2D)graphics;
		g.setColor(Color.BLACK);
		g.drawRect(x,y, this.getWidth() - 10, this.getHeight() - 10);
		g.drawString(fsObject.getName()+fsObject.getSize(), x, y+30);
		
	}
	
	
}
