import java.util.Objects;



public class Main {





    public static void main(final String[] args) {
        System.out.println("Hello");
        Carne carne = new Carne(10.0, "2022-01-01", "carne de vita");
        double pret = carne.getPret();
        System.out.println(pret);



    }





}
enum Categorie {
    LACTATE,
    PAINE,
    MEZELURI
}

 class Aliment {
    private double pret;
    private String dataExpirare;
    private String ingrediente;
    private double calorii;
    private String tipAliment;

     public Aliment(double pret, String dataExpirare, String ingrediente, double calorii, String tipAliment) {
        this.pret = pret;
        this.dataExpirare = dataExpirare;
        this.ingrediente = ingrediente;
        this.calorii = calorii;
        this.tipAliment = tipAliment;
    }
     public double getPret() {
         return pret;
     }


}

 class Carne extends Aliment {
     public Carne(double pret, String dataExpirare, String ingrediente) {
        super(pret, dataExpirare, ingrediente, 1.05, "carne");
    }
}

 class Lapte extends Aliment {
     public Lapte(double pret, String dataExpirare, String ingrediente) {
        super(pret, dataExpirare, ingrediente, 3.05, "lapte");
    }
}

 class Cereale extends Aliment {
     public Cereale(double pret, String dataExpirare, String ingrediente) {
        super(pret, dataExpirare, ingrediente, 2.56, "cereale");
    }
}


