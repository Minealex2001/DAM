import java.util.Arrays;
import java.util.Scanner;
/*
 * Ejercicio obligatorio
 * Made by Alejandro Sánchez Pinto
 * Github: https://github.com/Minealex2001
 */
public class EjercicioObligatorio {
	public static void main(String[] args) {
		//Inicializo el escaner.
		Scanner entrada = new Scanner(System.in);

		//Declaro la variable que utilizare para almacenar los nombres.
		String nombre[] = new String[8];

		/* Aqui utilizo un system.arraycopy para copiar el array que me dara como resultado el metodo que llamo
		 * dentro de la misma linea "nomalu(entrada)" y lo almaceno en el array previamente declarado e instanciado "nombre".
		 */
		System.arraycopy(nomAlu(entrada), 0, nombre, 0, 8);
		//Aqui declaro una variable que me servira para saber el numero de preguntas y le doy el valor que da como resultado "numPregun(entrada)".
		int numpreguntas = numPregun(entrada);
		char respuestas[][] = new char[8][numpreguntas];

		/* Aqui utilizo un system.arraycopy para copiar el array que me dara como resultado el metodo que llamo
		 * dentro de la misma linea "notas(entrada, numpreguntas, nombre)" y lo almaceno en el array 
		 * previamente declarado e instanciado "respuestas".
		 */
		respuestas = respuestaAlumno(entrada, numpreguntas, nombre);

		char respuestascorrecta[] = new char[numpreguntas];
		System.arraycopy(respuestaCorrecta(entrada, numpreguntas), 0, respuestascorrecta, 0, numpreguntas);


		menu(nombre, respuestascorrecta, respuestas, entrada, numpreguntas);
		entrada.close();
	}

	//Metodo para pedir y almacenar los nombres de los alumnos.
	//String[] declaro que el resultado del metodo es un Array de String.
	public static String[] nomAlu(Scanner entrada) {

			//Inicializo el array que almacenara los nombres dentro del metodo.
			String alumno[] = new String[8];

			//Realizo el bucle que me permitira dar vueltas por el array y almacenar los nombres.
			for(int i=0; i<alumno.length;i++){
				System.out.print("Introduce el nombre del alumno:");
				alumno[i]=entrada.nextLine();
			}

			//Devuelve como resultado el array con los nombres.
			return alumno;
	}

	//Metodo para pedir y almacenar el numero de preguntas que tendra el examen.
	public static int numPregun(Scanner entrada) {

		//Declaro la variable que almacenara dentro del metodo el numero de preguntas.
		//Lo inicializo con 0 para que siempre entre la primera vez, se podria hacer con un do-while.
		int numero = 0;

		/*Como metodo de control, realizo un while que estara siempre dando vueltas mientras el valor de numero
		 * sea menor o igual a 0, ya que no puede haber un numero de preguntas negativas o nulas.
		 */
		while(numero<=0){
			System.out.print("¿Cuantas preguntas tiene el examen?");
			numero = entrada.nextInt();

			//Este if solo es para mostrar un mensaje de error cuando el numero no cumpla con lo requerido.
			if(numero<=0){
				System.err.println("[ERROR] El numero de preguntas no puede ser menor o igual a 0.");
			}
		}
		
		//Devuelve como resultado el numero de preguntas despues de pasar por el control de datos.
		return numero;
	}

