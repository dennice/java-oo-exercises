

public class Student {

	//fields
	private String name;
	private int studentID;
	private int credits;
	private double GPA;
	
	public Student(String name, int studentID, int credits, double GPA){
		this.name = name;
		this.studentID = studentID;
		this.credits = credits;
		this.GPA = GPA;
	}
	
	public Student(String first_name, String last_name, int studentID){
		this.name = first_name + " " + last_name;
		this.studentID = studentID;
		this.credits = 0;
		this.GPA = 0;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getStudentID(){
		return studentID;
	}
	public void setStudentID(int studentID){
		this.studentID = studentID;
	}
	
	public int getCredits(){
		return credits;
	}
	public void setCredits(int credits){
		this.credits = credits;
	}
	
	public double getGPA(){
		//return this.GPA;
		return Math.round(this.GPA * 1000.0)/1000.0;
	}
	public void setGPA(double GPA){
		this.GPA = GPA;
	}
	public String toString(){
		return this.name + " " + this.studentID;
	}

	public String getClassStanding(){
		if(this.credits < 30){
			return "Freshman";
		}else if(this.credits >= 30 && this.credits < 60){
			return "Sophomore";
		}else if(this.credits >= 90){
			return "Senior";
		}else{
			return "Junior";
		}
	}
	
	public void submitGrade(double g, int c){
		double newQS = c * g;
		double prevQS = this.credits * this.GPA;
		this.GPA = (newQS + prevQS)/(c + this.credits);
		this.credits += c;	
	}
	
	public double computeTuition(){
		double semesters = this.credits/ 15;
		double creditsLeft = this.credits % 15;
		return semesters * 20000.0 + creditsLeft * 1333.33;
	}
	
	public Student createLegacy(Student a, Student b){
		String legName = a.getName() + " " + b.getName();
		int legStudentID = a.getStudentID() + b.getStudentID();
		double legGPA = (a.getGPA() + b.getGPA())/2.0;
		int legCredits = b.getCredits();
		if (a.getCredits() > b.getCredits()){
			legCredits = a.getCredits(); 
		}
		return new Student(legName, legStudentID, legCredits, legGPA );
	}
	

}
