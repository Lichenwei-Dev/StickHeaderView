package com.lcw.view.stickheaderview;

/**
 * 实体类
 * Create by: chenWei.li
 * Date: 2018/11/3
 * Time: 上午1:02
 * Email: lichenwei.me@foxmail.com
 */
public class Bean {

    private String text;
    private String groupName;

    public Bean(String text, String groupName) {
        this.text = text;
        this.groupName = groupName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
