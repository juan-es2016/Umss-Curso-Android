package com.example.battl.appcomic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Battl on 18/07/2017.
 */

public class LoginActivity extends AppCompatActivity{

    Button btnAcceder;
    Button btnRegistro;
    EditText edtEmail;
    EditText edtContraseña;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_login);
        btnAcceder = (Button) findViewById(R.id.btn_acceder);
        btnRegistro = (Button) findViewById(R.id.btn_registrarse);
        edtEmail = (EditText) findViewById(R.id.edit_txt_emaik);
        edtContraseña = (EditText) findViewById(R.id.edit_txt_contraseña);

        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
