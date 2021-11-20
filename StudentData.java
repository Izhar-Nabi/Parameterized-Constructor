class StudentData{
	
	public static void main(String args[]){
	Student Entry = new Student("John","20CX");
	Student Entry2= new Student("John2","20M X");
	System.out.println("Name = "+Entry.Name);
	System.out.println("Roll NO: "+Entry.Roll);
	}
}
	class Student{
	Student(String N, String R){
	Name = N;
	Roll = R;
	System.out.println("Student Data Form");}
	String Name;
	String Roll; 
	}