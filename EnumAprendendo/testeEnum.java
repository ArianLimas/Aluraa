package EnumAprendendo;

import java.util.ArrayList;

public class testeEnum {
	public static void main(String[] args) {

		Prioridade pMin = Prioridade.Min;
		Prioridade pNormal = Prioridade.Normal;
		Prioridade pMax = Prioridade.Max;

		// numero ordinal dos p
		System.out.println(pMin.ordinal());
		System.out.println(pNormal.ordinal());
		System.out.println(pMax.ordinal());

		System.out.println();

		// comparando a diferença entre pMin e pMax
		System.out.println(pMin.compareTo(pMax));
		System.out.println(pNormal.compareTo(pMax));
		System.out.println(pMax.compareTo(pMax));




	
	
}

}
