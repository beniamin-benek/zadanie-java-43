import java.util.List;
import java.util.TreeSet;

class NumbersCounter {
	
	static int[] countNumbers(List<Integer> array) {
		if(array == null || array.size() == 0) throw new NullPointerException();
		
        int[] counter = new int[getTheBiggest(array) + 1];

        for (int i = 0; i < array.size(); i++)
            counter[array.get(i)]++; //każde pole tablicy mówi o liczbie wystąpień danej liczby z listy
 
        return counter;
	}
	
	static void printInfo(List<Integer> array) {
		int[] counter = countNumbers(array);
		
		System.out.println("Ciąg wczytany z pliku: " + array);
        System.out.println("Unikalne wartości: " + createTreeSetFromArray(array)); //dodatkowa informacja
        
        for (int i = 0; i < counter.length; i++) {
        	if(counter[i] != 0)
        		System.out.println(i + " - liczba wystąpień: " + counter[i]);
        }
	}

	private static int getTheBiggest(List<Integer> array) {
		int max = array.get(0);
		for(int i = 0; i < array.size(); i++) {
			if (array.get(i) > max)
				max = array.get(i);
		}
		return max;
	}
	
	private static TreeSet<Integer> createTreeSetFromArray(List<Integer> array) {
        TreeSet<Integer> uniqeArray = new TreeSet<>(array); //kopiuje wartości z podanej listy do nowego zbioru, co niweluje powtórzenia
        return uniqeArray;
	}
	
}