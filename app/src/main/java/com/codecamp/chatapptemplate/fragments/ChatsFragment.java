package com.codecamp.chatapptemplate.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.codecamp.chatapptemplate.R;
import com.codecamp.chatapptemplate.adapter.ActiveChatAdapter;
import com.codecamp.chatapptemplate.adapter.ChatAdapter;
import com.codecamp.chatapptemplate.model.ActiveChat;
import com.codecamp.chatapptemplate.model.Chat;

import java.util.ArrayList;

public class ChatsFragment extends Fragment {
    private RecyclerView chatRecyclerView,activeChatRecyclerView;
    private ArrayList<Chat> chatList;
    private ChatAdapter chatAdapter;
    private ArrayList<ActiveChat> activeChatList;
    private ActiveChatAdapter activeChatAdapter;
    private RelativeLayout createRoomButton;
    private NestedScrollView parentRelativeLayout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chats_layout,container,false);
        chatRecyclerView = view.findViewById(R.id.chatRecyclerViewID);
        activeChatRecyclerView = view.findViewById(R.id.activeChatRecyclerViewID);
        createRoomButton = view.findViewById(R.id.createRoomRelativeLayoutID);
        parentRelativeLayout = view.findViewById(R.id.parentRelativeLayoutID);
        chatList = new ArrayList<>();
        chatAdapter = new ChatAdapter(getContext(),chatList);

        createRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createRoomButton.startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in));
                Toast.makeText(getContext(),"add new friend",Toast.LENGTH_SHORT).show();
            }
        });
        for(int i=0;i<=100;i++)
        {
            chatList.add(new Chat(R.drawable.avatar_person,"User"+i,"hey user"+i+" whats going on"));
        }

        chatRecyclerView.setHasFixedSize(true);
        chatRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        chatRecyclerView.setAdapter(chatAdapter);
        createActiveChat();
        return view;
    }

    private void createActiveChat()
    {
        activeChatList = new ArrayList<>();
        activeChatAdapter = new ActiveChatAdapter(getContext(),activeChatList);
        for(int j=0;j<=100;j++)
        {
            activeChatList.add(new ActiveChat(R.drawable.avatar_person));
        }

        activeChatRecyclerView.setHasFixedSize(true);
        activeChatRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        activeChatRecyclerView.setAdapter(activeChatAdapter);
    }


}
