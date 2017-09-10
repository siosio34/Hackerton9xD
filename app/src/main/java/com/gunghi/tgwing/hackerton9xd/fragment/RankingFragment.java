package com.gunghi.tgwing.hackerton9xd.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gunghi.tgwing.hackerton9xd.R;
import com.gunghi.tgwing.hackerton9xd.application.Hackerton9xdApplication;
import com.gunghi.tgwing.hackerton9xd.network.response.ResRanking;
import com.gunghi.tgwing.hackerton9xd.network.service.KakaoService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class RankingFragment extends Fragment {

    private RecyclerView rankRecyclerView;
    private RankingAdapter rankAdapter;
    private ArrayList<ResRanking.RankingList> datas;


    public RankingFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_ranking, container, false);

        datas = new ArrayList<>();

        rankAdapter = new RankingAdapter(datas,getContext(),inflater);
        rankRecyclerView = (RecyclerView) rootView.findViewById(R.id.rank_recycler_view);
        rankRecyclerView.setHasFixedSize(true);
        rankRecyclerView.setAdapter(rankAdapter);

        getRankingData();

        // Inflate the layout for this fragment
        return rootView;
    }

    private void getRankingData() {

        Retrofit retrofit = Hackerton9xdApplication.getRetrofitByServer();
        KakaoService rankService = retrofit.create(KakaoService.class);

        Call<ResRanking> resRankingCall = rankService.getRankingData();
        resRankingCall.enqueue(new Callback<ResRanking>() {
            @Override
            public void onResponse(Call<ResRanking> call, Response<ResRanking> response) {

                ResRanking rankData = response.body();
                for(ResRanking.RankingList item : rankData.getRankingList()) {
                    // TODO: 2017. 9. 10. 아이템의 추가
                    datas.add(item);
                }

                rankAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ResRanking> call, Throwable t) {

            }
        });

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    private class RankingAdapter extends RecyclerView.Adapter<RankingAdapter.ViewHolder> {
        private ArrayList<ResRanking.RankingList> rankInfos;
        private Context context;
        private LayoutInflater inflater;

        public RankingAdapter(ArrayList<ResRanking.RankingList> rankInfos, Context context, LayoutInflater inflater) {
            this.rankInfos = rankInfos;
            this.context = context;
            this.inflater = inflater;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = inflater.from(parent.getContext()).inflate(R.layout.cardview_cafe, parent, false);
            ViewHolder holder = new ViewHolder(v);
            return holder;
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
//            final ResKakaoLocalAPI.Document cafeInfo = cafeInfos.get(position);
//
//            holder.cafeWrapper.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Uri uri = Uri.parse(cafeInfo.getPlaceUrl());
//                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                    startActivity(intent);
//                }
//            });
//
//            if(position < 10) {
//                Picasso.with(context).load(imageurlList.get(position)).into(holder.cafeImageView);
//
//            }
//            holder.cafeName.setText((position+1) + ". " + cafeInfo.getPlaceName());
//            holder.cafeAddress.setText(cafeInfo.getAddressName());
//
//            String distance = cafeInfo.getDistance();
//            int dis = Integer.parseInt(distance);
//            if(dis >= 1000)
//                distance = (dis / 1000) + "." + (dis % 1000)/10 + "km";
//            else
//                distance = dis + "m";
//            holder.cafeDistance.setText(distance);
        }

        @Override
        public int getItemCount() {
            return rankInfos.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
//            public ConstraintLayout cafeWrapper;
//            public ImageView cafeImageView;
//            public TextView cafeName;
//            public TextView         cafeAddress;
//            public TextView         cafeDistance;

            public ViewHolder(View view) {
                super(view);
//                cafeWrapper = (ConstraintLayout)view.findViewById(R.id.mapRestaurantWrapper);
//                cafeImageView = (ImageView)view.findViewById(R.id.mapRestaurantImageView);
//                cafeName = (TextView)view.findViewById(R.id.mapRestaurantName);
//                cafeAddress = (TextView)view.findViewById(R.id.mapRestaurantAddress);
//                cafeDistance = (TextView)view.findViewById(R.id.mapRestaurantDistance);
            }
        }
    }

}
