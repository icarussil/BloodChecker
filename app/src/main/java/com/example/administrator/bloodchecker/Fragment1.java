package com.example.administrator.bloodchecker;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Fragment1 extends Fragment {

    ListView listView1;
    IconTextListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.activity_fragment1, container, false);

        // 리스트뷰 객체 참조
        listView1 = (ListView) rootView.findViewById(R.id.listView1);

        // 어댑터 객체 생성
        // adapter = new IconTextListAdapter(this);
        adapter = new IconTextListAdapter(rootView.getContext());




        
        // 아이템 데이터 만들기
        Resources res = getResources();
        adapter.addItem(new org.androidtown.ui.listview.IconTextItem(res.getDrawable(R.drawable.icon05), "추억의 테트리스", "30,000 다운로드", "900 원"));
        adapter.addItem(new org.androidtown.ui.listview.IconTextItem(res.getDrawable(R.drawable.icon06), "고스톱 - 강호동 버전", "26,000 다운로드", "1500 원"));
        adapter.addItem(new org.androidtown.ui.listview.IconTextItem(res.getDrawable(R.drawable.icon05), "친구찾기 (Friends Seeker)", "300,000 다운로드", "900 원"));
        adapter.addItem(new org.androidtown.ui.listview.IconTextItem(res.getDrawable(R.drawable.icon06), "강좌 검색", "120,000 다운로드", "900 원"));
        adapter.addItem(new org.androidtown.ui.listview.IconTextItem(res.getDrawable(R.drawable.icon05), "지하철 노선도 - 서울", "4,000 다운로드", "1500 원"));
        adapter.addItem(new org.androidtown.ui.listview.IconTextItem(res.getDrawable(R.drawable.icon06), "지하철 노선도 - 도쿄", "6,000 다운로드", "1500 원"));
        adapter.addItem(new org.androidtown.ui.listview.IconTextItem(res.getDrawable(R.drawable.icon05), "지하철 노선도 - LA", "8,000 다운로드", "1500 원"));
        adapter.addItem(new org.androidtown.ui.listview.IconTextItem(res.getDrawable(R.drawable.icon06), "지하철 노선도 - 워싱턴", "7,000 다운로드", "1500 원"));
        adapter.addItem(new org.androidtown.ui.listview.IconTextItem(res.getDrawable(R.drawable.icon05), "지하철 노선도 - 파리", "9,000 다운로드", "1500 원"));
        adapter.addItem(new org.androidtown.ui.listview.IconTextItem(res.getDrawable(R.drawable.icon06), "지하철 노선도 - 베를린", "38,000 다운로드", "1500 원"));

        // 리스트뷰에 어댑터 설정
        listView1.setAdapter(adapter);

        // 새로 정의한 리스너로 객체를 만들어 설정
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                org.androidtown.ui.listview.IconTextItem curItem = (org.androidtown.ui.listview.IconTextItem) adapter.getItem(position);
                String[] curData = curItem.getData();

                // error fix
                // Toast.makeText(getApplicationContext(), "Selected : " + curData[0], Toast.LENGTH_LONG).show();
            }

        });


        return rootView;
    }
}
