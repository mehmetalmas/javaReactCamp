package d5_kurumsalMimariler.d5_2.core;

import d5_kurumsalMimariler.d5_2.jLogger.JLoggerManeger;

public class JLoggerManegerAdapter implements LoggerService {

    @Override
    public void logToSystem(String message) {
        JLoggerManeger jLoggerManeger = new JLoggerManeger();
        jLoggerManeger.log(message);

    }
}
