package com.example.mycompose.repository.entity;

import java.util.List;

public class Test {

    private MenzhenDTO menzhen;
    private ZhuyuanDTO zhuyuan;
    private ZongheDTO zonghe;

    public MenzhenDTO getMenzhen() {
        return menzhen;
    }

    public void setMenzhen(MenzhenDTO menzhen) {
        this.menzhen = menzhen;
    }

    public ZhuyuanDTO getZhuyuan() {
        return zhuyuan;
    }

    public void setZhuyuan(ZhuyuanDTO zhuyuan) {
        this.zhuyuan = zhuyuan;
    }

    public ZongheDTO getZonghe() {
        return zonghe;
    }

    public void setZonghe(ZongheDTO zonghe) {
        this.zonghe = zonghe;
    }

    public static class MenzhenDTO {
        private String name;
        private List<MenusDTO> menus;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<MenusDTO> getMenus() {
            return menus;
        }

        public void setMenus(List<MenusDTO> menus) {
            this.menus = menus;
        }

        public static class MenusDTO {
            private String id;
            private String name;
            private String icon;
            private String menu_type;
            private String menu_type_name;
            private String content;
            private String py_type;
            private int is_show;
            private int is_alert_notice;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
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
        }
    }

    public static class ZhuyuanDTO {
        private String name;
        private List<MenusDTO> menus;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<MenusDTO> getMenus() {
            return menus;
        }

        public void setMenus(List<MenusDTO> menus) {
            this.menus = menus;
        }

        public static class MenusDTO {
            private String id;
            private String name;
            private String icon;
            private String menu_type;
            private String menu_type_name;
            private String content;
            private String py_type;
            private int is_show;
            private int is_alert_notice;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
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
        }
    }

    public static class ZongheDTO {
        private String name;
        private List<MenusDTO> menus;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<MenusDTO> getMenus() {
            return menus;
        }

        public void setMenus(List<MenusDTO> menus) {
            this.menus = menus;
        }

        public static class MenusDTO {
            private String id;
            private String name;
            private String icon;
            private String menu_type;
            private String menu_type_name;
            private String content;
            private String py_type;
            private int is_show;
            private int is_alert_notice;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
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
        }
    }
}
