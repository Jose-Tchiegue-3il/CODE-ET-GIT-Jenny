public class StockManager {

    /**
     * 
     */
    public void gererStock(String typeOperation) {
        if(typeOperation.equals("ajout")) {
            ajout();
        }
        else if (typeOperation.equals("retrait")){
            retrait();
        }else {
            System.out.println("Opération inconnue.");
        }
     
        
        public void ajouter(String produit, int quantite, int stock) {
            stock += quantite;
            System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        
        } 
        public void retrait(String produit, int quantite, int stock){
            
            if (stock >= quantite) {
                stock -= quantite;
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
            } else {
                System.out.println("Stock insuffisant pour le produit : " + produit);
            }
        
        } 
    }
}
