package com.example.roldepagos;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ejemplosqlite.bdd.BDHelper;

public class ReguistroActivity extends AppCompatActivity {
    EditText et_funcionario, et_cargo, et_area, et_hijos,et_estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reguistro);

        //UNIR ELEMENTOS DE BACK CON EL FROM
        et_funcionario=findViewById(R.id.txtFuncionario);
        et_cargo=findViewById(R.id.txtCargo);
        et_area=findViewById(R.id.txtArea);
        et_hijos=findViewById(R.id.txtHijos);
        et_estado=findViewById(R.id.txtEstado);

}
