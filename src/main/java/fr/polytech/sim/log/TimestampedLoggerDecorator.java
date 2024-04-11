package fr.polytech.sim.log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampedLoggerDecorator implements Logger {
    private Logger composant;

    public TimestampedLoggerDecorator(Logger logger) {
        this.composant = logger;
    }

    @Override
    public void log(String format, Object... args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateFormatee = dateFormat.format(date);

        composant.log(dateFormatee + " : " + format, args);
    }
}
