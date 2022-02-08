package com.example.learnalphabets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

     Context context;
     String[] lettersName;
     int[] lettersImage;

    private LayoutInflater layoutInflater;
    public CustomAdapter(Context context,String[] lettersName,int[] lettersImage){
        this.context = context;
        this.lettersName = lettersName;
        this.lettersImage = lettersImage;
    }

    @Override
    public int getCount() {
        return lettersName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ImageView imageView;

        if(view == null)
        {
            layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.sample_view,viewGroup,false);
        }
        imageView = view.findViewById(R.id.sampleLetterIcon);
        textView = view.findViewById(R.id.sampleLetterText);
        imageView.setImageResource(lettersImage[i]);
        textView.setText(lettersName[i]);
        return view;
    }
}
