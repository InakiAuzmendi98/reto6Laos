package reto6;
import java.util.Scanner;
public class laos {


	public static void opcionInfoGeneral() {
		/**
		 * dentro de la información general muestra tres nuevas opciones 
		 * que se pueden consultar dentro de este apartado
		 */
		Scanner sc = new Scanner(System.in);
		int num;
		char rep;

		//do {
		do {
			System.out.println("---Elija la información que desea consultar--- \n 1. Las provincias y sus habitantes \n 2. Los festivos \n 3. Informacón y conversión de la moneda");
			num= sc.nextInt();
		}while(num<=0 || num>=4);

		switch (num) {
		case 1:
			ciudadesHabitantes();
			break;
		case 2:
			festivos();
			break;
		case 3:
			moneda();
			break;
		}
		sc.nextLine();
		/*do {
				System.out.println("¿Desea volver al menú? S/N");
				rep = sc.nextLine().toLowerCase().charAt(0);
			} while (rep != 's' && rep != 'n');
		}while(rep=='s');*/

	}

	public static void ciudadesHabitantes() {
		/**
		 * muestra todos las provincias de Laos y su información general
		 */
		String [][] ciudades= {
				{"1.- Prefectura de Vientián (CAPITAL)","Superficie: 3920 km² ---- Habitantes : 698 254"},
				{"2.- Provincia de Phongsali","Superficie: 16925 km² ---- Habitantes :199.900"},
				{"3.- Provincia de Luang Namtha","Superficie: 15370 km² ---- Habitantes :160.205"},
				{"4.- Provincia de Oudomxai","Superficie: 15370 km² ---- Habitantes :275.300"},
				{"5.- Provincia de Bokeo","Superficie: 6196 km² ---- Habitantes :162.071"},
				{"6.- Provincia de Luang Prabang","Superficie: 16875 km² ---- Habitantes: 407.012"},
				{"7.- Provincia de Houaphan","Superficie: 16500 km² ---- Habitantes: 295.749"},
				{"8.- Provincia de Sainyabuli","Superficie: 16389 km² ---- Habitantes: 382.200"},
				{"9.- Provincia de Xiangkhoang","Superficie: 15580 km² ---- Habitantes: 262.200"},
				{"10.- Provincia de Xaisomboun","Superficie: 8300 km² ---- Habitantes: 85.168"},
				{"11.- Provincia de Bolikhamxai","Superficie: 14863 km² ---- Habitantes: 258.292"},
				{"12.- Provincia de Khammouan","Superficie: 16315 km² ---- Habitantes: 367.562"},
				{"13.- Provincia de Savannakhet","Superficie: 21774 km² ---- Habitantes: 721.500"},
				{"14.- Provincia de Salavan","Superficie: 10691 km² ---- Habitantes: 336.600"},
				{"15.- Provincia de Sekong","Superficie: 7665 km² ---- Habitantes: 83.600"},
				{"16.- Provincia de Champasak","Superficie: 10320 km² ---- Habitantes: 650.460"},
				{"17.- Provincia de Attapu","Superficie: 3920 km² ---- Habitantes: 124.664"}


		};

		for(int i = 0; i < ciudades.length; i++) {
			for(int j = 0; j < ciudades[i].length; j++) {
				System.out.print(ciudades[i][j]);
			}
			System.out.println();
		}



		/*System.out.println("--Laos tiene una expansión de 236.800 Km2 con 7.425.057 de habitantes y se divide en 17 provincias: --");
		System.out.println();
		System.out.println("1.- Prefectura de Vientián (CAPITAL) ---- Superficie:	3920 km² ---- Habitantes : 698 254");
		System.out.println("2.- Provincia de Phongsali ---- Superficie: 16925 km² ---- Habitantes : 199 900");
		System.out.println("3.- Provincia de Luang Namtha ---- Superficie: 15370 km² ---- Habitantes : 160 205");
		System.out.println("4.- Provincia de Oudomxai ---- Superficie: 15370 km² ---- Habitantes : 275 300");
		System.out.println("5.- Provincia de Bokeo ---- Superficie:	6196 km² ---- Habitantes : 162 071");
		System.out.println("6.- Provincia de Luang Prabang ---- Superficie:	16875 km² ---- Habitantes : 407 012 hab");
		System.out.println("7.- Provincia de Houaphan ---- Superficie: 16500 km² ---- Habitantes : 295 749");
		System.out.println("8.- Provincia de Sainyabuli ---- Superficie: 16389 km² ---- Habitantes : 382 200 hab");
		System.out.println("9.- Provincia de Xiangkhoang ---- Superficie: 15580 km² ---- Habitantes : 262 200");
		System.out.println("10.- Provincia de Xaisomboun ---- Superficie: 8300 km² ---- Habitantes : 85 168");
		System.out.println("11.- Provincia de Bolikhamxai ---- Superficie: 14863 km² ---- Habitantes : 258 292");
		System.out.println("12.- Provincia de Khammouan ---- Superficie: 16315 km² ---- Habitantes : 367 562");
		System.out.println("13.- Provincia de Savannakhet ---- Superficie: 21774 km² ---- Habitantes : 721 500");
		System.out.println("14.- Provincia de Salavan ---- Superficie: 10691 km² ---- Habitantes : 336 600");
		System.out.println("15.- Provincia de Sekong ---- Superficie: 7665 km² ---- Habitantes : 83 600");
		System.out.println("16.- Provincia de Champasak ---- Superficie: 10320 km² ---- Habitantes : 650 460");
		System.out.println("17.- Provincia de Attapu ---- Superficie:	3920 km² ---- Habitantes : 124 664");
		 */
	}

