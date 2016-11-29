package com.sarath.practice;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sarath on 11/28/2016.
 */

public class FragmentB extends Fragment{

    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.tvFragB);
    }

    public void changeData(int i) {
        Resources res = getResources();
        String[] description = res.getStringArray(R.array.description);
        textView.setText(description[i]);
    }
}
/* this class is for interfragment communication
public class FragmentB extends Fragment {
    TextView tvfragB;
    String data;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_b,container,false);
        if(savedInstanceState==null){

        }else {
            data=savedInstanceState.getString("text");
            TextView myText = (TextView) view.findViewById(R.id.tvFragB);
            myText.setText(data);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvfragB= (TextView) getActivity().findViewById(R.id.tvFragB);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",data);
    }

    public void changeText(String data){
        this.data= data;
        tvfragB.setText(data);

    }
}
*/
