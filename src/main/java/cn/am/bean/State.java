package cn.am.bean;

public class State {

    private String sid;
    private String applyid;
    private String uid;
    private String aid;
    private String isgrant;
    private String grantdate;
    private String license;
    private String isdel;

    //申请人
    private User userApplyDetail;
    //批准人
    private User userRatifyDetail;
    //表详情
    private Apply applyDetail;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getApplyid() {
        return applyid;
    }

    public void setApplyid(String applyid) {
        this.applyid = applyid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getIsgrant() {
        return isgrant;
    }

    public void setIsgrant(String isgrant) {
        this.isgrant = isgrant;
    }

    public String getGrantdate() {
        return grantdate;
    }

    public void setGrantdate(String grantdate) {
        this.grantdate = grantdate;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel;
    }

    public User getUserApplyDetail() {
        return userApplyDetail;
    }

    public void setUserApplyDetail(User userApplyDetail) {
        this.userApplyDetail = userApplyDetail;
    }

    public User getUserRatifyDetail() {
        return userRatifyDetail;
    }

    public void setUserRatifyDetail(User userRatifyDetail) {
        this.userRatifyDetail = userRatifyDetail;
    }

    public Apply getApplyDetail() {
        return applyDetail;
    }

    public void setApplyDetail(Apply applyDetail) {
        this.applyDetail = applyDetail;
    }

    @Override
    public String toString() {
        return "State{" +
                "sid='" + sid + '\'' +
                ", applyid='" + applyid + '\'' +
                ", uid='" + uid + '\'' +
                ", aid='" + aid + '\'' +
                ", isgrant='" + isgrant + '\'' +
                ", grantdate='" + grantdate + '\'' +
                ", license='" + license + '\'' +
                ", isdel='" + isdel + '\'' +
                ", userApplyDetail=" + userApplyDetail +
                ", userRatifyDetail=" + userRatifyDetail +
                ", applyDetail=" + applyDetail +
                '}';
    }
}
