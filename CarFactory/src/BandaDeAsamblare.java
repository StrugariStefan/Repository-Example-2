import java.util.LinkedList;
import java.util.ListIterator;

public class BandaDeAsamblare {
	public int capacitate;
	public int greutateMaxima;
	public LinkedList<Componenta> banda;
	
	public BandaDeAsamblare(int capacitate, int greutateMaxima ) {
		this.capacitate = capacitate;
		this.greutateMaxima = greutateMaxima;
		banda = new LinkedList<Componenta>();
	}
	
	public int getSize() {
		return banda.size();
	}
	
	public int getWeight() {
		int weight = 0;
		ListIterator<Componenta> it = banda.listIterator();
		while(it.hasNext()) {
			weight = weight + it.next().greutate;
		}
		return weight;
	}
	
	public void Put(Componenta componenta) {
		if( getWeight() + componenta.greutate <= greutateMaxima && getSize() < capacitate ) {
			banda.addFirst(componenta);
			System.out.println("Componenta " + componenta.nume + " a fost adaugata cu succes!");
		} else {
			System.out.println("Greutatea sau capacitatea benzii ar fi fost depasite");
		}
	}
	
	public Componenta Take() {
		if( getSize() == 0 ) {
			System.out.println("Banda este vida!");
			return null;
		} else {
			Componenta componenta = banda.getLast();
			banda.removeLast();
			return componenta;
		}
	}
}
