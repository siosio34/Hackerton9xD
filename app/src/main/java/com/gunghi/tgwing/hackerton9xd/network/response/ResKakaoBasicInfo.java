package com.gunghi.tgwing.hackerton9xd.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResKakaoBasicInfo {

    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("cateid")
    @Expose
    private String cateid;
    @SerializedName("catename")
    @Expose
    private String catename;
    @SerializedName("cid")
    @Expose
    private int cid;
    @SerializedName("englishname")
    @Expose
    private String englishname;
    @SerializedName("feedback")
    @Expose
    private Feedback feedback;
    @SerializedName("homepage")
    @Expose
    private String homepage;
    @SerializedName("homepagenoprotocol")
    @Expose
    private String homepagenoprotocol;
    @SerializedName("isStation")
    @Expose
    private boolean isStation;
    @SerializedName("mainphotourl")
    @Expose
    private String mainphotourl;
    @SerializedName("openHour")
    @Expose
    private OpenHour openHour;
    @SerializedName("phonenum")
    @Expose
    private String phonenum;
    @SerializedName("placenamefull")
    @Expose
    private String placenamefull;
    @SerializedName("reltelList")
    @Expose
    private List<ReltelList> reltelList = null;
    @SerializedName("roadview")
    @Expose
    private Roadview roadview;
    @SerializedName("source")
    @Expose
    private Source source;
    @SerializedName("wpointx")
    @Expose
    private int wpointx;
    @SerializedName("wpointy")
    @Expose
    private int wpointy;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResKakaoBasicInfo() {
    }

    /**
     *
     * @param cateid
     * @param wpointy
     * @param mainphotourl
     * @param homepagenoprotocol
     * @param roadview
     * @param placenamefull
     * @param cid
     * @param homepage
     * @param feedback
     * @param openHour
     * @param source
     * @param address
     * @param isStation
     * @param englishname
     * @param phonenum
     * @param reltelList
     * @param catename
     * @param wpointx
     */
    public ResKakaoBasicInfo(Address address, String cateid, String catename, int cid, String englishname, Feedback feedback, String homepage, String homepagenoprotocol, boolean isStation, String mainphotourl, OpenHour openHour, String phonenum, String placenamefull, List<ReltelList> reltelList, Roadview roadview, Source source, int wpointx, int wpointy) {
        super();
        this.address = address;
        this.cateid = cateid;
        this.catename = catename;
        this.cid = cid;
        this.englishname = englishname;
        this.feedback = feedback;
        this.homepage = homepage;
        this.homepagenoprotocol = homepagenoprotocol;
        this.isStation = isStation;
        this.mainphotourl = mainphotourl;
        this.openHour = openHour;
        this.phonenum = phonenum;
        this.placenamefull = placenamefull;
        this.reltelList = reltelList;
        this.roadview = roadview;
        this.source = source;
        this.wpointx = wpointx;
        this.wpointy = wpointy;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ResKakaoBasicInfo withAddress(Address address) {
        this.address = address;
        return this;
    }

    public String getCateid() {
        return cateid;
    }

    public void setCateid(String cateid) {
        this.cateid = cateid;
    }

    public ResKakaoBasicInfo withCateid(String cateid) {
        this.cateid = cateid;
        return this;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

    public ResKakaoBasicInfo withCatename(String catename) {
        this.catename = catename;
        return this;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public ResKakaoBasicInfo withCid(int cid) {
        this.cid = cid;
        return this;
    }

    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname;
    }

    public ResKakaoBasicInfo withEnglishname(String englishname) {
        this.englishname = englishname;
        return this;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public ResKakaoBasicInfo withFeedback(Feedback feedback) {
        this.feedback = feedback;
        return this;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public ResKakaoBasicInfo withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    public String getHomepagenoprotocol() {
        return homepagenoprotocol;
    }

    public void setHomepagenoprotocol(String homepagenoprotocol) {
        this.homepagenoprotocol = homepagenoprotocol;
    }

    public ResKakaoBasicInfo withHomepagenoprotocol(String homepagenoprotocol) {
        this.homepagenoprotocol = homepagenoprotocol;
        return this;
    }

    public boolean isIsStation() {
        return isStation;
    }

    public void setIsStation(boolean isStation) {
        this.isStation = isStation;
    }

    public ResKakaoBasicInfo withIsStation(boolean isStation) {
        this.isStation = isStation;
        return this;
    }

    public String getMainphotourl() {
        return mainphotourl;
    }

    public void setMainphotourl(String mainphotourl) {
        this.mainphotourl = mainphotourl;
    }

    public ResKakaoBasicInfo withMainphotourl(String mainphotourl) {
        this.mainphotourl = mainphotourl;
        return this;
    }

    public OpenHour getOpenHour() {
        return openHour;
    }

    public void setOpenHour(OpenHour openHour) {
        this.openHour = openHour;
    }

    public ResKakaoBasicInfo withOpenHour(OpenHour openHour) {
        this.openHour = openHour;
        return this;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public ResKakaoBasicInfo withPhonenum(String phonenum) {
        this.phonenum = phonenum;
        return this;
    }

    public String getPlacenamefull() {
        return placenamefull;
    }

    public void setPlacenamefull(String placenamefull) {
        this.placenamefull = placenamefull;
    }

    public ResKakaoBasicInfo withPlacenamefull(String placenamefull) {
        this.placenamefull = placenamefull;
        return this;
    }

    public List<ReltelList> getReltelList() {
        return reltelList;
    }

    public void setReltelList(List<ReltelList> reltelList) {
        this.reltelList = reltelList;
    }

    public ResKakaoBasicInfo withReltelList(List<ReltelList> reltelList) {
        this.reltelList = reltelList;
        return this;
    }

    public Roadview getRoadview() {
        return roadview;
    }

    public void setRoadview(Roadview roadview) {
        this.roadview = roadview;
    }

    public ResKakaoBasicInfo withRoadview(Roadview roadview) {
        this.roadview = roadview;
        return this;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public ResKakaoBasicInfo withSource(Source source) {
        this.source = source;
        return this;
    }

    public int getWpointx() {
        return wpointx;
    }

    public void setWpointx(int wpointx) {
        this.wpointx = wpointx;
    }

    public ResKakaoBasicInfo withWpointx(int wpointx) {
        this.wpointx = wpointx;
        return this;
    }

    public int getWpointy() {
        return wpointy;
    }

    public void setWpointy(int wpointy) {
        this.wpointy = wpointy;
    }

    public ResKakaoBasicInfo withWpointy(int wpointy) {
        this.wpointy = wpointy;
        return this;
    }
}

class Address {

    @SerializedName("addrbunho")
    @Expose
    private String addrbunho;
    @SerializedName("addrdetail")
    @Expose
    private String addrdetail;
    @SerializedName("newaddr")
    @Expose
    private Newaddr newaddr;
    @SerializedName("region")
    @Expose
    private Region region;

    /**
     * No args constructor for use in serialization
     *
     */
    public Address() {
    }

    /**
     *
     * @param region
     * @param addrbunho
     * @param newaddr
     * @param addrdetail
     */
    public Address(String addrbunho, String addrdetail, Newaddr newaddr, Region region) {
        super();
        this.addrbunho = addrbunho;
        this.addrdetail = addrdetail;
        this.newaddr = newaddr;
        this.region = region;
    }

    public String getAddrbunho() {
        return addrbunho;
    }

    public void setAddrbunho(String addrbunho) {
        this.addrbunho = addrbunho;
    }

    public Address withAddrbunho(String addrbunho) {
        this.addrbunho = addrbunho;
        return this;
    }

    public String getAddrdetail() {
        return addrdetail;
    }

    public void setAddrdetail(String addrdetail) {
        this.addrdetail = addrdetail;
    }

    public Address withAddrdetail(String addrdetail) {
        this.addrdetail = addrdetail;
        return this;
    }

    public Newaddr getNewaddr() {
        return newaddr;
    }

    public void setNewaddr(Newaddr newaddr) {
        this.newaddr = newaddr;
    }

    public Address withNewaddr(Newaddr newaddr) {
        this.newaddr = newaddr;
        return this;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Address withRegion(Region region) {
        this.region = region;
        return this;
    }

}

class CurrentPeriod {

    @SerializedName("periodName")
    @Expose
    private String periodName;
    @SerializedName("timeList")
    @Expose
    private List<TimeList_> timeList = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public CurrentPeriod() {
    }

    /**
     *
     * @param timeList
     * @param periodName
     */
    public CurrentPeriod(String periodName, List<TimeList_> timeList) {
        super();
        this.periodName = periodName;
        this.timeList = timeList;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public CurrentPeriod withPeriodName(String periodName) {
        this.periodName = periodName;
        return this;
    }

    public List<TimeList_> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<TimeList_> timeList) {
        this.timeList = timeList;
    }

    public CurrentPeriod withTimeList(List<TimeList_> timeList) {
        this.timeList = timeList;
        return this;
    }

}

class Feedback {

    @SerializedName("allphotocnt")
    @Expose
    private int allphotocnt;
    @SerializedName("blogrvwcnt")
    @Expose
    private int blogrvwcnt;
    @SerializedName("comntcnt")
    @Expose
    private int comntcnt;
    @SerializedName("scorecnt")
    @Expose
    private int scorecnt;
    @SerializedName("scoresum")
    @Expose
    private int scoresum;

    /**
     * No args constructor for use in serialization
     *
     */
    public Feedback() {
    }

    /**
     *
     * @param scorecnt
     * @param blogrvwcnt
     * @param comntcnt
     * @param allphotocnt
     * @param scoresum
     */
    public Feedback(int allphotocnt, int blogrvwcnt, int comntcnt, int scorecnt, int scoresum) {
        super();
        this.allphotocnt = allphotocnt;
        this.blogrvwcnt = blogrvwcnt;
        this.comntcnt = comntcnt;
        this.scorecnt = scorecnt;
        this.scoresum = scoresum;
    }

    public int getAllphotocnt() {
        return allphotocnt;
    }

    public void setAllphotocnt(int allphotocnt) {
        this.allphotocnt = allphotocnt;
    }

    public Feedback withAllphotocnt(int allphotocnt) {
        this.allphotocnt = allphotocnt;
        return this;
    }

    public int getBlogrvwcnt() {
        return blogrvwcnt;
    }

    public void setBlogrvwcnt(int blogrvwcnt) {
        this.blogrvwcnt = blogrvwcnt;
    }

    public Feedback withBlogrvwcnt(int blogrvwcnt) {
        this.blogrvwcnt = blogrvwcnt;
        return this;
    }

    public int getComntcnt() {
        return comntcnt;
    }

    public void setComntcnt(int comntcnt) {
        this.comntcnt = comntcnt;
    }

    public Feedback withComntcnt(int comntcnt) {
        this.comntcnt = comntcnt;
        return this;
    }

    public int getScorecnt() {
        return scorecnt;
    }

    public void setScorecnt(int scorecnt) {
        this.scorecnt = scorecnt;
    }

    public Feedback withScorecnt(int scorecnt) {
        this.scorecnt = scorecnt;
        return this;
    }

    public int getScoresum() {
        return scoresum;
    }

    public void setScoresum(int scoresum) {
        this.scoresum = scoresum;
    }

    public Feedback withScoresum(int scoresum) {
        this.scoresum = scoresum;
        return this;
    }

}

class Newaddr {

    @SerializedName("bsizonno")
    @Expose
    private String bsizonno;
    @SerializedName("newaddrfull")
    @Expose
    private String newaddrfull;

    /**
     * No args constructor for use in serialization
     *
     */
    public Newaddr() {
    }

    /**
     *
     * @param newaddrfull
     * @param bsizonno
     */
    public Newaddr(String bsizonno, String newaddrfull) {
        super();
        this.bsizonno = bsizonno;
        this.newaddrfull = newaddrfull;
    }

    public String getBsizonno() {
        return bsizonno;
    }

    public void setBsizonno(String bsizonno) {
        this.bsizonno = bsizonno;
    }

    public Newaddr withBsizonno(String bsizonno) {
        this.bsizonno = bsizonno;
        return this;
    }

    public String getNewaddrfull() {
        return newaddrfull;
    }

    public void setNewaddrfull(String newaddrfull) {
        this.newaddrfull = newaddrfull;
    }

    public Newaddr withNewaddrfull(String newaddrfull) {
        this.newaddrfull = newaddrfull;
        return this;
    }

}


class OpenHour {

    @SerializedName("periodList")
    @Expose
    private List<PeriodList> periodList = null;
    @SerializedName("realtime")
    @Expose
    private Realtime realtime;

    /**
     * No args constructor for use in serialization
     *
     */
    public OpenHour() {
    }

    /**
     *
     * @param realtime
     * @param periodList
     */
    public OpenHour(List<PeriodList> periodList, Realtime realtime) {
        super();
        this.periodList = periodList;
        this.realtime = realtime;
    }

    public List<PeriodList> getPeriodList() {
        return periodList;
    }

    public void setPeriodList(List<PeriodList> periodList) {
        this.periodList = periodList;
    }

    public OpenHour withPeriodList(List<PeriodList> periodList) {
        this.periodList = periodList;
        return this;
    }

    public Realtime getRealtime() {
        return realtime;
    }

    public void setRealtime(Realtime realtime) {
        this.realtime = realtime;
    }

    public OpenHour withRealtime(Realtime realtime) {
        this.realtime = realtime;
        return this;
    }

}



class PeriodList {

    @SerializedName("periodName")
    @Expose
    private String periodName;
    @SerializedName("timeList")
    @Expose
    private List<TimeList> timeList = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public PeriodList() {
    }

    /**
     *
     * @param timeList
     * @param periodName
     */
    public PeriodList(String periodName, List<TimeList> timeList) {
        super();
        this.periodName = periodName;
        this.timeList = timeList;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public PeriodList withPeriodName(String periodName) {
        this.periodName = periodName;
        return this;
    }

    public List<TimeList> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<TimeList> timeList) {
        this.timeList = timeList;
    }

    public PeriodList withTimeList(List<TimeList> timeList) {
        this.timeList = timeList;
        return this;
    }

}


class Realtime {

    @SerializedName("breaktime")
    @Expose
    private String breaktime;
    @SerializedName("currentPeriod")
    @Expose
    private CurrentPeriod currentPeriod;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("holiday")
    @Expose
    private String holiday;
    @SerializedName("moreOpenOffInfoExists")
    @Expose
    private String moreOpenOffInfoExists;
    @SerializedName("open")
    @Expose
    private String open;

    /**
     * No args constructor for use in serialization
     *
     */
    public Realtime() {
    }

    /**
     *
     * @param holiday
     * @param open
     * @param breaktime
     * @param currentPeriod
     * @param moreOpenOffInfoExists
     * @param datetime
     */
    public Realtime(String breaktime, CurrentPeriod currentPeriod, String datetime, String holiday, String moreOpenOffInfoExists, String open) {
        super();
        this.breaktime = breaktime;
        this.currentPeriod = currentPeriod;
        this.datetime = datetime;
        this.holiday = holiday;
        this.moreOpenOffInfoExists = moreOpenOffInfoExists;
        this.open = open;
    }

    public String getBreaktime() {
        return breaktime;
    }

    public void setBreaktime(String breaktime) {
        this.breaktime = breaktime;
    }

    public Realtime withBreaktime(String breaktime) {
        this.breaktime = breaktime;
        return this;
    }

    public CurrentPeriod getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(CurrentPeriod currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public Realtime withCurrentPeriod(CurrentPeriod currentPeriod) {
        this.currentPeriod = currentPeriod;
        return this;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Realtime withDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public Realtime withHoliday(String holiday) {
        this.holiday = holiday;
        return this;
    }

    public String getMoreOpenOffInfoExists() {
        return moreOpenOffInfoExists;
    }

    public void setMoreOpenOffInfoExists(String moreOpenOffInfoExists) {
        this.moreOpenOffInfoExists = moreOpenOffInfoExists;
    }

    public Realtime withMoreOpenOffInfoExists(String moreOpenOffInfoExists) {
        this.moreOpenOffInfoExists = moreOpenOffInfoExists;
        return this;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public Realtime withOpen(String open) {
        this.open = open;
        return this;
    }

}

class Region {

    @SerializedName("fullname")
    @Expose
    private String fullname;
    @SerializedName("name3")
    @Expose
    private String name3;
    @SerializedName("newaddrfullname")
    @Expose
    private String newaddrfullname;

    /**
     * No args constructor for use in serialization
     *
     */
    public Region() {
    }

    /**
     *
     * @param name3
     * @param fullname
     * @param newaddrfullname
     */
    public Region(String fullname, String name3, String newaddrfullname) {
        super();
        this.fullname = fullname;
        this.name3 = name3;
        this.newaddrfullname = newaddrfullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Region withFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public Region withName3(String name3) {
        this.name3 = name3;
        return this;
    }

    public String getNewaddrfullname() {
        return newaddrfullname;
    }

    public void setNewaddrfullname(String newaddrfullname) {
        this.newaddrfullname = newaddrfullname;
    }

    public Region withNewaddrfullname(String newaddrfullname) {
        this.newaddrfullname = newaddrfullname;
        return this;
    }

}


class ReltelList {

    @SerializedName("phonenum")
    @Expose
    private String phonenum;

    /**
     * No args constructor for use in serialization
     *
     */
    public ReltelList() {
    }

    /**
     *
     * @param phonenum
     */
    public ReltelList(String phonenum) {
        super();
        this.phonenum = phonenum;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public ReltelList withPhonenum(String phonenum) {
        this.phonenum = phonenum;
        return this;
    }

}

class Roadview {

    @SerializedName("pan")
    @Expose
    private double pan;
    @SerializedName("panoid")
    @Expose
    private int panoid;
    @SerializedName("rvlevel")
    @Expose
    private int rvlevel;
    @SerializedName("tilt")
    @Expose
    private int tilt;
    @SerializedName("wphotox")
    @Expose
    private int wphotox;
    @SerializedName("wphotoy")
    @Expose
    private int wphotoy;

    /**
     * No args constructor for use in serialization
     *
     */
    public Roadview() {
    }

    /**
     *
     * @param wphotoy
     * @param tilt
     * @param wphotox
     * @param rvlevel
     * @param panoid
     * @param pan
     */
    public Roadview(double pan, int panoid, int rvlevel, int tilt, int wphotox, int wphotoy) {
        super();
        this.pan = pan;
        this.panoid = panoid;
        this.rvlevel = rvlevel;
        this.tilt = tilt;
        this.wphotox = wphotox;
        this.wphotoy = wphotoy;
    }

    public double getPan() {
        return pan;
    }

    public void setPan(double pan) {
        this.pan = pan;
    }

    public Roadview withPan(double pan) {
        this.pan = pan;
        return this;
    }

    public int getPanoid() {
        return panoid;
    }

    public void setPanoid(int panoid) {
        this.panoid = panoid;
    }

    public Roadview withPanoid(int panoid) {
        this.panoid = panoid;
        return this;
    }

    public int getRvlevel() {
        return rvlevel;
    }

    public void setRvlevel(int rvlevel) {
        this.rvlevel = rvlevel;
    }

    public Roadview withRvlevel(int rvlevel) {
        this.rvlevel = rvlevel;
        return this;
    }

    public int getTilt() {
        return tilt;
    }

    public void setTilt(int tilt) {
        this.tilt = tilt;
    }

    public Roadview withTilt(int tilt) {
        this.tilt = tilt;
        return this;
    }

    public int getWphotox() {
        return wphotox;
    }

    public void setWphotox(int wphotox) {
        this.wphotox = wphotox;
    }

    public Roadview withWphotox(int wphotox) {
        this.wphotox = wphotox;
        return this;
    }

    public int getWphotoy() {
        return wphotoy;
    }

    public void setWphotoy(int wphotoy) {
        this.wphotoy = wphotoy;
    }

    public Roadview withWphotoy(int wphotoy) {
        this.wphotoy = wphotoy;
        return this;
    }

}


class Source {

    @SerializedName("date")
    @Expose
    private String date;

    /**
     * No args constructor for use in serialization
     *
     */
    public Source() {
    }

    /**
     *
     * @param date
     */
    public Source(String date) {
        super();
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Source withDate(String date) {
        this.date = date;
        return this;
    }

}


class TimeList {

    @SerializedName("dayOfWeek")
    @Expose
    private String dayOfWeek;
    @SerializedName("timeName")
    @Expose
    private String timeName;
    @SerializedName("timeSE")
    @Expose
    private String timeSE;

    /**
     * No args constructor for use in serialization
     *
     */
    public TimeList() {
    }

    /**
     *
     * @param timeSE
     * @param timeName
     * @param dayOfWeek
     */
    public TimeList(String dayOfWeek, String timeName, String timeSE) {
        super();
        this.dayOfWeek = dayOfWeek;
        this.timeName = timeName;
        this.timeSE = timeSE;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public TimeList withDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public String getTimeName() {
        return timeName;
    }

    public void setTimeName(String timeName) {
        this.timeName = timeName;
    }

    public TimeList withTimeName(String timeName) {
        this.timeName = timeName;
        return this;
    }

    public String getTimeSE() {
        return timeSE;
    }

    public void setTimeSE(String timeSE) {
        this.timeSE = timeSE;
    }

    public TimeList withTimeSE(String timeSE) {
        this.timeSE = timeSE;
        return this;
    }

}


class TimeList_ {

    @SerializedName("dayOfWeek")
    @Expose
    private String dayOfWeek;
    @SerializedName("timeName")
    @Expose
    private String timeName;
    @SerializedName("timeSE")
    @Expose
    private String timeSE;

    /**
     * No args constructor for use in serialization
     *
     */
    public TimeList_() {
    }

    /**
     *
     * @param timeSE
     * @param timeName
     * @param dayOfWeek
     */
    public TimeList_(String dayOfWeek, String timeName, String timeSE) {
        super();
        this.dayOfWeek = dayOfWeek;
        this.timeName = timeName;
        this.timeSE = timeSE;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public TimeList_ withDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    public String getTimeName() {
        return timeName;
    }

    public void setTimeName(String timeName) {
        this.timeName = timeName;
    }

    public TimeList_ withTimeName(String timeName) {
        this.timeName = timeName;
        return this;
    }

    public String getTimeSE() {
        return timeSE;
    }

    public void setTimeSE(String timeSE) {
        this.timeSE = timeSE;
    }

    public TimeList_ withTimeSE(String timeSE) {
        this.timeSE = timeSE;
        return this;
    }

}