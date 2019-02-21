import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.LinkedList;

public class FileScanner {
	
	static File openExternalFile(String patchname) throws FileNotFoundException {
	if(patchname == null) throw new FileNotFoundException();
        File file = new File(patchname);
        return file;
	}
	
	static List<Integer> createArrayFromFile (File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<Integer> array = new LinkedList<>();
        int currentNumber;
        
        while (scanner.hasNextLine()) {
        	currentNumber = scanner.nextInt();
        	array.add(currentNumber);
        }
        scanner.close();
        
        return array;
	}
	
}