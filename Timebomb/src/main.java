import java.util.*;
public class main {
	public static void main(String[] args) throws Exception {
		
	Scanner in = new Scanner(System.in);
	//making 1 student object
	Student mic= new Student();
	//making 1 tutor 
	Teacher james = new Teacher();
	
	TutionCenter jb = new TutionCenter();
	
	float mark = 0;
	
	
   	for(int j = 0;j<5;j++) {
    	System.out.println("Please enter marks: ");
    	mark = in.nextFloat();
    	mic.setMark(mark, j);
   		}
   	
   		mic.displayMarks();
   		System.out.println("The average is: "+ mic.calcAvg());
   		System.out.println("The lowest mark is: "+ mic.calcMin());
   		System.out.println("The highest is: "+ mic.calcMax());
   		
   		jb.getnumberstud();
   		jb.getnumberTutor();
   		
   		
	}
}
