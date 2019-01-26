package com.example.penny.imagerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> mFileList = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private ImageListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 10; i++) {
                mFileList.addLast("Word " + i);
        }

        // Activity에 RecyclerView를 표시하는 과정
        // 1. recycler view.
        mRecyclerView = findViewById(R.id.recyclerview);
        // 2. adapter
        mAdapter = new ImageListAdapter(this, mFileList);
        // 3. Link (view -> adaptor)
        mRecyclerView.setAdapter(mAdapter);
        // 4. item들이 표시되는 layout 설정
        // mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager horizontalLayoutManagaer = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(horizontalLayoutManagaer);

    }
}
