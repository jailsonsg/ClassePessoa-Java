package javapoo;

public class UsoClasseAtributos {
	public static void main(String[]args) {
		AtributosClasses cliente01 = new AtributosClasses();
		System.out.println(cliente01.firstname);
		System.out.println(cliente01.lastname);
		System.out.println(cliente01.idade);
		System.out.printf("O aluno %s %s tem %d anos",cliente01.firstname,cliente01.lastname,cliente01.idade);
	}
}
