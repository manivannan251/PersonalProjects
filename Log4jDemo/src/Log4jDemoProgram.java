import org.apache.log4j.Logger;

public class Log4jDemoProgram {

	static Logger log = Logger.getLogger(Log4jDemoProgram.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.trace("Trace Message!");
	      log.debug("Debug Message!");
	      log.info("Info Message!");
	      log.warn("Warn Message!");
	      log.error("Error Message!");
	      log.fatal("Fatal Message!");

	}

}
