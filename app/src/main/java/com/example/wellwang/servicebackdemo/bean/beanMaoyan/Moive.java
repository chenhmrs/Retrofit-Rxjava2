package com.example.wellwang.servicebackdemo.bean.beanMaoyan;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Well Wang on 2018/3/10.
 */

public class Moive {
        public int cnms;
        public int sn;
        public boolean late;
        public String showInfo;
        public String dir;
        public String star;
        public String cat;
        public int wish;
        @SerializedName("3d")
        public boolean threed;
        public int pn;
        public int preSale;
        public String vd;
        public boolean imax;
        public int snum;
        public String scm;
        public String showDate;
        public String img;
        public float sc;
        public String ver;
        public String rt;
        public String src;
        public int dur;
        public String nm;
        public String time;
        public long id;

        public int getCnms() {
                return cnms;
        }

        public void setCnms(int cnms) {
                this.cnms = cnms;
        }

        public int getSn() {
                return sn;
        }

        public void setSn(int sn) {
                this.sn = sn;
        }

        public boolean isLate() {
                return late;
        }

        public void setLate(boolean late) {
                this.late = late;
        }

        public String getShowInfo() {
                return showInfo;
        }

        public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
        }

        public String getDir() {
                return dir;
        }

        public void setDir(String dir) {
                this.dir = dir;
        }

        public String getStar() {
                return star;
        }

        public void setStar(String star) {
                this.star = star;
        }

        public String getCat() {
                return cat;
        }

        public void setCat(String cat) {
                this.cat = cat;
        }

        public int getWish() {
                return wish;
        }

        public void setWish(int wish) {
                this.wish = wish;
        }

        public boolean isThreed() {
                return threed;
        }

        public void setThreed(boolean threed) {
                this.threed = threed;
        }

        public int getPn() {
                return pn;
        }

        public void setPn(int pn) {
                this.pn = pn;
        }

        public int getPreSale() {
                return preSale;
        }

        public void setPreSale(int preSale) {
                this.preSale = preSale;
        }

        public String getVd() {
                return vd;
        }

        public void setVd(String vd) {
                this.vd = vd;
        }

        public boolean isImax() {
                return imax;
        }

        public void setImax(boolean imax) {
                this.imax = imax;
        }

        public int getSnum() {
                return snum;
        }

        public void setSnum(int snum) {
                this.snum = snum;
        }

        public String getScm() {
                return scm;
        }

        public void setScm(String scm) {
                this.scm = scm;
        }

        public String getShowDate() {
                return showDate;
        }

        public void setShowDate(String showDate) {
                this.showDate = showDate;
        }

        public String getImg() {
                return img;
        }

        public void setImg(String img) {
                this.img = img;
        }

        public float getSc() {
                return sc;
        }

        public void setSc(float sc) {
                this.sc = sc;
        }

        public String getVer() {
                return ver;
        }

        public void setVer(String ver) {
                this.ver = ver;
        }

        public String getRt() {
                return rt;
        }

        public void setRt(String rt) {
                this.rt = rt;
        }

        public String getSrc() {
                return src;
        }

        public void setSrc(String src) {
                this.src = src;
        }

        public int getDur() {
                return dur;
        }

        public void setDur(int dur) {
                this.dur = dur;
        }

        public String getNm() {
                return nm;
        }

        public void setNm(String nm) {
                this.nm = nm;
        }

        public String getTime() {
                return time;
        }

        public void setTime(String time) {
                this.time = time;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        @Override
    public String toString() {
        return "Moive{" +
                "cnms=" + cnms +
                ", sn=" + sn +
                ", late=" + late +
                ", showInfo='" + showInfo + '\'' +
                ", dir='" + dir + '\'' +
                ", star='" + star + '\'' +
                ", cat='" + cat + '\'' +
                ", wish=" + wish +
                ", threed=" + threed +
                ", pn=" + pn +
                ", preSale=" + preSale +
                ", vd='" + vd + '\'' +
                ", imax=" + imax +
                ", snum=" + snum +
                ", scm='" + scm + '\'' +
                ", showDate='" + showDate + '\'' +
                ", img='" + img + '\'' +
                ", sc=" + sc +
                ", ver='" + ver + '\'' +
                ", rt='" + rt + '\'' +
                ", src='" + src + '\'' +
                ", dur=" + dur +
                ", nm='" + nm + '\'' +
                ", time='" + time + '\'' +
                ", id=" + id +
                '}';
    }
}
