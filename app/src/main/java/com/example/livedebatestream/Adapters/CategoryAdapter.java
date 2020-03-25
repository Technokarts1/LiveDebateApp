package com.example.livedebatestream.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.livedebatestream.Model.Category;
import com.example.livedebatestream.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {
    private List<Category> categoryList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, subtitle;
        public ImageView icon;
        private RelativeLayout main;
        public MyViewHolder(final View parent) {
            super(parent);
            title = (TextView) parent.findViewById(R.id.title);
            subtitle = (TextView) parent.findViewById(R.id.subtitle);
            icon = (ImageView) parent.findViewById(R.id.icon);
            main = (RelativeLayout) parent.findViewById(R.id.main);
            main.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), "Position:" + Integer.toString(getPosition()), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    public CategoryAdapter(List<Category>categoryList){
        this.categoryList=categoryList;
    }
    @Override
    public CategoryAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_list,parent,false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Category row=categoryList.get(position);
        holder.title.setText(row.getTitle());
        holder.subtitle.setText(row.getSubtitle());
        holder.icon.setImageResource(row.getImageId());
    }
    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