	public static void festivos() {
		/**
		 * método que pide un mes al usuario y muestra la información guardada en este
		 */
		boolean encontrado = false;
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		String mes;
		Scanner sc = new Scanner(System.in);


		do {
			encontrado=false;
			System.out.println("Introduce un mes: ");
			mes = sc.nextLine().toLowerCase();

			for(int i = 0; i < meses.length; i++) {
				if(mes.equalsIgnoreCase(meses[i])) {
					encontrado = true;
				}
			}

			switch(mes) {
			case "enero":
				System.out.println("En enero se celebra el Pha Wet, una fiesta popular ligada a la tradición budista. Durante \nesta festividad se conmemora la vida de Buda como Príncipe Vestsantara. Se intercambian \ninvitaciones con los amigos y las familias entre los diferentes pueblos para participar \nen las celebraciones."
						+ "La gente se reúne en los templos para escuchar la historia recitada del Buda, también es un momento especialmente propicio para aquellos que deseen ser ordenados como monje.");
				break;
			case "febrero":
				System.out.println("El Magha Puja o Boun Ma Kha Bu Saar, tiene lugar en febrero, durante la luna llena. Dentro \nde las fiestas populares de Laos, esta fiesta conmemora el momento en el que más de mil \nmonjes acudieron a recibir de forma espontánea las enseñanzas originales de Buda."
						+ "\r\n"
						+"Durante el festival se realizan grandes desfiles, se portan velas y se rodea el templo. \nMientras, se recitan oraciones y canciones religiosas para obtener mérito ante el Buda.");
				break;
			case "marzo":
				System.out.println("Durante el mes de marzo tiene lugar el Boun Khoun Khao, la fiesta de la cosecha. En diferentes \npueblos del país, se celebran diferentes eventos para dar gracias por la abundancia \nde las cosechas.\r\n"
						+ "\r\n"
						+ "Por otro lado, el Boun Pi Mai es una de las festividades de Laos que tienen lugar durante el mes de abril. \nSe trata de la celebración del Año Nuevo de Laos y es una combinación perfecta entre \nalegría y meditación. Tienen lugar desfiles, bailes, cantos y se adornan las \nestatuas de Buda para las ceremonias del agua. Participar de esta celebración lleva consigo la buena fortuna y la salud.");
				break;
			case "abril":
				System.out.println("Durante el mes de marzo tiene lugar el Boun Khoun Khao, la fiesta de la cosecha. En diferentes \npueblos del país, se celebran diferentes eventos para dar gracias por la abundancia \nde las cosechas.\r\n"
						+ "\r\n"
						+ "Por otro lado, el Boun Pi Mai es una de las festividades de Laos que tienen lugar durante el mes \nde abril. Se trata de la celebración del Año Nuevo de Laos y es una combinación \nperfecta entre alegría y meditación. Tienen lugar desfiles, bailes, cantos y se adornan las estatuas de Buda para las ceremonias del agua. Participar de esta celebración \nlleva consigo la buena fortuna y la salud.");
				break;
			case "mayo":
				System.out.println("El festival Boun Bang Fai tiene sus orígenes en antiguas ceremonias de la lluvia. Esta es otra \nde las fiestas populares de Laos donde verás desfiles, bailes y cantos tradicionales. \nLa fiesta culmina con enormes cohetes de bambú que son bendecidos y disparados hacia el cielo para atraer a las lluvias.");
				break;
			case "junio":
				System.out.println("También durante el mes de junio y hasta entrado septiembre, se sigue celebrando el Boun Bang Fai \nen diferentes pueblos. Si viajas al país durante estos meses, podrás asistir a \nuna de las fiestas populares de Laos más alegres y divertidas.\r\n"
						+ "\r\n"
						+ "En julio, tiene lugar el festival Khao Phansaa, que marca el comienzo de los tres meses de la \ncuaresma budista. Esta festividad empieza con la luna llena en julio y continúa hasta \nla luna llena de octubre. Todo este período es propicio para hacerse monje, por ello es habitual que esté lleno de \nnumerosas ceremonias de ordenación.");
				break;
			case "julio":
				System.out.println("También durante el mes de junio y hasta entrado septiembre, se sigue celebrando el Boun Bang Fai \nen diferentes pueblos. Si viajas al país durante estos meses, podrás asistir a \nuna de las fiestas populares de Laos más alegres y divertidas.\r\n"
						+ "\r\n"
						+ "En julio, tiene lugar el festival Khao Phansaa, que marca el comienzo de los tres meses de la \ncuaresma budista. Esta festividad empieza con la luna llena en julio y continúa hasta \nla luna llena de octubre. Todo este período es propicio para hacerse monje, por ello es habitual que esté lleno de \nnumerosas ceremonias de ordenación.");
				break;
			case "agosto":
				System.out.println("En agosto los habitantes de Laos celebran el Boun Haw Khao Padap Din, una de las festividades de \nLaos más íntimas, pues está dedicada a recordar y presentar respeto a los familiares fallecidos.\r\n"
						+ "\r\n"
						+ "Quizás sea esta una de las fiestas populares más peculiares del país, pues durante ella, se \nlleva a cabo la exhumación de los cuerpos enterrados, para la limpieza de los restos. \nA continuación, se incineran bajo la luna llena. Los familiares de los fallecidos, entregan regalos a los monjes que han recitado el \nnombre de los fallecidos durante la ceremonia.");
				break;
			case "septiembre":
				System.out.println("En septiembre dentro de los eventos en Laos a los que puedes acudir, está el Boun Khao Salak. Este \nfestival acoge carreras de embarcaciones y ofrendas a los antepasados. También se organiza una feria agrícola con \npuestos de artesanía local, música y danza.");
				break;
			case "octubre":
				System.out.println("Podrás asistir al Boun Awk Phansaa si viajas a Laos en octubre. Esta celebración marca el final de \nlos tres meses de la cuaresma budista el día de la luna llena. Los monjes, que hasta entonces no \npodían salir de los templos, llevan regalos para sus familiares.\r\n"
						+ "\r\n"
						+ "En la víspera del Awk Phansaa podrás asistir a una de las fiestas populares de Laos con más \nencanto. Durante esa noche, la gente se reúne junto al río más cercano para liberar decenas de pequeñas\n embarcaciones de hojas de plátano decoradas con velas, incienso y flores.");
				break;
			case "noviembre":
				System.out.println("Noviembre es el mes del Boun That Luang, este festival se centra tradicionalmente en el That Luang \nen Vientiane. Numerosas ferias, concursos de belleza, música y fuegos artificiales se llevan a \ncabo durante toda la semana de la luna llena. \nLas celebraciones terminan en una procesión con velas alrededor del templo de That Luang.");
				break;
			case "diciembre":
				System.out.println("En diciembre se celebra el Día Nacional de Laos, concretamente el 2 de diciembre. \nSi viajas durante este mes a este hermoso país, ten en cuenta que muchos establecimientos pueden estar cerrados.\r\n"
						+ "\r\n"
						+ "Ya sólo tienes que anotar en tu calendario las fiestas populares de Laos que quieras \nconocer y planificar tu viaje para coincidir con ellas.");
				break;
			}
			if(!encontrado) {
				System.out.println("El mes introducido no es válido.");
			}
		}while(!encontrado);

	}

