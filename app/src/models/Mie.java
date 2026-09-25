package src.models;

public class Mie extends Products implements Discountable {
    private String rasa;
    private double berat;

    public Mie(String id, String nama, double harga, int stok , Rasa rasa , double berat) {
        super(id, nama, harga , stok);
        this.rasa = rasa;
        this.berat = berat;
        
        calculateDiscount();
    }


    public Rasa getRasa(){
        return rasa;
    }

    public double getBerat(){
        return berat;
    }

    @Override
    public void calculateDiscount(int amount){
        if (amount < 10){
            return harga * amount;
        } else if ( amount >= 10 && amount < 20){
            return harga * amount * 0.05;
        } else {
            return harga * amount * 0.10;
        }
    }

    @Override
     public double calculatedSubTotal( int amount){
        int subtotal = (harga * amount) - calculateDiscount(amount);
        return subtotal;
}

@Override
    public String getProductDetail() {
    return "• Mie [" + getNama() + "] (ID: " + getId()
            + ") - Harga: " + getHarga() + " | Stok: " + getStok()
            + " | Rasa: " + getRasa + " | Berat: " + getBerat;
}

}