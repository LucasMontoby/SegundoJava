// import com.deg.Persona;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
	public static void main(String[] args) {
		Persona juan = new Persona("juan", "pepe");
		Persona pedro = new Persona("pedro", "pio");
		Persona lucas = new Persona("lucas", "montoby");
		Persona martin = new Persona("martin", "monto");
		Persona marcos = new Persona("marcos", "toby");

		List<Persona> personList = new ArrayList<>();
		List<String> listaDePalabras = new ArrayList<>();

		listaDePalabras.add("juan");
		listaDePalabras.add("pedro");
		listaDePalabras.add("lucas");
		listaDePalabras.add("martin");
		listaDePalabras.add("marcos");

		personList.add(juan);
		personList.add(pedro);
		personList.add(lucas);
		personList.add(martin);
		personList.add(marcos);

		// Ordenamos la lista.
        Collections.sort(personList, Comparator.comparing(Persona::getNombre));
		Collections.sort(personList, Comparator.comparing(Persona::getApellido));
		Collections.reverseOrder();
		personList.forEach(System.out::println);


		// Persona p = personaList.stream()
		// .filte(persona -> persona.)
		// .collect(Collectors.toList())
		// .get(0);
		// System.out.println("Personaje : " + p);
	}
}
