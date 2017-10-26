package com.uepapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by ehaadmin on 10/23/17.
 */

public class EventAdapter extends ArrayAdapter<EventUEPA> {
    public EventAdapter(@NonNull Context context, @LayoutRes int resource, List<EventUEPA> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
//            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);

        }

        return convertView;

    }

}
