package com.francistudio.guapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    private RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaContactos = (RecyclerView) findViewById(R.id.rvContactos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation((LinearLayoutManager.VERTICAL));
        listaContactos.setLayoutManager(llm);
        inicializarListaContactos();
        iniciarlizaAdaptador();

        /*ArrayList<String> nombresContacto = new ArrayList<>();
        for (Contacto contacto: contactos){
            nombresContacto.add(contacto.getNombre());
        }

        ListView lstContactos = (ListView) findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombresContacto ));
        lstContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);
                intent.putExtra(getResources().getString(R.string.pnombre), contactos.get(i).getNombre());
                intent.putExtra(getResources().getString(R.string.ptelefono), contactos.get(i).getTelefono());

                startActivity(intent);
            }
        });*/
    }

    public void iniciarlizaAdaptador (){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos);
        listaContactos.setAdapter(adaptador);
    }


    public void inicializarListaContactos(){

        contactos= new ArrayList<Contacto>();

        contactos.add(new Contacto(R.drawable.perro1, "Lorencho", "7"));
        contactos.add(new Contacto(R.drawable.perro2, "Linda", "3"));
        contactos.add(new Contacto(R.drawable.perro3, "Lulu", "8"));
        contactos.add(new Contacto(R.drawable.perro4, "Chicholino", "7"));
        contactos.add(new Contacto(R.drawable.perro5, "Fabricio", "3"));
    }

}