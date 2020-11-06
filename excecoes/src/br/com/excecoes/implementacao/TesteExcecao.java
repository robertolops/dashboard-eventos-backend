package br.com.excecoes.implementacao;

public class TesteExcecao {

	public static void main(String[] args) {

		/*
		 * Exce��es n�o s�o controladas pelo programador
		 * Existem dois tipos:
		 * a) Checked  -> o Java verifica antes da compila��o
		 * b) Unchecked -> s� ocorre apos a compila��o
		 */

		try{
			int numero = Integer.parseInt("7");
			System.out.println("Resultado: " + (numero*10));		
			String email="";
			
			System.out.println("Usu�rio: " + email.substring(0,email.indexOf("@")));

		}catch (NullPointerException e) {
			System.out.println("Objeto Nulo");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Coordenada Invalida");
		}catch(NumberFormatException e) {
			System.out.println("N�mero Inv�lido");
		}catch(Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}finally {
			System.out.println("At� logo");
		}



	}
}
