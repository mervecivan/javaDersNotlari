package inheritanceDemoo;

public class Main {

	public static void main(String[] args) {
		 /*OgretmenKrediManager ogretmen= new OgretmenKrediManager();
		 ogretmen.Hesapla(); */
		 
		 KrediUI krediUI= new KrediUI();
		 krediUI.KrediHesapla(new OgretmenKrediManager());
	}

}
