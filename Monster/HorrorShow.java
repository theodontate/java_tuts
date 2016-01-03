package Monster;

/**
 * Created by theartiste on 1/3/16.
 */
public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    public void w(lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster arbey = new DragonZilla();
        u(arbey);
        v(arbey);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        new HorrorShow().w(vlad);
    }
}
