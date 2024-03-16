
public class Aula02 {
	public static void main(String[] args) {
		// vou instanciar uma classe, pra fazer isso criamos assim
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.modelo = "BIC";
		c1.carga = 90;
		c1.destampar();
		c1.tampar();
		c1.status();
	}
}
