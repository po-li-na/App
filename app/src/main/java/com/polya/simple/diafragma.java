package com.polya.simple;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class diafragma extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savee){
        super.onCreateView(inflater, container, savee);
        View view = inflater.inflate(R.layout.dialogfragment,
                container, false);
        click(view);
        return view;
        
    }
    void click(View view){
        ImageButton pl=(ImageButton) view.findViewById(R.id.play1);
        ImageButton res=(ImageButton) view.findViewById(R.id.restart);
        ImageButton cl=(ImageButton) view.findViewById(R.id.close1);
        pl.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dismiss();
                    }
                }
        );
        res.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dismiss();
                        getActivity().recreate();
                    }
                }
        );
        cl.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dismiss();
                        getActivity().finish();
                    }
                }
        );
        
        
    }

   
}