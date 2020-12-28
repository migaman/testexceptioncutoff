package cutoff;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		LOGGER.info("App Start");
		Exception exc = new Exception("My First Exception");
		
		try {
			throw new RuntimeException("My Runtime Excpetion", exc);	
		}
		catch(Exception e) {
			LOGGER.error("Hello", e);
		}
		
		LOGGER.info("App End");
	}
}
