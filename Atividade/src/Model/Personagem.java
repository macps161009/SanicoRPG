package Model;

public class Personagem{
    protected String Nome;
    protected int hp;
    protected int mp;
    protected int level;
    protected int exp;
    protected int atq;
    protected int def;

    public Personagem(String nome, int hp, int mp, int level, int exp, int atq, int def) {
        Nome = nome;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
        this.exp = exp;
        this.atq = atq;
        this.def = def;
    }
    public void atacar(Personagem alvo){
        int dano = this.atq - alvo.def;
        if (dano <0) dano =  o;
        alvo.hp -= dano;
        System.out.println(this.nome = "atacou" + alvo.nome + "e causou" + dano = "de dano!");

    }
    public void descansar() {
        this.hp += 20;
        this.mp += 15;
        System.out.println(this.nome = "descansou e recuperou a vida e mana.");

    }
}
