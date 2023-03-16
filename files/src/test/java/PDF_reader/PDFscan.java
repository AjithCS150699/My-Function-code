package PDF_reader;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFscan {

	
    public void filereader(String word) throws IOException {
//    	PropertiesReader.getpropertyvalue(null)
	PDDocument document = PDDocument.load(new File(PropertiesReader.getpropertyvalue("PDFLocation")));
    PDFTextStripper stripper = new PDFTextStripper();
    int numPages = document.getNumberOfPages();
    String searchWord = word;
    for (int i = 1; i <= numPages; i++) {
        stripper.setStartPage(i);
        stripper.setEndPage(i);
        String text = stripper.getText(document);
        int count = countOccurrences(text, word);
        int count1 = 0;
        int index = 0;
        while ((index = text.indexOf(word, index)) != -1) {
            count1++;
            index += word.length();
        }
        if (text.contains(searchWord)) {
            System.out.println("Page " + i + ": Found " + searchWord +":Count="+count1);
        } else {
            System.out.println("Page " + i + ": Not found " + searchWord+":Count="+count1);
        }
    }
    document.close();
}

	private int countOccurrences(String text, String word) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	
	

