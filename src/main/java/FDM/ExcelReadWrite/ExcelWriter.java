package FDM.ExcelReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	// "/Users/brian.luna/Desktop/Book1.xlsx";
	private final String FILE_PATH;

	public ExcelWriter(String filePath) {
		this.FILE_PATH = filePath;
	}

	public void writeChanges(List<Student> studentList) throws IOException{
		  FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
			 
          Workbook workbook = new XSSFWorkbook(fileInputStream);
          Sheet workingSheet=  workbook.getSheet("sheet2");
          int rowIndex = 0;
          for(Student student : studentList){
              Row row = workingSheet.createRow(rowIndex++);
              int cellIndex = 0;
              row.createCell(cellIndex++).setCellValue(student.getName());
              row.createCell(cellIndex++).setCellValue(student.getMaths());
              row.createCell(cellIndex++).setCellValue(student.getScience());
              row.createCell(cellIndex++).setCellValue(student.getEnglish());
          }
          try {
              FileOutputStream fileOut = new FileOutputStream(FILE_PATH);
              workbook.write(fileOut);
              fileOut.close();
              System.out.println(FILE_PATH + " is successfully written");
          } catch (FileNotFoundException e) {
              e.printStackTrace();
          } catch (IOException e) {
              e.printStackTrace();
          }
          fileInputStream.close();
          
          
		 }
}
