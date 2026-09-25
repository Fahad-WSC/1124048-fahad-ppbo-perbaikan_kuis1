package src.models;

public class FrozenFood extends Product implements Discountable, Expireable {
    private String jenis;
    private double berat;
    private String tanggalKadaluarsa;

    public FrozenFood(String id, String nama, double harga, int stok , double suhuPenyimpanan , String tanggalKadaluarsa) {
        super(id, nama, harga , stok);
        this.suhuPenyimpanan = suhuPenyimpanan;
        this.tanggalKadaluarsa = tanggalKadaluarsa;

        calculateDiscount();
        getExpiry();
    }

    public double getSuhuPenyimpanan(){
        return suhuPenyimpanan;
    }
    public String getTanggalKadaluarsa(){
        return tanggalKadaluarsa;
    }

    @Override
    public void calculateDiscount(int amount){
        if (amount < 4){
            return harga * amount;
        } else if ( amount >= 4 && amount < 8){
            return harga * amount * 0.04;
        } else {
            return harga * amount * 0.08;
        }
    }

    @Override 
    public void getExpiry(String tanggalKadaluarsa);

    @Override
     public double calculatedSubTotal( int amount){
        int subtotal = (harga * amount) - calculateDiscount(amount);
        return subtotal;
}

 @Override
    public String getProductDetail() {
    return "• Buah [" + getNama() + "] (ID: " + getId()
            + " | Stok: " + getStok()
            + " | Kadaluarsa: " + getExpiry + " | Suhu Penyimpanan: " + getSuhuPenyimpanan();
}

}
