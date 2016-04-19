package com.example.wansu.spinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // uicontrols
    Spinner spCountries;
    Spinner spBusinessType;
    Button btnsubmit;

    //class members
    String businessType[] = { "Automobile", "Food", "Computers", "Education",
            "Personal", "Travel" };
    ArrayAdapter<String> adapterBusinessType;

    // local members
    String sbusinesstype,scountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spCountries = (Spinner) findViewById(R.id.spCountries);
        spBusinessType = (Spinner) findViewById(R.id.spBussinessType);
        btnsubmit = (Button)findViewById(R.id.button);

        // Initialize and set Adapter
        adapterBusinessType = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, businessType);
        spBusinessType.setAdapter(adapterBusinessType);

        /* Country Item Selected Listener
        spCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v, int position, long id)
            {
                // On selecting a spinner item
                String item = adapter.getItemAtPosition(position).toString();
                // Showing selected spinner item
                Toast.makeText(getApplicationContext(),
                        "Selected Country : " + item, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        // Business Type Item Selected Listener
        spBusinessType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {

            @Override
            public void onItemSelected(AdapterView<?> adapter, View v, int position, long id)
            {
                // On selecting a spinner item
                String item = adapter.getItemAtPosition(position).toString();
                // Showing selected spinner item
                Toast.makeText(getApplicationContext(), "Bussiness Type : " + item, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });*/

            btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text = spCountries.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),
                        "Bussiness Type : " + Text, Toast.LENGTH_LONG).show();
                String Text2 = spBusinessType.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),
                        "Bussiness Type : " + Text2, Toast.LENGTH_LONG).show();
            }
        });
};
}