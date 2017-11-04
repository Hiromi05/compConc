
public class Monitor {
	Mapa_Assento mapa;
	int qtdAssento;
	public Monitor(int n) {
		mapa = new Mapa_Assento(n);
		qtdAssento = n;
	}
	
	public Mapa_Assento Verifica() {
		return mapa;
	}
	
	public void OcupaVazio(int id_user) {
		int id_aleatorio;
		id_aleatorio = (int)((int)Math.random() * qtdAssento);
		mapa.tranca[id_aleatorio].lock();
		if(mapa.assento[id_aleatorio].estado == false) {
			mapa.assento[id_aleatorio].estado = true;
			mapa.assento[id_aleatorio].id_usuario = id_user;
		}
		mapa.tranca[id_aleatorio].unlock();
	}
	
	public void OcupaAssento(int id, int id_user) {//id = id do assento; id_user = id do próprio usuário, reserva assento do id
		mapa.tranca[id].lock();
		if(mapa.assento[id].estado == false) {
			mapa.assento[id].estado = true;
			mapa.assento[id].id_usuario = id_user;
		}
		mapa.tranca[id].unlock();
	}
	
	public void Cancela(int id, int id_user) {//id = id do assento; id_user = id do próprio usuário
		mapa.tranca[id].lock();
		if(mapa.assento[id].id_usuario != id_user || mapa.assento[id].estado != true) 
		{System.out.println("usuario nao reservou esse assento");}
		else {mapa.assento[id].estado = false;}
		mapa.tranca[id].unlock();
	}
}
