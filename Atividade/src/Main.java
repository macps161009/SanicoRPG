import Model.Arqueiro;
import Model.Guerreiro;
import Model.Mago;

public class Main {
    public static void main(String[] args){
        Mago mago = new Mago();
        mago.hp = 100;
        mago.mp = 80;
        mago.level = 1;
        mago.exp = 10;
        mago.atq = 100;
        mago.def = 15;

        System.out.println("HP:" + mago.hp);
        System.out.println("MP:" + mago.mp);
        System.out.println("Level:" + mago.level);
        System.out.println("EXP:" + mago.exp);
        System.out.println("ATQ:" + mago.atq);
        System.out.println("DEF:" + mago.def);

        mago.atacar();
        mago.descansar();
        mago.SK1();
        mago.SK2();
























































































    }


}