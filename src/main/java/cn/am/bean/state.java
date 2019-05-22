package cn.am.bean;

public class state {

    private String sid;
    private String applyid;
    private String uid;
    private String aid;
    private String isgrant;
    private String grantdate;
    private String license;
    private String isdel;

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

    @Override
    public String toString() {
        return "state{" +
                "sid='" + sid + '\'' +
                ", applyid='" + applyid + '\'' +
                ", uid='" + uid + '\'' +
                ", aid='" + aid + '\'' +
                ", isgrant='" + isgrant + '\'' +
                ", grantdate='" + grantdate + '\'' +
                ", license='" + license + '\'' +
                ", isdel='" + isdel + '\'' +
                '}';
    }
}
