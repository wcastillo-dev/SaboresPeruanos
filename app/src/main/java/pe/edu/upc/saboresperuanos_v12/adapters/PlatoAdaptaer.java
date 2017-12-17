package pe.edu.upc.saboresperuanos_v12.adapters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pe.edu.upc.saboresperuanos_v12.R;
import pe.edu.upc.saboresperuanos_v12.activities.ActivityPlato;
import pe.edu.upc.saboresperuanos_v12.entidades.Plato;

/**
 * Created by itsoportetecnico on 16/12/2017.
 */

public class PlatoAdaptaer extends RecyclerView.Adapter<PlatoAdaptaer.PlatoViewHolder> {
    private List<Plato> items;

    public static class PlatoViewHolder extends RecyclerView.ViewHolder {

        public CardView platoCardView;
        public TextView txtNombre;
        public TextView txtDescripcion;
        public TextView txtPrecio;
        public ImageView imgPlato;

        public PlatoViewHolder(View itemView) {
            super(itemView);
            platoCardView = (CardView)itemView.findViewById(R.id.lista_plato);
            txtNombre = (TextView)itemView.findViewById(R.id.txtNombre);
            txtDescripcion = (TextView)itemView.findViewById(R.id.txtDescripcion);
            txtPrecio = (TextView)itemView.findViewById(R.id.txtPrecio);
            imgPlato = (ImageView) itemView.findViewById(R.id.imgPlato);
        }
    }

    public PlatoAdaptaer(List<Plato> items) {
        this.items = items;
    }

    public List<Plato> getItems(){
        return this.items;
    }

    @Override
    public PlatoViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_platos, parent, false);
        return new PlatoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlatoViewHolder viewHolder, final int i) {
        viewHolder.txtNombre.setText(items.get(i).getNombre());
        viewHolder.txtDescripcion.setText(items.get(i).getDescripcion());
        viewHolder.txtPrecio.setText(items.get(i).getPrecio());
        viewHolder.imgPlato.setImageResource(items.get(i).getImgPlato());

        viewHolder.platoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("curImagen", items.get(i).getImgPlato());
                bundle.putString("curNombre", items.get(i).getNombre());
                bundle.putString("curDescripcion", items.get(i).getDescripcion());
                bundle.putString("curPrecio", items.get(i).getPrecio());
                Intent iconIntent = new Intent(view.getContext(), ActivityPlato.class);
                iconIntent.putExtras(bundle);
                view.getContext().startActivity(iconIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
