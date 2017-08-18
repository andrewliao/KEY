import java.util.*;

public class People{
	public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	ArrayList<Person> list= new ArrayList <Person>();
	input(console,list);
	printOut(list);
    	printOut2(list);
	}
	public static void input(Scanner console, ArrayList<Person> list){
		while(console.hasNext()){
			String name= console.next();
			if(name.equals("stop")){
				break;
			}
			int age= console.nextInt();
			double weight= console.nextDouble();
			list.add(nimabi);
		}
	}	
	public static void printOut(ArrayList<Person> list){
        System.out.println("Original list: ");
		System.out.print("[");
		for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
            if(i != list.size() - 1){
                System.out.print(", ");
            }
        }
		System.out.println("]");
        System.out.println("");
	}
    public static void printOut2(ArrayList<Person> list){
	   System.out.println("Sorted list: ");
       Collections.sort(list);
        System.out.print("[");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
            if(i != list.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }
}
