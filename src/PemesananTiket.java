class PemesananTiket {
  // Do your magic here...
  private String namaPemesanan;
  private TiketKonser tiket;

  public PemesananTiket(String namaPemesanan, TiketKonser tiket){
    this.namaPemesanan = namaPemesanan;
    this.tiket = tiket;
  }

  public void nota(){
    System.out.println("----- Detail Pemesanan -----");
    System.out.println("Nama Pemesanan: " + this.namaPemesanan);
    System.out.println("Kode Booking: " + Main.generateKodeBooking());
    System.out.println("Tanggal Pemesanan: " + Main.getCurrentDate());
    System.out.println("Tiket yang dipesan: " + tiket.getNamaTiket());
    System.out.println("Total Harga: " + tiket.getHarga() + " USD");
  }
}