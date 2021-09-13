package com.codecamp.chatapptemplate.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codecamp.chatapptemplate.ChatPageActivity;
import com.codecamp.chatapptemplate.MainActivity;
import com.codecamp.chatapptemplate.MessageReceiverActivity;
import com.codecamp.chatapptemplate.R;
import com.codecamp.chatapptemplate.model.AddFriend;
import com.codecamp.chatapptemplate.viewholder.AddFriendViewHolder;

import java.util.ArrayList;

public class AddFriendAdapter extends RecyclerView.Adapter<AddFriendViewHolder> {
    private Context mContext;
    private ArrayList<AddFriend> addFriendList;

    public AddFriendAdapter(Context mContext, ArrayList<AddFriend> addFriendList) {
        this.mContext = mContext;
        this.addFriendList = addFriendList;
    }

    @NonNull
    @Override
    public AddFriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.add_friend,parent,false);
        return new AddFriendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddFriendViewHolder holder, int position) {
        holder.addFriendImage.setImageResource(addFriendList.get(position).getAddFriendImage());
        holder.addFriendName.setText(addFriendList.get(position).getAddFriendName());

        holder.addFriendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.addFriendButton.startAnimation(AnimationUtils.loadAnimation(mContext, android.R.anim.fade_in));
            }
        });

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.parentLayout.startAnimation(AnimationUtils.loadAnimation(mContext, android.R.anim.fade_in));
                Intent intent = new Intent(mContext, MessageReceiverActivity.class);
                intent.putExtra("userName",addFriendList.get(position).getAddFriendName());
                mContext.startActivity(intent);
                ((MainActivity)mContext).finish();
            }
        });
    }

    @Override
    public int getItemCount() {
        return addFriendList.size();
    }
}
