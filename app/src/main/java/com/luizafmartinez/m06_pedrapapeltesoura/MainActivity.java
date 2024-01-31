package com.luizafmartinez.m06_pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view) {

        verificarGanhador("pedra");
    }

    public void selecionarPapel(View view) {

        verificarGanhador("papel");
    }

    public void selecionarTesoura(View view) {

        verificarGanhador("tesoura");
    }


    private String gerarEscolhaAleatoriaApp() {

//        Random random = new Random();
//        random.nextInt(3);

        String[] opcoes = { "pedra", "papel", "tesoura" };
        int numeroAleatorio = new Random().nextInt(3); // 0,1,2

        ImageView imagemApp = findViewById(R.id.image_app);

        String escolhaApp = opcoes[numeroAleatorio];

        switch ( escolhaApp ) {

            case "pedra":
                imagemApp.setImageResource( R.drawable.pedra);
                break;

            case "papel":
                imagemApp.setImageResource( R.drawable.papel);
                break;

            case "tesoura":
                imagemApp.setImageResource( R.drawable.tesoura);
                break;

        }

        return escolhaApp;
    }

    private void verificarGanhador( String escolhaUsuario ) {

        String escolhaApp = gerarEscolhaAleatoriaApp();
        //System.out.println("Item clicado: " + escolhaUsuario);
    }

}