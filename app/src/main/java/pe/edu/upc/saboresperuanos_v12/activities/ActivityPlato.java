package pe.edu.upc.saboresperuanos_v12.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import pe.edu.upc.saboresperuanos_v12.R;

public class ActivityPlato extends AppCompatActivity {
    TextView txtNombre;
    TextView txtDescripcion;
    TextView txtPrecio;
    ImageView imgPlato;
    Button btnComprarPlato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plato);

        txtNombre = (TextView) findViewById(R.id.txtNombrePlato);
        txtDescripcion = (TextView) findViewById(R.id.txtDescripcionPlato);
        txtPrecio = (TextView) findViewById(R.id.txtPrecioPlato);
        imgPlato = (ImageView) findViewById(R.id.imgPlato_);
        btnComprarPlato = (Button)findViewById(R.id.btnComprarPlato);

        txtNombre.setText(getIntent().getExtras().getString("curNombre"));
        txtDescripcion.setText(getIntent().getExtras().getString("curDescripcion"));
        txtPrecio.setText(getIntent().getExtras().getString("curPrecio"));
        imgPlato.setImageResource(getIntent().getExtras().getInt("curImagen"));

        btnComprarPlato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPago = new Intent(ActivityPlato.this, ActivityPago.class);
                startActivity(goPago);
            }
        });
    }
}
