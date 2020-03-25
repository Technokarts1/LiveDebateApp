package com.example.livedebatestream.ui.Fragments;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.livedebatestream.Adapters.CategoryAdapter;
import com.example.livedebatestream.Adapters.CustomPagerAdapter;
import com.example.livedebatestream.Adapters.MyAdapter;
import com.example.livedebatestream.Adapters.TopAdapter;
import com.example.livedebatestream.Adapters.ViewPagerAdapter;
import com.example.livedebatestream.Model.Category;
import com.example.livedebatestream.Model.Item;
import com.example.livedebatestream.Model.Topusers;
import com.example.livedebatestream.R;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {


    // view Pager

    ViewPager viewPager;
    ImageView imageView;
    Runnable runnable;
    Handler handler;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;


    private List<Item> itemList = new ArrayList<>();
    private RecyclerView recyclerview;
    private MyAdapter mAdapter;

    private List<Category> categoryList=new ArrayList<>();
    private RecyclerView Crecyclerview;
    private CategoryAdapter CmAdapter;

    private RecyclerView recyclerview1;


    private List<Topusers> topList=new ArrayList<>();
    private RecyclerView recyclerview2;
    private TopAdapter TmAdapter;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home,container,false);



        ViewPager viewPager1 = (ViewPager) view.findViewById(R.id.viewPager1);
        viewPager1.setAdapter(new CustomPagerAdapter(getActivity()));

        viewPager = (ViewPager) view.findViewById(R.id.viewPager);

        sliderDotspanel = (LinearLayout) view.findViewById(R.id.SliderDots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getActivity());

        viewPager.setAdapter(viewPagerAdapter);
        viewPager1.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];


        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(getActivity());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.inactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.inactive_dot));

                }


                dots[position].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.active_dot));


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        Crecyclerview=(RecyclerView) view.findViewById(R.id.rvCategory01);

        recyclerview=(RecyclerView) view.findViewById(R.id.rvCategory);
        recyclerview1=(RecyclerView) view.findViewById(R.id.rvCategory1);
        recyclerview2=(RecyclerView) view.findViewById(R.id.rvCategory2);


        CmAdapter = new CategoryAdapter(categoryList);
        Crecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        Crecyclerview.setItemAnimator(new DefaultItemAnimator());
        Crecyclerview.setAdapter(CmAdapter);
        prepareCatogeryItem();



        TmAdapter = new TopAdapter(topList);
//        RecyclerView.LayoutManager mLayoutManger = new LinearLayoutManager(getContext());
//        recyclerview.setLayoutManager(mLayoutManger);

        recyclerview2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerview2.setItemAnimator(new DefaultItemAnimator());
        recyclerview2.setAdapter(TmAdapter);
        prepareTopItem();



        mAdapter = new MyAdapter(itemList);
//        RecyclerView.LayoutManager mLayoutManger = new LinearLayoutManager(getContext());
//        recyclerview.setLayoutManager(mLayoutManger);

        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(mAdapter);
        prepareItem();


        recyclerview1.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerview1.setItemAnimator(new DefaultItemAnimator());
        recyclerview1.setAdapter(mAdapter);
        prepareItem();


        return view;
    }

    private void prepareTopItem() {
        Topusers topusers=new Topusers(R.drawable.gates,"Bill Gates","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.mark,"Mark","");
        topList.add(topusers);

        topusers=new Topusers(R.drawable.gates,"Bill Gates","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.mark,"Mark","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.gates,"Bill Gates","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.mark,"Mark","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.gates,"Bill Gates","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.mark,"Mark","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.gates,"Bill Gates","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.mark,"Mark","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.gates,"Bill Gates","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.mark,"Mark","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.gates,"Bill Gates","");
        topList.add(topusers);
        topusers=new Topusers(R.drawable.mark,"Mark","");
        topList.add(topusers);

        TmAdapter.notifyDataSetChanged();
        recyclerview2.setAdapter(TmAdapter);

    }

    private void prepareCatogeryItem() {

        Category category=new Category(R.drawable.home1,"Home","");
        categoryList.add(category);

        category=new Category(R.drawable.trade,"Trading","");
        categoryList.add(category);

        category=new Category(R.drawable.home1,"Home","");
        categoryList.add(category);

        category=new Category(R.drawable.trade,"Trading","");
        categoryList.add(category);

        category=new Category(R.drawable.home1,"Home","");
        categoryList.add(category);

        category=new Category(R.drawable.trade,"Trading","");
        categoryList.add(category);

        category=new Category(R.drawable.home1,"Home","");
        categoryList.add(category);

        category=new Category(R.drawable.trade,"Trading","");
        categoryList.add(category);

        category=new Category(R.drawable.home1,"Home","");
        categoryList.add(category);

        category=new Category(R.drawable.trade,"Trading","");
        categoryList.add(category);

        category=new Category(R.drawable.home1,"Home","");
        categoryList.add(category);

        category=new Category(R.drawable.trade,"Trading","");
        categoryList.add(category);

        category=new Category(R.drawable.home1,"Home","");
        categoryList.add(category);

        category=new Category(R.drawable.trade,"Trading","");
        categoryList.add(category);




        CmAdapter.notifyDataSetChanged();
        Crecyclerview.setAdapter(CmAdapter);

    }


    private void prepareItem() {

        Item item = new Item(R.drawable.liveevents,"Wopro","Wipro is software");
        itemList.add(item);
        item = new Item(R.drawable.livenew,"TCS","TCS is service base");
        itemList.add(item);
        item = new Item(R.drawable.liveevents,"Ericsson","Ericsson is a networking  ");
        itemList.add(item);
        item= new Item(R.drawable.livenew,"Evon","Evon is hub of software  ");
        itemList.add(item);
        item = new Item(R.drawable.livenew,"TCS","TCS is service base ");
        itemList.add(item);
        item = new Item(R.drawable.liveevents,"Ericsson","Ericsson is a networking  ");
        itemList.add(item);
        item= new Item(R.drawable.livenew,"Evon","Evon is hub of software  ");
        itemList.add(item);


        mAdapter.notifyDataSetChanged();
        recyclerview.setAdapter(mAdapter);
    }
}
