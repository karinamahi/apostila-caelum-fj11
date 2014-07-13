package br.com.balancotrimestral;

public class balancoTrimestral {

	public static void main(String[] args) {
		float gastosJaneiro = 15000;
		float gastosFevereiro = 23000;
		float gastosMarco = 17000;
		float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		float mediaMensal = gastosTrimestre/3;

		System.out.printf("Gastos do trimestre: %.2f\n", gastosTrimestre);
		System.out.printf("Média mensal dos gastos: %.2f", mediaMensal);
	}
}
