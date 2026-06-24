package com.example.aplicativobase;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // =========================================================
    // TODO: Renomeie as variáveis com o nome do seu tema
    // Exemplo: edtCampo1 → edtNomeFilme, edtCampo2 → edtAno
    // =========================================================
    EditText edtCampo1;
    EditText edtCampo2;
    Button btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Os IDs aqui devem bater com os IDs do activity_main.xml
        edtCampo1 = findViewById(R.id.edtCampo1);
        edtCampo2 = findViewById(R.id.edtCampo2);
        btnAvancar = findViewById(R.id.btnAvancar);

        btnAvancar.setOnClickListener(v -> {

            // Captura o que o usuário digitou
            String valor1 = edtCampo1.getText().toString();
            String valor2 = edtCampo2.getText().toString();

            // Valida se os campos estão preenchidos
            if (valor1.isEmpty() || valor2.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
                return;
            }

            // TODO: Se o seu grupo precisar de cálculo, faça aqui antes de passar para a Tela 2
            // Exemplo App Notas:
            // double nota1 = Double.parseDouble(valor1);
            // double nota2 = Double.parseDouble(valor2);
            // double media = (nota1 + nota2) / 2;

            // Cria o Intent para navegar para a Tela 2
            Intent intent = new Intent(this, ResultadoActivity.class);

            // Passa os dados para a Tela 2
            intent.putExtra("campo1", valor1);
            intent.putExtra("campo2", valor2);

            // TODO: Se calculou algo, passe também:
            // intent.putExtra("resultado", media);

            startActivity(intent);
        });
    }
}