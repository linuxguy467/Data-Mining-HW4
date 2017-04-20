/**
 * 
 */
package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author mchemingway0031
 *
 */
public class Document {
	private HashMap<String, Integer> words;
	private File email;
	
	public File getEmail() {
		return email;
	}
	public void setEmail(File email) {
		this.email = email;
	}
	public void setWords(HashMap<String, Integer> words) {
		this.words = words;
	}
	public HashMap<String, Integer> getWords() {
		return words;
	}
	public Document(File file) {
		words = new HashMap<String, Integer>();
		email = file;
		words = getFrequencies();
	}
	
	public HashMap<String, Integer> getFrequencies(){
		String text = null;
		try{
			text = new String(Files.readAllBytes(Paths.get(email.getPath())));
			text.trim();
			//System.out.println(text);
		}
		catch(IOException ioe){
			
		}

		String[] allWords = text.split(" ");
		String[] foundWords = new String[allWords.length];
		int[] foundCount = new int[allWords.length];
		int foundIndex = 0;
		
		for(String word: allWords){
			int j = 0;
			for(; j< foundIndex; j++){
				if(foundWords[j].equals(word)){//found
					foundCount[j]++;
					break;
				}
			}
			
			if( j == foundIndex){//word not found in foundWords	
				foundWords[foundIndex] = word;
				foundCount[foundIndex] = 1;
				foundIndex++;
			}
		}   
		
		//populate the hashmap
		for(int i = 0; i< foundIndex; i++)
		{
			words.put(foundWords[i], foundCount[i]);
			System.out.println(foundWords[i] + " : " + foundCount[i]);
		}
		
		return words;
	}
	
	
}
