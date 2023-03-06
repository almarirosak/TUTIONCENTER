
public class TutionCenter {
	private String headmaster;
	private String physicalAdd;
	
	
	public TutionCenter() {
		
	}
	public TutionCenter(String headmaster,String physicalAdd) {
		this.headmaster= headmaster;
		this.physicalAdd = physicalAdd;
		
	}
	
	public void getnumberstud() {
		System.out.println("Total Number of Students in this branch is: " + Student.count);
		
		
	}
	public void getnumberTutor() {
		System.out.println("Total Number of Tutors in this branch is: " + Teacher.count);
	}
}
