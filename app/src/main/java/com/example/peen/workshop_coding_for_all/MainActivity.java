package com.example.peen.workshop_coding_for_all;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img_feed = (ImageView) findViewById(R.id.img_feed);
        Bitmap imagenAndroid = BitmapFactory.decodeResource(getResources(),R.drawable.test);
        img_feed.setImageBitmap(imagenAndroid);

        TextView caption = (TextView) findViewById(R.id.caption);
        caption.setText(Html.fromHtml("<p><b>Pattarapol</b>    ขอแสดงความยินดีกับคู่บ่าวสาวด้วยนะครับ</p>"));

        ImageView img_feed2 = (ImageView) findViewById(R.id.img_feed2);
        img_feed2.setImageBitmap(imagenAndroid);



    }
}
