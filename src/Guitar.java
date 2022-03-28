public class Guitar extends MusicInstr implements PoweredByElectric{

    public Guitar() {
        super.name = "Guitar";
        super.musicInstrType = "Stringed";
    }

    @Override
    public void doSomething() {
        System.out.println(name + " play music");
    }

    @Override
    public void playSomeMusic() {
        System.out.println(name + " sounds of guitar");
    }

    @Override
    public void plugIn(int isOn){
        if (isOn == 1) {
            System.out.println(name + " подключена к сети");
        } else {
            System.out.println(name + " отключена от сети");
        }
    };
}
