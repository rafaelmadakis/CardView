package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclePostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);


        //LinearLayoutManager  layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerPostagem.setLayoutManager(layoutManager);



        //define adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    //Configura postagem
    public void prepararPostagens() {

        Postagem p = new Postagem("Rafael Madakis", "#tbt Viagem Legal!", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Hotel RM", "Viaje, aproveite nosso desconto", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Maria Luiza", "#Paris!!!", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Marcos Paulo", "#Que foto linda", R.drawable.imagem4);
        this.postagens.add(p);

    }
}