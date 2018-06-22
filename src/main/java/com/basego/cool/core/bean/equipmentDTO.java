package com.basego.cool.core.bean;

import java.util.List;

/**
 * 项目名称：ClassCircleProject
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/5/10 22:06
 * 修改备注
 */
public class equipmentDTO {

    /**
     * code : 0
     * page : {"totalCount":1,"pageSize":10,"totalPage":1,"currPage":1,"list":[{"id":1,"equipmentName":"1","equipmentAddress":"11","problem":"正常使用","createBy":"admin"}]}
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
         * list : [{"id":1,"equipmentName":"1","equipmentAddress":"11","problem":"正常使用","createBy":"admin"}]
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
             * id : 1
             * equipmentName : 1
             * equipmentAddress : 11
             * problem : 正常使用
             * createBy : admin
             */

            private int id;
            private String equipmentName;
            private String equipmentAddress;
            private String problem;
            private String createBy;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getEquipmentName() {
                return equipmentName;
            }

            public void setEquipmentName(String equipmentName) {
                this.equipmentName = equipmentName;
            }

            public String getEquipmentAddress() {
                return equipmentAddress;
            }

            public void setEquipmentAddress(String equipmentAddress) {
                this.equipmentAddress = equipmentAddress;
            }

            public String getProblem() {
                return problem;
            }

            public void setProblem(String problem) {
                this.problem = problem;
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
