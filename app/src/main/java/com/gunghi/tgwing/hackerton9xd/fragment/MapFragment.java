package com.gunghi.tgwing.hackerton9xd.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gunghi.tgwing.hackerton9xd.R;
import com.gunghi.tgwing.hackerton9xd.application.Hackerton9xdApplication;
import com.gunghi.tgwing.hackerton9xd.network.response.ResKakaoLocalAPI;
import com.gunghi.tgwing.hackerton9xd.network.service.KakaoService;
import com.gunghi.tgwing.hackerton9xd.util.LocationTracker;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class MapFragment extends Fragment implements MapView.MapViewEventListener{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);
        initMapView(rootView);
        return rootView;
    }

    private void initMapView(View rootView) {
        MapView mapView = new MapView(getActivity());
        mapView.setMapViewEventListener(this);
        ViewGroup mapViewContainer = (ViewGroup) rootView.findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);
    }

    @Override
    public void onMapViewInitialized(MapView mapView) {
        Double lat = LocationTracker.getCurLoc().getLatitude();
        Double lon = LocationTracker.getCurLoc().getLongitude();
        mapView.setMapCenterPoint(MapPoint.mapPointWithGeoCoord(lat, lon) , true);

        // 내거 띄우기
        MapPOIItem marker = new MapPOIItem();
        marker.setItemName("내 위치");
        marker.setTag(0);
        marker.setMapPoint(MapPoint.mapPointWithGeoCoord(lat, lon));
        marker.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
        mapView.addPOIItem(marker);

        getKakaoAPI(mapView, lat.toString(),lon.toString(),10000);

    }

    private void getKakaoAPI(final MapView mapView, String x, String y, int radius) {
        Retrofit retrofit =  Hackerton9xdApplication.getRetrofit();
        KakaoService kakaoService = retrofit.create(KakaoService.class);

        final Call<ResKakaoLocalAPI> call = kakaoService.getCafeList("KakaoAK 1d6e137a6cc075f1f2c2af376a15fc2b","CE7", y, x, radius);
        call.enqueue(new Callback<ResKakaoLocalAPI>() {
            @Override
            public void onResponse(Call<ResKakaoLocalAPI> call, Response<ResKakaoLocalAPI> response) {

                if(response.isSuccessful()) {
                    int count = 0;
                    ResKakaoLocalAPI body = response.body();

                    for (ResKakaoLocalAPI.Document item : response.body().getDocuments()) {
                        MapPOIItem mapPOIItem = new MapPOIItem();
                        mapPOIItem.setMapPoint(MapPoint.mapPointWithGeoCoord(Double.parseDouble(item.getY()),Double.parseDouble(item.getX())));
                        mapPOIItem.setItemName(item.getPlaceName());
                        mapPOIItem.setTag(count);
                        mapPOIItem.setMarkerType(MapPOIItem.MarkerType.RedPin);

                        mapView.addPOIItem(mapPOIItem);
                        count++;
                    }
                }

            }

            @Override
            public void onFailure(Call<ResKakaoLocalAPI> call, Throwable t) {
                Log.d("Falied", call.toString());
            }
        });

    }

    @Override
    public void onMapViewCenterPointMoved(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewZoomLevelChanged(MapView mapView, int i) {

    }

    @Override
    public void onMapViewSingleTapped(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDoubleTapped(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewLongPressed(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDragStarted(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewDragEnded(MapView mapView, MapPoint mapPoint) {

    }

    @Override
    public void onMapViewMoveFinished(MapView mapView, MapPoint mapPoint) {

    }

    public static Drawable LoadImageFromWebOperations(String url) {
        try {
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, "src name");
            return d;
        } catch (Exception e) {
            return null;
        }
    }


    private class MapRestaurantAdapter extends RecyclerView.Adapter<MapRestaurantAdapter.ViewHolder> {
        private ArrayList<ResKakaoLocalAPI.Document> cafeInfos;
        private Context context;
        private LayoutInflater inflater;

        public MapRestaurantAdapter(ArrayList<ResKakaoLocalAPI.Document> cafeInfos, Context context, LayoutInflater inflater) {
            this.cafeInfos = cafeInfos;
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
            final ResKakaoLocalAPI.Document cafeInfo = cafeInfos.get(position);

            holder.cafeWrapper.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    RestaurantInfo.setCurrentRestaurantInfo(restaurantInfo);
//                    Intent intent = new Intent(getActivity(), RestaurantActivity.class);
//                    startActivity(intent);
                }
            });

           // Picasso.with(context).load(cafeInfo.).into(holder.cafeImageView);
            holder.cafeName.setText((position+1) + ". " + cafeInfo.getPlaceName());
            holder.cafeAddress.setText(cafeInfo.getAddressName());

            String distance = cafeInfo.getDistance();
            int dis = Integer.parseInt(distance);
            if(dis >= 1000)
                distance = (dis / 1000) + "." + (dis % 1000)/10 + "km";
            else
                distance = dis + "m";
            holder.cafeDistance.setText(distance);
        }

        @Override
        public int getItemCount() {
            return cafeInfos.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public ConstraintLayout cafeWrapper;
            public ImageView        cafeImageView;
            public TextView         cafeName;
            public TextView         cafeAddress;
            public TextView         cafeDistance;

            public ViewHolder(View view) {

                super(view);
               cafeWrapper = (ConstraintLayout)view.findViewById(R.id.mapRestaurantWrapper);
               cafeImageView = (ImageView)view.findViewById(R.id.mapRestaurantImageView);
               cafeName = (TextView)view.findViewById(R.id.mapRestaurantName);
               cafeAddress = (TextView)view.findViewById(R.id.mapRestaurantAddress);
               cafeDistance = (TextView)view.findViewById(R.id.mapRestaurantDistance);
            }
        }
    }

}
