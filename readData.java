
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;




public class readData{


	
	
	final List<Attribut> attribut = new ArrayList<Attribut>();

	public readData() {
		
		Path pathToFile = Paths.get("file/Training_data.txt");
		// create an instance of BufferedReader // using try with resource, Java 7 feature to close resources 
		try 
		(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
			// read the first line from the text file
			String line = br.readLine();
			// loop until all lines are read
			while (line != null) {
// use string.split to load a string array with the values from
				// each line of
				//the file, using a comma as the delimiter
				String [] attributes = line.split(",");
				
	
				
				
				Attribut att = createAttribut(attributes); 
				// adding book into
			   attribut.add(att);
				// read next line before looping
				// if end of file reached, line would be null
				line = br.readLine();
				}
			
			

			
			} 
		catch (IOException ioe) {
			ioe.printStackTrace();
			}

	} 
	
	
	private static Attribut createAttribut(String[] attributes) {
		Attribut tt=new Attribut();
		tt.setAge(Double.parseDouble(attributes[0]));
		tt.setSex(Double.parseDouble(attributes[1]));
		tt.setCp(Double.parseDouble(attributes[2]));
		tt.setTrestbps(Double.parseDouble(attributes[3]));
		tt.setChol(Double.parseDouble(attributes[4]));
		tt.setFbs(Double.parseDouble(attributes[5]));
		tt.setRestecg(Double.parseDouble(attributes[6]));
		tt.setThalach(Double.parseDouble(attributes[7]));
		tt.setExang(Double.parseDouble(attributes[8]));
		tt.setOldpeak(Double.parseDouble(attributes[9]));
		tt.setSlope(Double.parseDouble(attributes[10]));
		tt.setCa(Double.parseDouble(attributes[11]));
		tt.setThal(Double.parseDouble(attributes[12]));
		tt.setNum(Integer.parseInt(attributes[13]));
		
		return tt;
		
		
		} 
	
	public void  GetnumDataUsed(ArrayList p ){
		int m =0;
		for(int i=0;i<=p.size();i++){
			m++;
		}
		System.out.println("Data Used In this Predict : "+m);
		
	}


	public List<Attribut> getAttribut() {
		return attribut;
	}
		
	

	
}
