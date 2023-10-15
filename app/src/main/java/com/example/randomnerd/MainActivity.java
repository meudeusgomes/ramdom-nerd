package com.example.randomnerd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.randomnerd.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button botaoSorteio;
    private TextView resultadoSorteio;

    private String[] frasesGeek = {
            "Oi eu sou o Goku!",
            "kakaroto.",
            "O naruto pode ser um pouco duro as vezes.",
            "Chocolate.",
            "AAAAAH SEU ZÉ RUELA.",
            "ESQUECI O PONTO E VIRGULA.",
            "EU TINHA UM NITENDO MARIO WORLD MARIO KART."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoSorteio = findViewById(R.id.botao);
        resultadoSorteio = findViewById(R.id.resultado);

        botaoSorteio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int indiceAleatorio = random.nextInt(frasesGeek.length);
                resultadoSorteio.setText(frasesGeek[indiceAleatorio]);
            }
        });
    }
}