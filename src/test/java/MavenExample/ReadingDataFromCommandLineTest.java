package MavenExample;

import org.testng.annotations.Test;

public class ReadingDataFromCommandLineTest {
	@Test(groups = "smoke")
	public void readingDataFromCommandTest() {
	String	URL=System.getProperty("url");
	String UN = System.getProperty("username");
	String PWD = System.getProperty("password");
		system.out.println("is the");
	System.out.println(URL);
	System.out.println(UN);
	System.out.println(PWD);
	}
    @Test(groups ="regression")
    public void regressionTest() {
    	System.out.println("regression");
    }
}
