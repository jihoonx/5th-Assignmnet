
public class MainClass {
	public static void main(String args[]){
		Animal animal = new Animal();
		Bird bird = new Bird();
		System.out.println();
		Dog dog = new Dog();
		
		System.out.println();
		
		animal.sleep();
		animal.eat();
		
		bird.sleep();
		bird.eat();
		
		Animal a1=new Dog();
		Animal a2=new Bird();
		
		a1.eat();
		a2.sleep();
		
	}

}
