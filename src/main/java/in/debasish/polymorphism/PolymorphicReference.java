package in.debasish.polymorphism;

class Animal{
	public void makeSound() {
		System.out.println("Animals makes sound");
	}
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("Woof!");
	}
}

class Cat extends Animal{
	public void makeSound() {
		 System.out.println("Meow!");
	}
}
public class PolymorphicReference {

	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.makeSound();
		Animal ani1=new Cat();
		ani1.makeSound();
		
		Animal[] animal2=new Animal[3];
		animal2[0] = new Animal();
		animal2[1] = new Dog();
		animal2[2] = new Cat();
		
		for(Animal an:animal2) {
			an.makeSound();
		}
	}
}
