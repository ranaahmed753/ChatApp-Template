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
import com.codecamp.chatapptemplate.model.Chat;
import com.codecamp.chatapptemplate.viewholder.ChatViewHolder;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatViewHolder> {
    private Context mContext;
    private ArrayList<Chat> chatList;

    public ChatAdapter(Context mContext, ArrayList<Chat> chatList) {
        this.mContext = mContext;
        this.chatList = chatList;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.chats_item,parent,false);
        return new ChatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        holder.chatMainLayout.startAnimation(AnimationUtils.loadAnimation(mContext, android.R.anim.slide_in_left));
        holder.chatImage.setImageResource(chatList.get(position).getChatImage());
        holder.chatName.setText(chatList.get(position).getChatName());
        holder.chatMessage.setText(chatList.get(position).getChatMessage());

//        holder.chatMainLayout.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                Toast.makeText(mContext,"clicked here",Toast.LENGTH_SHORT).show();
//
//                return false;
//            }
//        });

        holder.chatMainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.chatMainLayout.startAnimation(AnimationUtils.loadAnimation(mContext, android.R.anim.fade_in));
                Intent intent = new Intent(mContext, ChatPageActivity.class);
                intent.putExtra("userName",chatList.get(position).getChatName());
                intent.putExtra("userImage", chatList.get(position).getChatImage());
                mContext.startActivity(intent);
                ((MainActivity)mContext).finish();
                //Toast.makeText(mContext,"clicked on"+chatList.get(position).getChatName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }
}
