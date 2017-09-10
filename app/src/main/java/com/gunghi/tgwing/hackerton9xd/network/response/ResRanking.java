package com.gunghi.tgwing.hackerton9xd.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ResRanking {

    @SerializedName("rankingList")
    @Expose
    private List<RankingList> rankingList = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResRanking() {
    }

    /**
     *
     * @param rankingList
     */
    public ResRanking(List<RankingList> rankingList) {
        super();
        this.rankingList = rankingList;
    }

    public List<RankingList> getRankingList() {
        return rankingList;
    }

    public void setRankingList(List<RankingList> rankingList) {
        this.rankingList = rankingList;
    }

    public ResRanking withRankingList(List<RankingList> rankingList) {
        this.rankingList = rankingList;
        return this;
    }

    public class RankingList {

        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("cafe_name")
        @Expose
        private String cafeName;
        @SerializedName("call_number")
        @Expose
        private String callNumber;
        @SerializedName("features")
        @Expose
        private String features;
        @SerializedName("keywords")
        @Expose
        private List<String> keywords = null;
        @SerializedName("photo_url")
        @Expose
        private String photoUrl;

        /**
         * No args constructor for use in serialization
         */
        public RankingList() {
        }

        /**
         * @param keywords
         * @param cafeName
         * @param address
         * @param callNumber
         * @param features
         * @param photoUrl
         */
        public RankingList(String address, String cafeName, String callNumber, String features, List<String> keywords, String photoUrl) {
            super();
            this.address = address;
            this.cafeName = cafeName;
            this.callNumber = callNumber;
            this.features = features;
            this.keywords = keywords;
            this.photoUrl = photoUrl;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public RankingList withAddress(String address) {
            this.address = address;
            return this;
        }

        public String getCafeName() {
            return cafeName;
        }

        public void setCafeName(String cafeName) {
            this.cafeName = cafeName;
        }

        public RankingList withCafeName(String cafeName) {
            this.cafeName = cafeName;
            return this;
        }

        public String getCallNumber() {
            return callNumber;
        }

        public void setCallNumber(String callNumber) {
            this.callNumber = callNumber;
        }

        public RankingList withCallNumber(String callNumber) {
            this.callNumber = callNumber;
            return this;
        }

        public String getFeatures() {
            return features;
        }

        public void setFeatures(String features) {
            this.features = features;
        }

        public RankingList withFeatures(String features) {
            this.features = features;
            return this;
        }

        public List<String> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<String> keywords) {
            this.keywords = keywords;
        }

        public RankingList withKeywords(List<String> keywords) {
            this.keywords = keywords;
            return this;
        }

        public String getPhotoUrl() {
            return photoUrl;
        }

        public void setPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
        }

        public RankingList withPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
            return this;
        }

    }
}


