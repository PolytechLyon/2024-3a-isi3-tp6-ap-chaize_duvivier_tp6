package fr.polytech.sim.log;

/**
 * General-purpose logger.
 */
public interface Logger {

    /**
     * Log a formatted message.
     *
     * @param format    message format
     * @param args      message arguments
     */
    void log(String format, Object... args);

    public static Logger useLogger(String name) {
        Logger consoleLogger = new ConsoleLogger(name);
        return new TimestampedLoggerDecorator(consoleLogger);
    }
}
