package com.example.roldepagos;


import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roldepagos.bdd.BDHelper;

public class ReguistroActivity extends AppCompatActivity {
    EditText et_funcionario, et_cargo, et_area, et_hijos,et_estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reguistro);

        //UNIR ELEMENTOS DE BACK CON EL FROM
        et_funcionario = findViewById(R.id.txtFuncionario);
        et_cargo = findViewById(R.id.txtCargo);
        et_area = findViewById(R.id.txtArea);
        et_hijos = findViewById(R.id.txtHijos);
        et_estado = findViewById(R.id.txtEstado);

    }
        public void registrar(View view){
            BDHelper admin=new BDHelper(this,"registro.db",null,1);
            SQLiteDatabase bd=admin.getWritableDatabase();
            String funcionario=et_funcionario.getText().toString();
            String cargo=et_cargo.getText().toString();
            String area=et_area.getText().toString();
            String hijos=et_hijos.getText().toString();
            String estado=et_estado.getText().toString();

            if(!funcionario.isEmpty() && !cargo.isEmpty() && !area.isEmpty() && !hijos.isEmpty() && !estado.isEmpty()){
                ContentValues registro=new ContentValues();
                registro.put("usu_funcionario",funcionario);
                registro.put("usu_cargo",cargo);
                registro.put("usu_area",area);
                registro.put("usu_hijos",hijos);
                registro.put("usu_estado",estado);
                bd.insert("tblUsuarios",null,registro);
                Toast.makeText(this, "REGISTRO EXITOSO", Toast.LENGTH_SHORT).show();
                et_funcionario.setText("");
                et_cargo.setText("");
                et_area.setText("");
                et_hijos.setText("");
                et_estado.setText("");
                bd.close();
            }else{
                Toast.makeText(this,"FAVOR INGRESAR TODOS LOS CAMPOS",Toast.LENGTH_SHORT).show();
            }

        }
    public void RegreasarMenu(View view) {
        this.finish();

    }
    }