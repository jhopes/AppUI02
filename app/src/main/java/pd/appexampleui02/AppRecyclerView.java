package pd.appexampleui02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;

public class AppRecyclerView extends AppCompatActivity {
    RecyclerView recView;
    //String colors[] = {"White", "Black", "Yellow", "Green", "Orange", "Purple", "Brown", "Blue", "Red"};
    //int[] colorImages={R.mipmap.ic_colors,R.mipmap.ic_colors,R.mipmap.ic_colors,R.mipmap.ic_colors,R.mipmap.ic_colors,R.mipmap.ic_colors,R.mipmap.ic_colors,R.mipmap.ic_colors,R.mipmap.ic_colors,R.mipmap.ic_colors};
    ArrayList<Titular> datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_recycler_view);

        datos = new ArrayList<Titular>();
        for(int i=0; i<50; i++)
            datos.add(new Titular("Título " + i, "Subtítulo item " + i));

        //Inicialización RecyclerView
        recView = (RecyclerView) findViewById(R.id.rvcolors);
        recView.setHasFixedSize(true);

        final AdaptadorTitulares adaptador = new AdaptadorTitulares(datos);

        recView.setAdapter(adaptador);
        recView.setLayoutManager(
                new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        //String[] from={"name","image"};//string array
        //int[] to={R.id.textView,R.id.imageView};
        //SimpleAdapter simpleAdapter=new SimpleAdapter(this,colors,,from,to);
    }
}
