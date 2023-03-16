package PDF_reader;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesReader extends Constands_properties {

	
	public static String getpropertyvalue(String Key) {
		FileReader reader;
		Properties props = null;
		try {
			reader= new FileReader(File_path_properties);
			System.out.println("Syso"+reader);
			props=new Properties();
			props.load(reader);
//			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		return props.getProperty(Key);
		
	}
	
}
