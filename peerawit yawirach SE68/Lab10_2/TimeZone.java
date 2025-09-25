package Lab10_2;

public class TimeZone {
    public static void main(String[] args) {
        System.out.println("Current time(h:m:s): " + convertMillis(System.currentTimeMillis()));
    }
    public static String convertMillis(long millis) {
        int TimeZoneRn = 7;

        long totalseconds = millis / 1000;
        long currentseconds = totalseconds %60;

        long totalminutes = totalseconds /60;
        long currentminutes = totalminutes %60;

        long totalhours = totalminutes /60;
        long currenthours = totalhours %24;
        
        return String.format("%02d:%02d:%02d", currenthours + TimeZoneRn,currentminutes,currentseconds);
    }
}
