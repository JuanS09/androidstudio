package com.example.proyectoejemplo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class Dato2Activity extends AppCompatActivity {
    String nombres;
    String Apellidos;
    String telefono;
    String email;
    TextView txNombres, txApellidos, txTelefono, txEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dato2);
        txNombres=(TextView)this.findViewById(R.id.txNombres);
        txApellidos=(TextView)this.findViewById(R.id.txApellido);
        txTelefono=(TextView)this.findViewById(R.id.txTelefono);
        txEmail=(TextView)this.findViewById(R.id.txEmail);

        nombres=getIntent().getStringExtra("NOMBRES");
        Apellidos=getIntent().getStringExtra("APELLIDOS");
        telefono=getIntent().getStringExtra("TELEFONO");
        email=getIntent().getStringExtra("EMAIL");

        txNombres.setText(nombres);
        txApellidos.setText(getIntent().getStringExtra("APELLIDOS"));
        txTelefono.setText(getIntent().getStringExtra("TELEFONO"));
        txEmail.setText(getIntent().getStringExtra("EMAIL"));
    }
}

