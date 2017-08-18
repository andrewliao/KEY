public class InfiniteLoop2{

	public static void main(String[] args) {

		writeStars(16780);
	}

	//writes *s forever -> stack overflow error
	public static void writeStars(int n){
		if (n == 0) {
			System.out.println();
		} else {
			System.out.print("*");
			writeStars(n-1);
		}
	}
}