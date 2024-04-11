package fr.polytech.sim.log;

public class NoopLoggerFactory  extends LoggerFactory {
    public Logger createLogger(String name) {
        return new NoopLogger();
    }
}
