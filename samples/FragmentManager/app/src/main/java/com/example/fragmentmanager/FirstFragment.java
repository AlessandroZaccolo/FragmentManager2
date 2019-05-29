package com.example.fragmentmanager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {


    interface IFirstFragmentCommChannel {
        void sendData (int num);
    }

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_first, container, false);

        final Button btnUpdate = root.findViewById(R.id.fragment_first__btn__update);
        btnUpdate.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fragment_first__btn__update){
            Log.i("First fragment", "button clicked");
        }
    }
}
