import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Person person = new Person();
        LOGGER.info("Hola");
        LOGGER.debug("debug");
        LOGGER.error("");
    }

    }

