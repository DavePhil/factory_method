public class ProduitFactory {
    public static final int TYPE_PRODUITA1 = 1;
    public static final int TYPE_PRODUITA2 = 2;

    public ProduitA getProduitA(int typeProduit){
        ProduitA produitA = null;
        switch (typeProduit){
            case TYPE_PRODUITA1 -> produitA = new ProduiA1();
            case TYPE_PRODUITA2 -> produitA = new ProduitA2();
            default -> throw new IllegalArgumentException("Type de produit Inconnu");
        }
        return produitA;
    }
}
