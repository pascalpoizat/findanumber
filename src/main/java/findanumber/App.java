package findanumber;

public class App {

    private static final String GAME_HEADER = "Find a Number!";

    public static void game(int nombreATrouver) {
        System.out.println(String.format("Le nombre était : %d", nombreATrouver));
        System.out.println("Game over!");
    }

    // tag::contains[]
    public static void main(String[] args) {
        System.out.println(GAME_HEADER);
        int borneInf = 40;
        int borneSup = 50;
        int nombreATrouver = genererNombre(borneInf, borneSup);
        game(nombreATrouver);
    }
    // end::contains[]

    private static int genererNombre(int borneInf, int borneSup) {
        int delta = 42;
        return 42;
    }
}
