public class ProductePes extends Producte{
    public ProductePes(String nom, int preu) {
        super(nom, preu);
    }

    @Override
    float calcularPreu(float quantitat) {
        return super.getPreu()*quantitat;
    }
}
