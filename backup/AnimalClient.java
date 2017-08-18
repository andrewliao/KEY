public class AnimalClient {

	public static void main(String[] args) {
		Animal[] x = new Animal[2];
		x[0] = new Cat();
		x[1] = new Dog();

		Cat c = new Cat();
		c.makeSound();

		Dog d = new Dog();
		d.makeSound();
	}
}