package com.example.penny.takepicture;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    TakingPicture takingPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.take).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takingPicture = new TakingPicture();

                Intent takePictureIntent = takingPicture.getTakePhotoIntent(getApplicationContext(),
                        getPackageManager(), getPackageName(),
                        getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                startActivityForResult(takePictureIntent, takingPicture.REQUEST_IMAGE_CAPTURE);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Bitmap bitmap = takingPicture.getImage(requestCode, resultCode);
        if (bitmap != null)
        {
            ((ImageView)findViewById(R.id.ImageView)).setImageBitmap(bitmap);
        }
    }
}


