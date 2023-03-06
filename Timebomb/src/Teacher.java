import java.util.*;
public class Teacher {
	 static int count; 
	Scanner in = new Scanner(System.in);
    public Teacher() {
    	count++;
    	
    }
    public Teacher(String ic, String address, int numyearexp, String qualification) {
    	
    }
    // data
    Name name;
    String ic;
    String address;
    int numyearexp;
    String qualification;
    
    // op
    public void setName(Name thename) {
        name = thename;
    } 
    public void setbg(String qualification) {
    	System.out.println("Please enter background of teacher: ");
    	qualification = in.nextLine();
    	
    	
    }
    public void dispbg(String qualification) {
    	System.out.println(qualification);
    	
    }
}