package com.codecamp.chatapptemplate.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.codecamp.chatapptemplate.R;
import com.codecamp.chatapptemplate.adapter.AddFriendAdapter;
import com.codecamp.chatapptemplate.adapter.JoinGroupAdapter;
import com.codecamp.chatapptemplate.model.AddFriend;
import com.codecamp.chatapptemplate.model.JoinGroup;

import java.util.ArrayList;

import static com.codecamp.chatapptemplate.R.drawable.text_white_back;

public class PeopleFragment extends Fragment {
    private LinearLayout storiesLinearLayout,activeLinearLayout;
    private RelativeLayout storiesRelativeLayout,activeRelativeLayout;
    private TextView addTextView,storiesTextView;
    private RecyclerView addFriendRecyclerView,joinGroupRecyclerView;
    private ArrayList<AddFriend> addFriendList;
    private AddFriendAdapter addFriendAdapter;
    private ArrayList<JoinGroup> joinGroupList;
    private JoinGroupAdapter joinGroupAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.people_layout,container,false);

        storiesLinearLayout = view.findViewById(R.id.storiesLinearLayoutID);
        activeLinearLayout = view.findViewById(R.id.activeLinearLayoutID);
        storiesRelativeLayout = view.findViewById(R.id.storiesRelativeLayoutID);
        activeRelativeLayout = view.findViewById(R.id.activeRelativeLayoutID);
        addTextView = view.findViewById(R.id.addTextViewID);
        storiesTextView = view.findViewById(R.id.storiesText);
        addFriendRecyclerView = view.findViewById(R.id.addFriendRecyclerViewID);
        joinGroupRecyclerView = view.findViewById(R.id.joinGroupRecyclerView);

        storiesLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storiesRelativeLayout.setVisibility(View.VISIBLE);
                activeRelativeLayout.setVisibility(View.INVISIBLE);
                storiesTextView.setTextColor(ContextCompat.getColor(getContext(),R.color.black));
                addTextView.setTextColor(ContextCompat.getColor(getContext(),R.color.gray));

            }
        });

        activeLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activeRelativeLayout.setVisibility(View.VISIBLE);
                storiesRelativeLayout.setVisibility(View.INVISIBLE);
                addTextView.setTextColor(ContextCompat.getColor(getContext(),R.color.black));
                storiesTextView.setTextColor(ContextCompat.getColor(getContext(),R.color.gray));
            }
        });

        joinGroup();
        addFrind();
        return view;
    }

    private void joinGroup()
    {
        joinGroupList = new ArrayList<>();
        joinGroupAdapter = new JoinGroupAdapter(getContext(),joinGroupList);
        for(int b=0;b<=100;b++)
        {
            joinGroupList.add(new JoinGroup(R.drawable.programming_community,"Programming Community"));
        }
        joinGroupRecyclerView.setHasFixedSize(true);
        joinGroupRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        joinGroupRecyclerView.setAdapter(joinGroupAdapter);
    }

    private void addFrind()
    {
        addFriendList = new ArrayList<>();
        addFriendAdapter = new AddFriendAdapter(getContext(),addFriendList);
        for(int a=0;a<=100;a++)
        {
            addFriendList.add(new AddFriend(R.drawable.avatar_person,"Person"+a));
        }
        addFriendRecyclerView.setHasFixedSize(true);
        addFriendRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        addFriendRecyclerView.setAdapter(addFriendAdapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        storiesRelativeLayout.setVisibility(View.VISIBLE);
        activeRelativeLayout.setVisibility(View.INVISIBLE);
        storiesTextView.setTextColor(ContextCompat.getColor(getContext(),R.color.black));
        addTextView.setTextColor(ContextCompat.getColor(getContext(),R.color.gray));
    }
}
