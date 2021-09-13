package com.codecamp.chatapptemplate.viewholder;

import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codecamp.chatapptemplate.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ActiveChatViewHolder extends RecyclerView.ViewHolder {
    public CircleImageView activeChatImage;
    public RelativeLayout activeChatLayout;
    public ActiveChatViewHolder(@NonNull View itemView) {
        super(itemView);
        activeChatImage = itemView.findViewById(R.id.activeChatImageID);
        activeChatLayout = itemView.findViewById(R.id.activeChatRelativeLayoutID);
    }
}
