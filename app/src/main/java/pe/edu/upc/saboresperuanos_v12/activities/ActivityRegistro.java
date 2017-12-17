package pe.edu.upc.saboresperuanos_v12.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pe.edu.upc.saboresperuanos_v12.R;

public class ActivityRegistro extends AppCompatActivity {
    Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnRegistrar =(Button)findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMain = new Intent(ActivityRegistro.this, ActivityMenu.class);
                Toast.makeText(getApplicationContext(),"Gracias por regisrarte, Disfruta de las Promociones :D",Toast.LENGTH_LONG).show();
                startActivity(goMain);
            }
        });
    }
}
