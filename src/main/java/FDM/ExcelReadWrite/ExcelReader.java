package FDM.ExcelReadWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;






public class ExcelReader {
	
	//"/Users/brian.luna/Desktop/Book1.xlsx";
	 private final String FILE_PATH;
	 
	 public ExcelReader(String filePath){
		 this.FILE_PATH = filePath;
	 }

	    public List<Student> getStudentListAndScoresFromSheet() {
	        List<Student> studentList = new ArrayList<Student>();
	        FileInputStream fileInputStream = null;
	        try {
	            fileInputStream = new FileInputStream(FILE_PATH);
	 
	         
	            Workbook workbook = new XSSFWorkbook(fileInputStream);
	 
	            int numberOfSheets = workbook.getNumberOfSheets();
	 
	           
	            for (int i = 0; i < numberOfSheets; i++) {
	                Sheet sheet = workbook.getSheetAt(i);
	                Iterator<Row> rowIterator = sheet.iterator();
	 
	                
	                while (rowIterator.hasNext()) {
	 
	                    Student student = new Student();
	                    Row row = rowIterator.next();
	                    Iterator<Cell> cellIterator = row.cellIterator();
	 
	                    
	                    while (cellIterator.hasNext()) {
	 
	                        Cell cell = (Cell) cellIterator.next();
	                        
	                        if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
	                            student.setName(cell.getStringCellValue());
	 
	                      
	                        } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
	 
	                            
	                            if (cell.getColumnIndex() == 1) {
	                                student.setMaths(String.valueOf(cell.getNumericCellValue()));
	                            }
	                            
	                            else if (cell.getColumnIndex() == 2) {
	                                student.setScience(String.valueOf(cell.getNumericCellValue()));
	                            }
	                            
	                            else if (cell.getColumnIndex() == 3) {
	                                student.setEnglish(String.valueOf(cell.getNumericCellValue()));
	                            }
	                        }
	                    }
	                   
	                    studentList.add(student);
	                }
	            }
	 
	            fileInputStream.close();
	 
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return studentList;
	    }
	 
	 
	    
	    
}
