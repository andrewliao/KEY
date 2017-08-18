public class InfiniteLoop1{
	public static void main(String[] args) {

		//increments i forever
		for(int i = 1; i >= 1; i = i * 5){
			System.out.println("i = " + i);
		}
	}
}