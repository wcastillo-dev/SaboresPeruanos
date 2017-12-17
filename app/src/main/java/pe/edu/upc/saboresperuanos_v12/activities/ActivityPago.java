package pe.edu.upc.saboresperuanos_v12.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pe.edu.upc.saboresperuanos_v12.R;

public class ActivityPago extends AppCompatActivity {
    Button btnFinalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);

        btnFinalizar = (Button)findViewById(R.id.btnFinalizar);

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goFinalizar = new Intent(ActivityPago.this,ActivityFinalizar.class);
                startActivity(goFinalizar);
            }
        });
    }
}
