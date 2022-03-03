package holadam;

public class HolaDAM {

    public static void main(String[] args) {
        holaDam();

        llueve();

        adiosDam();
        ayuda();
        System.out.println(ganasDeVivir());
    }

    private static void holaDam() {
        System.out.println("Hola DAM!");
    }

    
    public static void llueve(){
        System.out.println("Está lloviendo");
    } 


    private static void adiosDam() {
        System.out.println("Adios DAM!");
    }
    
    private static void ayuda() {
        System.out.println("Ayuda por favor.");
    }
    
    private static int ganasDeVivir() {
        return 0;
    }


}
