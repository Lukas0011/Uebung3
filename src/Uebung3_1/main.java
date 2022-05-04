package Uebung3_1;

public class main {
    public static void main(String[] args) {
        bruch a = new bruch(1,3);
        bruch b = new bruch(2,6);


        kuerzen(b);
        System.out.println(b.toString());
        if (a.equals(b)){
            System.out.println("Sind gleich");
        }else {
            System.out.println("SInd nicht gleich");
        }
    }

    private static void kuerzen(bruch b) {
        //Zähler durch nenner
        System.out.println(b.getNenner());
        int tmp =  b.getNenner() / b.getZeahler() ;
        System.out.println(tmp);
        int tmpp = b.getZeahler() / b.getZeahler();
        System.out.println(tmpp);

        b.setNenner(tmp);
        b.setZeahler(tmpp);
    }
}
