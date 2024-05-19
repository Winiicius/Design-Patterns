package main;

import enums.TipoAtaque;
import enums.TipoInimigo;
import enums.TipoPlataforma;
import mapa.Mapa;
import prototypeConcreto.Inimigo;
import prototypeConcreto.Obstaculo;
import prototypeConcreto.Plataforma;

public class AplicacaoPrototype {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();

        // Criando um inimigo do Zero
        Inimigo inimigoFantasma1 = new Inimigo();
        inimigoFantasma1.setTipoInimigo(TipoInimigo.of("Fantasma"));
        inimigoFantasma1.setPontosVida(20);
        inimigoFantasma1.setTipoAtaque(TipoAtaque.of("Perseguir"));
        mapa.adicionarElemento(inimigoFantasma1);

        // Clonando um Objeto do tipo "Inimigo" e mudando os seus pontos de vida
        Inimigo inimigoFantasma2 = (Inimigo)inimigoFantasma1.clone();
        inimigoFantasma2.setPontosVida(10);
        mapa.adicionarElemento(inimigoFantasma2);

        // Criando uma Plataforma do Zero
        Plataforma plataforma1 = new Plataforma();
        plataforma1.setTipoPlataforma(TipoPlataforma.of("Cano"));
        plataforma1.setLargura(4);
        plataforma1.setAltura(2);
        mapa.adicionarElemento(plataforma1);

        // Clonando a "plataforma1" e mudando apenas o tipo
        Plataforma plataforma2 = (Plataforma)plataforma1.clone();
        plataforma2.setTipoPlataforma(TipoPlataforma.of("Chao"));
        mapa.adicionarElemento(plataforma2);

        // Criando um Obstáculo do 0
        Obstaculo obstaculo1 = new Obstaculo();
        obstaculo1.setAltura(3);
        obstaculo1.setLargura(2);
        obstaculo1.setBreakable(true);
        mapa.adicionarElemento(obstaculo1);

        // Clonando o Obstáculo sem fazer alterações
        Obstaculo obstaculo2 = (Obstaculo) obstaculo1.clone();
        mapa.adicionarElemento(obstaculo2);

        // Imprime no terminal todos os Elementos presentes no mapa e suas informações
        mapa.toString();

        // RETORNO NO TERMINAL

        // Elementos Presentes no Mapa:
        // Inimigo: Fantasma
        // Pontos de Vida: 20
        // Tipo Ataque: Perseguir

        // Inimigo: Fantasma
        // Pontos de Vida: 10
        // Tipo Ataque: Perseguir

        // Plataforma: Cano
        // Largura: 4
        // Altura: 2

        // Plataforma: Chao
        // Largura: 4
        // Altura: 2

        // Obstaculo:
        // Largura: 2
        // Altura: 3
        // Quebrável: true

        // Obstaculo:
        // Largura: 2
        // Altura: 3
        // Quebrável: true
    }
}
