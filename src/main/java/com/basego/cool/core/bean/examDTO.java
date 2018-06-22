package com.basego.cool.core.bean;

import java.util.List;

/**
 * 项目名称：Retrofit-mvp-rxjava
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/5/10 23:03
 * 修改备注
 */
public class examDTO {

    /**
     * code : 0
     * page : {"totalCount":7,"pageSize":10,"totalPage":1,"currPage":1,"list":[{"id":"18","shijian":null,"shijianStart":"2018-05-02","shijianEnd":"2018-05-11","classroom":"1","teacher":"admin","subject":"1","approveStatus":"审核中","category":"考试预约"},{"id":"17","shijian":null,"shijianStart":"2018-05-04","shijianEnd":"2018-05-12","classroom":"1","teacher":"admin","subject":"1","approveStatus":"未提交","category":"考试预约"},{"id":"16","shijian":null,"shijianStart":"2018-05-04","shijianEnd":"2018-05-19","classroom":"1","teacher":"admin","subject":"1","approveStatus":"同意","category":"考试预约"},{"id":"15","shijian":null,"shijianStart":"2018-05-02","shijianEnd":"2018-05-19","classroom":"1","teacher":"admin","subject":"1","approveStatus":"拒绝","category":"考试预约"},{"id":"14","shijian":null,"shijianStart":"2018-05-05","shijianEnd":"2018-05-19","classroom":"1","teacher":"admin","subject":"1","approveStatus":"审核中","category":"考试预约"},{"id":"13","shijian":null,"shijianStart":"2018-05-02","shijianEnd":"2018-05-12","classroom":"55555","teacher":"admin","subject":"1","approveStatus":"拒绝","category":"考试预约"},{"id":"12","shijian":null,"shijianStart":"2018-05-03","shijianEnd":"2018-05-19","classroom":"1","teacher":"admin","subject":"1","approveStatus":"同意","category":"考试预约"}]}
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
         * totalCount : 7
         * pageSize : 10
         * totalPage : 1
         * currPage : 1
         * list : [{"id":"18","shijian":null,"shijianStart":"2018-05-02","shijianEnd":"2018-05-11","classroom":"1","teacher":"admin","subject":"1","approveStatus":"审核中","category":"考试预约"},{"id":"17","shijian":null,"shijianStart":"2018-05-04","shijianEnd":"2018-05-12","classroom":"1","teacher":"admin","subject":"1","approveStatus":"未提交","category":"考试预约"},{"id":"16","shijian":null,"shijianStart":"2018-05-04","shijianEnd":"2018-05-19","classroom":"1","teacher":"admin","subject":"1","approveStatus":"同意","category":"考试预约"},{"id":"15","shijian":null,"shijianStart":"2018-05-02","shijianEnd":"2018-05-19","classroom":"1","teacher":"admin","subject":"1","approveStatus":"拒绝","category":"考试预约"},{"id":"14","shijian":null,"shijianStart":"2018-05-05","shijianEnd":"2018-05-19","classroom":"1","teacher":"admin","subject":"1","approveStatus":"审核中","category":"考试预约"},{"id":"13","shijian":null,"shijianStart":"2018-05-02","shijianEnd":"2018-05-12","classroom":"55555","teacher":"admin","subject":"1","approveStatus":"拒绝","category":"考试预约"},{"id":"12","shijian":null,"shijianStart":"2018-05-03","shijianEnd":"2018-05-19","classroom":"1","teacher":"admin","subject":"1","approveStatus":"同意","category":"考试预约"}]
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
             * id : 18
             * shijian : null
             * shijianStart : 2018-05-02
             * shijianEnd : 2018-05-11
             * classroom : 1
             * teacher : admin
             * subject : 1
             * approveStatus : 审核中
             * category : 考试预约
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
