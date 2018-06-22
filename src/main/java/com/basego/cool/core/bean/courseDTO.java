package com.basego.cool.core.bean;

import java.util.List;

/**
 * 项目名称：Retrofit-mvp-rxjava
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/5/10 22:55
 * 修改备注
 */
public class courseDTO  {

    /**
     * code : 0
     * page : {"totalCount":1,"pageSize":10,"totalPage":1,"currPage":1,"list":[{"id":"23","shijian":null,"shijianStart":"2018-05-02","shijianEnd":"2018-05-17","classroom":"6666","teacher":"admin","subject":"6666","approveStatus":"同意","category":"调课申请"}]}
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
         * totalCount : 1
         * pageSize : 10
         * totalPage : 1
         * currPage : 1
         * list : [{"id":"23","shijian":null,"shijianStart":"2018-05-02","shijianEnd":"2018-05-17","classroom":"6666","teacher":"admin","subject":"6666","approveStatus":"同意","category":"调课申请"}]
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
             * id : 23
             * shijian : null
             * shijianStart : 2018-05-02
             * shijianEnd : 2018-05-17
             * classroom : 6666
             * teacher : admin
             * subject : 6666
             * approveStatus : 同意
             * category : 调课申请
             */

            private String id;
            private Object shijian;
            private String shijianStart;
            private String shijianEnd;
            private String classroom;
            private String teacher;
            private String subject;
            private String approveStatus;
            private String category;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public Object getShijian() {
                return shijian;
            }

            public void setShijian(Object shijian) {
                this.shijian = shijian;
            }

            public String getShijianStart() {
                return shijianStart;
            }

            public void setShijianStart(String shijianStart) {
                this.shijianStart = shijianStart;
            }

            public String getShijianEnd() {
                return shijianEnd;
            }

            public void setShijianEnd(String shijianEnd) {
                this.shijianEnd = shijianEnd;
            }

            public String getClassroom() {
                return classroom;
            }

            public void setClassroom(String classroom) {
                this.classroom = classroom;
            }

            public String getTeacher() {
                return teacher;
            }

            public void setTeacher(String teacher) {
                this.teacher = teacher;
            }

            public String getSubject() {
                return subject;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }

            public String getApproveStatus() {
                return approveStatus;
            }

            public void setApproveStatus(String approveStatus) {
                this.approveStatus = approveStatus;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }
        }
    }
}
