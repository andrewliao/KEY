public class GFEHClient {
	public static void main(String[] args) {
		G[] elements = {new G(), new F(), new E(), new H()};
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
			elements[i].method1();
			elemetns[i].method2();
			System.out.println();
		}
	}
}