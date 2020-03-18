package com.tectibet.tutorilaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by kharag on 18-03-2020.
 */
public class SliderPagerAdapter extends PagerAdapter {
    private LayoutInflater layoutInflater;
    private Context context;
    private ArrayList<String> image_arraylist;
    public SliderPagerAdapter(Context context, ArrayList<String> image_arraylist) {
        this.context = context;
        this.image_arraylist = image_arraylist;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_slider, container, false);
        ImageView im_slider =view.findViewById(R.id.im_slider);
        Glide.with(context).load(image_arraylist.get(position)).into(im_slider);
        //For Picasso user
      /*  Picasso.with(context.getApplicationContext())
                .load(image_arraylist.get(position))
                .placeholder(R.mipmap.ic_launcher) // optional
                .error(R.mipmap.ic_launcher)         // optional
                .into(im_slider);*/
        container.addView(view);
        return view;
    }
    @Override
    public int getCount() {
        return image_arraylist.size();
    }
    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }
}