	/*Metodo para pedir y almacenar las respuestas de los alumnos.
	 * char[] declaro que el resultado del metodo es un Array de char.
	 * Importo Scanner entrada para poder utilizar el escaner dentro del metodo
	 * Importo int numpreguntas para utilizar el numero de preguntas y creear el array bidimensional igual al de main
	 * Importo String nombre[] para poder mostrar el nombre de los alumnos y asi sea más entendible para el usuario
	 */
	public static char[][] respuestaAlumno(Scanner entrada, int numpreguntas, String nombre[]) {

		//Inicializo el array bidimensional que almacenara las respuestas y a que alumno refieren dentro del metodo.
		char respuestas[][] = new char[8][numpreguntas];

		//Hago un bucle para ir cambiando el alumno del cual se quieren almacenar las respuestas.
		for(int i=0; i < 8; i++){

			System.out.println("Introduce las respuestas para el alumno "+ nombre[i]);

			//Hago un bucle para ir cambiando las preguntas del cual se quieren almacenar las respuestas.
			for(int j=0;j<numpreguntas;j++){

				System.out.print("Introduce la respuesta para la pregunta " + j + ": ");
				String resultado = entrada.nextLine();
				entrada.nextLine();

				/*Como metodo de control, realizo un while que estara siempre dando vueltas mientras el valor de resultado
				* sea distinto de A, B, C, D o E, ya que no hay más respuestas aceptables.
				*/
				while(!resultado.matches("[A-E]")){
					System.err.println("[ERROR] La respuesta tiene que estar entre la A y la E");
					System.out.print("Introduce la respuesta para la pregunta " + j + ": ");
					resultado = entrada.nextLine();
				}
				/*Al haber leido un array en el escaner anterior, uso esta linea para sacar el primer
				* caracter para añadirlo en el array de char para las respuestas de los alumnos.
				*/
				respuestas[i][j] = resultado.charAt(0);
			}
		}
		return respuestas;
	}

	public static char[] respuestaCorrecta(Scanner entrada, int numpreguntas) {
		char respuestas[] = new char[numpreguntas];

		for(int i=0; i < numpreguntas;i++){
			System.out.print("Escribe la respuesta para la pregunta " + i + " ");
			String resultado = entrada.nextLine();


			/*Como metodo de control, realizo un while que estara siempre dando vueltas mientras el valor de resultado
			* sea distinto de A, B, C, D o E, ya que no hay más respuestas aceptables.
			*/
			while(!resultado.matches("[A-E]")){
				System.err.println("[ERROR] La respuesta tiene que estar entre la A y la E");
				System.out.print("Escribe la respuesta para la pregunta " + i + " ");
				resultado = entrada.nextLine();
			}
			/*Al haber leido un array en el escaner anterior, uso esta linea para sacar el primer
			* caracter para añadirlo en el array de char para las respuestas correctas.
			*/
			respuestas[i] = resultado.charAt(0);
		}
		return respuestas;
	}

	//Este metodo es unicamente para el menu del programa.
	public static void menu( String nombre[], char respuestascorrecta[], char respuestaalumno[][], Scanner entrada, int numpreguntas) {
        
        //Inicializo la variable de respuesta.
        int res;

        /* Realizo un do-while par aque mientras el valor de res sea distinto de "-1" este en bulce el menu y 
         * asi que no salga del programa despues de que el metodo de cada caso termine y no perder los datos
         * ya introducidos.
         */
        do{
			//Muestro el menu.
			System.out.println("Opción 1 Notas: Muestra la nota obtenida de cada estudiante. Esta nota corresponde al número de aciertos que tuvo el estudiante.");
			System.out.println("Opción 2 Media: Muestra la media de aciertos de los 8 alumnos.");
			System.out.println("Opción 3 Nota Alumno: dado un nombre de un alumno, muestra su nota.");
			System.out.println("Opción 4 Pregunta: Muestra el número de la pregunta más acertada");
            System.out.println("Elije la opcion que quieres simplemente insertando el numero que quieres. Elige -1 para salir del programa");
			
			res = entrada.nextInt();
			entrada.nextLine();
			//Dependiendo de la respuesta que de el usuario se llamara a un metodo diferente.
			switch(res){
				case 1:
					notasTotales(nombre, respuestascorrecta, respuestaalumno, numpreguntas);
					break;
				
				case 2:
					media(respuestascorrecta, respuestaalumno, numpreguntas);
					break;
				
				case 3:
                    notaAlumno(respuestascorrecta, respuestaalumno, numpreguntas, entrada, nombre);
                    break;

				case 4:
					preguntaMasAcertada(respuestascorrecta, respuestaalumno, numpreguntas);
					break;
			}

        }while(res != -1);
	}

