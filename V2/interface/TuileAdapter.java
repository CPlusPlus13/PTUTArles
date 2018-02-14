package com.ptut.projetptut_v1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ptut.projetptut_v1.Semantique.Tclassique;

import java.util.ArrayList;

public class TuileAdapter extends ArrayAdapter<Tclassique> {

    private static class MyViewHolder {
        private TextView img;
        private TextView text;
    }

    public TuileAdapter(Context context, ArrayList<Tclassique> items) {
        super(context,0, items);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        /*ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(this.getContext()).inflate(R.layout.affichage_tuile, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.img= convertView.findViewById(R.id.imgTuile);
            viewHolder.text= convertView.findViewById(R.id.textTuile);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Tclassique item = getItem(position);
        if (item!= null) {
            // My layout has only one TextView
            // do whatever you want with your string and long
           //viewHolder.img.setImageResource(R.drawable.ic_home);
            viewHolder.img.setText(item.getidPanneau());
            viewHolder.text.setText(item.getPhrase());
        }*/

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.affichage_tuile,parent, false);
        }

        MyViewHolder viewHolder = (MyViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new MyViewHolder();
            viewHolder.img = (TextView) convertView.findViewById(R.id.imgTuile);
            viewHolder.text = (TextView) convertView.findViewById(R.id.textTuile);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Tclassique tweet = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.img.setText(tweet.getidTuile());
        viewHolder.text.setText(tweet.getPhrase());

        return convertView;
    }

}
