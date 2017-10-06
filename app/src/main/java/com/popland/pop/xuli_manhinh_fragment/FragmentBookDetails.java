package com.popland.pop.xuli_manhinh_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hai on 19/07/2016.
 */
public class FragmentBookDetails extends Fragment {//this Fragment added into Landscape Main screen
    TextView TVtitle, TVauthor, TVprice, TVdescription;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_book_detail,container,false);
        TVtitle = (TextView)v.findViewById(R.id.TVtitle);
        TVauthor = (TextView)v.findViewById(R.id.TVauthor);
        TVprice = (TextView)v.findViewById(R.id.TVprice);
        TVdescription = (TextView)v.findViewById(R.id.TVdescription);
        return v;
    }
    public void nhandulieu(BookDetails bookDetails){
        TVtitle.setText(bookDetails.title);
        TVauthor.setText(bookDetails.author);
        TVprice.setText(bookDetails.price+"");
        TVdescription.setText(bookDetails.description);
    }
}
