import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook {
	
	static TreeMap<String, ArrayList<String>> directory = new TreeMap<String, ArrayList<String>>(); //map of names and lists of numbers
	static ArrayList<String> numbers; //list of numbers
	
	public void add(String name, String number) {
		numbers = directory.get(name);
		
		if(numbers==null) { //if the name is new to the map
			numbers = new ArrayList<String>();
			directory.put(name, numbers); //add name to the map
		}
		
		numbers.add(number); //add given number to the list of numbers
	}
	
	public ArrayList<String> searchName(String name) { //return all numbers associated with the given name
		return directory.get(name);
	}
	
	public String searchNumber(String number) { //return all names associated with the given number
		if(directory.containsValue(number)) {
			//search through arraylist of each value for given number.
		}
		else 
			return "Number not found";
		
		return null;
	}
	
	public Set<String> viewDirectory() { //return all names in the map
		return directory.keySet();
	}

}
