class Main {
    public static void main(String[] args) {
      Heroes hero = new Heroes();
  
      hero.setProfile("Rani Fanika", 20, 160);
      hero.profile();
      
      // jalankan aktivitas disini (GROUP 7)...
      hero.jalan();

      hero.lari();
      hero.lari();
      hero.lari();

      hero.makan();

      hero.minum();

      hero.lompat();
      hero.lompat();

      hero.duduk();
      
      // tampilkan status terkini...
      hero.profile();
      
    }
  }