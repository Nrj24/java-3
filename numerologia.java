public class calNumerologia{
    private int diaN;
    private int resultado = 0;
    private int resultado2 = 0;

	public void calNumerologia1() {
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
    }
}