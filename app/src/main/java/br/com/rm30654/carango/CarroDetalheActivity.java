package br.com.rm30654.carango;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;

import br.com.rm30654.model.Carro;

public class CarroDetalheActivity extends AppCompatActivity {
    private ImageView imagem;
    private TextView desc;
    private CollapsingToolbarLayout collapsingToolbar;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_detalhe);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        imagem = (ImageView) findViewById(R.id.imagem);
        desc = (TextView) findViewById(R.id.desc);
        if (getIntent() != null) {
            Carro carro = (Carro) getIntent().getSerializableExtra("carro");
            Picasso.with(this).load(carro.getFoto()).into(imagem);
            collapsingToolbar.setTitle(carro.getNome());
            desc.setText(carro.getDesc());

        }
    }
}