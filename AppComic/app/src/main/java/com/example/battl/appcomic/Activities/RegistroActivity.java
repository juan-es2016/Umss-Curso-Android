package com.example.battl.appcomic.Activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.battl.appcomic.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegistroActivity extends AppCompatActivity {
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        ButterKnife.bind(this);
        editor = getSharedPreferences("shared1", MODE_PRIVATE).edit();
        editor.putString("nombre","Brian");
        editor.apply();
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.myDialog1));
        alertDialogBuilder.setTitle("REGISTRO");
        alertDialogBuilder.setMessage("Todos tus datos son correctos");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(RegistroActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Bienvenido nuevamente a la pantalla de registro", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @OnClick(R.id.button2)
    public void cancelar(){
        SharedPreferences sharedPreferences = getSharedPreferences("shared1", MODE_PRIVATE);
        final String nombre = sharedPreferences.getString("nombre","Dennis");
        final String nombre2 = sharedPreferences.getString("nombre2","vega|");
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.myDialog1));
        alertDialogBuilder.setTitle("Cancelar Registro");
        alertDialogBuilder.setMessage("Esta seguro que quiere cancelar su registro");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(RegistroActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), nombre2, Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        //showDialogQuantity(RegistroActivity.this);
    }

    public static void showDialogQuantity(final Context context) {
        android.app.AlertDialog.Builder dialogBuilder = new android.app.AlertDialog.Builder(new ContextThemeWrapper(context, R.style.myDialog1));
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View dialogView = inflater.inflate(R.layout.dialog_quantity_product, null);
        dialogBuilder.setView(dialogView);

        final EditText ediQuantity = (EditText) dialogView.findViewById(R.id.edi_quantity);
        Button aceptar = (Button) dialogView.findViewById(R.id.button_aceptar);
        Button cancelar = (Button) dialogView.findViewById(R.id.button_cancelar);

        dialogBuilder.setTitle(context.getResources().getString(R.string.alert_tittle_item));
        dialogBuilder.setMessage(context.getResources().getString(R.string.alert_dialog_message));
        android.app.AlertDialog b = dialogBuilder.create();
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b.show();
    }

}
