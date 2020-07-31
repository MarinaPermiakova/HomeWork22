package com.example.android.com.homework22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class Adapter extends BaseAdapter {
    private List<Items> items;
    private LayoutInflater inflater;

    Adapter(Context context, List<Items> items) {
        if (items == null){
            this.items = new ArrayList<>();
        } else {
            this.items = items;
        }
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.size();
    }


    @Override
    public Items getItem(int i) {
        if (i < items.size()){
            return items.get(i);
        } else
            return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View listItemView = view;
        if (listItemView == null) {
            listItemView = inflater.inflate(R.layout.item_view, viewGroup, false);
        }

        final Items item = items.get(i);

        TextView textView1 = (TextView) listItemView.findViewById(R.id.textView);
        textView1.setText(item.getString1());

        TextView textView2 = (TextView) listItemView.findViewById(R.id.textView2);
        textView2.setText(item.getString2());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(item.getImageId());

        Button deleteBtn = (Button) listItemView.findViewById(R.id.delete_button);
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                items.remove(i);
                notifyDataSetChanged();
            }
        });
        return listItemView;
    }
}
