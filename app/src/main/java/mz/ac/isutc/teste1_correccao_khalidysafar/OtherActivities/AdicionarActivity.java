package mz.ac.isutc.teste1_correccao_khalidysafar.OtherActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import mz.ac.isutc.teste1_correccao_khalidysafar.R;

public class AdicionarActivity extends AppCompatActivity {

    Livro livroDados;

    private Button bt_add;
    private EditText edt_titulo, edt_ano, edt_autor, edt_editora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar);

        bt_add = findViewById(R.id.bt_Adicionar);
        edt_titulo = findViewById(R.id.edTitulo);
        edt_ano = findViewById(R.id.ed_Ano);
        edt_autor = findViewById(R.id.edTitulo);
        edt_editora = findViewById(R.id.edEditora);

        bt_add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int i = DataAcess.livroModel.size();

                if(!edt_titulo.getText().toString().isEmpty() && !edt_ano.getText().toString().isEmpty() &&
                        !edt_autor.getText().toString().isEmpty() && !edt_editora.getText().toString().isEmpty()){
                    try {
                         livroDados = new Livro(edt_titulo.getText().toString(), edt_editora.getText().toString(),
                                        edt_autor.getText().toString(), Integer.parseInt(edt_ano.getText().toString()));
                         DataAcess.livroModel.add(livroDados);
                         Toast.makeText(getApplicationContext(), "Livro adicionado", Toast.LENGTH_SHORT).show();

                    }catch (Exception ex){
                        Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                } else {

                    Toast.makeText(getApplicationContext(), "Preencher todos dados", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}