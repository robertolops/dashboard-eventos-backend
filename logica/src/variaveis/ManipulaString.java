package variaveis;

public class ManipulaString {

	public static void main(String[] args) {


		String email= "reGIna@gaMa.acaDemy";
		System.out.println("Original....................: " + email);
		System.out.println("Minuscula...................: " + email.toLowerCase());
		System.out.println("Maiuscula...................: " + email.toUpperCase());
		System.out.println("Qtde de caracteres..........: " + email.length());
		System.out.println("Posi��o do @................: " + email.indexOf("@"));
		System.out.println("Exibir do 2� at� 4� caracter: " + email.substring(1,4));
		System.out.println("Exibir do 3� em diante......: " + email.substring(2));
		System.out.println("Exibir 1�metade.............: " + email.substring(0, email.length()/2));
		System.out.println("Usu�rio do e-mail...........: " + email.substring(0,email.indexOf("@")));
		System.out.println("Servidor do e-mail..........: " + email.substring(email.indexOf("@")+1));
		System.out.println("Primeiro caracter...........: " + email.charAt(4));
		System.out.println("Compara��o..................: " + email.equals("regina@gama.academy"));
		System.out.println("Compara��o ignorando caixa..: " + email.equalsIgnoreCase("REGINA@GAMA.ACADEMY"));	

	}

}
