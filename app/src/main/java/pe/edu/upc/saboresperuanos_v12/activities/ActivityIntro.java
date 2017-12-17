package pe.edu.upc.saboresperuanos_v12.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import pe.edu.upc.saboresperuanos_v12.R;

public class ActivityIntro extends AppCompatActivity {
    Button btnGoLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        btnGoLogin = (Button)findViewById(R.id.btnGoLogin);

        btnGoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irAlLogin = new Intent(ActivityIntro.this, ActivityLogin.class);
                startActivity(irAlLogin);
            }
        });

    }
}
