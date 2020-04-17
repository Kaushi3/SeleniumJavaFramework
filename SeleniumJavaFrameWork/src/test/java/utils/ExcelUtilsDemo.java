package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		String projectpath=System.getProperty("user.dir");
		ExcelUtils excel= new ExcelUtils(projectpath+"/Excel/data.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getColumnCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		
	}
}
