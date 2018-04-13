package pd.appexampleui02;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AppListView extends AppCompatActivity {
    ListView listColors;
    String colors[] = {"White", "Black", "Yellow", "Green", "Orange", "Purple", "Brown", "Blue", "Red"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list_view);
        listColors = (ListView) findViewById(R.id.listcolors);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, colors);
        listColors.setAdapter(adapter);
        listColors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(view, colors[position], Snackbar.LENGTH_LONG)
                        .setAction("action", null).show();
            }
        });
    }
}

