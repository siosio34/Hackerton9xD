package com.gunghi.tgwing.hackerton9xd.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResKakaoLocalAPI {

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("documents")
    @Expose
    private List<Document> documents = null;

    /**
     * No args constructor for use in serialization
     */
    public ResKakaoLocalAPI() {
    }

    /**
     * @param documents
     * @param meta
     */
    public ResKakaoLocalAPI(Meta meta, List<Document> documents) {
        super();
        this.meta = meta;
        this.documents = documents;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public ResKakaoLocalAPI withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public ResKakaoLocalAPI withDocuments(List<Document> documents) {
        this.documents = documents;
        return this;
    }

    private class Meta {

        @SerializedName("same_name")
        @Expose
        private Object sameName;
        @SerializedName("pageable_count")
        @Expose
        private Integer pageableCount;
        @SerializedName("total_count")
        @Expose
        private Integer totalCount;
        @SerializedName("is_end")
        @Expose
        private Boolean isEnd;

        /**
         * No args constructor for use in serialization
         *
         */
        public Meta() {
        }

        /**
         *
         * @param isEnd
         * @param pageableCount
         * @param totalCount
         * @param sameName
         */
        public Meta(Object sameName, Integer pageableCount, Integer totalCount, Boolean isEnd) {
            super();
            this.sameName = sameName;
            this.pageableCount = pageableCount;
            this.totalCount = totalCount;
            this.isEnd = isEnd;
        }

        public Object getSameName() {
            return sameName;
        }

        public void setSameName(Object sameName) {
            this.sameName = sameName;
        }

        public Meta withSameName(Object sameName) {
            this.sameName = sameName;
            return this;
        }

        public Integer getPageableCount() {
            return pageableCount;
        }

        public void setPageableCount(Integer pageableCount) {
            this.pageableCount = pageableCount;
        }

        public Meta withPageableCount(Integer pageableCount) {
            this.pageableCount = pageableCount;
            return this;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public Meta withTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Boolean getIsEnd() {
            return isEnd;
        }

        public void setIsEnd(Boolean isEnd) {
            this.isEnd = isEnd;
        }

        public Meta withIsEnd(Boolean isEnd) {
            this.isEnd = isEnd;
            return this;
        }

    }

    public class Document {

        @SerializedName("place_name")
        @Expose
        private String placeName;
        @SerializedName("distance")
        @Expose
        private String distance;
        @SerializedName("place_url")
        @Expose
        private String placeUrl;
        @SerializedName("category_name")
        @Expose
        private String categoryName;
        @SerializedName("address_name")
        @Expose
        private String addressName;
        @SerializedName("road_address_name")
        @Expose
        private String roadAddressName;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("category_group_code")
        @Expose
        private String categoryGroupCode;
        @SerializedName("category_group_name")
        @Expose
        private String categoryGroupName;
        @SerializedName("x")
        @Expose
        private String x;
        @SerializedName("y")
        @Expose
        private String y;

        /**
         * No args constructor for use in serialization
         *
         */
        public Document() {
        }

        /**
         *
         * @param id
         * @param categoryName
         * @param phone
         * @param distance
         * @param categoryGroupCode
         * @param categoryGroupName
         * @param placeUrl
         * @param placeName
         * @param roadAddressName
         * @param y
         * @param x
         * @param addressName
         */
        public Document(String placeName, String distance, String placeUrl, String categoryName, String addressName, String roadAddressName, String id, String phone, String categoryGroupCode, String categoryGroupName, String x, String y) {
            super();
            this.placeName = placeName;
            this.distance = distance;
            this.placeUrl = placeUrl;
            this.categoryName = categoryName;
            this.addressName = addressName;
            this.roadAddressName = roadAddressName;
            this.id = id;
            this.phone = phone;
            this.categoryGroupCode = categoryGroupCode;
            this.categoryGroupName = categoryGroupName;
            this.x = x;
            this.y = y;
        }

        public String getPlaceName() {
            return placeName;
        }

        public void setPlaceName(String placeName) {
            this.placeName = placeName;
        }

        public Document withPlaceName(String placeName) {
            this.placeName = placeName;
            return this;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public Document withDistance(String distance) {
            this.distance = distance;
            return this;
        }

        public String getPlaceUrl() {
            return placeUrl;
        }

        public void setPlaceUrl(String placeUrl) {
            this.placeUrl = placeUrl;
        }

        public Document withPlaceUrl(String placeUrl) {
            this.placeUrl = placeUrl;
            return this;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public Document withCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        public String getAddressName() {
            return addressName;
        }

        public void setAddressName(String addressName) {
            this.addressName = addressName;
        }

        public Document withAddressName(String addressName) {
            this.addressName = addressName;
            return this;
        }

        public String getRoadAddressName() {
            return roadAddressName;
        }

        public void setRoadAddressName(String roadAddressName) {
            this.roadAddressName = roadAddressName;
        }

        public Document withRoadAddressName(String roadAddressName) {
            this.roadAddressName = roadAddressName;
            return this;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Document withId(String id) {
            this.id = id;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Document withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getCategoryGroupCode() {
            return categoryGroupCode;
        }

        public void setCategoryGroupCode(String categoryGroupCode) {
            this.categoryGroupCode = categoryGroupCode;
        }

        public Document withCategoryGroupCode(String categoryGroupCode) {
            this.categoryGroupCode = categoryGroupCode;
            return this;
        }

        public String getCategoryGroupName() {
            return categoryGroupName;
        }

        public void setCategoryGroupName(String categoryGroupName) {
            this.categoryGroupName = categoryGroupName;
        }

        public Document withCategoryGroupName(String categoryGroupName) {
            this.categoryGroupName = categoryGroupName;
            return this;
        }

        public String getX() {
            return x;
        }

        public void setX(String x) {
            this.x = x;
        }

        public Document withX(String x) {
            this.x = x;
            return this;
        }

        public String getY() {
            return y;
        }

        public void setY(String y) {
            this.y = y;
        }

        public Document withY(String y) {
            this.y = y;
            return this;
        }

    }
}