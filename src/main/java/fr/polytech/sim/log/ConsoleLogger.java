package fr.polytech.sim.log;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Console logger.
 */
public class ConsoleLogger extends NamedLogger {

    /**
     * Constructor.
     *
     * @param name  logger name.
     */
    public ConsoleLogger(String name) {
        super(name);
    }

    @Override
    public void writeMessage(String message) {
        System.out.print(message);
    }
}
