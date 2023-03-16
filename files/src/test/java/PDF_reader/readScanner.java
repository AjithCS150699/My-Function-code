package PDF_reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class readScanner {

	
	

	public void readInputFromConsole() throws IOException {
		PDFscan ss=new PDFscan();
		ArrayList<String> list = new ArrayList<>();
		 list.add("freezer");
		 list.add("considered");
		 list.add("saturate");
		 list.add("influenced");
		 list.add("write");
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the value:");
		 String userinput=scanner.next();
		 if(list.contains(userinput)) {
			 ss.filereader(userinput);
		 }else {
			 System.out.println("The specified Systax is not a key");
		 }
	}
	
}
