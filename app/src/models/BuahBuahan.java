package src.models;

public class BuahBuahan extends Product implements Discountable, Expireable {
    private String jenis;
    private double berat;
    private String tanggalKadaluarsa;

    public BuahBuahan(String id, String nama, double harga, int stok ,Jenis jenis, double berat , String tanggalKadaluarsa) {
        super(id, nama, harga , stok);
        this.jenis = jenis;
        this.berat = berat;
        this.tanggalKadaluarsa = tanggalKadaluarsa;

        calculateDiscount();
        getExpiry();
    }


    public Jenis getJenis(){
        return jenis;
    }
    public double getBerat(){
        return berat;
    }
    public String getTanggalKadaluarsa(){
        return tanggalKadaluarsa;
    }

    @Override
    public void calculateDiscount(int amount){
        if (amount < 5){
            return harga * amount;
        } else if ( amount >= 10 && amount < 15){
            return harga * amount * 0.03;
        } else if ( amount >= 5 && amount <10) {
            return harga * amount * 0.02;
        } else {
            return harga * amount * 0.05;
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
            + ") - Jenis: " + getJenis() + " | Stok: " + getStok()
            + " | Kadaluarsa: " + getExpiry + " | Berat: " + getBerat;
}

}
