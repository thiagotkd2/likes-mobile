package com.thiago.likes;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.ViewModelInitializer;

public class LikesViewModel extends ViewModel {
    MutableLiveData<String> nome = new MutableLiveData<>("Thiago");
    MutableLiveData<String> sobrenome = new MutableLiveData<>("F. de Moraes");
    MutableLiveData<Integer> likes = new MutableLiveData<>(0);
    MutableLiveData<Integer> imagemLikes = new MutableLiveData<>(R.drawable.like_svgrepo_com);


    public MutableLiveData<String> getNome() {
        return nome;
    }

    public MutableLiveData<String> getSobrenome() {
        return sobrenome;
    }

    public MutableLiveData<Integer> getLikes() {
        return likes;
    }

    public MutableLiveData<Integer> getImagemLikes() {
        return imagemLikes;
    }

    public void darLikes(){
        if(likes.getValue()!=null) {
            likes.setValue(likes.getValue() + 1);
            if (likes.getValue() >=0 && likes.getValue() < 4) {
                imagemLikes.setValue(R.drawable.like_svgrepo_com);
            } else if (likes.getValue() > 3 && likes.getValue() < 9) {
                imagemLikes.setValue(R.drawable.heart_svgrepo_com);
            } else if (likes.getValue() > 8 && likes.getValue() < 12) {
                imagemLikes.setValue(R.drawable.fire_svgrepo_com);
            } else if (likes.getValue() > 12) {
                imagemLikes.setValue(R.drawable.star_fall_minimalistic_2_svgrepo_com);
            } else if (likes.getValue() < 0) {
                Log.i("likes.getValue()", "likes.getValue() invalida");
            }
        }
    }

}