	//Este metodo se utiliza solo para mostrar las notas de cada alumno.
	public static void notasTotales(String nombre[], char respuestascorrecta[], char respuestaalumno[][], int numpreguntas) {

		//Creo un array local para almacenar temporalmente las notas de los alumnos para despues mostrarlas.
		int nota[] = new int[8];

		//Relleno el array anterior con 'O' para que no de error a la hora de sumar la nota.
		Arrays.fill(nota, 0);

		//Realizo un for para recorrer el array de respuesta por alumno.
		for(int i = 0; i < 8; i++){

			//Realizo un for para recorrer el array de respuesta por pregunta.
			for(int j = 0; j < numpreguntas ; j++){

				//Compruebo si la respuesta del alumno es igual a la respuesta correcta de la pregunta.
				if(respuestaalumno[i][j] == respuestascorrecta[j]){
					nota[i] = nota[i] + 1;
				}
			}
        
        //Muestro la nota del alumno.
		System.out.println("La nota del alumno " + nombre[i] + " es: " + nota[i]);
		}
	}

	//Este metodo se utiliza solo para mostrar la nota media de la clase.
	public static void media(char respuestascorrecta[], char respuestaalumno[][], int numpreguntas) {

        //Inicializo una variable local para almacenar de forma temporal la nota de los alumnos para sacar la media.
		float nota = 0;

        //Realizo un for para recorrer el array de respuesta por alumno.
		for(int i = 0; i < 8; i++){

            //Realizo un for para recorrer el array de respuesta por pregunta.
			for(int j = 0; j < numpreguntas ; j++){

                //Compruebo si la respuesta del alumno es igual a la respuesta correcta de la pregunta.
				if(respuestaalumno[i][j] == respuestascorrecta[j]){
					nota = nota + 1;
				}
			}
		}

        //Muestro la nota media de la clase.
		System.out.println("La nota media de la clase es: " + (nota/8));

	}

	//Este metodo se utiliza solo para mostrar la nota de un alumno en particular.
	public static void notaAlumno(char respuestascorrecta[], char respuestaalumno[][], int numpreguntas, Scanner entrada, String nombre[]) {

        //Inicializo una variable local para almacenar de forma temporal la nota del alumno del cual se quiere sacar la nota.
		int nota = 0;

        //Pregunto al usuario de que alumno se quiere sacar la nota en particular.
		System.out.print("¿De que alumno quieres saber la nota?");
		String alumno = entrada.nextLine();

        //Realizo un for para recorrer el array de nombres en busca del nombre proporcionado.
		for(int i=0; i < nombre.length ; i++ ){

            //Compruebo si el nombre proporcionado se encuentra dentro del array.
			if(alumno.equalsIgnoreCase(nombre[i])){

                /*Realizo un for para recorrer el array de preguntas en el caso de que se haya encontrado el alumno dentro del array.
                *Dado que las respuestas y el orden de los nombres al principio del programa se han tenido que dar en el mismo orden,
                *utilizo dentro del array el valor del anterior for para no moverme de la posicion de donde se encuetra el alumno.
                */
				for(int j = 0; j < numpreguntas; j++){

                    //Compruebo si la respuesta en la posicion 'j' es la misma que en "respuestacorrecta" en la misma posicion.
					if(respuestaalumno[i][j] == (respuestascorrecta[j])){
						nota = nota + 1;
					}
				}
			}
		}

        //Muestro la nota del alumno en concreto.
		System.out.println("La nota del alumno "+ alumno + " es " + nota);
	}

    //Este metodo solo se utilizara para mostrar cual es la pregunta más acertada.
    public static void preguntaMasAcertada(char respuestacorrecta[], char respuestaalumno[][], int numpreguntas) {

		 	//Crea un arreglo para contar la cantidad de veces que cada respuesta fue seleccionada.
			int[] contarPregunta = new int[respuestacorrecta.length];

				//Recorre cada respuesta de los alumnos y compara con la respuesta correcta.
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < numpreguntas; j++){

					//Si la respuesta del alumno es igual a la respuesta correcta, incrementa el contador.
					if (respuestaalumno[i][j] == (respuestacorrecta[j])) {
						contarPregunta[j]++;
					}
				}
			}

			int masAcertada = 0;
			int masAcertadaIndex = 0;

			// Busca la respuesta con la mayor cantidad de selecciones
			for (int g = 0; g < contarPregunta.length; g++) {
				if (contarPregunta[g] > masAcertada) {
					masAcertada = contarPregunta[g];
					masAcertadaIndex = g;
				}
			}

			//Devuelve la respuesta correspondiente de las respuestas correctas
			System.out.println("La pregunta más acertada es la: "+ masAcertadaIndex);
	}
}