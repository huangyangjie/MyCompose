package com.example.mycompose.repository.entity;


import java.util.List;

/**
 * 作者: Ocean<br><br>
 * 时间: 2020/3/28 9:57 PM<br><br>
 * 邮箱: xinzhaohaibo@aliyun.com<br><br>
 * 描述: 可展开视图的数据模型
 */
public class DoctorsEntity {

    /**
     * GroupName : 水果
     * GroupIcon :
     * ChildData : [{"ChildName":"香蕉","ChildIcon":"","Number":5},{"ChildName":"苹果","ChildIcon":"","Number":3},{"ChildName":"西瓜","ChildIcon":"","Number":9}]
     */

    private String GroupName;
    private String GroupIcon;
    private List<ChildDataBean> ChildData;

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public String getGroupIcon() {
        return GroupIcon;
    }

    public void setGroupIcon(String GroupIcon) {
        this.GroupIcon = GroupIcon;
    }

    public List<ChildDataBean> getChildData() {
        return ChildData;
    }

    public void setChildData(List<ChildDataBean> ChildData) {
        this.ChildData = ChildData;
    }

    public static class ChildDataBean {
        /**
         * ChildName : 香蕉
         * ChildIcon :
         * Number : 5
         */

        private String ChildName;
        private String ChildIcon;
        private int Number;

        public String getChildName() {
            return ChildName;
        }

        public void setChildName(String ChildName) {
            this.ChildName = ChildName;
        }

        public String getChildIcon() {
            return ChildIcon;
        }

        public void setChildIcon(String ChildIcon) {
            this.ChildIcon = ChildIcon;
        }

        public int getNumber() {
            return Number;
        }

        public void setNumber(int Number) {
            this.Number = Number;
        }
    }
}


