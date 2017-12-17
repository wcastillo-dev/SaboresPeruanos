package pe.edu.upc.saboresperuanos_v12.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.saboresperuanos_v12.R;
import pe.edu.upc.saboresperuanos_v12.adapters.PlatoAdaptaer;
import pe.edu.upc.saboresperuanos_v12.entidades.Plato;

public class ActivityMenu extends AppCompatActivity {
    private List<Plato> items = new ArrayList();
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        FillPersons();

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        adapter = new PlatoAdaptaer(items);
        recycler.setAdapter(adapter);
    }

    private void FillPersons(){
        items.add(new Plato("Lomo Saltado", "Papitas fritas con trozos de carne", "S/. 15.00",R.drawable.plato_lomo_saltado));
        items.add(new Plato("Pachamanca", "Papitas fritas con trozos de carne", "S/. 15.00",R.drawable.plato_pachamanca));
        items.add(new Plato("Manchapecho", "Papitas fritas con trozos de carne", "S/. 15.00",R.drawable.plato_manchapecho));
        items.add(new Plato("Cuy Chactado", "Papitas fritas con trozos de carne", "S/. 15.00",R.drawable.plato_cuy_chactado));
        items.add(new Plato("Arroz Chaufa con Cecina", "Papitas fritas con trozos de carne", "S/. 15.00",R.drawable.plato_arroz_chaufa_con_cecina));
        items.add(new Plato("Arroz con Pato", "Papitas fritas con trozos de carne", "S/. 15.00",R.drawable.plato_arroz_con_pato_borracho));
        items.add(new Plato("Cabrito a la Norteña", "Papitas fritas con trozos de carne", "S/. 15.00",R.drawable.plato_cabrito_a_la_nortenia));
        items.add(new Plato("Seco de Cornero", "Papitas fritas con trozos de carne", "S/. 15.00",R.drawable.plato_seco_de_cordero_al_pisco));
    }
}
