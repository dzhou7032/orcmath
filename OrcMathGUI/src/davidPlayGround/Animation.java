package davidPlayGround;

import java.awt.Color;
import java.awt.Graphics2D;

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
	public static void main(String[] args) {
		CharacterMaker create = new CharacterMaker();
		System.out.println(create.getCSVContent());
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
