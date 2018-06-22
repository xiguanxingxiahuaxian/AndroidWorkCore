package com.basego.cool.core.bean;

import java.util.List;

/**
 * 项目名称：Retrofit-mvp-rxjava
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/5/10 23:07
 * 修改备注
 */
public class messageDTO {

    /**
     * code : 0
     * page : {"totalCount":2,"pageSize":10,"totalPage":1,"currPage":1,"list":[{"id":3,"content":"22","shijian":"2018-05-23","createBy":"admin","reply":null},{"id":2,"content":"11222","shijian":"2018-05-01","createBy":"admin","reply":"rr"}]}
     */

    private int code;
    private PageBean page;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public static class PageBean {
        /**
         * totalCount : 2
         * pageSize : 10
         * totalPage : 1
         * currPage : 1
         * list : [{"id":3,"content":"22","shijian":"2018-05-23","createBy":"admin","reply":null},{"id":2,"content":"11222","shijian":"2018-05-01","createBy":"admin","reply":"rr"}]
         */

        private int totalCount;
        private int pageSize;
        private int totalPage;
        private int currPage;
        private List<ListBean> list;

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getCurrPage() {
            return currPage;
        }

        public void setCurrPage(int currPage) {
            this.currPage = currPage;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : 3
             * content : 22
             * shijian : 2018-05-23
             * createBy : admin
             * reply : null
             */

            private int id;
            private String content;
            private String shijian;
            private String createBy;
            private String reply;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getShijian() {
                return shijian;
            }

            public void setShijian(String shijian) {
                this.shijian = shijian;
            }

            public String getCreateBy() {
                return createBy;
            }

            public void setCreateBy(String createBy) {
                this.createBy = createBy;
            }

            public String getReply() {
                return reply;
            }

            public void setReply(String reply) {
                this.reply = reply;
            }
        }
    }
}
