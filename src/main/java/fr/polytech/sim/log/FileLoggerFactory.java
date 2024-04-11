package fr.polytech.sim.log;

public class FileLoggerFactory extends LoggerFactory {
    public Logger createLogger(String name) {
        return new FileLogger(name);
    }
}
