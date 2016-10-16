package com.ishuyin.gecollsn.accueilBlock.domain;

import com.ishuyin.gecollsn.utils.DateUtil;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * @author gecollsn
 * @create 5/22/2016
 * @company www.ishuyin.com
 */
@Entity
public class BookInfo {
    @Id(autoincrement = true)
    private long id;
    private String bookName = "";
    private String bookLogoUrl = "";
    private String bookPlayer = "";
    private String latestUpdate = "";
    private String bookDownloadUrl = "";
    private String createTime = DateUtil.timestamp(true) + "";
    private int type;   // 0：我的下载，1：我的收藏，2：最近收听

    @Generated(hash = 1952025412)
    public BookInfo() {
    }

    @Generated(hash = 1962459891)
    public BookInfo(long id, String bookName, String bookLogoUrl, String bookPlayer,
            String latestUpdate, String bookDownloadUrl, String createTime,
            int type) {
        this.id = id;
        this.bookName = bookName;
        this.bookLogoUrl = bookLogoUrl;
        this.bookPlayer = bookPlayer;
        this.latestUpdate = latestUpdate;
        this.bookDownloadUrl = bookDownloadUrl;
        this.createTime = createTime;
        this.type = type;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookLogoUrl() {
        return this.bookLogoUrl;
    }

    public void setBookLogoUrl(String bookLogoUrl) {
        this.bookLogoUrl = bookLogoUrl;
    }

    public String getBookPlayer() {
        return this.bookPlayer;
    }

    public void setBookPlayer(String bookPlayer) {
        this.bookPlayer = bookPlayer;
    }

    public String getLatestUpdate() {
        return this.latestUpdate;
    }

    public void setLatestUpdate(String latestUpdate) {
        this.latestUpdate = latestUpdate;
    }

    public String getBookDownloadUrl() {
        return this.bookDownloadUrl;
    }

    public void setBookDownloadUrl(String bookDownloadUrl) {
        this.bookDownloadUrl = bookDownloadUrl;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }
}