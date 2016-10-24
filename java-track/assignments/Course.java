
import java.util.ArrayList;
import java.util.Arrays;

import exercises2.Computer;
public class Course{

	private String name;
	private int credits;
	private int remainingSeats;
	private ArrayList<Student> roster;
	
	public Course(String name, int credits, int remainingSeats){
		this.name = name;
		this.credits = credits;
		this.remainingSeats = remainingSeats;
		this.roster = new ArrayList<Student>();
		
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getCredits(){
		return credits;
	}
	public void setCredits(int credits){
		this.credits = credits;
	}
	public int getRemainingSeats(){
		return remainingSeats;
	}
	public void setRemainingSeats(int remainingSeats){
		this.remainingSeats = remainingSeats;
	}
	public ArrayList<Student> roster(){
		return roster;
	}
	public void roster(ArrayList<Student> roster){
		this.roster = roster;
	}

	public String toString(){
		return this.name + " " + this.credits + " " + this.remainingSeats;
	}
	public boolean addStudent(Student a){

		
		if(this.remainingSeats > 0 && !this.roster.contains(a.getName())){
			roster.add(a);
			this.remainingSeats--;
			return true;
		}
		return false;
	}
	public String generateRoster(){
		String s = "";
		for(int i = 0; i < roster.size(); i++){
			s += roster.get(i).getName() + " ";
		}
		return s;
	}//add string evertime iterates through array
	
	public double averageGPA(){
		double sum = 0.0;
		for(int i = 0; i < roster.size(); i++){
			sum += roster.get(i).getGPA();
		}
		return sum/roster.size();
		
	}
//	public static void main(String[] args){
//		Course c = new Course("math", 3, 4);
//		Student s1 = new Student("hello", 10, 9, 4.0);
//		Student s2 = new Student("kil", 10, 9, 4.0);
//		c.addStudent(s1);
//		c.addStudent(s2);
//		System.out.println(c.generateRoster());
//		
//
//	}

}
