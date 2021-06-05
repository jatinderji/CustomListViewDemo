package com.jatin.customlistviewdemo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private Activity context;
    private ArrayList<MyRow> users;

    private String names[] = {
            "Cathy",
            "Ayesha",
            "Jassi",
            "Pooja",
            "Sonia",
            "Ayesha",
            "Jatinder",
            "Manisha",
            "Parteek",
            "Sarthak"
    };
    private String contacts[]={
            "7696965611",
            "7696965612",
            "7696965613",
            "7696965614",
            "7696965615",
            "7696965616",
            "7696965617",
            "7696965618",
            "7696965619",
            "7696965610"
    };

    private int images[] = {
            R.drawable.user_one,
            R.drawable.user_two,
            R.drawable.user_three,
            R.drawable.user_four,
            R.drawable.user_five,
            R.drawable.user_six,
            R.drawable.user_seven,
            R.drawable.user_eight,
            R.drawable.user_nine,
            R.drawable.user_ten,
    };

    public MyAdapter(Activity context) {
        this.context = context;
        users = new ArrayList<>();
        for(int i=0;i<names.length;i++){
            users.add(new MyRow(names[i],contacts[i],images[i]));
        }
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        final View rootView = inflater.inflate(R.layout.my_layout, null, false);
        // Get the reference of each view
        ImageView imageView = rootView.findViewById(R.id.image);
        TextView name = rootView.findViewById(R.id.txtName);
        TextView contact = rootView.findViewById(R.id.txtContact);

        // Set the data
        imageView.setImageResource(images[position]);
//        imageView.setImageResource(users.get(position).getImageId());
        name.setText(names[position]);
        contact.setText(contacts[position]);
        // return the root view
        return rootView;
    }
}
