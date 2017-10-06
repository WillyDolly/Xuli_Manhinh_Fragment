package com.popland.pop.xuli_manhinh_fragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hai on 18/07/2016.
 */
public class
        BookListFragment extends ListFragment {
    ArrayList<String> arrlBook;
    Communicator com;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listfragment,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        com = (Communicator)getActivity();
        arrlBook = new ArrayList<String>();
        arrlBook.add("Brief History Of Time");
        arrlBook.add("How to win friends and influence people");
        arrlBook.add("The Universe in the nutshell");
        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,arrlBook);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        com.Nhandulieu(position);
    }
}
