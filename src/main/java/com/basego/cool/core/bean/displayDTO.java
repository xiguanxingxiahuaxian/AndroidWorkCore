package com.basego.cool.core.bean;

import java.util.List;

/**
 * 项目名称：Retrofit-mvp-rxjava
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/5/9 11:06
 * 修改备注
 */
public class displayDTO {

    /**
     * content : [{"id":"1254","machinename":"微机原理试验箱10","bh":null,"content":"用于微机原理实验","numbercount":"25","uptime":"1523014313607","img":"https://p3.pstatp.com/weili/l/240084076308201802.jpg","machinestatus":"2"},{"id":"1253","machinename":"微机原理试验箱9","bh":null,"content":"用于微机原理实验","numbercount":"25","uptime":"1523014313607","img":"https://p3.pstatp.com/weili/l/240084076308201802.jpg","machinestatus":"2"}]
     * totalElements : 25
     * totalPages : 13
     * last : false
     * number : 0
     * size : 2
     * sort : [{"direction":"DESC","property":"id","ignoreCase":false,"nullHandling":"NATIVE","descending":true,"ascending":false}]
     * numberOfElements : 2
     * first : true
     */

    private int totalElements;
    private int totalPages;
    private boolean last;
    private int number;
    private int size;
    private int numberOfElements;
    private boolean first;
    private List<ContentBean> content;
    private List<SortBean> sort;

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }

    public List<SortBean> getSort() {
        return sort;
    }

    public void setSort(List<SortBean> sort) {
        this.sort = sort;
    }

    public static class ContentBean {
        /**
         * id : 1254
         * machinename : 微机原理试验箱10
         * bh : null
         * content : 用于微机原理实验
         * numbercount : 25
         * uptime : 1523014313607
         * img : https://p3.pstatp.com/weili/l/240084076308201802.jpg
         * machinestatus : 2
         */

        private String id;
        private String machinename;
        private Object bh;
        private String content;
        private String numbercount;
        private String uptime;
        private String img;
        private String machinestatus;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMachinename() {
            return machinename;
        }

        public void setMachinename(String machinename) {
            this.machinename = machinename;
        }

        public Object getBh() {
            return bh;
        }

        public void setBh(Object bh) {
            this.bh = bh;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getNumbercount() {
            return numbercount;
        }

        public void setNumbercount(String numbercount) {
            this.numbercount = numbercount;
        }

        public String getUptime() {
            return uptime;
        }

        public void setUptime(String uptime) {
            this.uptime = uptime;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getMachinestatus() {
            return machinestatus;
        }

        public void setMachinestatus(String machinestatus) {
            this.machinestatus = machinestatus;
        }
    }

    public static class SortBean {
        /**
         * direction : DESC
         * property : id
         * ignoreCase : false
         * nullHandling : NATIVE
         * descending : true
         * ascending : false
         */

        private String direction;
        private String property;
        private boolean ignoreCase;
        private String nullHandling;
        private boolean descending;
        private boolean ascending;

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public boolean isIgnoreCase() {
            return ignoreCase;
        }

        public void setIgnoreCase(boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
        }

        public String getNullHandling() {
            return nullHandling;
        }

        public void setNullHandling(String nullHandling) {
            this.nullHandling = nullHandling;
        }

        public boolean isDescending() {
            return descending;
        }

        public void setDescending(boolean descending) {
            this.descending = descending;
        }

        public boolean isAscending() {
            return ascending;
        }

        public void setAscending(boolean ascending) {
            this.ascending = ascending;
        }
    }
}
