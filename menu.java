

public class menu extends preMenu {
    public static void main(String args[]) throws Exception {

        // Titulo
        System.out.println(ANSI_GREEN+"");
        InputStream ins = new FileInputStream( "titulo.txt" );
        Scanner scanner2 = new Scanner(ins);
        while (scanner2.hasNextLine())
            System.out.println(scanner2.nextLine());
        scanner2.close();
        System.out.println(ANSI_RESET);
        
        //Aqui empieza el menu
        preMenu principal = new preMenu();
        principal.menuMain();
        if (getEleccion() >= 1 && getEleccion() <= 4) {
            var setear = new preMenu();
            setear.setear();
            preMenu elec = new preMenu();
            elec.eleccion();
        } else if (getEleccion() == 5) {
            System.out.println("Te extrañaremos, esperamos verte pronto");
            System.exit(0);
        }
    }
}