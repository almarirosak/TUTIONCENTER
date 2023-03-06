
public class Name {
	 private String fname;
	    private String lname;
	    private String mname;
	    public Name(){
	        
	    }
	    public String getFname(){
	        return fname;
	    }
	    public Name(String fname,String mname, String lname){
	        this.fname = fname;
	        this.mname = mname;
	        this.lname = lname;
	        
	    }
	    public void setFname(String name1){
	        fname = name1;

	    }
	    public void setMname(String name2){
	        mname = name2;

	    }
	    public void setLname(String name3){
	        lname = name3;

	    }
	    
}
