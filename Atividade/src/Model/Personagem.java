package Model;

public class Personagem{
   public int hp;
   public int mp;
   public int level;
   public int exp;
   public int atq;
   public int def;

   public void atacar (){
       System.out.println("o personagem atacou");
   }
   public void descansar(){
       System.out.println("o personagem descansou");
   }
}
