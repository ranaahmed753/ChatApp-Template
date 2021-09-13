package com.codecamp.chatapptemplate.viewholder;

import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codecamp.chatapptemplate.R;
import com.codesgood.views.JustifiedTextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatViewHolder extends RecyclerView.ViewHolder {
    public CircleImageView chatImage;
    public JustifiedTextView chatName,chatMessage;
    public RelativeLayout chatMainLayout;
    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);
        chatImage = itemView.findViewById(R.id.chatImageID);
        chatName = itemView.findViewById(R.id.chatNameID);
        chatMessage = itemView.findViewById(R.id.chatmessageID);
        chatMainLayout = itemView.findViewById(R.id.chatMainLayoutID);
    }
}
