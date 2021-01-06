import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class importarCSV {

	public static void main(String[] args) {
		
		File file = new File("teste.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);				
			}			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			sc.close();
		}
		
		
		
	}

}
