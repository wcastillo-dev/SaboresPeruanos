package pe.edu.upc.saboresperuanos_v12.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pe.edu.upc.saboresperuanos_v12.R;

public class ActivityLogin extends AppCompatActivity {
    Button btnRegistrar, btnIngresar, btnSinCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegistrar = (Button)findViewById(R.id.btnRegistrar);
        btnIngresar = (Button)findViewById(R.id.btnIngresar);
        btnSinCuenta = (Button)findViewById(R.id.btnSinCuenta);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goRegistro = new Intent(ActivityLogin.this, ActivityRegistro.class);
                startActivity(goRegistro);
            }
        });

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMain = new Intent(ActivityLogin.this, ActivityMenu.class);
                Toast.makeText(getApplicationContext(),"Bienvenid@..!!",Toast.LENGTH_LONG).show();
                startActivity(goMain);
            }
        });

        btnSinCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMain = new Intent(ActivityLogin.this, ActivityMenu.class);
                Toast.makeText(getApplicationContext(),"Bienvenid@ se ve que tienes hambre jeje..!!",Toast.LENGTH_LONG).show();
                startActivity(goMain);
            }
        });

    }
}
