package questao5;

public class resposta {

	public static void main(String[] args) {
		
		String normal = "Target";
		String revertida = "";
		
		for(int i = normal.length() -1; i >= 0; i--) {
			revertida += normal.charAt(i);
		}
		
		System.out.print(revertida);

	}

}
