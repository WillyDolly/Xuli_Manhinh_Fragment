package com.popland.pop.xuli_manhinh_fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView TVtitle, TVdes, TVauthor, TVprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TVtitle = (TextView)findViewById(R.id.TVtitle);
        TVdes = (TextView)findViewById(R.id.TVdes);
        TVauthor = (TextView)findViewById(R.id.TVauthor);
        TVprice = (TextView)findViewById(R.id.TVprice);
        Intent i  = getIntent();
        int vitri = i.getIntExtra("vitri",99);
        TVtitle.setText(MainActivity.arrlDetails.get(vitri).title);
        TVdes.setText(MainActivity.arrlDetails.get(vitri).description);
        TVauthor.setText(MainActivity.arrlDetails.get(vitri).author);
        TVprice.setText(MainActivity.arrlDetails.get(vitri).price+"");
    }
}
