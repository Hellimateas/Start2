package start2.exe3;

public class Main {
	
	public static void main(String[] args) {
		Jogador felipe = new Jogador("Hellimateas","Atacante", "22/03/1996");
		
		
		
		System.out.println(felipe.toString());
		
		System.out.println("You are "+felipe.anos()+" years");
		
//		System.out.println(felipe.);
//		System.out.println(data.getYear());
//		System.out.println(formato);
//		
		
//		String text = data.format(formato);
//		System.out.println(text);
		
		felipe.aposentadoria();
		
	}
}
