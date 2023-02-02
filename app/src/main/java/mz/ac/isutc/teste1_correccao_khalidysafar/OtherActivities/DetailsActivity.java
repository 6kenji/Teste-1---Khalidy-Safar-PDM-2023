package mz.ac.isutc.teste1_correccao_khalidysafar.OtherActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import mz.ac.isutc.teste1_correccao_khalidysafar.R;

public class DetailsActivity extends AppCompatActivity {

    TextView txAutor, txTitulo, txtAno, txtEditora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txAutor = findViewById(R.id.autor_textview);
        txTitulo = findViewById(R.id.titulo_textview);
        txtEditora = findViewById(R.id.editora_textview);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){

            String titulo = bundle.getString("Titulo");
            String autor = bundle.getString("Autor");
            String editora = bundle.getString("Editora");

            txAutor.setText(autor);
            txTitulo.setText(titulo);
            txtEditora.setText(editora);

        }
    }
}