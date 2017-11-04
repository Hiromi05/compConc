import java.util.concurrent.locks.*;
public class Mapa_Assento {
	Assento assento[];
	Lock tranca[];
	public Mapa_Assento(int n) {
		tranca = new Lock[n];
		assento = new Assento[n];
	}
}
