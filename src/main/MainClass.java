/**
 * 
 */
package main;

import java.io.File;

/**
 * @author mchem
 *
 */
public class MainClass {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File[] testing_set = new File("test").listFiles();
		File[] training_set = new File("train").listFiles();
		naiveBayes(training_set);
		knn();
	}

	private static float knn() {
		// TODO Auto-generated method stub
		return 2.f;
	}

	private static float naiveBayes(File[] train) {
		return 0;
	}

}
