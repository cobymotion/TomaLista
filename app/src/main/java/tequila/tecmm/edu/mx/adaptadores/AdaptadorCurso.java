package tequila.tecmm.edu.mx.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
// -----------------
import java.util.List;
// -----------------
import de.hdodenhof.circleimageview.CircleImageView;
import tequila.tecmm.edu.mx.R;
import tequila.tecmm.edu.mx.TomaListaActividad;
import tequila.tecmm.edu.mx.listeners.OnItemListenerProyecto;
import tequila.tecmm.edu.mx.model.Cursos;

public class AdaptadorCurso extends
        RecyclerView.Adapter<AdaptadorCurso.ViewHolderCursos>
     implements OnItemListenerProyecto{

    private final Context context;
    private List<Cursos> lista;

    public AdaptadorCurso(Context context, List<Cursos> a){
        this.context = context;
        this.lista = a;
    }

    @NonNull
    @Override
    public ViewHolderCursos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_curso,viewGroup,
                        false);
        return new ViewHolderCursos(v,
                this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCursos viewHolderCursos, int i) {
        Cursos curso = lista.get(i);
        viewHolderCursos.txtNombrecurso.
                setText(curso.getNombre());
        viewHolderCursos.txtPorcentajeCurso.
                setText("Asistencia: " +
                curso.getPorcentaje());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    @Override
    public void onItemClick(View v, int posicion) {

        Intent i = new Intent(context,
                TomaListaActividad.class);
        /*i.putExtra("idCurso",
                   lista.get(posicion).getId());*/
        context.startActivity(i);

    }

    public static class ViewHolderCursos
    extends RecyclerView.ViewHolder implements
                View.OnClickListener {

        TextView txtNombrecurso;
        TextView txtPorcentajeCurso;
        CircleImageView imagen;

        OnItemListenerProyecto listener;


        public ViewHolderCursos(@NonNull View itemView
                , OnItemListenerProyecto listener) {
            super(itemView);
            this.listener = listener;
            txtNombrecurso = (TextView)itemView
                             .findViewById
                                     (R.id.txtNombreCurso);
            txtPorcentajeCurso = (TextView) itemView
                             .findViewById(R.id.txtPorcentaje);
            imagen = (CircleImageView)itemView.
                      findViewById(R.id.imgCurso);
            itemView.setOnClickListener(this);

        }

            @Override
            public void onClick(View v) {
                listener.onItemClick(v,
                        getAdapterPosition());
            }
        }

}
