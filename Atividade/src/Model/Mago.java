package Model;

public class Mago extends Personagem implements Habilidade_especial {
    private boolean nome;

    public Mago(String nome){
        super(nome, 80,150,40,10,1000,500);

    }

    @Override
    public void usarSK1(Personagem alvo) {
        System.out.println(this.nome + "usou bola de fogo (SK1) em " + alvo.nome + "!");

    }

    @Override
    public void usarSK2(Personagem alvo) {
        System.out.println(this.nome + "usou barreira de gelo (SK2)!");

    }

    @Override
    public void usarSK3(Personagem alvo) {
        System.out.println(this.nome + "conjurou meteoro (ULT) em " + alvo.nome + "!");

    }
}
