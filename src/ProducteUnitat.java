public class ProducteUnitat extends Producte {
    private float descompte;
    private float preuMinimPerAplicarDescompte;

    public ProducteUnitat(String nom, int preu,float descompte,float preuMinimPerAplicarDescompte) {
        super(nom, preu);
        if (descompte<0||descompte>1)
            System.out.println("el descompte ha de ser de 0 a 1");

        this.descompte=descompte;
        this.preuMinimPerAplicarDescompte=preuMinimPerAplicarDescompte;
    }

    @Override
    float calcularPreu(float quantitat) {
        int preuFinal;
        if (getPreu()*quantitat>=preuMinimPerAplicarDescompte)
           preuFinal= (int) (getPreu()*quantitat-(getPreu()*quantitat)*descompte);
        else
            preuFinal= (int) (getPreu()*quantitat);
        return preuFinal;
    }

    public float getDescompte() {
        return descompte;
    }

    public void setDescompte(float descompte) {
        this.descompte = descompte;
    }

    public float getPreuMinimPerAplicarDescompte(float preuMinimPerAplicarDescompte) {


        return preuMinimPerAplicarDescompte;
    }

    public void setPreuMinimPerAplicarDescompte(float preuMinimPerAplicarDescompte)
    {

        this.preuMinimPerAplicarDescompte = preuMinimPerAplicarDescompte;
    }

}
