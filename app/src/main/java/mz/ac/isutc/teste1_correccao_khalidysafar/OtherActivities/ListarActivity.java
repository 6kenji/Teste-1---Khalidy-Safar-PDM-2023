package mz.ac.isutc.teste1_correccao_khalidysafar.OtherActivities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import mz.ac.isutc.teste1_correccao_khalidysafar.databinding.ActivityListarBinding;

public class ListarActivity extends AppCompatActivity {

    private ActivityListarBinding binding;
    private RecyclerView recyclerView;
    private ListarAdapter listarAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityListarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        recyclerView = binding.listar.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listarAdapter = new ListarAdapter(DataAcess.livroModel);

        binding.listar.recyclerView.setAdapter(listarAdapter);
    }
}