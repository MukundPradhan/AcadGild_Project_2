package com.assignments.acadgild.project_2_IMDB.CustomAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.assignments.acadgild.project_2_IMDB.R;
import com.assignments.acadgild.project_2_IMDB.model.Movies;

import java.util.ArrayList;

/**
 * Created by mukund on 17/4/16.
 */
public class MoviesAdapter extends BaseAdapter {

    private ArrayList<Movies> moviesArrayList;
    private LayoutInflater inflater;
    private Context mContext;

    public MoviesAdapter(Context mContext, ArrayList<Movies> moviesArrayList) {
        this.moviesArrayList = moviesArrayList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return moviesArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return moviesArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if(convertView==null){
            convertView=inflater.inflate(R.layout.row,viewGroup,false);
        }
        TextView txtTitle = (TextView) convertView.findViewById(R.id.tvTitle);

        Movies movies = moviesArrayList.get(position);
        

        return null;
    }
}
