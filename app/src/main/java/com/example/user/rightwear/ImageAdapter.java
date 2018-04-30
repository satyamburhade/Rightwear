package com.example.user.rightwear;

import android.content.Context;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {

    private Context mcontext;
    private int[]Imageid=new int[]{R.drawable.d, R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,
    };

    ImageAdapter(Context context){mcontext=context;

    }

    @Override
    public int getCount() {
        return Imageid.length;

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView=new ImageView(mcontext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(Imageid[position]);
        container.addView(imageView,0);
        return imageView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView)object);
    }
}
