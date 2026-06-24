package com.example.aplicativobase;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    // =========================================================
    // TODO: Renomeie as variáveis com o nome do seu tema
    // Exemplo: txtCampo1 → txtNomeFilme, txtCampo2 → txtAno
    // =========================================================
    TextView txtCampo1;
    TextView txtCampo2;
    TextView txtResultado;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        // TODO: Os IDs aqui devem bater com os IDs do activity_resultado.xml
        txtCampo1   = findViewById(R.id.txtCampo1);
        txtCampo2   = findViewById(R.id.txtCampo2);
        txtResultado = findViewById(R.id.txtResultado);
        btnVoltar   = findViewById(R.id.btnVoltar);

        // Recebe os dados enviados pela Tela 1
        String valor1 = getIntent().getStringExtra("campo1");
        String valor2 = getIntent().getStringExtra("campo2");

        // TODO: Se passou um resultado calculado, receba assim:
        // double resultado = getIntent().getDoubleExtra("resultado", 0);

        // Exibe os dados recebidos nos TextViews
        // TODO: Troque os rótulos pelo nome real do seu campo
        // Exemplo: txtCampo1.setText("Filme: " + valor1);
        txtCampo1.setText("Campo 1: " + valor1);
        txtCampo2.setText("Campo 2: " + valor2);

        // TODO: Implemente a lógica de resultado do seu grupo aqui
        // Exemplo App Notas:
        // if (resultado >= 7.0) txtResultado.setText("Situação: APROVADO");
        // else if (resultado >= 5.0) txtResultado.setText("Situação: RECUPERAÇÃO");
        // else txtResultado.setText("Situação: REPROVADO");
        txtResultado.setText("Resultado: (implemente aqui)");

        // Botão voltar para a Tela 1
        btnVoltar.setOnClickListener(v -> finish());
    }
}