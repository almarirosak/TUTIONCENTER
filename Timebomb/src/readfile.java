import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class readfile {
	public static void main(String args[]) throws FileNotFoundException {
		
		File file = new File("C:/Users/Michael/Documents/textextex.txt");
		Scanner scan = new Scanner(file);
		System.out.println(scan.nextLine());
	}
}