	public static void moneda() {
		/**
		 * método de transformación de la moneda
		 */
		int euro;
		float kip;
		Scanner sc = new Scanner(System.in);

		System.out.println("La moneda oficial de Laos es el kip laosiano (LAK). Aunque legalmente solo se puede \nutilizar el kip en las transacciones cotidianas, en realidad en el comercio se \nutilizan tres monedas: kips, bahts tailandeses(THB) y dólares estadounidenses(US$).");
		System.out.println();

		do {
			System.out.println("Introduce los Euros que quieres convertir en Kips: ");
			euro = sc.nextInt();
			if(euro<=0) {
				System.out.println("Error! Debe de ser una cantidad positiva");
			}
		}while(euro<=0);

		kip = euro* (float)22660.13;		

		System.out.println(euro+" , son "+kip+" kips.");


	}

	public static void imprimirBidis(String v[][]) {
		/**
		 * método de impresion de bidimensionales
		 */

		for(int i = 0; i < v.length; i++) {
			for(int j = 0; j < v[i].length;j++) {
				System.out.print(v[i][j]);
			}
			System.out.println();
		}
	}

	public static void quiz() {
		/**
		 * quiz de tipo a,b,c sobre la temática del programa
		 */
		int aciertos=0;
		char letra;
		Scanner sc = new Scanner(System.in);


		System.out.println("---Has elegido la opción de QUIZ---");


		do {
			System.out.println("Pregunta 1:\n¿Cómo se llama la moneda oficial de Laos?\na)Kit\nb)Kip\nc)Kin");
			letra=sc.nextLine().toLowerCase().charAt(0);
			if(letra!='a'&&letra!='b'&&letra!='c') {
				System.out.println("La letra introducida no está entre las opciones.");
			}
		}while(letra!='a'&&letra!='b'&&letra!='c');
		if(letra == 'b') {
			aciertos++;
		}

		do {
			System.out.println("Pregunta 2: \n¿Cómo se llama el festival que tiene lugar en Mayo?\na)Boun Bang Fai\nb)Awk Phansaa\nc)Khao Phansaa");
			letra=sc.nextLine().toLowerCase().charAt(0);
			if(letra!='a'&&letra!='b'&&letra!='c') {
				System.out.println("La letra introducida no está entre las opciones.");
			}
		}while(letra!='a'&&letra!='b'&&letra!='c');
		if(letra == 'a') {
			aciertos++;
		}

		do {
			System.out.println("Pregunta 3: \n¿Cuál es la capital de Laos?\na)Provincia de Attapu\nb)Povincia de Vientián\nc)Provincia de Sekong");
			letra=sc.nextLine().toLowerCase().charAt(0);
			if(letra!='a'&&letra!='b'&&letra!='c') {
				System.out.println("La letra introducida no está entre las opciones.");
			}
		}while(letra!='a'&&letra!='b'&&letra!='c');
		if(letra == 'b') {
			aciertos++;
		}

		do {
			System.out.println("Pregunta 4: \n¿En qué año se construyó el monumento Buddha Park?\na)1932\nb)1807\nc)1958");
			letra=sc.nextLine().toLowerCase().charAt(0);
			if(letra!='a'&&letra!='b'&&letra!='c') {
				System.out.println("La letra introducida no está entre las opciones.");
			}
		}while(letra!='a'&&letra!='b'&&letra!='c');
		if(letra == 'c') {
			aciertos++;
		}

		do {
			System.out.println("Pregunta 5: \n¿Qué tipo de instrumento es el Khouy?\na)Viento\nb)Cuerda\nc)Percusión");
			letra=sc.nextLine().toLowerCase().charAt(0);
			if(letra!='a'&&letra!='b'&&letra!='c') {
				System.out.println("La letra introducida no está entre las opciones.");
			}
		}while(letra!='a'&&letra!='b'&&letra!='c');
		if(letra == 'a') {
			aciertos++;
		}

		do {
			System.out.println("Pregunta 6: \n¿Cuál es el cuento más antiguo de la historia de Laos?\na)Dhammapada\nb)Jataka\nc)La Route");
			letra=sc.nextLine().toLowerCase().charAt(0);
			if(letra!='a'&&letra!='b'&&letra!='c') {
				System.out.println("La letra introducida no está entre las opciones.");
			}
		}while(letra!='a'&&letra!='b'&&letra!='c');
		if(letra == 'b') {
			aciertos++;
		}

		do {
			System.out.println("Pregunta 7: \n¿Cuál fue el evento histórico ocurrido en Laos en el año 1975?\na)La independencia de Laos.\nb)La ocupación japonesa durante la Segunda Guerra Mundial.\nc)El derrocamiento del gobierno monárquico por el comunista Pathet Lao.");
			letra=sc.nextLine().toLowerCase().charAt(0);
			if(letra!='a'&&letra!='b'&&letra!='c') {
				System.out.println("La letra introducida no está entre las opciones.");
			}
		}while(letra!='a'&&letra!='b'&&letra!='c');
		if(letra == 'c') {
			aciertos++;
		}

		do {
			System.out.println("Pregunta 8: \n¿Qué evento ocurrió en Laos en el año 1994?\na)La inauguración del Puente de la Amistad sobre el río Mekong.\nb)La firma de acuerdos con Vietnam para finalizar las relaciones con China.\nc)El levantamiento del embargo de veinte años por parte de Estados Unidos.");
			letra=sc.nextLine().toLowerCase().charAt(0);
			if(letra!='a'&&letra!='b'&&letra!='c') {
				System.out.println("La letra introducida no está entre las opciones.");
			}
		}while(letra!='a'&&letra!='b'&&letra!='c');
		if(letra == 'a') {
			aciertos++;
		}

		do {
			System.out.println("Pregunta 9: \n¿Cuál de las siguientes afirmaciones es correcta sobre Laos?\na)Laos es un país sin relaciones comerciales con otros países.\nb)Laos limita con China, Vietnam, Myanmar y Corea del Norte.\nc) La mayoría de la población de Laos pertenece a la etnia lao.");
			letra=sc.nextLine().toLowerCase().charAt(0);
			if(letra!='a'&&letra!='b'&&letra!='c') {
				System.out.println("La letra introducida no está entre las opciones.");
			}
		}while(letra!='a'&&letra!='b'&&letra!='c');
		if(letra == 'c') {
			aciertos++;
		}

		do {
			System.out.println("Pregunta 10: \n¿Cuál era el objetivo principal de la Operación Estrella Blanca realizada por \nEstados Unidos en Laos?\na)Promover la independencia de Laos.\nb) Eliminar bases norvietnamitas en Laos.\nc)Proteger la monarquía en Laos.");
			letra=sc.nextLine().toLowerCase().charAt(0);
			if(letra!='a'&&letra!='b'&&letra!='c') {
				System.out.println("La letra introducida no está entre las opciones.");
			}
		}while(letra!='a'&&letra!='b'&&letra!='c');
		if(letra == 'b') {
			aciertos++;
		}

		System.out.println("Has acertado: "+aciertos+"/10");

	}

