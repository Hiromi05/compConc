
public class Sistema {
	public static void main(String args[]) {
		Consumidor consumidor = new Consumidor(args[0]);
		Monitor monitor = new Monitor(Integer.valueOf(args[1]));
	}
}
