package com.example.battl.appcomic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        MenuItem guardar = menu.getItem(1);
        guardar.setVisible(true);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.tooblar_guardar:
                Toast.makeText(LoginActivity.this,"item guardar", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