	public static int pedirNumero() {
		/**
		 * método para que el usuario solicite la información que desea.
		 */
		Scanner sc = new Scanner (System.in);
		int num;

		System.out.println("Has elegido ver información acerca del arte en Laos.");
		do{
			System.out.println("Elige una de estas cuatro opciones o introduce 0 si desea salir:");
			System.out.println("1. MONUMENTOS \n2. MÚSICA \n3. LITERATURA ");
			num = sc.nextInt();
			if(num <1 || num >3) {
				System.out.println("ATENCIÓN. Debe introducir un número del 1 al 3");
			}
		}while (num <1 || num >3);
		return num;
	}

	public static void imprimirInfo(int o, String [][] monum, String [][] musica, String [][] liter) {
		/**
		 * método para imprimir la información de la matriz
		 */
		switch (o) {
		case 1:
			imprimirMatriz(monum);
			break;
		case 2:
			imprimirMatriz(musica);
			break;
		case 3:
			imprimirMatriz(liter);
			break;

		}
	}

	public static String [][] creaRellenaMonumentos(){
		/**
		 * método que crea y rellena el array bidimensional de monumentos
		 */
		String[][] mon = { {"--BUDDHA PARK--: ", "Construido en 1958. A orillas del Río Mekong, a 25km de Vientiane (capital de RDP de Laos)"}, 
				{"--PATUXAI--: ", "Construido en el 1968 por el rey Sisavang Vatthana. Monumento a la Memoria a los héroes caídos por la independencia del país durante la II Guerra Mundial.  "}, 
				{"--THAT DAM--: ", "Monumento religioso del siglo XVI. Se cree que en ella habita un dragón de 7 cabezas que protege la estupa de piedra."}, 
				{"--WAT THAT LUANG NEUA--: ", "Construida en 1566 por el rey Setthathirat, es una pirámide dorada de 45 metros formada por 3 niveles, que según la filosofía budista, forman las 3 etapas del ascenso desde la tierra a los cielos."}, 
				{"--PHAT THAT LUANG--: ", "Es una estupa budista recubierta de oro del siglo III. Se considera el monument más importante de Laos y Símbolo Nacional."}, 
		};
		return mon;
	}
	public static String [][] creaRellenaMusica(){
		String[][] mus = { {"--KHENE--: ", "Este instrumento de viento es la base de la música laosiana. Una serie de palos de bambú de diferentes longitudes que forman una especie de Zampoña peruana."}, 
				{"--KHOUY--: ", "Un instrumento de viento de bambú parecido a una flauta tradicional."}, 
				{"--SAW--: ", "Instrumento de cuerda, una especie de violín de dos cuerdas que se toca de manera vertical."}, 
				{"--NONG NAT--: ", "Este instrumento de percusión es un xilófono de bambú con forma de barco."}, 
				{"--KHON VONG--: ", "Este instrumento es una serie de dieciséis palillos golpeados por un martillo tapizado de tela."}, 
		};
		return mus;
	}
	public static String [][] creaRellenaLiteratura(){
		String[][] lit = { {"--JATAKA--: ", "El más antiguo. Transmitido oralmente desde antes del sigo XV, cuenta los relatos de las 547 vidas pasadas del Buda en sus formas animales, humanas o divinas"}, 
				{"--DHAMMAPADA--: ", "Uno de los textos fundadores del Tipitaka, el canon pali del nombre de la lengua cercana al sánscrito que se utiliza con fines litúrgicos en Laos."}, 
				{"--LA ROUTE--: ", "2003. Un testimonio sobre el gulag Laosiano y la guerra de independecia del país."}, 
				{"--AU REVOIR PAYS--: ", "2010. Cuenta que tras 25 años de guerra civil, el cambio de régimen obligó a una familia a abandonar su tierra natal por los suburbios parisinos "}, 
				{"--IMPRUDENCE--: ", "2019. Retrata a un fotógrafo que regresa por primera vez a Savannakhet para asistir al funeral de su abuela"}, 
		};
		return lit;
	}

