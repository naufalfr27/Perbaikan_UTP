abstract class TiketKonser implements HargaTiket {
    // Do your magic here...
    private double harga;
    private String namaTiket;

    public TiketKonser(double harga, String namaTiket){
        this.harga = harga;
        this.namaTiket = namaTiket;
    }

    public double getHarga(){
        return harga;
    }

    public String getNamaTiket(){
        return namaTiket;
    }
}
 