
public class CarFactoryLog {
	public static void main(String[] args) {
		BandaDeAsamblare banda = new BandaDeAsamblare(3,16);
		
		banda.Put(new Componenta("usa",5));
		banda.Put(new Componenta("motor",10));
		banda.Put(new Componenta("volan",2));
		
		banda.Take();
		banda.Put(new Componenta("volan",2));
		
	}
}
