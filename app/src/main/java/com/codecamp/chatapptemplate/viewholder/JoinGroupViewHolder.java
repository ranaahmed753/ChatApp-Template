package com.codecamp.chatapptemplate.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codecamp.chatapptemplate.R;

public class JoinGroupViewHolder extends RecyclerView.ViewHolder {
    public ImageView groupImage;
    public TextView groupName;
    public RelativeLayout joinGroupButton;
    public JoinGroupViewHolder(@NonNull View itemView) {
        super(itemView);
        groupImage = itemView.findViewById(R.id.groupImageID);
        groupName = itemView.findViewById(R.id.groupNameID);
        joinGroupButton = itemView.findViewById(R.id.joinButtonID);
    }
}
