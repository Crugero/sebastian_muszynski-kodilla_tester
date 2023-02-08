public class SimpleArray {
    public static void main(String[] args) {

        String[] bands = new String[4];
        bands [0] = "Black Sabbath";
        bands [1] = "Pantera";
        bands [2] = "Malevolence";
        bands [3] = "Sleep Token";
        String band = bands [3];
        System.out.println(band);

        int numberOfbands = bands.length;
        System.out.println("Moja tablica zawiera " +numberOfbands+ " elementy");

        boolean a = true;
        boolean b = !a;

    }
}
