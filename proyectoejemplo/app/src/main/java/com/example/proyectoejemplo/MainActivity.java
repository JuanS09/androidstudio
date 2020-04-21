package com.example.proyectoejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText eNombres, eApellidos, eEmail,eTelefono;
    Button btDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        validarDatos();
    }
        void validarDatos(){
            eNombres=(EditText)findViewById(R.id.eNombres);
            eApellidos=(EditText)findViewById(R.id.eApellidos);
            eEmail=(EditText)findViewById(R.id.eEmail);
            eTelefono=(EditText)findViewById(R.id.eTeléfono);
            btDatos=(Button)findViewById(R.id.btDatos);

            btDatos.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    if ((eNombres.getText().toString().contentEquals(""))||
                            (eApellidos.getText().toString().contentEquals(""))||
                            (eEmail.getText().toString().contentEquals(""))||
                            (eTelefono.getText().toString().contentEquals(""))){
                        Toast.makeText(MainActivity.this,"Todos los campos son requeridos",
                                Toast.LENGTH_LONG).show();
                    }

                    else{
                        Intent intent=new Intent(MainActivity.this, Dato2Activity.class);
                        intent.putExtra("NOMBRES", eNombres.getText().toString());
                        intent.putExtra("APELLIDOS", eApellidos.getText().toString());
                        intent.putExtra("EMAIL",eEmail.getText().toString());
                        intent.putExtra("TELEFONO",eTelefono.getText().toString());

                        startActivity(intent);

                    }
                }
            });
        }
    }