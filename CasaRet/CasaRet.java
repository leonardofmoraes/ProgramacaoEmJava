class CasaRet {
	public static void main (String[] args) {
			//Aqui vai seu codigo
			int areaSala;
			int areaQuarto;
			int areaBanheiro;
			int areaTotal;
			
			System.out.println("Programa para calculo da area da casa");
			areaSala = 10*10;
			System.out.println("A area da sala e " + areaSala);
			areaQuarto = 5*7;
			System.out.println("A area do quarto e " + areaQuarto);
			areaBanheiro = 5*7;
			System.out.println("A area do banheiro e " + areaBanheiro);
			areaTotal = areaSala + 2*areaQuarto;
			System.out.println("A area total e " + areaTotal);
	}
}