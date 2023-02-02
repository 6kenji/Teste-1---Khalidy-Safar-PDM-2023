package mz.ac.isutc.teste1_correccao_khalidysafar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mz.ac.isutc.teste1_correccao_khalidysafar.OtherActivities.AdicionarActivity;
import mz.ac.isutc.teste1_correccao_khalidysafar.OtherActivities.ListarActivity;
import mz.ac.isutc.teste1_correccao_khalidysafar.OtherActivities.ListarAdapter;

public class MainActivity extends AppCompatActivity {

    private Button bt_add, bt_lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_add = findViewById(R.id.btAdd);
        bt_lista = findViewById(R.id.btListar);

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AdicionarActivity.class));
            }
        });

        bt_lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListarActivity.class));
            }
        });
    }
}