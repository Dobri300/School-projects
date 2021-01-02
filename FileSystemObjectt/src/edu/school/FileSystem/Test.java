package edu.school.FileSystem;

import java.awt.Rectangle;

import javax.swing.JFrame;

import View.FileSystemObjectView;

public class Test {

	public static void main(String[] args) {
		File file1 = new File("Parks.txt", 20);
		File file2 = new File("Gardents.txt", 30);
		File file3 = new File("Reservations.txt", 60);
		FileSystemObject[] files = {file1, file2, file3};
		Folder folder = new Folder("Green files", files);
		
		
		int folderSize = folder.getSize();
		System.out.println(folderSize);
		
		File file4 = new File("Forests.txt", 40);
		folder.add(file4);
		
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		Rectangle r_1 = new Rectangle(180, 0, 85, 85);
		FileSystemObjectView object_1 = new FileSystemObjectView(r_1, folder);
		object_1.SetX(5);
		object_1.SetY(5);
		frame.add(object_1);
		
		Rectangle r_2 = new Rectangle(0, 100, 85, 85);
		FileSystemObjectView object_2 = new FileSystemObjectView(r_2, file1);
		object_2.SetX(5);
		object_2.SetY(5);
		frame.add(object_2);
		
		
		Rectangle r_3 = new Rectangle(100, 100, 85, 85);
		FileSystemObjectView object_3 = new FileSystemObjectView(r_3, file2);
		object_3.SetX(5);
		object_3.SetY(5);
		frame.add(object_3);
		
		Rectangle r_4 = new Rectangle(200, 100, 85, 85);
		FileSystemObjectView object_4 = new FileSystemObjectView(r_4, file3);
		object_4.SetX(5);
		object_4.SetY(5);
		frame.add(object_4);
		
		Rectangle r_5 = new Rectangle(300, 100, 85, 85);
		FileSystemObjectView object_5 = new FileSystemObjectView(r_5, file4);
		object_5.SetX(5);
		object_5.SetY(5);
		frame.add(object_5);
		
		
		
		
	}

}
