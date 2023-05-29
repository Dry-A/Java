package poo.bytebankHerdadoConta;

import poo.bytebankHerdadoConta.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
