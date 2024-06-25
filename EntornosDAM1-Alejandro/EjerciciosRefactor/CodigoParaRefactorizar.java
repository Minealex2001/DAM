package ejemplos;

public class CodigoParaRefactorizar{

	private static final double IVA = 0.21;
	
	public double calculoIva(double precioBase) {
		return precioBase + (IVA * precioBase);
	}

	public int diasMes(int mes, int anio) {
		int diasMes = 0;
		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				diasMes = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				diasMes = 30;
				break;
			case 2:
				if (esBisiesto(anio)) {
					diasMes = 29;
				} else {
					diasMes = 28;
				}
				break;
		}
		return diasMes;
	}
	
	private boolean esBisiesto(int anio) {
		return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
	}
	
	public double subidaPrecio(double precioBase, double subida) {
		precioBase += subida;
		double precioConIVA = calculoIva(precioBase);
		imprimirPrecio(precioBase, precioConIVA);
		return precioBase;
	}
	
	private void imprimirPrecio(double precioBase, double precioConIVA) {
		System.out.println("El nuevo precio base es " + precioBase);
		System.out.println("El precio con IVA es " + precioConIVA);
	}
}
