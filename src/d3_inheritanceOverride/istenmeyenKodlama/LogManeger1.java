package d3_inheritanceOverride.istenmeyenKodlama;

public class LogManeger1 {
    // Program icinde kimin ne zaman ne yaptigini tutmaya loglama denir

    public void log(int logType) {
        //Böyle bir kod hatali bir yazimdir, 100 lerce satiri olan if bloklarinda degisiklik yapmak cok zor olur ileride
        if (logType == 1) {
            System.out.println("Veritabanina loglandi");
        } else if (logType == 2) {
            System.out.println("Dosyaya yollandi");
        } else {
            System.out.println("Email gönderildi");
        }
        //Biribrilerinin alternatifi olan kod bloklari if ile yönetilemez, yukaridaki 3 kodda loglama kodu ve
        // birbirlerinin alternatifidir
    }

    // bunlarin bir yerde asagida ki sekilde enum olarak tutuldugunu varsayiyoruz
    //1 - Veritabanina loglandi
    //2 - Dosyaya yollandi
    //3 - Email gönderildi

}