	public static void imprimirMatriz(String [][] array) {
		/**
		 * método de impresion de bidimensionales
		 */
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}

	public static void evoHistArt() {
		/**
		 * llamada a todos los métodos que cumplimentan el método de evoHistArt
		 */
		int opcion;
		String [][] monumentos, musica, literatura; 

		opcion = pedirNumero();
		monumentos = creaRellenaMonumentos();
		musica = creaRellenaMusica();
		literatura = creaRellenaLiteratura();


		imprimirInfo(opcion, monumentos, musica, literatura);
	}

	public static int pideDias() {
		/**
		 * método para solicitar los diás al usuario
		 */
		int d;
		Scanner sc = new Scanner (System.in);

		do {
			System.out.println("¿Cuántos días va a pasar en Laos?");
			d = sc.nextInt();
		}while(d<=0);

		return d;
	}

	public static String [][] creaArraySiete (){
		String[][] siete = {{"Día 1: ", "VIENTIANE. Wat Si Saket a la mañana y paseo en canoa por el río Mekong a la tarde."},
				{"Día 2: ", "VIENTIANE. Monumento Patuxai a la mañana y el mercado Ban Anou de noche."},
				{"Día 3: ", "VANG VIENG. Viaje a Vang Vieng a la mañana y kayak a la tarde."},
				{"Día 4: ", "VANG VIENG. Visita  Tham Chang Cave y Blue Lagoon todo el día."},
				{"Día 5: ", "LUANG PRABANG. Viaje a Luang Prabang a la mañana y visita a las cataratas Kuang Si a la tarde."},
				{"Día 6: ", "LUANG PRABANG. Madruga para presenciar la ceremomia de Alms Giving, luego el Palacio Real y el Phousi Hill al anochecer."},
				{"Día 7: ", "LUANG PRABANG. Visita las cuevas Pak Ou por el río Mekong y las aldeas Ban Xanghai y Ban Xienglek de tarde."},};
		return siete;
	}

	public static String [][] creaArrayCatorce (){
		String[][] catorce = {{"Días 1-3: ", "VIENTIANE. Wat Si Saket, monumento Patuxai y el centro COPE."},
				{"Días 4-6: ", "VANG VIENG. Las cuevas Tham Chang, Blue Lagoon, ruta en globo por Pha Poak y las aldeas locales."},
				{"Días 7-10: ", "LUANG PRABANG. Las cataratas Kuang Si, la ceremonia de los monjes Alms Giving y paseo en barco por las cuevas Pak Ou, y aprende de la cocina de Laos en Wat Xieng."},
				{"Días 11-14: ", "LUANG NAMTHA. Senderismo por el Parque Nacional Nam Ha, viaja a Mua Sing a visitar los monumentos locales y disfruta cerca de aldeas de minorías étnicas de Laos."}};
		return catorce;
	}
	public static String [][] creaArrayVeintiuno (){
		String[][] veintiuno = {{"Días 1-4: ", "VIENTIANE. Visita todos los monumentos mencionados en el apartado Arte y Monumentos de Laos."},
				{"Días 5-8: ", "VANG VIENG. Cuevas Tham Chang, tour en globo por el río Nam Song, sube al mirador Pha Poak y disfruta de la cocina local para terminar."},
				{"Días 9-12: ", "LUANG PRABANG. Cataratas Kuang Si y mercado de noche, Palacio Real, ve por el río Mekong a Pak Ou y por último día entero en Wat Xieng Thong."},
				{"Días 13-17: ", "AVENTURA LAOS NORTE. Sube al Nong Khiaw, después ruta a Muang Ngoi Neua por el río Nam Ou y vuelve a Luang Prabang para disfrutar de la noche y atardecer."},
				{"Días 18-21: ", "EXPLORACIÓN LAOS SUR. Viaja a Pakse para visitar el Wat Phou, patrimonio de la UNESCO, después las ilas Si Phan Don y otro viaje en barco a ver los delfines Irrawaddy."}};
		return veintiuno;
	}
	public static String [][] creaArrayTreinta (){
		String[][] treinta = {{"Días 1-10: ", "LAOS NORTE. Luang Prabang, Nong Khiawy y la provincia Phongsali."},
				{"Días 11-18: ", "LAOS CENTRAL. Vientiane, Thakhek Loop y las cuevas Kong Lor."},
				{"Días 19-30: ", "LAOS SUR. Pakse, Don Det, Don Khon y y las cataratas Khone Phapheng."}
		};
		return treinta;
	}


