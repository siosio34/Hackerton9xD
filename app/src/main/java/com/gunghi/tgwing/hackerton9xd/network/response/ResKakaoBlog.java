package com.gunghi.tgwing.hackerton9xd.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by joyeongje on 2017. 9. 9..
 */

public class ResKakaoBlog {

    @SerializedName("blogrvwcnt")
    @Expose
    private int blogrvwcnt;
    @SerializedName("moreId")
    @Expose
    private int moreId;
    @SerializedName("placenamefull")
    @Expose
    private String placenamefull;
    @SerializedName("resultList")
    @Expose
    private List<ResultList> resultList = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResKakaoBlog() {
    }

    /**
     *
     * @param resultList
     * @param moreId
     * @param placenamefull
     * @param blogrvwcnt
     */
    public ResKakaoBlog(int blogrvwcnt, int moreId, String placenamefull, List<ResultList> resultList) {
        super();
        this.blogrvwcnt = blogrvwcnt;
        this.moreId = moreId;
        this.placenamefull = placenamefull;
        this.resultList = resultList;
    }

    public int getBlogrvwcnt() {
        return blogrvwcnt;
    }

    public void setBlogrvwcnt(int blogrvwcnt) {
        this.blogrvwcnt = blogrvwcnt;
    }

    public ResKakaoBlog withBlogrvwcnt(int blogrvwcnt) {
        this.blogrvwcnt = blogrvwcnt;
        return this;
    }

    public int getMoreId() {
        return moreId;
    }

    public void setMoreId(int moreId) {
        this.moreId = moreId;
    }

    public ResKakaoBlog withMoreId(int moreId) {
        this.moreId = moreId;
        return this;
    }

    public String getPlacenamefull() {
        return placenamefull;
    }

    public void setPlacenamefull(String placenamefull) {
        this.placenamefull = placenamefull;
    }

    public ResKakaoBlog withPlacenamefull(String placenamefull) {
        this.placenamefull = placenamefull;
        return this;
    }

    public List<ResultList> getResultList() {
        return resultList;
    }

    public void setResultList(List<ResultList> resultList) {
        this.resultList = resultList;
    }

    public ResKakaoBlog withResultList(List<ResultList> resultList) {
        this.resultList = resultList;
        return this;
    }

    public class ResultList {

        @SerializedName("blogname")
        @Expose
        private String blogname;
        @SerializedName("blogurl")
        @Expose
        private String blogurl;
        @SerializedName("contents")
        @Expose
        private String contents;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("isMy")
        @Expose
        private boolean isMy;
        @SerializedName("outlink")
        @Expose
        private String outlink;
        @SerializedName("photoList")
        @Expose
        private List<PhotoList> photoList = null;
        @SerializedName("reviewid")
        @Expose
        private String reviewid;
        @SerializedName("title")
        @Expose
        private String title;

        /**
         * No args constructor for use in serialization
         *
         */
        public ResultList() {
        }

        /**
         *
         * @param title
         * @param contents
         * @param outlink
         * @param blogname
         * @param isMy
         * @param blogurl
         * @param reviewid
         * @param date
         * @param photoList
         */
        public ResultList(String blogname, String blogurl, String contents, String date, boolean isMy, String outlink, List<PhotoList> photoList, String reviewid, String title) {
            super();
            this.blogname = blogname;
            this.blogurl = blogurl;
            this.contents = contents;
            this.date = date;
            this.isMy = isMy;
            this.outlink = outlink;
            this.photoList = photoList;
            this.reviewid = reviewid;
            this.title = title;
        }

        public String getBlogname() {
            return blogname;
        }

        public void setBlogname(String blogname) {
            this.blogname = blogname;
        }

        public ResultList withBlogname(String blogname) {
            this.blogname = blogname;
            return this;
        }

        public String getBlogurl() {
            return blogurl;
        }

        public void setBlogurl(String blogurl) {
            this.blogurl = blogurl;
        }

        public ResultList withBlogurl(String blogurl) {
            this.blogurl = blogurl;
            return this;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public ResultList withContents(String contents) {
            this.contents = contents;
            return this;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public ResultList withDate(String date) {
            this.date = date;
            return this;
        }

        public boolean isIsMy() {
            return isMy;
        }

        public void setIsMy(boolean isMy) {
            this.isMy = isMy;
        }

        public ResultList withIsMy(boolean isMy) {
            this.isMy = isMy;
            return this;
        }

        public String getOutlink() {
            return outlink;
        }

        public void setOutlink(String outlink) {
            this.outlink = outlink;
        }

        public ResultList withOutlink(String outlink) {
            this.outlink = outlink;
            return this;
        }

        public List<PhotoList> getPhotoList() {
            return photoList;
        }

        public void setPhotoList(List<PhotoList> photoList) {
            this.photoList = photoList;
        }

        public ResultList withPhotoList(List<PhotoList> photoList) {
            this.photoList = photoList;
            return this;
        }

        public String getReviewid() {
            return reviewid;
        }

        public void setReviewid(String reviewid) {
            this.reviewid = reviewid;
        }

        public ResultList withReviewid(String reviewid) {
            this.reviewid = reviewid;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public ResultList withTitle(String title) {
            this.title = title;
            return this;
        }

        public class PhotoList {

            @SerializedName("orgurl")
            @Expose
            private String orgurl;

            /**
             * No args constructor for use in serialization
             *
             */
            public PhotoList() {
            }

            /**
             *
             * @param orgurl
             */
            public PhotoList(String orgurl) {
                super();
                this.orgurl = orgurl;
            }

            public String getOrgurl() {
                return orgurl;
            }

            public void setOrgurl(String orgurl) {
                this.orgurl = orgurl;
            }

            public PhotoList withOrgurl(String orgurl) {
                this.orgurl = orgurl;
                return this;
            }

        }

    }

}