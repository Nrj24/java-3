import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class preMenu {
    // Variables
    Scanner scanner = new Scanner(System.in);
    private static int eleccion;
    private static int diaN;
    private static int mesN;
    private static int anioN;
    private long diasConver;
    private long diasTotal;
    private int resultado = 0;
    private int resultado2 = 0;

    //Colores de consola
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // Constructores
    public preMenu() {
    }

    public preMenu(int diaN, int mesN, int anioN, long diasTotal) {
        preMenu.diaN = diaN;
        preMenu.mesN = mesN;
        preMenu.anioN = anioN;
        this.diasTotal = diasTotal;
    }

    public preMenu(int diaN, int mesN) {
        preMenu.diaN = diaN;
        preMenu.mesN = mesN;
    }

    public preMenu(int diaN, int mesN, int anioN) {
        preMenu.diaN = diaN;
        preMenu.mesN = mesN;
        preMenu.anioN = anioN;
    }
//____________________________________________________________________________________________________
//____________________________________________________________________________________________________

    // Metodos

    // sleeper hace que el programa se tarde 3 segundos para que se siga ejecutando
    public void sleeper() {
        try {
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // menuMain es el menu principal que se muestra en consola
    public void menuMain() {
        System.out.println("");
        System.out.println(ANSI_RESET + "");

        System.out.println(
                "//////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println(ANSI_PURPLE + "|-----------------------------------------|");
        System.out.println("|  Escoge una de las siguientes opciones  |");
        System.out.println("|-----------------------------------------|" + ANSI_RESET);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("1. Si quieres calcular tu signo del zodiaco de forma exacta");
        System.out.println("");
        System.out.println("2. Si quieres saber cuantos dias has vivido en toda tu existencia");
        System.out.println("");
        System.out.println("3. Si quieres saber cuantos años tendrias si fueras un perro");
        System.out.println("");
        System.out.println("4. Si quieres saber tu numerologia");
        System.out.println("");
        System.out.println("5. Si quieres salir :(");
        System.out.println("-----------------------------------------------------------------------");
        int eleccion = scanner.nextInt();
        setEleccion(eleccion);
    }

    // eleccion Toma la eleccion del usuario
    public void eleccion() {
        switch (eleccion) {
            case 1:
                preMenu calcular = new preMenu(getDiaN(), getMesN());
                calcular.calculaTuZodiaco();
                break;
            case 2:
                preMenu diasViv = new preMenu(getDiaN(), getMesN(), getAnioN());
                diasViv.diasSufridos();
                break;
            case 3:
                preMenu diasConver = new preMenu(getDiaN(), getMesN(), getAnioN());
                diasConver.aniosPerro();
                break;
            case 4:
                preMenu numolo = new preMenu(getDiaN(), getMesN());
                numolo.calNumerologia();
                break;
            case 5:
                System.out.println("Te extrañaremos, esperamos verte pronto");
                System.exit(0);
        }
        preMenu repetir = new preMenu();
        repetir.repetir();
    }

    // setea la fecha de nacimiento
    public void setear() {
        System.out.println("▀▄▀▄▀▄ Ahora danos tu fecha de nacimeinto en numeros por favor ▄▀▄▀▄▀");
        System.out.println("");
        System.out.println("Digite su dia de nacimiento");
        int dia = scanner.nextInt();
        System.out.println("");
        System.out.println("Digite su mes de nacimiento");
        int mes = scanner.nextInt();
        System.out.println("");
        System.out.println("Digite su año de nacimiento");
        int anio = scanner.nextInt();
        System.out.println("");
        setDiaN(dia);
        setMesN(mes);
        setAnioN(anio);
    }

    // repetir hace que el progrma se vuelva a ejecutar o se termine
    public void repetir() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Deseas volver al menu");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("1. Si");
        System.out.println("2. No salir");
        int eleccion2 = scanner.nextInt();
        if (eleccion2 == 1) {
            menuMain();
            setear();
            eleccion();
        } else if (eleccion2 == 2) {
            System.out.println("**********************************");
            System.out.println("| Te extrañaremos, Vuelve Pronto |");
            System.out.println("**********************************");
        }
    }

    // calcula dia zodiaco
    public void calculaTuZodiaco() {
        if (diaN > 31 || diaN < 1) {
            System.out.println("Te saliste del rango :( ");
        } else if (mesN > 12 || mesN < 1) {
            System.out.println("Te saliste del rango");
        } else {
            switch (mesN) {
                // Enero
                case (1):
                    if (diaN >= 1 && diaN <= 20) {
                        System.out.println("_______________________");
                        System.out.println("| Tu eres Capricornio |");
                        System.out.println("|_____________________|");
                    } else if (diaN >= 21 && diaN <= 31) {
                        System.out.println("_______________________");
                        System.out.println("| Tu signo es Acuario |");
                        System.out.println("|_____________________|");
                    }
                    break;
                // Febrero
                case (2):
                    if (diaN >= 1 && diaN <= 19) {
                        System.out.println("___________________");
                        System.out.println("| Tu eres Acuario |");
                        System.out.println("|_________________|");

                    } else if (diaN >= 20 && diaN <= 28) {
                        System.out.println("__________________");
                        System.out.println("| Tu eres piscis |");
                        System.out.println("|________________|");

                    } else {
                        System.out.println("______________________________________________");
                        System.out.println("| Eres un Dios naciste un dia que no existe! |");
                        System.out.println("|____________________________________________|");
                    }
                    break;
                // Marzo
                case (3):
                    if (diaN >= 1 && diaN <= 20) {
                        System.out.println("_________________");
                        System.out.println("| Tu eres Piscis |");
                        System.out.println("|________________|");
                    } else if (diaN >= 21 && diaN <= 31) {
                        System.out.println("_________________");
                        System.out.println("| Tu eres Aries |");
                        System.out.println("|_______________|");
                    }
                    break;
                // Abril
                case (4):
                    if (diaN >= 1 && diaN <= 20) {
                        System.out.println("_________________");
                        System.out.println("| Tu eres Aries |");
                        System.out.println("|_______________|");
                    } else if (diaN >= 21 && diaN <= 30) {
                        System.out.println("_________________");
                        System.out.println("| Tu eres Tauro |");
                        System.out.println("|_______________|");
                    } else {
                        System.out.println("______________________________________________");
                        System.out.println("| Eres un Dios naciste un dia que no existe! |");
                        System.out.println("|____________________________________________|");
                    }
                    break;
                // Mayo
                case (5):
                    if (diaN >= 1 && diaN <= 21) {
                        System.out.println("_________________");
                        System.out.println("| Tu eres Tauro |");
                        System.out.println("|_______________|");
                    } else if (diaN >= 22 && diaN <= 31) {
                        System.out.println("___________________");
                        System.out.println("| Tu eres Geminis |");
                        System.out.println("|_________________|");
                    }
                    break;
                // Junio
                case (6):
                    if (diaN >= 1 && diaN <= 21) {
                        System.out.println("___________________");
                        System.out.println("| Tu eres Geminis |");
                        System.out.println("|_________________|");
                    } else if (diaN >= 22 && diaN <= 30) {
                        System.out.println("__________________");
                        System.out.println("| Tu eres Cancer |");
                        System.out.println("|________________|");
                    } else {
                        System.out.println("______________________________________________");
                        System.out.println("|naciste un dia que no existe! |");
                        System.out.println("|____________________________________________|");
                    }
                    break;
                // Julio
                case (7):
                    if (diaN >= 1 && diaN <= 22) {
                        System.out.println("__________________");
                        System.out.println("| Tu eres Cancer |");
                        System.out.println("|________________|");
                    } else if (diaN >= 23 && diaN <= 31) {
                        System.out.println("_______________");
                        System.out.println("| Tu eres Leo |");
                        System.out.println("|_____________|");
                    }
                    break;
                // Agosto
                case (8):
                    if (diaN >= 1 && diaN <= 23) {
                        System.out.println("_______________");
                        System.out.println("| Tu eres Leo |");
                        System.out.println("|_____________|");
                    } else if (diaN >= 24 && diaN <= 31) {
                        System.out.println("_________________");
                        System.out.println("| Tu eres Virgo |");
                        System.out.println("|_______________|");
                    }
                    break;
                // Septiembre
                case (9):
                    if (diaN >= 1 && diaN <= 23) {
                        System.out.println("_________________");
                        System.out.println("| Tu eres Virgo |");
                        System.out.println("|_______________|");
                    } else if (diaN >= 24 && diaN <= 30) {
                        System.out.println("_________________");
                        System.out.println("| Tu eres Libra |");
                        System.out.println("|_______________|");
                    } else {
                        System.out.println("______________________________________________");
                        System.out.println("|naciste un dia que no existe! |");
                        System.out.println("|____________________________________________|");
                    }
                    break;
                // Octubre
                case (10):
                    if (diaN >= 1 && diaN <= 23) {
                        System.out.println("_________________");
                        System.out.println("| Tu eres Libra |");
                        System.out.println("|_______________|");
                    } else if (diaN >= 24 && diaN <= 31) {
                        System.out.println("____________________");
                        System.out.println("| Tu eres Escorpio |");
                        System.out.println("|__________________|");
                    }
                    break;
                // Noviembre
                case (11):
                    if (diaN >= 1 && diaN <= 22) {
                        System.out.println("____________________");
                        System.out.println("| Tu eres Escorpio |");
                        System.out.println("|__________________|");
                    } else if (diaN >= 23 && diaN <= 30) {
                        System.out.println("_____________________");
                        System.out.println("| Tu eres Sagitario |");
                        System.out.println("|___________________|");
                    } else {
                        System.out.println("______________________________________________");
                        System.out.println("| naciste un dia que no existe! |");
                        System.out.println("|____________________________________________|");
                    }
                    break;
                // Diciembre
                case (12):
                    if (diaN >= 1 && diaN <= 21) {
                        System.out.println("_____________________");
                        System.out.println("| Tu eres Sagitario |");
                        System.out.println("|___________________|");
                    } else if (diaN >= 22 && diaN <= 31) {
                        System.out.println("_______________________");
                        System.out.println("| Tu eres Capricornio |");
                        System.out.println("|_____________________|");
                    }
                    break;
            }
            sleeper();
        }
    }


    // calcula la cantidad de dias vividos
    public void diasSufridos() {
        LocalDate diaNacimiento = LocalDate.of(anioN, mesN, diaN);
        LocalDate fechaActual = LocalDate.now();
        diasTotal = ChronoUnit.DAYS.between(diaNacimiento, fechaActual);
        System.out.println("Tu numero de dias Vividos es " + diasTotal);
        try {
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        sleeper();
    }

    // calcula los años de perro
    public void aniosPerro() {
        LocalDate diaNaci = LocalDate.of(anioN, mesN, diaN);
        LocalDate fechaAct = LocalDate.now();
        diasConver = ChronoUnit.DAYS.between(diaNaci, fechaAct);
        System.out.println((diasConver / 365) / 7);
        sleeper();
    }
    
    // calcula la suerte
    public void calNumerologia() {
        while (diaN > 0) {
            resultado += diaN % 10;
            diaN = diaN / 10;
        }
        if (resultado > 10) {
            while (resultado > 0) {
                resultado2 += resultado % 10;
                resultado = resultado / 10;
            }
            System.out.println("Tu numero de la suerte es: " + resultado2);
        } else {
            System.out.println("Tu numero de la suerte es:" + resultado);
        }
        sleeper();
    }


    // Getters Y Setters
    public static int getEleccion() {
        return eleccion;
    }

    public void setEleccion(int eleccion) {
        preMenu.eleccion = eleccion;
    }

    public static int getDiaN() {
        return diaN;
    }

    public void setDiaN(int diaN) {
        preMenu.diaN = diaN;
    }

    public static int getMesN() {
        return mesN;
    }

    public void setMesN(int mesN) {
        preMenu.mesN = mesN;
    }

    public int getAnioN() {
        return anioN;
    }

    public void setAnioN(int anioN) {
        preMenu.anioN = anioN;
    }

    public long getDiasTotal() {
        return diasTotal;
    }

    public void setDiasTotal(long diasTotal) {
        this.diasTotal = diasTotal;
    }
}