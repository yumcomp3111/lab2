import lab2.ex2.*;//* is all stuff inside
import lab2.exl.Book; 
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
	public static void main(String arg[]) {
		final String array[] = {"Basic Java", "Advance Java", "Forget about Java"};
		Book b = new Book(array);
		System.out.println("The title of chapter 1 is " + b.getChapter(1));
		String anotherArray[] = b.getChapters();
		
		System.out.println("There are " + anotherArray.length + " chapters.");
		System.out.println(java.util.Arrays.toString(anotherArray));
		
		
		Computer a = new MobileComputer();
		for (int i = 0; i < 10; i++)
			a.work();
		
		
		Charger c = new Charger();
		Phone p = new Phone();
		MobileComputer m = new MobileComputer();
		
		c.charge(p);
		c.charge(m); // fix this in MobileComputer.
		
		
	}
	
    public boolean someLibraryMethod() {
        return true;
    }
}
