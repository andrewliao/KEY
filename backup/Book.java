public class Book {
	public static final int num = 15;
	public static void line1(){
		for (int i = 1; i <= (num+1); i++){
			System.out.print(" ");
		}
		System.out.print('+');
		for (int j = 1; j <= (num * 3); j++){
			System.out.print('-');
		}
		System.out.print("+\n");
	}
	public static void section2(){
		for (int i = 1; i <= num; i++){
			for (int j = num; j >= i; j--){
				System.out.print(" ");
			}
			System.out.print('/');
			for (int k = (3 * num); k >=(3 * i);k--){
				System.out.print(" ");
			}
			for (int g = 1; g <= i; g++){
			System.out.print("__/");
			}
			for (int f = 1; f < i; f++){
			System.out.print('/');
			}

			System.out.println();
		}
	}
	public static void line2(){
		System.out.print('+');
		for (int i = 1; i <= (num * 3); i++){
			System.out.print('-');
		}
		System.out.print('+');
		for (int j = 1; j <= num; j++){
			System.out.print('/');
		}
		System.out.println();
	}
	public static void box(){
		for (int i = 1; i<= (num / 2); i++){
			System.out.print('|');
			for (int j = 1; j <= (((3 * num)- 22)/2); j++){
				System.out.print(" ");
			}	
			System.out.print("Building Java Programs");
			for (int k = 1; k <= (((3 * num)-22)/2); k++){
				System.out.print(" ");
			}
			System.out.print('|');
			for (int g = 1; g <= (num - (2*(i - 1))); g++){
				System.out.print('/');

			}
			System.out.println();
		}

	}
	public static void line3(){
		System.out.print('+');
		for (int i = 1; i <= (num * 3); i++){
			System.out.print('-');
		}
		System.out.print('+');
		System.out.println();
	}
	public static void statement(){
		System.out.print("Now only ");
		System.out.print("$"+ (9 * num)+ "!");
	}
	public static void main(String[] args){
		line1();
		section2();
		line2();
		box();
		line3();
		statement();
	}
}