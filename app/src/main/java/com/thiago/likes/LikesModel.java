package com.thiago.likes;

import android.util.Log;

public class LikesModel {
    private String nome;
    private String sobrenome;
    private String imagemLikes;
    private int pontuação;

    public LikesModel(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.pontuação = 0;
        this.imagemLikes = "diretorio/imagens/normal";
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getImagemLikes() {
        return imagemLikes;
    }

    public int getPontuação() {
        return pontuação;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setPontuação(int pontuacao) {
        this.pontuação = pontuacao;
        if (pontuacao>=0 && pontuacao <4){this.imagemLikes="diretorio/imagens/normal";}
        else if(pontuacao>3 && pontuacao<9){this.imagemLikes="diretorio/imagens/coracao";}
        else if(pontuacao > 8 && pontuacao<12){this.imagemLikes="diretorio/imagens/fogo";}
        else if(pontuacao > 12){this.imagemLikes="diretorio/imagens/estrela_de_fogo";}
        else{Log.i("pontuacao", "pontuacao invalida");}
    }
}
