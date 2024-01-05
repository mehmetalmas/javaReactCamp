package d6.d5_kurumsalMimariler.core;

import d6.d5_kurumsalMimariler.jLogger.JLoggerManeger;

public class JLoggerManegerAdapter implements LoggerService {

    @Override
    public void logToSystem(String message) {
        JLoggerManeger jLoggerManeger = new JLoggerManeger();
        jLoggerManeger.log(message);

    }
}
