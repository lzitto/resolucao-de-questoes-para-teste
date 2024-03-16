/**
 * 
 * @author lzito
 *	A classe caneta definte o que vai vir a ser uma canea
 */ 
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Uma caneta tem modelo : " + this.modelo);
		System.out.println("A caneta tem qual ponta ? " + this.ponta);
		System.out.println("A caneta tem quanto de carga ? " + this.carga);
		System.out.println("A caneta está despanda ou tampada ? " + this.tampada);
	}
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
	void tampar() {
		this.tampada = true;
		
	}
	
	void destampar() {
		this.tampada = false;
	}
}
