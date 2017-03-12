package example;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class HelloWorld{
	static Logger logger = Logger.getLogger(HelloWorld.class);

	public static void main(String [] args){
		BasicConfigurator.configure();

		//System.out.println("Hello World!!!");
		logger.info("Hello World");
	}
}
