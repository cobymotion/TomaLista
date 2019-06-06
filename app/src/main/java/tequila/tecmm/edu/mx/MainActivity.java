package tequila.tecmm.edu.mx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import tequila.tecmm.edu.mx.adaptadores.AdaptadorCurso;
import tequila.tecmm.edu.mx.model.Cursos;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView)findViewById(R.id.rv);
        llenarRecycler(); /// provisional
    }

    private void llenarRecycler() {
        Cursos c1 = new Cursos();
        c1.setNombre("Moviles");
        c1.setPorcentaje(20);
        Cursos c2 = new Cursos();
        c2.setNombre("Base de datos");
        c2.setPorcentaje(30);
        Cursos c3 = new Cursos();
        c3.setNombre("Paginas web");
        c3.setPorcentaje(30);
        List<Cursos> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        AdaptadorCurso adaptador =
                 new AdaptadorCurso(this,lista);
        LinearLayoutManager llm = new LinearLayoutManager
                (this);
        rv.setLayoutManager(llm);
        rv.setAdapter(adaptador);
    }


}
