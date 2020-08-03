
public abstract class CuentaBancaria {
	private String propietario;
	public double saldo;
	
	
	
	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	

	public abstract void deposito(double dinero);
	
	public void retiro(double dinero) {
		if (saldo >= dinero) {
			saldo -= dinero;
			
		}else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	
	

}
