public class Project {
	public static final int myNum = 10;
	private int page;
	private String title;

	public static void main (String [] args){
		Book b1 = new Book("Physics", 205);
		Book b2 = new Book("Chemistry", 405);

		System.out.println("book1 page number is: " + b1.getPageNumber());
		System.out.println("book2 page number is: " + b2.getPageNumber());
		System.out.println("static is: "+Book.myNum);
	}

	public Book(String title, int page) {
		this.title = title;
		this.page = page;
	}

	public int getPageNumber() {
		return page;
	}

}
