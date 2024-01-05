package d5_kurumsalMimariler.core;

import d5_kurumsalMimariler.jLogger.JLoggerManeger;

public class JLoggerManegerAdapter implements LoggerService {

    // LoggerService yi imlement eden JLoggerManegerAdapter sinifi
    // distan gelen sinifi(dosyayi) metodunda kullanarak, dosyayi sisteme adapte ediyor
    @Override
    public void logToSystem(String message) {
        JLoggerManeger jLoggerManeger = new JLoggerManeger();
        jLoggerManeger.log(message);

    }
}