	public static void imprimirArray (String [][] array ) {
		/**
		 * impresión de array bidimensional
		 */
		for(int i = 0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.println(array[i][j]);
			}
			System.out.println();
		}
	}

	public static void guiaTuristica() {
		/**
		 * solicita los días al usuario para mostrar lo que se puede hacer dentro de la franja de los dias introducidos
		 */
		int dias;
		String [][] siete, catorce, veint, treinta;
		System.out.println("Has elegido la opción de Guía Turística: \nA continuación, indique los días que va a pasar en el país y le ofreceremos diferentes opciones de visita.");
		dias = pideDias();

		siete = creaArraySiete();
		catorce = creaArrayCatorce();
		veint = creaArrayVeintiuno();
		treinta = creaArrayTreinta();

		if(dias >0 && dias <=7) {
			System.out.println("***Aquí tiene el itinerario para estar entre 2 y 7 días en Laos***");
			imprimirArray(siete);
		}else if(dias >7 && dias <=14){
			System.out.println("***Aquí tiene el itinerario para estar entre 8 y 14 días en Laos***");
			imprimirArray(catorce);
		}else if (dias > 14 && dias <=21) {
			System.out.println("***Aquí tiene el itinerario para estar entre 15 y 21 días en Laos***");
			imprimirArray(veint);
		}else if (dias >21 && dias <=30) {
			System.out.println("***Aquí tiene el itinerario para estar entre 22 y 30 días en Laos***");
			imprimirArray(treinta);
		}else {
			System.out.println("Lo siento, el máximo de días para montar el itinerario es de 30 días.");
		}
	}

	public static void calendario() {
		/**
		 *  método que muestra el calendario de los festivos de Laos
		 */
		int numMes;
		char continuar;
		String[][] calendario = null;
		Scanner sc = new Scanner(System.in);

		do {
			do {
				System.out.println("Introduce el número del mes para que te muestre los festivos:");
				numMes = sc.nextInt();

				if(numMes<1 || numMes>12) {
					System.out.println("Error. Introduce un número entre 1 y 12");
				}
			}while(numMes<1 || numMes>12);

			/**
			 * todos los meses en un switch para visualizar el mes seleccionado
			 */
			switch(numMes) {
			case 1:
				calendario = new String [][] {
					{"1", "Año nuevo internacional"},
					{"6", "Aniversario Pathet Lao" },
					{"20", "Aniversario del ejército de Laos"}
				};
				break;

			case 2:
				calendario = new String [][] {
					{"10", "Año nuevo Chino y Vietnamita"},
					{"12 - 18", "Festival de los elefantes en Sayaboury"},
					{"21", "Día internacional de la lengua materna."},
					{"Durante la luna llena del tercer mes del calendario laosiano", "--> El Festival de Wat Phu"},
					{"Durante la luna llena del tercer mes del calendario laosiano", "--> El festival de la estupa de Sikhottabong"}
				};
				break;

			case 3:
				calendario = new String [][] {
					{"1", "Día internacional del trabajo."},
					{"8", "Día internacional de la mujer."}
				};
				break;

			case 4: 
				calendario = new String [][] {
					{"7", "Día mundial de la salud."},
					{"13 - 15", "Año nuevo laosiano 'Pi May'."}
				};			
				break;

			case 5:
				calendario = new String [][] {
					{"1", "Día internacional del trabajo."},
					{"Sin especificar", "--> Bun Bang Fai: El festival de los cohetes"}
				};
				break;

			case 6:
				calendario = new String [][] {
					{"1", "Día del niño."},
					{"Sin especificar", "--> Bun Bang Fai: El festival de los cohetes"}
				};
				break;

			case 7:
				calendario = new String [][] {
					{"19", "Día de la independencia de Francia."},
					{"21", "Boun Khao Phansa --> El comienzo del retiro de los monjes budistas."}
				};
				break;

			case 8:
				calendario = new String [][] {
					{"13", "Lao Issara day"},
					{"4 últimos días del mes", "El festival del columpio Akha"}
				};
				break;

			case 9:
				calendario = new String [][] {
					{"Durante la luna nueva del décimo mes del calendario laosiano", "--> Fiesta de las carreras de barcas en el río Nam Khan de Luang Prabang durante el festival Khao Phadabdin"}		
				};
				break;

			case 10:
				calendario = new String [][] {
					{"17", "Bun OK Phansa --> Fin del retiro de los monjes budistas."},
					{"28", "Festival del Boat Racing en Luang Prabang."}
				};
				break;

			case 11:
				calendario = new String [][] {
					{"1", "Festival del Boun That Luang en Vietnae"}
				};
				break;

			case 12: 
				calendario = new String [][] {
					{"2", "Día nacional de Laos."}
				};
				break;

			default:
				System.out.println("No hay festivos este mes.");
				break;
			}

			/**
			 * Imprimir calendario 
			 */
			System.out.println("Dia y festivo del mes:");
			for (int i = 0; i < calendario.length; i++) {
				for (int j = 0; j < calendario[i].length; j++) {
					System.out.print(calendario[i][j] + " ");
				}
				System.out.println();
			}
			sc.nextLine();
			System.out.println("Desea consultar otro mes? (S/N)");
			continuar = sc.next().toLowerCase().charAt(0);

		}while(continuar == 's');

		System.out.println("Fin del calendario.");
		
	}

	public static void cultura() {
		/**
		 * / Matriz que representa la cultura laosiana
		 */
		String[][] culturaLaosiana = {
				// Aspectos culturales
				{"Budismo Theravada", "Forma de vida y costumbres", "Festivales importantes"},
				// Detalles sobre el Budismo Theravada
				{"El budismo es una parte fundamental de la cultura laosiana. A través del budismo Theravada, Laos ha sido influenciada por la India y también refleja aspectos de la cultura china. Esta influencia se manifiesta en la lengua, el arte, la literatura, la música y otras expresiones artísticas en todo el país."},
				// Detalles sobre la forma de vida y costumbres
				{"El budismo ha dejado una huella profunda en la forma de vida de los laosianos. Se les enseña a ser pacientes y abiertos. Además, el budismo ha servido como un elemento unificador y ha fomentado la bondad y la evitación de acciones perjudiciales, especialmente en épocas antiguas cuando no existían leyes o medios para hacer cumplir las normas."},
				// Detalles sobre festivales importantes
				{"Uno de los festivales más significativos en Laos es el Boun Pha Vet, que se celebra una vez al año. Este festival budista dura dos días y reúne a toda la comunidad. Durante la ceremonia, los monjes de la Sangha pronuncian sermones sobre los capítulos del Vessantara Jataka, también conocido como el Gran Sermón del Nacimiento."},

				// Aspectos de las vestimentas tradicionales
				{"Vestimentas tradicionales de Laos: "},
				// Detalles sobre las vestimentas para hombres
				{"Para Hombres:\n- El traje tradicional está hecho de tela de seda de Laos y se corta al estilo laosiano.\n- A menudo, los hombres llevan una camisa de seda y pantalones largos, ambos con detalles bordados o tejidos.\n- En ocasiones formales, pueden usar un sinh (falda) de seda."},
				// Detalles sobre las vestimentas para mujeres
				{"Para Mujeres:\n- El traje tradicional está confeccionado con tela de seda de Laos.\n- La blusa laosiana tradicional se llama sinh phi, y se combina con una falda de seda.\n- Las mujeres a menudo adornan sus trajes con joyas y accesorios tradicionales."}
		};

		// Mostrar aspectos culturales y detalles sobre las vestimentas tradicionales
		for (int i = 0; i < culturaLaosiana.length; i++) {
			System.out.println("-----------------------------------------");
			for (int j = 0; j < culturaLaosiana[i].length; j++) {
				System.out.println(culturaLaosiana[i][j]);
			}
		}
	}

	/**
	 * Imprime las opciones para insertar y obtener informacion de ese año
	 */
	public static void imprimirOpciones() {
		System.out.println("Ingresa un número para obtener información sobre Laos:");
		System.out.println("1. Año 1893");
		System.out.println("2. Año 1945");
		System.out.println("3. Año 1955-1974");
		System.out.println("4. Año 1975");
		System.out.println("5. Año 1979");
		System.out.println("6. Año 1994");
		System.out.println("7. Año 1995");
		System.out.println("8. Informacion generica");	
	}

	/**
	 * Pide un numero y lo verifica que sea valido
	 */
	public static int pedirNumero1() {
		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println();
		do {
			System.out.println("Introduce un numero del 1 al 8.\nIntroduzca 0 si desea finalizar.");
			opcion = sc.nextInt();
			sc.nextLine();
		}while(opcion<0||opcion>8);
		return opcion;
	}

	/**
	 * Llama a los metodos mientras el numero sea valido
	 */
	public static void informacion() {
		int opcion;
		do {
			opcion=pedirNumero1();
			seleccionado(opcion);
			/**
			 * validacion del numero
			 */
		}while(opcion>0&&opcion<8);
	}



	/**
	 * Segun el numero introducido te da una informacion o otra
	 */
	public static void seleccionado(int opcion) {
		/**
		 * valora el numero introducido y muestra la información relacionada
		 */
		switch(opcion) {
		case 0:
			break;
		case 1:
			System.out.println("Año 1893: El rey de Siam les cedió a ellos las tierras hoy conocidas como Laos, y éstas fueron incorporadas a la Indochina Francesa en 1893.");
			break;
		case 2:
			System.out.println("Año 1945: Tras una breve ocupación japonesa durante la Segunda Guerra Mundial, el país declaró su independencia en 1945, pero los franceses reafirmaron su control y sólo en 1950 Laos obtuvo una semi-autonomía como un «estado asociado» dentro de la Unión Francesa.");
			break;
		case 3:
			System.out.println("Año 1955-1974: Las tensiones políticas en el vecino Vietnam arrastraron a Laos a la Segunda Guerra de Indochina, un factor desestabilizante que contribuyó a la guerra civil y varios golpes de Estado. El ejército norvietnamita invadió y ocupó porciones del este de Laos.");
			System.out.println("El ejército norvietnamita, con sus potentes armas incluyendo artillería pesada y carros de combate fue el auténtico poder detrás de la insurgencia de Pathet Lao.");
			System.out.println("Significantes bombardeos aéreos por Estados Unidos se sucedieron con la intención de este país de eliminar bases norvietnamitas en Laos e interrumpir las líneas de abastecimiento en el sendero Ho Chi Minh.");
			System.out.println("Estados Unidos intervinó en forma oculta a través de la Operación Estrella Blanca.");
			break;
		case 4:
			System.out.println("Año 1975: El comunista Pathet Lao, respaldado por la Unión Soviética y el ejército norvietnamita, derrocó al gobierno monárquico, forzando al rey Savang Vatthana a abdicar el 2 de diciembre de 1975.");
			System.out.println("Después de tomar el control del país, lo renombraron a República Democrática de Lao.");
			System.out.println("Posteriormente el gobierno de Pathet Lao firmó acuerdos dando a Vietnam el derecho de destinar fuerzas militares y designar asesores para ayudar a supervisar el país.");
			System.out.println("Entonces Pathet Lao pudo fundar la República Popular de Laos, aboliendo la monarquía.");
			System.out.println("Sin embargo las tropas vietnamitas no se retiraron sino hasta 1990.");
			break;
		case 5:
			System.out.println("Año 1979: Emigraron refugiados laosianos hmong a Argentina producto de la violencia y represión en su país.");
			System.out.println("Arribaron al Valle Medio procedentes del medio rural de las tierras altas de Laos, lograron paulatinamente, pese al shock del cambio, con el tiempo una inserción en la actividad económica agrícola regional como eficientes horticultores.");
			break;
		case 6:
			System.out.println("Año 1994: Fue inaugurado el Puente de la Amistad sobre el río Mekong, uniendo a Laos y Tailandia y sellando la reconciliación entre ambos pueblos.");
			System.out.println("Laos fue ordenado a finales de los años 70 por Vietnam de finalizar las relaciones con China, esto cortó el comercio con cualquier país excepto Vietnam.");
			break;
		case 7:
			System.out.println("Año 1995: Fue levantado el embargo de veinte años por los Estados Unidos.");
			System.out.println("Estados Unidos estableció relaciones de comercio normales con Laos en noviembre de 2004.");
			break;
		case 8:
			System.out.println("Laos, oficialmente República Democrática Popular Lao,es un país sin salida al mar del sureste asiático. ");
			System.out.println("Limita con Myanmar al noroeste; con China al norte; con Vietnam al este; con Camboya al sur y con Tailandia al oeste.");
			System.out.println();
			System.out.println("El territorio actual de Laos perteneció al reino de Lan Xang (Tierra del millón de elefantes) entre los siglos XIV y XVIII. Tras el periodo colonial, en el que el país fue colonia francesa, consiguió la independencia en 1949.");
			System.out.println("Tras la independencia se produjo una guerra civil que terminó en 1975 con el ascenso al poder de los comunistas del Pathet Lao.");
			System.out.println("El país tiene una gran variedad étnica, pero el 70% pertenece a la etnia lao. El término lao también es usado para referirse a la lengua dominante y oficial del país, también se habla francés.");
			System.out.println("Siglo XIV La historia de Laos se remontan al reino de Lan Xang, fundado en el siglo XIV, que duró hasta el siglo XVIII, cuando Siam invadió y asumió el control de los principados separados que quedaban.");
			break;
		default:
			System.out.println("Opción no válida.");
		}

	}

	public static void historiaLaos() {
		/**
		 * método que une los dos métodos necesarios para mostrar la historia de Laos
		 */
		imprimirOpciones();
		informacion();
	}


	public static void eleccion() {
		/**
		 * método utilizado para guardar todos los métodos anteriormente descritos
		 * con una repetición al final para volver a visualizar el programa completo
		 * si así el usuario lo desea.
		 */
		int num;
		char repetir;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("---¿Qué desea consultar?---\n1.Información general\n2.Evolución e historia del arte\n3.Guía turística\n4.Calendario de festivos\n5.Cultura\n6.Historia de Laos\n7.Quiz");
			num = sc.nextInt();
			sc.nextLine();

			switch(num) {
			case 1:
				opcionInfoGeneral();
				break;
			case 2:
				evoHistArt();
				break;	
			case 3:
				guiaTuristica();
				break;
			case 4:
				calendario();
				break;
			case 5:
				cultura();
				break;
			case 6:
				historiaLaos();
				break;
			case 7:
				quiz();
			}

			do {
				System.out.println("¿Desea volver al menú? S/N");
				repetir = sc.nextLine().toLowerCase().charAt(0);
			} while (repetir != 's' && repetir != 'n');
		}while(repetir=='s');

	}




	public static void main(String[] args) {
		/**
		 * main sencillo para que quede lo más limpio posible. Era posible introducir
		 * el método eleccion() direcamente sin ser un método pero lo hemos dejado así
		 * para introducir todo el código en métodos.
		 */
		eleccion();

	}

}
