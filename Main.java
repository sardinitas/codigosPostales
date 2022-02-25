
public class Main {

	public static void main(String[] args) {
		long cp[] = { 29002, 34987, 29700, 41430, 41657, 29680, 29380, 29210, 14200, 14511 };
		for (int i = 0; i < cp.length; i++) {
			CPZonas codigo = new CPZonas(cp[i]);
			String area = codigo.zona;
			boolean nuestro = codigo.us;
			if (nuestro == true) {
				System.out.println(area + " pertenece a Malaga");
			} else {
				System.out.println(cp[i] + " No nos pertenece");
			}
		}
	}
}
