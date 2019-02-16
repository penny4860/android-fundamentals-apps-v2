Android Developer Fundamentals (Version 2)
==========================================

## Android fundamentals 04.1: Clickable images : [DroidCafe](DroidCafe/)

* floating 버튼을 누르면 다른 activity를 시작하는 예제
	* intent 객체 생성
	* intent를 사용해서 새로운 activity 시작
* [tutorial](https://codelabs.developers.google.com/codelabs/android-training-clickable-images/index.html?index=..%2F..%2Fandroid-training#0)


## Android fundamentals 04.5: RecyclerView : [RecyclerView](RecyclerView/)

<img src="https://codelabs.developers.google.com/codelabs/android-training-create-recycler-view/img/86fabc5476249934.png" height="300">

* [floating 버튼에 아이콘을 추가](https://codelabs.developers.google.com/codelabs/android-training-create-recycler-view/index.html?index=..%2F..android-training#2)

* RecyclerView 사용방법
	1) RecyclerView 위치를 layout으로 지정
	2) DataItem class 정의
	3) Adaptor class 정의
	4) Activity에서 RecyclerView를 표시


## ImageRecyclerView : [ImageRecyclerView](ImageRecyclerView/)

* MainActivity 클래스
* Adapter 클래스
* ImageViewHolder 클래스

## 카메라에서 사진찍기 : [TakePicture](TakePicture/)


## ImageView

* Assets 디렉토리에 있는 이미지 파일을 띄우기

```
AssetManager assetManager = getAssets();
InputStream istr = null;
try {
    istr = assetManager.open("donut_circle.png");
} catch (IOException e) {
    e.printStackTrace();
}
Bitmap bitmap = BitmapFactory.decodeStream(istr);
imageView.setImageBitmap(bitmap);
```	

* Resource에 있는 이미지 파일을 띄우기

```	
imageView.setImageResource(R.drawable.donut_circle);
```	







