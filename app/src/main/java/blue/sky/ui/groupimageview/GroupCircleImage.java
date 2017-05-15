package blue.sky.ui.groupimageview;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import blue.sky.ui.GroupImageView;

public class GroupCircleImage extends AppCompatActivity {
    GroupImageView group, group1, group2, group3, group4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_cirle_image);
        group= (GroupImageView) findViewById(R.id.img);
        group.setCircleGroupImage(1, BitmapFactory.decodeResource(getResources(),R.drawable.aa));
        group1= (GroupImageView) findViewById(R.id.img1);
        group1.setCircleGroupImage(2,BitmapFactory.decodeResource(getResources(),R.drawable.aa),
                BitmapFactory.decodeResource(getResources(),R.drawable.b));
        group2= (GroupImageView) findViewById(R.id.img2);
        group2.setCircleGroupImage(3,BitmapFactory.decodeResource(getResources(),R.drawable.aa),
                BitmapFactory.decodeResource(getResources(),R.drawable.b),
                BitmapFactory.decodeResource(getResources(),R.drawable.c));
        group3= (GroupImageView) findViewById(R.id.img3);
        group3.setCircleGroupImage(4,BitmapFactory.decodeResource(getResources(),R.drawable.aa),
                BitmapFactory.decodeResource(getResources(),R.drawable.b),
                BitmapFactory.decodeResource(getResources(),R.drawable.c),
                BitmapFactory.decodeResource(getResources(),R.drawable.d));
        group4= (GroupImageView) findViewById(R.id.img4);
        group4.setCircleGroupImage(100,BitmapFactory.decodeResource(getResources(),R.drawable.aa),
                BitmapFactory.decodeResource(getResources(),R.drawable.b),
                BitmapFactory.decodeResource(getResources(),R.drawable.c));
    }

    public void round(View view) {
        startActivity(new Intent(this, GroupRoundImage.class));
        finish();
    }
}
