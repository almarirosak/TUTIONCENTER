import java.util.*;

public class Student {
	static int count; 
	Scanner in = new Scanner(System.in);
	public Student(){
        count++;
        
    }
    public Student(String kp,String address,String schoolname){
        
    }
    // data/attributes
    Name name;
    
    private String kp;
    private String address;
    private String schoolname;
    
    private float marks[] = new float[5];
    
    // methods or operations
    public float calcAvg(){
    	int total = 0;float average;
    	
    	for(int i =0;i<5;i++) {
    		total+=marks[i];
    		
    	}
        average = total/5;
		return average;
    }
    
    public float calcMin() {
    	float lowest=999999;
    	for(int i =0;i<5;i++) {
    		if (marks[i]<lowest) {
    			lowest = marks[i];
    			
    		}
    	}
    	
        return lowest;
        
    }
    public float calcMax() {
    	float highest=-999999;
    	for(int i =0;i<5;i++) {
    		if (marks[i]>highest) {
    			highest = marks[i];
    			
    		}
    	}
    	
        return highest;
        
    }

    public void setName(Name thename) {
        name = thename;
    }    
    
    public void setMark(float mark, int i) throws Exception {
    	/*if(mark < 0) {//non OO error checking
    		return;
    		
    	}*/
    	//OO way of error checking
    	if(mark <0 || mark>100) {
    		throw new Exception("Error in mark detected");
    		
    	}else if (i >4) {
    		throw new Exception("Error in index detected");
    	}
        marks[i] = mark;        
    }
    
    public void displayMarks() {
    	for(int i =0;i<marks.length;i++) {
        	System.out.println(marks[i]);

    	}
    	
    }
    
}
