package ie.atu.sw;

/* 
 * The Client class has dependencies on the target interface SequenceListStore and
 * on the Adapters InhStoredSequenceListAdapter and ComStoredSequenceListAdapter. 
 * However, the "Class Adapter" InhStoredSequenceListAdapter also places a transitive
 * dependency on the class StoredSequenceContext. 
 * 
 * The client knows nothing about the state abstraction (SequenceComparator) or any 
 * of the different concrete state objects (subtypes of SequenceComparator). If a 
 * Strategy Pattern had been used, the client would have been responsible for configuring
 * the context (StoredSequenceContext) with a concrete strategy and would therefore have
 * to know about, and have possible dependencies on, the classes Hamming, SmithWaterman,
 * Levenshtein and DamerauLevenshtein.
 */
public class Client {
	public static void main(String[] args) throws Exception{
	     CharSequence[] sequences = {"Galvia", "Galloway", "Galaxy", "Always", "Gorgon"}; 
	     
	     //We do not have a conforming class yet
	     SequenceListStore sls = new InhStoredSequenceListAdapter("Galway");
	     sls.open("./out.txt");
	     sls.store(sequences);
	     sls.close();
	     
	     InhStoredSequenceListAdapter adapt = (InhStoredSequenceListAdapter) sls;
	     StoredSequenceContext ssc = new InhStoredSequenceListAdapter("Galway");
	     
	     SequenceListStore sls1 = new ComStoredSequenceListAdapter("Galway");
	     sls1.open("./out1.txt");
	     sls1.store(sequences);
	     sls1.close();
	}
}