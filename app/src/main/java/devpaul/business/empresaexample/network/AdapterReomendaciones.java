package devpaul.business.empresaexample.network;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import devpaul.business.empresaexample.R;

public class AdapterReomendaciones extends RecyclerView.Adapter<AdapterReomendaciones.ViewHolder> {
    private Context mcontext;
    private ArrayList<recomendaciones> mlista;

    private List<recomendaciones> recomendaciones;

   /* public Adapter(Context context, ArrayList<taxielemento>lista){
        this.mcontext=context;
        this.mlista=lista;
    }*/

    public AdapterReomendaciones(Context mcontext, List<recomendaciones> recomendaciones) {
        this.mcontext = mcontext;
        this.recomendaciones = recomendaciones;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recomendaciones,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


       /* holder.nombre.setText("Nombre: "+taxis.get(position).getNombre());
        holder.matricula.setText("Matricula: "+taxis.get(position).getMatricula());
        holder.modelo.setText("Modelo: "+taxis.get(position).getModelo());
        holder.numero.setText("Numero: "+taxis.get(position).getTelefono());
        int i=holder.getAbsoluteAdapterPosition();

        holder.llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+taxis.get(i).getTelefono()));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mcontext.startActivity(intent);
            }
        });*/
        holder.nombre.setText("Nombre: "+recomendaciones.get(position).getName());
        holder.descripcion.setText("Descripcion: "+recomendaciones.get(position).getDescription());
        holder.fecha.setText("Fecha: "+recomendaciones.get(position).getFecha());

    }

    @Override
    public int getItemCount() {
        System.out.println("No. Registros: "+recomendaciones.size());
        return recomendaciones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView nombre;
        public TextView descripcion;
        public TextView fecha;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre=itemView.findViewById(R.id.nombre_text);
            descripcion=itemView.findViewById(R.id.desc_text);
            fecha=itemView.findViewById(R.id.fecha_text);

        }

    }

}
