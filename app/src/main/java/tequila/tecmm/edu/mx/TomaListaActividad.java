package tequila.tecmm.edu.mx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TomaListaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toma_lista_actividad);
    }


    /// metodos para las tareas de la ventana
    public void justificar(View v){
        Log.i("LISTA","Justificar");
    }

    public void falta(View v){
        Log.i("LISTA","Falta");
    }

    public void asistencia(View v){
        Log.i("LISTA","Asistencia");
    }

    public void anterior(View v){
        Log.i("LISTA","Anterior");
    }

    public void siguiente(View v){
        Log.i("LISTA","Siguiente");
    }

}
