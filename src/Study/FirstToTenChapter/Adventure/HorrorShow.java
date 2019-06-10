package Study.FirstToTenChapter.Adventure;

interface Monster{
    void menace();
}
interface DangerousMonster extends Monster{
    void destroy();
}
interface Lethal{
    void kill();
}

interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}
public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public DangerousMonster monsterMaker() {
        return new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("destroy");
            }

            @Override
            public void menace() {
                System.out.println("menace");
            }
        };
    }

    public Vampire makeVampire() {
        return new Vampire() {
            @Override
            public void drinkBlood() {
                System.out.println("drinkBlood");
            }

            @Override
            public void destroy() {
                System.out.println("destroy");
            }

            @Override
            public void kill() {
                System.out.println("kill");
            }

            @Override
            public void menace() {
                System.out.println("menace");
            }
        };
    }

    public static void main(String[] args) {
        HorrorShow horrorShow = new HorrorShow();
        horrorShow.makeVampire().kill();
        horrorShow.makeVampire().destroy();
        horrorShow.makeVampire().drinkBlood();
        horrorShow.makeVampire().menace();
        horrorShow.monsterMaker().menace();
        horrorShow.monsterMaker().destroy();
    }
}