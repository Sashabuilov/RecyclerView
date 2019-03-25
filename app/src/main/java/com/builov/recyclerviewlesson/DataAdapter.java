package com.builov.recyclerviewlesson;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<User_Info>users;

    DataAdapter(Context context, List<User_Info> users) {
        this.users = users;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int position) {

        User_Info user_info = users.get(position);
        viewHolder.imageView.setImageResource(user_info.getImage());
        viewHolder.nameView.setText(user_info.getFirstname());
        viewHolder.companyView.setText(user_info.getLastname());
        viewHolder.ageView.setText(Integer.toString(user_info.getAge()));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView nameView, companyView, ageView;
        ViewHolder(View view){
            super(view);
            imageView = view.findViewById(R.id.image);
            nameView = view.findViewById(R.id.firstname);
            companyView = view.findViewById(R.id.lastname);
            ageView = view.findViewById(R.id.age);
        }
    }
}
