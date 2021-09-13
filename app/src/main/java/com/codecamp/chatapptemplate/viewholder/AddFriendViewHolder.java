package com.codecamp.chatapptemplate.viewholder;

import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codecamp.chatapptemplate.R;
import com.codesgood.views.JustifiedTextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class AddFriendViewHolder extends RecyclerView.ViewHolder {
    public CircleImageView addFriendImage;
    public JustifiedTextView addFriendName;
    public RelativeLayout addFriendButton,parentLayout;
    public AddFriendViewHolder(@NonNull View itemView) {
        super(itemView);
        addFriendImage = itemView.findViewById(R.id.addFriendImageViewID);
        addFriendName = itemView.findViewById(R.id.addFreindNameID);
        addFriendButton = itemView.findViewById(R.id.addFriendButtonID);
        parentLayout = itemView.findViewById(R.id.parentLayoutID);
    }
}
