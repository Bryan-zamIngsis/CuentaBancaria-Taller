
public class CuentaAhorro extends CuentaBancaria {
	double a=0;
	public void deposito(double dinero) {
		
		if (dinero < 1000) {
			a= (dinero *2)/100;
			saldo = saldo+(dinero+a);
			
		}else {
			saldo =saldo+ dinero;
		}
		
		
	}
}
