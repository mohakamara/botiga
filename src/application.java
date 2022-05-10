import java.util.ArrayList;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int menu=Menu();

        Botiga botiga=new Botiga(new ArrayList<>());
        boolean sortida=false;
        Producte p=CrearProductePes(botiga);
        Producte u=CrearProducteUnitat(botiga);

do {
    switch (Menu())
    {
        case 1:CrearProductePes(botiga);

          System.out.println(Menu());break;
        case 2:CrearProducteUnitat(botiga);break;
        case 3:imprimirProductes(p,u);break;



    }
}while (!sortida);





    }

    public static int Menu()
    {
        Scanner sc=new Scanner(System.in);
        int  opcioMenu;
        System.out.println("Benvigut a la nostre botiga");
        System.out.println("===========================");

        System.out.println("1.Producte Pes");
        System.out.println("2.Producte Unitat");
        System.out.println("3.Llistat de productes");


        opcioMenu=sc.nextInt();

        return opcioMenu;
    }
    public static ProductePes CrearProductePes(Botiga botiga ){
        Scanner sc=new Scanner(System.in);
        String nom;
        int preu;
        int unitats;
        String afegir;
        System.out.println("Quin producte vols");
        nom=sc.next();
        System.out.println("quants unitats vols ?");
        unitats=sc.nextInt();
        System.out.println("Quin preu te?");
        preu=sc.nextInt();
        System.out.println("Vols afegir algu mes");
        afegir= sc.next();

        String n="no";
    if (afegir.equals(n))
    {
        ProductePes p=new ProductePes(nom,preu);
        botiga.afegirProducte(p);
        System.out.println(Menu());

    }









        System.out.println(p.calcularPreu(unitats));



return p;

    }
    public static ProducteUnitat CrearProducteUnitat (Botiga botiga) {
        Scanner sc = new Scanner(System.in);
        String nom;
        int preu;
        int unitats;
        float descompte;
        float preuminim;

        System.out.println("Quin producte vols");
        nom=sc.next();

        System.out.println("Quants unitats vols?");
        unitats=sc.nextInt();

        System.out.println("Quin preu te");
        preu=sc.nextInt();

        System.out.println("Quin descompte te");
        descompte=sc.nextFloat();

        System.out.println("Quin preu minim te");
        preuminim=sc.nextFloat();

        ProducteUnitat u=new ProducteUnitat(nom,preu,descompte,preuminim);
        if (botiga.afegirProducte(u)== botiga.afegirProducte(u)){

            System.out.println(Menu());
        }else {
            botiga.afegirProducte(u);
        }



        System.out.println(u.calcularPreu(unitats));
        return u;
    }


    static Botiga imprimirProductes(Producte p,Producte u)
    {
        imprimirProductes(p,u).ImprimirProductes();
        System.out.println(p.getNom());
        System.out.println(p.getPreu());
        return imprimirProductes(p,u);
    }
}
