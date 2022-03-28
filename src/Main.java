public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Tube tube = new Tube();
        Chainsaw chainsaw = new Chainsaw();
        guitar.plugIn(1);
        tube.playSomeMusic();
        chainsaw.makeSomething();
    }
}
