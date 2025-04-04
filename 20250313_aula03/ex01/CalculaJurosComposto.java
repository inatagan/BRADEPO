public class CalculaJurosComposto implements ICalculaJurosComposto {
	private double capital;
	private double montante;
	private int tempoEmMeses;



	public CalculaJurosComposto(double capital, double montante, int tempoEmMeses) {
		this.capital = capital;
		this.montante = montante;
		this.tempoEmMeses = tempoEmMeses;
	}

	public double CalcularValorDoJuros(){
		double juros;
		juros = FloorOfNthRoot.floorOfNthRoot((montante/capital), tempoEmMeses);
	}

	@Override
	public void connect(IPlanoAmortizacao componente) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'connect'");
	}
}
