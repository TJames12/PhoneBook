import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TestPhoneBook {
	private PhoneBook galesburg;

	@Before
	public void create() {
		galesburg = new PhoneBook();
	}
	
	@Test
	public void testAdd() {
		galesburg.add("Blake", "(586) 428-8566");
		galesburg.add("Bob", "(235) 321-0349");
		galesburg.add("George", "(284) 486-5648");
		galesburg.add("Blake", "(746) 423-4567");
		
		ArrayList<String> blakeList = new ArrayList<String>();
		blakeList.add("(586) 428-8566");
		blakeList.add("(746) 423-4567");
		
		ArrayList<String> bobList = new ArrayList<String>();
		bobList.add("(235) 321-0349");
		
		ArrayList<String> georgeList = new ArrayList<String>();
		georgeList.add("(284) 486-5648");
		
		assertEquals(blakeList, galesburg.searchName("Blake"));
		assertEquals(bobList, galesburg.searchName("Bob"));
		assertEquals(georgeList, galesburg.searchName("George"));
	}
	
	@Test
	public void testSearchName() {
		galesburg.add("Kevin", "(235) 321-0349");
		galesburg.add("Kevin", "(567) 486-8645");
		galesburg.add("Kevin", "(789) 562-7899");
		galesburg.add("Kevin", "(746) 568-2378");
		galesburg.add("Kevin", "(156) 321-3187");
		
		ArrayList<String> kevinList = new ArrayList<String>();
		kevinList.add("(235) 321-0349");
		kevinList.add("(567) 486-8645");
		kevinList.add("(789) 562-7899");
		kevinList.add("(746) 568-2378");
		kevinList.add("(156) 321-3187");
	}
	
	public void testViewDirectory() {
		galesburg.add("Blake", "(586) 428-8566");
		galesburg.add("Bob", "(235) 321-0349");
		galesburg.add("George", "(284) 486-5648");
		galesburg.add("Blake", "(746) 423-4567");
		
		Set<String> keySet = new TreeSet<String>();
		keySet.add("Blake");
		keySet.add("Bob");
		keySet.add("George");
		
		assertEquals(keySet, galesburg.viewDirectory());		
	}
}
