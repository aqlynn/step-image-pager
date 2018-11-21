package com.linxk.imagepager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.linxk.library.StepImagePagerActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linxiaoke on 7/21/18.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StepImagePagerActivity.ImageSize imageSize = new StepImagePagerActivity.ImageSize(0, 0);
                List<String> photoPaths = new ArrayList<String>();
                photoPaths.add("http://bbsimg.zhibo8.cc/bbsimg/2018-08-02/20180802205007_873.jpg");
                photoPaths.add("http://pic5.nipic.com/20100103/3279936_135704058874_2.jpg");
                photoPaths.add("http://08.imgmini.eastday.com/mobile/20180121/20180121082236_cb320c44c26d567d65dcedb2fd95b02f_1.jpeg");
                StepImagePagerActivity.startImagePagerActivity(MainActivity.this, photoPaths, 0, imageSize);
            }
        });
    }
}
