public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenci = {
                new Ogrenci("null", "null", 2013 , "108" , "016" , 2.67),
                new Ogrenci("Yusuf" , "Bilgisayar Müh." , 2023 , "141" , "035" ,  3.87),
                new Ogrenci("Melek" , "Makine Müh." , 2022 , "116" , "038" ,  3.14),
                new Ogrenci("Deniz" ,"Elektrik-Elektronik Müh." , 2021 , "114" , "075" ,  3.27 )
        };
        double gano = 0;
        String ad = "Yusuf";
        Ogrenci foundOgrenci = null;

        for (Ogrenci C : ogrenci){
            if (C.getAd().equals(ad)){
                foundOgrenci = C;
                break;
            }

        }
        if (foundOgrenci==null)
            throw new IllegalArgumentException("Öğrenci bulunamadı!!!");

        int c =1;
        System.out.println("Öğrencilerin Bilgileri");
        for (Ogrenci b : ogrenci){
            for (int i = 0; i < ogrenci.length; i++) {
                System.out.println("OGR-" + c + " " + b.getAd()+ " " + b.getBolum()+ " " + b.ogrenciNoOluştur()+ " " + b.getGano());
                c++;
                break;
            }
        }
        try {
            System.out.println("3. öğrencinin ödeyeceği harç: " + foundOgrenci.harcHesapla(3 , 0.5));
            System.out.println("4. öğrencinin ödeyeceği harç: " + foundOgrenci.harcHesapla(6 , 0 ));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
