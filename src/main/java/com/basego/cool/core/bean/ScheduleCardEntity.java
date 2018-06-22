package com.basego.cool.core.bean;

/**
 * 项目名称：Retrofit-mvp-rxjava
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2018/5/12 12:07
 * 修改备注
 */
public class ScheduleCardEntity {
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
