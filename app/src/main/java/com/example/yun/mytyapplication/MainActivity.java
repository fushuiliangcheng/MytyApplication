package com.example.yun.mytyapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ImageView headImage;
//    private String[] stest={"aaa","bbb"};
//    private SearchView sv;
//    private ListView lv;
//    private RollPagerView mRollViewPager;

    private String i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        headImage = (ImageView)findViewById(R.id.iv_head);

//        sv=(SearchView)findViewById(R.id.sv_search);
//        lv=(ListView)findViewById(R.id.lv_search);
//        lv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,stest));
//        lv.setTextFilterEnabled(true);
//        //设置搜索文本监听
//        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
//            // 当点击搜索按钮时触发该方法
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            // 当搜索内容改变时触发该方法
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                if (!TextUtils.isEmpty(newText)){
//                    lv.setFilterText(newText);
//                }else{
//                    lv.clearTextFilter();
//                }
//                return false;
//            }
//
//        });


//        mRollViewPager = (RollPagerView) findViewById(R.id.roll_view_pager);
//
//        //设置播放时间间隔
//        mRollViewPager.setPlayDelay(1000);
//        //设置透明度
//        mRollViewPager.setAnimationDurtion(500);
//        //设置适配器
//        mRollViewPager.setAdapter(new TestNormalAdapter());
//
//        //设置指示器（顺序依次）
//        //自定义指示器图片
//        //设置圆点指示器颜色
//        //设置文字指示器
//        //隐藏指示器
//        //mRollViewPager.setHintView(new IconHintView(this, R.drawable.point_focus, R.drawable.point_normal));
//        mRollViewPager.setHintView(new ColorPointHintView(this, Color.YELLOW,Color.WHITE));
//        //mRollViewPager.setHintView(new TextHintView(this));
//        //mRollViewPager.setHintView(null);
//    }
//
//    private class TestNormalAdapter extends StaticPagerAdapter {
//        private int[] imgs = {
//                R.drawable.img1,
//                R.drawable.img2,
//                R.drawable.img3,
//                R.drawable.img4,
//        };
//
//
//        @Override
//        public View getView(ViewGroup container, int position) {
//            ImageView view = new ImageView(container.getContext());
//            view.setImageResource(imgs[position]);
//            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//            return view;
//        }
//
//
//        @Override
//        public int getCount() {
//            return imgs.length;
//        }
//    }


}
}
