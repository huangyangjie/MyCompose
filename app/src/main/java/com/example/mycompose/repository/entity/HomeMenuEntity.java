package com.example.mycompose.repository.entity;

import java.util.List;

public class HomeMenuEntity {

    public int code;
    public String message;
    public DataBean data;

    @Override
    public String toString() {
        return "HomeMenuEntity{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        public ZongheBean zonghe;
        public MenzhenBean menzhen;
        public ZhuyuanBean zhuyuan;

        @Override
        public String toString() {
            return "DataBean{" +
                    "zonghe=" + zonghe +
                    ", menzhen=" + menzhen +
                    ", zhuyuan=" + zhuyuan +
                    '}';
        }

        public ZongheBean getZonghe() {
            if(zonghe !=null && zonghe.getMenus()!=null && zonghe.getMenus().size()>0){
                return zonghe;
            }else{
                return null;
            }
        }

        public void setZonghe(ZongheBean zonghe) {
            this.zonghe = zonghe;
        }

        public MenzhenBean getMenzhen() {
            if(menzhen !=null && menzhen.getMenus()!=null && menzhen.getMenus().size()>0){
                return menzhen;
            }else{
                return null;
            }
        }

        public void setMenzhen(MenzhenBean menzhen) {
            this.menzhen = menzhen;
        }

        public ZhuyuanBean getZhuyuan() {
            if(zhuyuan !=null && zhuyuan.getMenus()!=null && zhuyuan.getMenus().size()>0){
                return zhuyuan;
            }else{
                return null;
            }
        }

        public void setZhuyuan(ZhuyuanBean zhuyuan) {
            this.zhuyuan = zhuyuan;
        }

        public static class ZongheBean {
            public String name;
            public List<MenusBean> menus;

            @Override
            public String toString() {
                return "ZongheBean{" +
                        "name='" + name + '\'' +
                        ", menus=" + menus +
                        '}';
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<MenusBean> getMenus() {
                return menus;
            }

            public void setMenus(List<MenusBean> menus) {
                this.menus = menus;
            }
        }

        public static class MenzhenBean {
            public String name;
            public List<MenusBean> menus;

            @Override
            public String toString() {
                return "MenzhenBean{" +
                        "name='" + name + '\'' +
                        ", menus=" + menus +
                        '}';
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<MenusBean> getMenus() {
                return menus;
            }

            public void setMenus(List<MenusBean> menus) {
                this.menus = menus;
            }
        }

        public static class ZhuyuanBean {
            public String name;
            public List<MenusBean> menus;

            @Override
            public String toString() {
                return "ZhuyuanBean{" +
                        "name='" + name + '\'' +
                        ", menus=" + menus +
                        '}';
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<MenusBean> getMenus() {
                return menus;
            }

            public void setMenus(List<MenusBean> menus) {
                this.menus = menus;
            }
        }

        public static class MenusBean {
            public String id;
            public String code;
            public String name;
            public String icon;
            public String menu_type;
            public String menu_type_name;
            public String content;
            public String py_type;
            public int is_show;
            public int is_alert_notice;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getMenu_type() {
                return menu_type;
            }

            public void setMenu_type(String menu_type) {
                this.menu_type = menu_type;
            }

            public String getMenu_type_name() {
                return menu_type_name;
            }

            public void setMenu_type_name(String menu_type_name) {
                this.menu_type_name = menu_type_name;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getPy_type() {
                return py_type;
            }

            public void setPy_type(String py_type) {
                this.py_type = py_type;
            }

            public int getIs_show() {
                return is_show;
            }

            public void setIs_show(int is_show) {
                this.is_show = is_show;
            }

            public int getIs_alert_notice() {
                return is_alert_notice;
            }

            public void setIs_alert_notice(int is_alert_notice) {
                this.is_alert_notice = is_alert_notice;
            }

            @Override
            public String toString() {
                return "MenusBean{" +
                        "id='" + id + '\'' +
                        ", code='" + code + '\'' +
                        ", name='" + name + '\'' +
                        ", icon='" + icon + '\'' +
                        ", menu_type='" + menu_type + '\'' +
                        ", menu_type_name='" + menu_type_name + '\'' +
                        ", content='" + content + '\'' +
                        ", py_type='" + py_type + '\'' +
                        ", is_show=" + is_show +
                        ", is_alert_notice=" + is_alert_notice +
                        '}';
            }
        }
    }

}
