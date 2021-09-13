package com.codecamp.chatapptemplate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.codecamp.chatapptemplate.R;
import com.codecamp.chatapptemplate.model.JoinGroup;
import com.codecamp.chatapptemplate.viewholder.JoinGroupViewHolder;

import java.util.ArrayList;

public class JoinGroupAdapter extends RecyclerView.Adapter<JoinGroupViewHolder> {
    private Context mContext;
    private ArrayList<JoinGroup> joinGroupList;

    public JoinGroupAdapter(Context mContext, ArrayList<JoinGroup> joinGroupList) {
        this.mContext = mContext;
        this.joinGroupList = joinGroupList;
    }

    @NonNull
    @Override
    public JoinGroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.group_items,parent,false);
        return new JoinGroupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JoinGroupViewHolder holder, int position) {
        holder.groupImage.setImageResource(joinGroupList.get(position).getGroupImage());
        holder.groupName.setText(joinGroupList.get(position).getGroupName());
        holder.groupName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.groupName.startAnimation(AnimationUtils.loadAnimation(mContext, android.R.anim.fade_in));
            }
        });
        holder.joinGroupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.joinGroupButton.startAnimation(AnimationUtils.loadAnimation(mContext, android.R.anim.fade_in));
                
            }
        });
    }

    @Override
    public int getItemCount() {
        return joinGroupList.size();
    }
}
