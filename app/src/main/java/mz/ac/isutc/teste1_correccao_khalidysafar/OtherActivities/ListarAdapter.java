package mz.ac.isutc.teste1_correccao_khalidysafar.OtherActivities;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import mz.ac.isutc.teste1_correccao_khalidysafar.R;

public class ListarAdapter extends RecyclerView.Adapter<ListarAdapter.ViewHolder> {

    ArrayList<Livro> livroAdapter;

    public ListarAdapter(ArrayList<Livro> livroAdapter){
        this.livroAdapter = livroAdapter;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_custom_cardview, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bookTitle.setText(livroAdapter.get(position).getTitulo());

        holder.bookAuthor.setText(livroAdapter.get(position).getAutor());
        holder.bookPublisher.setText(livroAdapter.get(position).getEditora());
    }

    @Override
    public int getItemCount() {
        return livroAdapter.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView bookTitle;
        TextView bookAuthor;
        TextView bookPublisher;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            bookTitle = itemView.findViewById(R.id.bookTitle);
            bookAuthor = itemView.findViewById(R.id.bookAuthor);
            bookPublisher = itemView.findViewById(R.id.bookPublisher);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), DetailsActivity.class);

                    intent.putExtra("Titulo", livroAdapter.get(getAdapterPosition()).getTitulo());
                    intent.putExtra("Autor", livroAdapter.get(getAdapterPosition()).getAutor());
                    intent.putExtra("Editora", livroAdapter.get(getAdapterPosition()).getEditora());

                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
