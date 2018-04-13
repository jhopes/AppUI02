package pd.appexampleui02;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by P&D on 9/04/2018.
 */

public class AdaptadorTitulares
        extends RecyclerView.Adapter<AdaptadorTitulares.TitularesViewHolder>  {

    public static class TitularesViewHolder
            extends RecyclerView.ViewHolder {

        private TextView txtTitulo;
        private TextView txtSubtitulo;

        public TitularesViewHolder(View itemView) {
            super(itemView);

            txtTitulo = (TextView)itemView.findViewById(R.id.LblTitulo);
            txtSubtitulo = (TextView)itemView.findViewById(R.id.LblSubTitulo);
        }

        public void bindTitular(Titular t) {
            txtTitulo.setText(t.getTitulo());
            txtSubtitulo.setText(t.getSubtitulo());
        }
    }
    private ArrayList<Titular> datos;

    //...

    public AdaptadorTitulares(ArrayList<Titular> datos) {
        this.datos = datos;
    }

    @Override
    public TitularesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.listitem_titular, viewGroup, false);

        TitularesViewHolder tvh = new TitularesViewHolder(itemView);

        return tvh;
    }

    @Override
    public void onBindViewHolder(TitularesViewHolder viewHolder, int pos) {
        Titular item = datos.get(pos);

        viewHolder.bindTitular(item);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    //...
}

