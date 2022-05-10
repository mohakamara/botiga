import java.util.ArrayList;

public class Botiga {
    public ArrayList<Producte>llistatProducte=null;

    public Botiga(ArrayList llistatProducte) {
        this.llistatProducte = llistatProducte;
    }

    public ArrayList<Producte> getLlistatProducte() {
        return llistatProducte;
    }

    public void setLlistatProducte(ArrayList<Producte> llistatProducte) {
        this.llistatProducte = llistatProducte;
    }

    public boolean afegirProducte(Producte p)
    {
        int cont = 0;
        for (int i=0;i<llistatProducte.size();i++){
            if (p.getNom().equals(llistatProducte.get(i).getNom()))
            {
                cont ++;


                break;

            }
        }
        if(cont == 0)
        {
            System.out.println("S'ha afegit el producte");
            llistatProducte.add(p);
            return false;

        }
        else {
            System.err.println("Aquest producte ja existeix");
            return true;
        }
    }
    public int ImprimirProductes()
    {
        for (int i=0;i<llistatProducte.size();i++)
        {
            System.out.println(llistatProducte.get(i).getNom());
        }
        return ImprimirProductes();
    }

    }

