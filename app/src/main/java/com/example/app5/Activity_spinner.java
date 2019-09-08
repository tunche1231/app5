package com.example.app5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Activity_spinner extends BaseAdapter {
    Context c;
    List<Persona> datos;
    int layout;

    public Activity_spinner(Context c, List<Persona> datos, int layout) {
        this.c = c;
        this.datos = datos;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return datos.size();
    }

    @Override
    public Object getItem(int i) {
        return datos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(c);
        view = inflater.inflate(layout,null);
        TextView tv = view.findViewById(R.id.nombre);
        tv.setText((datos.get(i)).nombre);

        TextView tv2 = view.findViewById(R.id.dni);
        tv2.setText((datos.get(i)).dni);

        ImageView tv3 = view.findViewById(R.id.icono);
        tv3.setImageResource((datos.get(i)).icono);
        return view;
    }
}
