/**
 * 
 */
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author mchemingway0031
 *
 */
public class Document {
	private HashMap<String, Integer> words;
	
	public void setWords(HashMap<String, Integer> words) {
		this.words = words;
	}
	public HashMap<String, Integer> getWords() {
		return words;
	}
	public Document() {
		words = new HashMap<String, Integer>();
	}
	
	public HashMap<String, Integer> getFrequencies(File file){
		BufferedReader reader = null;
		try{
			reader = new BufferedReader(new FileReader(file));
			String line;
			while((line = reader.readLine()) != null){
				line = line.trim();
				if(!line.equals("")){
					
				}
			}
		}catch(IOException ioe){
			
		}
		return words;
	}
}
