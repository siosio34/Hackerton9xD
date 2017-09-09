package com.gunghi.tgwing.hackerton9xd.network.response;

/**
 * Created by joyeongje on 2017. 9. 9..
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ResKakaoPhoto {

    @SerializedName("photoList")
    @Expose
    private List<PhotoList> photoList = null;
    @SerializedName("storeviewid")
    @Expose
    private int storeviewid;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResKakaoPhoto() {
    }

    /**
     *
     * @param storeviewid
     * @param photoList
     */
    public ResKakaoPhoto(List<PhotoList> photoList, int storeviewid) {
        super();
        this.photoList = photoList;
        this.storeviewid = storeviewid;
    }

    public List<PhotoList> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<PhotoList> photoList) {
        this.photoList = photoList;
    }

    public ResKakaoPhoto withPhotoList(List<PhotoList> photoList) {
        this.photoList = photoList;
        return this;
    }

    public int getStoreviewid() {
        return storeviewid;
    }

    public void setStoreviewid(int storeviewid) {
        this.storeviewid = storeviewid;
    }

    public ResKakaoPhoto withStoreviewid(int storeviewid) {
        this.storeviewid = storeviewid;
        return this;
    }

    public class PhotoList {

        @SerializedName("categoryName")
        @Expose
        private String categoryName;
        @SerializedName("photoCount")
        @Expose
        private int photoCount;
        @SerializedName("resultList")
        @Expose
        private List<ResultList> resultList = null;

        /**
         * No args constructor for use in serialization
         *
         */
        public PhotoList() {
        }

        /**
         *
         * @param categoryName
         * @param resultList
         * @param photoCount
         */
        public PhotoList(String categoryName, int photoCount, List<ResultList> resultList) {
            super();
            this.categoryName = categoryName;
            this.photoCount = photoCount;
            this.resultList = resultList;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public PhotoList withCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        public int getPhotoCount() {
            return photoCount;
        }

        public void setPhotoCount(int photoCount) {
            this.photoCount = photoCount;
        }

        public PhotoList withPhotoCount(int photoCount) {
            this.photoCount = photoCount;
            return this;
        }

        public List<ResultList> getResultList() {
            return resultList;
        }

        public void setResultList(List<ResultList> resultList) {
            this.resultList = resultList;
        }

        public PhotoList withResultList(List<ResultList> resultList) {
            this.resultList = resultList;
            return this;
        }

        public class ResultList {

            @SerializedName("orgurl")
            @Expose
            private String orgurl;
            @SerializedName("photoid")
            @Expose
            private String photoid;

            /**
             * No args constructor for use in serialization
             *
             */
            public ResultList() {
            }

            /**
             *
             * @param orgurl
             * @param photoid
             */
            public ResultList(String orgurl, String photoid) {
                super();
                this.orgurl = orgurl;
                this.photoid = photoid;
            }

            public String getOrgurl() {
                return orgurl;
            }

            public void setOrgurl(String orgurl) {
                this.orgurl = orgurl;
            }

            public ResultList withOrgurl(String orgurl) {
                this.orgurl = orgurl;
                return this;
            }

            public String getPhotoid() {
                return photoid;
            }

            public void setPhotoid(String photoid) {
                this.photoid = photoid;
            }

            public ResultList withPhotoid(String photoid) {
                this.photoid = photoid;
                return this;
            }

        }

    }

}
