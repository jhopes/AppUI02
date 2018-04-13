package pd.appexampleui02;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class AppSpinner extends AppCompatActivity {
    Spinner spcolors;
    String colors[] = {"-----","White", "Black", "Yellow", "Green", "Orange", "Purple", "Brown", "Blue", "Red"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_spinner);
        spcolors = (Spinner) findViewById(R.id.spinnercolors);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, colors);
        spcolors.setAdapter(adapter);
        spcolors.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(view, colors[position], Snackbar.LENGTH_LONG)
                        .setAction("action", null).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Snackbar.make(parent,"NADA", Snackbar.LENGTH_LONG)
                        .setAction("action", null).show();
            }
        });
        /*spcolors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(view, colors[position], Snackbar.LENGTH_LONG)
                        .setAction("action", null).show();
            }
        });*/
    }
}
