package git_Pack01;

import org.testng.annotations.Test;

public class SimpleTest {
	
	@Test
	public void printSimpleTest() {
		System.out.println("First Basic Simple Test for Git");
		
		System.out.println("Downloaded from Github to Local -> added line 1 for modification");
		
		System.out.println("Pulled from Github to Local -> added line 2 for modification");
	}
	
	@Test
	public void anotherSimpleTest() {
		
		System.out.println("Pulled from Github to Local -> added line 3 in new method");
	}

}
