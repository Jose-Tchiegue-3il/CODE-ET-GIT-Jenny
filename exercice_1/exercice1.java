/**
 * Classe permettant de generer une facture
 */
public class FactureManager {

    /**
     * Calcul une facture en tenant compte des remises
     * 
     * @param total le total de la facture
     */
    public double calculerFacture(double total) {
        total = calculeremise(typeProduit,quantite,Prixuniataire);

        if (total > 1000) {
            total -= total * 0.05; 
        }

        return total;
    }

    /**
     * calcule les remises en fonctions des types de produits
     * 
     * @param typeProduit type du produit achete
     * @param quantite nombre de produit achetes
     * @param prixUnitaire prix d'un seul produit
     */
    public double calculremise(String typeProduit, int quantite,double prixUnitaire) {
        double total = quantite * prixUnitaire;
        if (typeProduit.equals("Alimentaire")) {
            total -= total * 0.05; 
        } else if (typeProduit.equals("Electronique")) {
            total -= total * 0.1; 
        } else if (typeProduit.equals("Luxe")) {
            total -= total * 0.15; 
        }

    } return total;
}
