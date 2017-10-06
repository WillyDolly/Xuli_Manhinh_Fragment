package com.popland.pop.xuli_manhinh_fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Communicator{
public static ArrayList<BookDetails> arrlDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrlDetails = new ArrayList<BookDetails>();
        arrlDetails.add(new BookDetails(strings(R.string.book1),53455,"Hawking",strings(R.string.des1)));
        arrlDetails.add(new BookDetails(strings(R.string.book2),75675,"forget",strings(R.string.des2)));
        arrlDetails.add(new BookDetails(strings(R.string.book3),86867,"hawking",strings(R.string.des3)));
    }
    public String strings(int res){//access long strings from strings.xml
        String chuoi = getResources().getString(res);
        return chuoi;
    }
//how to create Landscape screen for activity_main:
     //create layout file with the same name "activity_main"
    // adjust orientation to Landscape
    //add 2 fragments into this layout & divide them in suitable ratio
    @Override
    public void Nhandulieu(int vitri) {
        FragmentBookDetails fragmentBookDetails = (FragmentBookDetails) getFragmentManager().findFragmentById(R.id.fragment3);
        Configuration configuration = getResources().getConfiguration();
        if((fragmentBookDetails!=null)&&(configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)){//check both FragmentBookDetails & screen orientation
            fragmentBookDetails.nhandulieu(arrlDetails.get(vitri));
        }else{
            Intent i = new Intent(MainActivity.this,Main2Activity.class);//use second Activity incase of Portrait screen
        i.putExtra("vitri",vitri);
        startActivity(i);}
    }
}
