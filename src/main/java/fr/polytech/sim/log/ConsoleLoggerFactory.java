package fr.polytech.sim.log;

public class ConsoleLoggerFactory extends LoggerFactory {
    public Logger createLogger(String name) {
        return new ConsoleLogger(name);
    }
}
