package com.example.penny.imagerecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class ImageListAdapter extends RecyclerView.Adapter<ImageListAdapter.ImageViewHolder> {

    private LinkedList<String> mFileList;
    private LayoutInflater mInflater;

    // 1. Adapter의 constructor 구현
    //      1) layout inflator : resource에서 정의한 view를 가져와서 element view를 설정
    //      2) dataset : ListView에 표시할 data 설정
    public ImageListAdapter(Context context, LinkedList<String> fileList)
    {
        mInflater = LayoutInflater.from(context);
        mFileList = fileList;
    }

    // 2. Element View(ViewHolder) 가 생성될때 실행되는 method
    @Override
    public ImageListAdapter.ImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // view 객체를 생성.
        View mItemView = mInflater.inflate(R.layout.image_element, viewGroup, false);
        return new ImageViewHolder(mItemView);
    }

    // 3. ViewHolder 가 서로 바인딩될 때 : index를 얻어서 뷰에 데이터를 설정
    @Override
    public void onBindViewHolder(ImageListAdapter.ImageViewHolder imageViewHolder, int posIndex) {
        String mCurrent = mFileList.get(posIndex);
        imageViewHolder.imageTextView.setText(mCurrent);
    }


    // ViewHolder class 정의
    class ImageViewHolder extends RecyclerView.ViewHolder {
        TextView imageTextView;
        public ImageViewHolder(View itemView) {
            super(itemView);
            imageTextView = itemView.findViewById(R.id.imageFilename);
        }
    }

    @Override
    public int getItemCount() {
        return mFileList.size();
    }

}


