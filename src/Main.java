import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> array = null;
						
		try {
			File file = FileScanner.openExternalFile("file.txt");
			array = FileScanner.createArrayFromFile(file);
			NumbersCounter.printInfo(array);
		} catch (FileNotFoundException e) {
			System.err.println("Plik nie istnieje.");	
		} catch (NoSuchElementException e) {
			System.err.println("Nieprawidłowa zawartość pliku.");
		} catch (NullPointerException e) {
			System.err.println("Podałeś nieistniejącą lub pustą listę.");
		} 
					
	}
	
}