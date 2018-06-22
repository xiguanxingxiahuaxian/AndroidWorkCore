package com.basego.cool.core.bean;

import java.util.List;

/**
 * 项目名称：Retrofit-mvp-rxjava
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/5/10 22:45
 * 修改备注
 */
public class classRoomDTO {

    /**
     * code : 0
     * page : {"totalCount":6,"pageSize":10,"totalPage":1,"currPage":1,"list":[{"id":"10","classroomNum":"1","classroomType":"1","isAppointment":"否","approveStatus":"已保存","shijianStart":null,"shijianEnd":null,"createBy":"admin"},{"id":"9","classroomNum":"1","classroomType":"1","isAppointment":"否","approveStatus":"审核中","shijianStart":null,"shijianEnd":null,"createBy":"admin"},{"id":"8","classroomNum":"1","classroomType":"4","isAppointment":"否","approveStatus":"已保存","shijianStart":null,"shijianEnd":null,"createBy":"admin"},{"id":"7","classroomNum":"1","classroomType":"4","isAppointment":"否","approveStatus":"已保存","shijianStart":null,"shijianEnd":null,"createBy":"admin"},{"id":"6","classroomNum":"1","classroomType":"4","isAppointment":"否","approveStatus":"审核中","shijianStart":"2018-05-02","shijianEnd":"2018-05-17","createBy":"admin"},{"id":"5","classroomNum":"1","classroomType":"4","isAppointment":"否","approveStatus":"同意","shijianStart":"2018-05-02","shijianEnd":"2018-05-17","createBy":"admin"}]}
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
         * totalCount : 6
         * pageSize : 10
         * totalPage : 1
         * currPage : 1
         * list : [{"id":"10","classroomNum":"1","classroomType":"1","isAppointment":"否","approveStatus":"已保存","shijianStart":null,"shijianEnd":null,"createBy":"admin"},{"id":"9","classroomNum":"1","classroomType":"1","isAppointment":"否","approveStatus":"审核中","shijianStart":null,"shijianEnd":null,"createBy":"admin"},{"id":"8","classroomNum":"1","classroomType":"4","isAppointment":"否","approveStatus":"已保存","shijianStart":null,"shijianEnd":null,"createBy":"admin"},{"id":"7","classroomNum":"1","classroomType":"4","isAppointment":"否","approveStatus":"已保存","shijianStart":null,"shijianEnd":null,"createBy":"admin"},{"id":"6","classroomNum":"1","classroomType":"4","isAppointment":"否","approveStatus":"审核中","shijianStart":"2018-05-02","shijianEnd":"2018-05-17","createBy":"admin"},{"id":"5","classroomNum":"1","classroomType":"4","isAppointment":"否","approveStatus":"同意","shijianStart":"2018-05-02","shijianEnd":"2018-05-17","createBy":"admin"}]
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
             * id : 10
             * classroomNum : 1
             * classroomType : 1
             * isAppointment : 否
             * approveStatus : 已保存
             * shijianStart : null
             * shijianEnd : null
             * createBy : admin
             */

            private String id;
            private String classroomNum;
            private String classroomType;
            private String isAppointment;
            private String approveStatus;
            private String shijianStart;
            private String shijianEnd;
            private String createBy;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getClassroomNum() {
                return classroomNum;
            }

            public void setClassroomNum(String classroomNum) {
                this.classroomNum = classroomNum;
            }

            public String getClassroomType() {
                return classroomType;
            }

            public void setClassroomType(String classroomType) {
                this.classroomType = classroomType;
            }

            public String getIsAppointment() {
                return isAppointment;
            }

            public void setIsAppointment(String isAppointment) {
                this.isAppointment = isAppointment;
            }

            public String getApproveStatus() {
                return approveStatus;
            }

            public void setApproveStatus(String approveStatus) {
                this.approveStatus = approveStatus;
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

            public String getCreateBy() {
                return createBy;
            }

            public void setCreateBy(String createBy) {
                this.createBy = createBy;
            }
        }
    }
}
