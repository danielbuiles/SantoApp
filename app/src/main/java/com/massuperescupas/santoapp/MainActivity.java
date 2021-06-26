package com.massuperescupas.santoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    ArrayList<Datos> listaActividades = new ArrayList<>();
    RecyclerView listadoGrafico;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listadoGrafico=findViewById(R.id.listado);
        listadoGrafico.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        int fiesta=R.string.party;

        crearlista();
        ListaActividades adapter =new ListaActividades(listaActividades);
        listadoGrafico.setAdapter(adapter);
    }
    //ENCARGADA DE CAMBIAR LA CONFIGURACION DE IDIOMA
    public void CambiarIdioma(String Lenguaje){
        Locale idioma =new Locale(Lenguaje);
        Locale.setDefault(idioma);

        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=idioma;
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch(id){
            case (R.id.opcion1):
                Intent intent1 =new Intent(MainActivity.this,Acercade.class);
                startActivity(intent1);
                break;
            case (R.id.opcion2):
                CambiarIdioma("en");

                Intent intent2 =new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent2);
                break;
            case (R.id.opcion3):
                CambiarIdioma("es");

                Intent intent3 =new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

        private void crearlista()
        {
            db.collection("actividades")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    String titulo= document.get("texto").toString();
                                    String foto= document.get("foto").toString();
                                    String descripcion= document.get("descripcion").toString();

                                    listaActividades.add(new Datos(titulo,foto,descripcion));
                                }
                            } else {
                                Toast.makeText(MainActivity.this, "error en la consulta", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
}
