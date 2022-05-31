package com.example.searchview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {
    private TextView lblUser;
    private ListView listAlumnos;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lblUser = (TextView) findViewById(R.id.lblUsuario);
        listAlumnos = (ListView) findViewById(R.id.listAlumnos);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.alumnos));
        listAlumnos.setAdapter(adapter);
        Bundle datos = getIntent().getExtras();
        //lblUser.setText(datos.getString("usuario"));
        Usuarios user = (Usuarios) datos.getSerializable("usuario");
        lblUser.setText(user.getNombreCompleto());
    }
}