package FDM.ExcelReadWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelReader doot = new ExcelReader("/Users/brian.luna/Desktop/Book1.xlsx");
		List<Student> ListOfCurrentStudents = doot.getStudentListAndScoresFromSheet();
		System.out.println(ListOfCurrentStudents);
		List<Student> NewListOfStudents= new ArrayList<Student>();
		
		
		
		NewListOfStudents.add(new Student("Tommy","1","2","3"));
		NewListOfStudents.add(new Student("Jeff","34","37","87"));
		NewListOfStudents.add(new Student("Tommy","87","23","34"));
		NewListOfStudents.add(new Student("Jimmy","86","25","67"));
		NewListOfStudents.add(new Student("Tommy","12","22","12"));
		NewListOfStudents.add(new Student("Tommy","12","2","86"));
		NewListOfStudents.add(new Student("Tommy","11","21","31"));
		
		ExcelWriter Meow = new ExcelWriter("/Users/brian.luna/Desktop/Book1.xlsx");
		Meow.writeChanges(NewListOfStudents);
	}

}
