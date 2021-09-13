package com.codecamp.chatapptemplate.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codecamp.chatapptemplate.ChatPageActivity;
import com.codecamp.chatapptemplate.MainActivity;
import com.codecamp.chatapptemplate.R;
import com.codecamp.chatapptemplate.model.ActiveChat;
import com.codecamp.chatapptemplate.viewholder.ActiveChatViewHolder;

import java.util.ArrayList;

public class ActiveChatAdapter extends RecyclerView.Adapter<ActiveChatViewHolder> {
    private Context mContext;
    private ArrayList<ActiveChat> activeChatList;

    public ActiveChatAdapter(Context mContext, ArrayList<ActiveChat> activeChatList) {
        this.mContext = mContext;
        this.activeChatList = activeChatList;
    }

    @NonNull
    @Override
    public ActiveChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.active_chat,parent,false);
        return new ActiveChatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActiveChatViewHolder holder, int position) {
        holder.activeChatImage.setImageResource(activeChatList.get(position).getActiveChat());
        holder.activeChatLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.activeChatLayout.startAnimation(AnimationUtils.loadAnimation(mContext, android.R.anim.fade_in));
                Intent intent = new Intent(mContext, ChatPageActivity.class);
                //intent.putExtra("userName",activeChatList.get(position).getChatName());
                mContext.startActivity(intent);
                ((MainActivity)mContext).finish();
                //Toast.makeText(mContext,"clicked on+"+activeChatList.get(position).getActiveChat(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return activeChatList.size();
    }
}
