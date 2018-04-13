package pd.appexampleui02;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class AppGridView extends AppCompatActivity {
    GridView gridColors;
    String colors[] = {"White", "Black", "Yellow", "Green", "Orange", "Purple", "Brown", "Blue", "Red"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_grid_view);
        gridColors=(GridView) findViewById(R.id.gridcolors);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, colors);
        gridColors.setAdapter(adapter);
        gridColors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(view, colors[position], Snackbar.LENGTH_LONG)
                        .setAction("action", null).show();
            }
        });
    }
}
