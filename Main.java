package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManager = new BaseKrediManager[]  
				{new OgrenciKrediManager(),new OgretmenKrediManager(),new TarimKrediManager()};
		
		
		OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		ogretmenKrediManager.hesapla(10000);
		double yeni=ogretmenKrediManager.hesapla(10000);
		System.out.println(yeni);
		
		for(BaseKrediManager credits : baseKrediManager)
		{
			System.out.println(credits.hesapla(1000));
			
		}
		ogretmenKrediManager.add();

	}

}
