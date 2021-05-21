package com.massuperescupas.santoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.ResultReceiver;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Datos> listaActividades = new ArrayList<>();
    RecyclerView listadoGrafico;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listadoGrafico=findViewById(R.id.listado);
        listadoGrafico.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearlista();
        ListaActividades adapter =new ListaActividades(listaActividades);
        listadoGrafico.setAdapter(adapter);
    }

        private void crearlista()
        {
            listaActividades.add(new Datos("Fiestas",R.drawable.fiestas,"<string name=\"Fiestas\">Fiesta permanente en el año 2008, pues se celebran 150 años del natalicio de su más ilustre hijo, el famoso escritor Tomás Carrasquilla.\n" +
                    "Fiestas del Corpus Christi y el altar de San Isidro, sin fecha fija en el mes de mayo o principios de junio\n" +
                    "Fiestas de la antioqueñidad y el desfile de Mitos y leyendas, en le mes de agosto\n" +
                    "Semana de la Juventud y El Deporte con el reinado Miss Montañera, en le mes de septiembre\n" +
                    "Fiesta de la Juventud\n" +
                    "Feria de ganado cada mes.\n" ));
            listaActividades.add(new Datos("Economía",R.drawable.economia,"La economía de Santo Domingo se basa en la ganadería, una fortaleza tradicional del municipio," +
                    " y en el cultivo de caña de azúcar y café, además de la mínería en como el oro"));
            listaActividades.add(new Datos("Ecología",R.drawable.ecologia,"Salto del Pérez, en la vía hacia Alejandría.\n" +
                    "Aguas termales en la vereda los naranjos, vía hacia Alejandría, son 3 piscinas con agua tibia que brota de la montaña, el lugar cuenta con tienda.\n" +
                    "Estación del tren en el corregimiento de Porce\n" +
                    "Túnel de la Quiebra, en el corregimiento de Santiago\n" +
                    "Charcos en todos sus corregimientos, son especialmente visitados los de Santiago, Versalles y Porce.\n" +
                    "Cascada´s en la vereda la chorrera, en la vía hacia Cisneros, la primera cascada posee un pequeño charco, y la segunda es una imponente caída de 50 metros en la montaña.\n" +
                    "Trapiches paneleros"));
            listaActividades.add(new Datos("Museos",R.drawable.museo,"Tomás Carrasquilla, escritor\n" +
                    "Francisco de Paula Rendón, escritor\n" +
                    "Magda Moreno, escritora\n" +
                    "Fernando Toro Saldarriaga, historiador\n" +
                    "Margarita María Monsalve Estrada, Bióloga, Docente"));
            listaActividades.add(new Datos("Iglesia",R.drawable.iglesia,"La Iglesia de Santo Domingo de Guzmán es un templo colombiano de culto católico bajo la advocación de Santo Domingo de Guzmán, está ubicado en el municipio de Santo Domingo (Antioquia) y pertenece a la jurisdicción eclesiástica de la Diócesis de Girardota.1," +
                    "El templo fue diseñado por el sonsoneño Heliodoro Ochoa," +
                    " cuenta con una cúpula de 55 m de altura y 8.80 m de diámetro; las torres tienen 80 m de altura."));
            listaActividades.add(new Datos("Hoteles",R.drawable.hoteles,"Hoteles de naturaleza\n" +
                    "Están situados cerca de zonas naturales de interés como parques naturales, reservas y áreas protegidas. Las estancias suelen ser de muchos días.\n" +
                    "\n" +
                    "El turismo ecológico es una de las actividades que está creciendo por las variedades que la naturaleza y las costumbres que los habitantes nos brindan, como la naturaleza,que es la única y verdadera fuente de descanso y paz, por lo tanto, se debe ser muy responsables para no causar daño a la naturaleza ni a los nativos de la región. Debido a su rápido crecimiento ha contribuido al desarrollo de la actividad turística.\n" +
                    "\n" +
                    "Hoteles-apartamento o apartahoteles\n" +
                    "Son establecimientos que por su estructura y servicio disponen de la instalación adecuada para la conservación, instalación y consumo de alimentos dentro de la unidad de alojamiento. Se clasifican en cinco categorías identificadas por estrellas doradas y su símbolo son las letras HA sobre fondo verde.\n" +
                    "\n" +
                    "Albergues turísticos\n" +
                    "Establecimiento que atiende al turismo durante estancias que suelen ser entre varios días y varias semanas. Suelen ser económicos y entre ellos cabe destacar los albergues juveniles. Estos frecuentemente alquilan camas en un dormitorio y comparten baño, cocina y sala de estar aunque muchos disponen también de habitaciones privadas.\n" +
                    "\n"));
        }
}
