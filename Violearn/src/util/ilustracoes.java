package util;

public class ilustracoes {

	String[] notasMusicais = {
			
			"────█▀█▄▄▄▄─────██▄───",
			"────█▀▄▄▄▄█─────█▀▀█──",
			"─▄▄▄█─────█──▄▄▄█─────",
			"██▀▄█─▄██▀█─███▀█─────",
			"─▀▀▀──▀█▄█▀─▀█▄█▀─────"
			
	};
	
	public void exibirIlustracao() {
        for (String linha : notasMusicais) {
            System.out.println(linha);
        }
    }
	
}
