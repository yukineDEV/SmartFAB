package MultiScene.Scene.POS;

public class menuModel {
  private String namaMenu;
  private int harga;
  public menuModel(String namaMenu, int harga) {
    this.namaMenu = namaMenu;
    this.harga = harga;
  }
  public String getNamaMenu() {
    return namaMenu;
  }
  public void setNamaMenu(String namaMenu) {
    this.namaMenu = namaMenu;
  }
  public int getHarga() {
    return harga;
  }
  public void setHarga(int harga) {
    this.harga = harga;
  }
  

}
