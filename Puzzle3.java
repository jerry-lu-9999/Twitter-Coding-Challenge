import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Puzzle3 {

    /**
     * Given a text file, figure out the frequency of all of the words.
     * Take the first letter of the top four words to figure out the next puzzle piece.
     */

    // filename of the given file
    public static final String ARTICLE_FILE = "Puzzle3-article.txt";

    // FILL IN THE PROPER TYPES:
    // - Figure out the right KEY_TYPE and VALUE_TYPE
    // - Replace KEY_TYPE and VALUE_TYPE with the proper data type in the code
    public static final Map<KEY_TYPE, VALUE_TYPE> WORDS = new HashMap<>();
    
    public static void printFourMostFrequentWords(String fileName) {
        String line = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
		// IMPLEMENT CODE HERE
            }   

	    printTopFour(sortMapByValue(WORDS));

        } catch(Exception ex) {
            System.out.println("An exception was thrown here while processing" + fileName + "\n" + ex.getMessage());
	    ex.printStackTrace();
        } finally{
            try{
                bufferedReader.close();
            } catch(IOException ex){
                System.out.println("An exception was thrown here while closing the BufferedReader" + fileName + "\n" + ex.getMessage());
		ex.printStackTrace();
            }    
        }
    }

    private static void printTopFour(Map<KEY_TYPE, VALUE_TYPE> words) {
	// IMPLEMENT CODE HERE
    }

    // Helper method to sort a Map by the value stored
    // REMEMBER: Replace KEY_TYPE and VALUE_TYPE with the proper data types
    private static Map<KEY_TYPE, VALUE_TYPE> sortMapByValue(Map<KEY_TYPE, VALUE_TYPE> unsortMap) {
        List<Map.Entry<KEY_TYPE, VALUE_TYPE>> list = new LinkedList<Map.Entry<KEY_TYPE, VALUE_TYPE>>(unsortMap.entrySet());	
        Collections.sort(list, new Comparator<Map.Entry<KEY_TYPE, VALUE_TYPE>>() {
		public int compare(Map.Entry<KEY_TYPE, VALUE_TYPE> o1,
				   Map.Entry<KEY_TYPE, VALUE_TYPE> o2) {
		    return (o2.getValue()).compareTo(o1.getValue());
		}
	    });
        Map<KEY_TYPE, VALUE_TYPE> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<KEY_TYPE, VALUE_TYPE> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static void main(String [] args) {
        printFourMostFrequentWords(ARTICLE_FILE);
    }
}
