package variaveis;

public class ManipulaString {

	public static void main(String[] args) {


		String email= "reGIna@gaMa.acaDemy";
		System.out.println("Original....................: " + email);
		System.out.println("Minuscula...................: " + email.toLowerCase());
		System.out.println("Maiuscula...................: " + email.toUpperCase());
		System.out.println("Qtde de caracteres..........: " + email.length());
		System.out.println("Posição do @................: " + email.indexOf("@"));
		System.out.println("Exibir do 2º até 4º caracter: " + email.substring(1,4));
		System.out.println("Exibir do 3º em diante......: " + email.substring(2));
		System.out.println("Exibir 1ªmetade.............: " + email.substring(0, email.length()/2));
		System.out.println("Usuário do e-mail...........: " + email.substring(0,email.indexOf("@")));
		System.out.println("Servidor do e-mail..........: " + email.substring(email.indexOf("@")+1));
		System.out.println("Primeiro caracter...........: " + email.charAt(4));
		System.out.println("Comparação..................: " + email.equals("regina@gama.academy"));
		System.out.println("Comparação ignorando caixa..: " + email.equalsIgnoreCase("REGINA@GAMA.ACADEMY"));	

	}

}
