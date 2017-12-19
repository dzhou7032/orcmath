package davidPlayGround;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Animation extends AnimatedComponent {

	String Name;
	String Color;
	int Age;
	
	String imageLocation;
	
	public Animation(String name, String color, int age, String imageloc) {
		super(40, 40, 254, 253);
		this.Name = name;
		this.Color = color;
		this.Age = age;
		this.imageLocation = imageloc;
		
	//	addSequence("resources/spritesheet.jpg", 150, 0, 240, 254, 253, 4);
	//	Thread animation=new Thread(this);
	//	animation.start();
	//	update();
	}
	public static void main(String[] args){
		CharacterMaker create = new CharacterMaker();
		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to load a file?");
		if (in.nextLine().equals("Yes")) {
			
		}
		System.out.println("What is your name?");
	 	String namez = in.nextLine();
		System.out.println("What color are your eyes?");
		String colorz = in.nextLine();
		System.out.println("How old are you?");
		int agez = in.nextInt();
		String locationz = null;
		System.out.println("Where is your picture located?");
		while(locationz == null || locationz.equals("")) {
			locationz = in.nextLine();
		}
		Animation yup = new Animation(namez, colorz, agez, locationz);
		System.out.println(yup);
		in.close();
		try {
		FileWriter fw=new FileWriter("test.csv");
		System.out.println("run");
		 fw.write(yup.toString());    
		 fw.close();   
		}
		catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}

	@Override
	public void update(Graphics2D g) {
		//g.setColor(Color.red);
		//g.fillRect(0, 0, getWidth(), getHeight());
		super.update(g);
	}
	
	public String toString() {
		return Name+","+Color+","+Age+","+imageLocation;
	}
}