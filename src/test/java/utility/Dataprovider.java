package utility;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.DataProvider;

public class Dataprovider
{
	
	@DataProvider(name = "dataprovider")
	public String [][] real() throws BiffException, IOException
	{
		File f = new File(".//excel/input.xlsx");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		int row = s.getRows();
		int col = s.getColumns();
		
		String [][] input = new String [row][col];
		
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				Cell c = s.getCell(j, i);
				input[i][j] = c.getContents();
				System.out.println(input[i][j]);
			}
		}
		
		return input;
		
	}
}
