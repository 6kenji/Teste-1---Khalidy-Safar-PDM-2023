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
        txtAno = findViewById(R.id.ano_textview);
        txtEditora = findViewById(R.id.editora_textview);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String autor = bundle.getString("Nome");
            String titulo = bundle.getString("Titulo");
            String ano = String.valueOf(bundle.getString("Ano"));
            String editora = bundle.getString("Editora");

            txAutor.setText(autor);
            txTitulo.setText(titulo);
            txtAno.setText(ano);
            txtEditora.setText(editora);

        }
    }
}