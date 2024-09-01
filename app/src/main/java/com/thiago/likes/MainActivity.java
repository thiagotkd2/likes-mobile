package com.thiago.likes;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.thiago.likes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setLifecycleOwner(this);
        LikesViewModel vm = new ViewModelProvider(this).get(LikesViewModel.class);
        binding.setVm(vm);
        ImageView imagem = findViewById(R.id.imageView2);


        vm.imagemLikes.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer idImagem) {

                if (idImagem!=null){
                    imagem.setImageResource(idImagem);
                }
            }
        });
    }
}