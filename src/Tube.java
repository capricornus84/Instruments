public class Tube extends MusicInstr{
    public Tube() {
        super.name = "Tube";
        super.musicInstrType = "Wind";
    }

    @Override
    public void doSomething() {
        System.out.println(name + " play music");
    }

    @Override
    public void playSomeMusic() {
        System.out.println(name + " sound of tube");
    }
}
