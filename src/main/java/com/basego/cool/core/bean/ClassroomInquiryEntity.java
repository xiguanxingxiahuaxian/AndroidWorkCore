package com.basego.cool.core.bean;

/**
 * 项目名称：Retrofit-mvp-rxjava
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/5/12 12:08
 * 修改备注
 */
public class ClassroomInquiryEntity {
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
