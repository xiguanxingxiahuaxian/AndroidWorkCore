package com.basego.cool.core.api;

import com.basego.cool.core.bean.ClassroomInquiryEntity;
import com.basego.cool.core.bean.CodeAndMsgDTO;
import com.basego.cool.core.bean.EquipmentEntity;
import com.basego.cool.core.bean.LeavingMessageEntity;
import com.basego.cool.core.bean.Persion;
import com.basego.cool.core.bean.ScheduleCardEntity;
import com.basego.cool.core.bean.UserInoDTO;
import com.basego.cool.core.bean.classRoomDTO;
import com.basego.cool.core.bean.courseDTO;
import com.basego.cool.core.bean.equipmentDTO;
import com.basego.cool.core.bean.examDTO;
import com.basego.cool.core.bean.messageDTO;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 项目名称：Basego
 * 类描述：
 * 创建人：maw@neuqsoft.com
 * 创建时间： 2017/9/6 11:27
 * 修改备注
 */
public interface SimpleApiservice {
   /**
   * 项目名称：${PROJECT_NAME}
   * 类描述：  网络请求入口
   * 创建人：maw@neuqsoft.com
   * 创建时间： ${DATE} ${TIME}
   * @version
   */
    @GET("/code")
    Observable<Persion>getName();


    //http://localhost:8080/security/equipment/list?_search=false&nd=1525960988566&limit=10&page=1&sidx=&order=asc&_=1525960988254

    @POST("sys/login")
    Observable<CodeAndMsgDTO>login(@Query("username")String username,
                                   @Query("password")String pwd
                                   , @Query("android")boolean b);


    @GET("sys/role/queryRoleSelf")
    Observable<UserInoDTO>getUserInfo(@Query("username")String username);

 //实验室设备查询
    @GET("equipment/self")
    Observable<equipmentDTO>getEquipment(
            @Query("_search")boolean b,
            @Query("nd") String time,
            @Query("limit")int  pageSize,
            @Query("page")int pageNo,
            @Query("sidx")String sidx,
            @Query("order")String  asc,
            @Query("_")String _,
            @Query("android")boolean c,
            @Query("username")String username
            );
    //实验室设备修理
    @POST("equipment/repair")
    Observable<CodeAndMsgDTO>repair(@Body EquipmentEntity equipmentEntity);

    //教室
    @GET("classroominquiry/self")
    Observable<classRoomDTO>getClassRoom(
            @Query("_search")boolean b,
            @Query("nd") String time,
            @Query("limit")int  pageSize,
            @Query("page")int pageNo,
            @Query("sidx")String sidx,
            @Query("order")String  asc,
            @Query("_")String _,
            @Query("username")String username
    );


    //schedulecard/lectrueList

    //教室预约保存
    @POST("classroominquiry/save")
    Observable<CodeAndMsgDTO>classroominquiry_save(@Body ClassroomInquiryEntity classroomInquiryEntity);
    // 实验室设备查询  查询接口   保修接口
    // 教室查询       预约接口
    // 查看自己的课程  调课申请   确认取消申请
    // 预约查询  调课批复  考试预约   留言

    //课程预约查询
    @GET("schedulecard/selfLectrue")
    Observable<courseDTO>getLecture(
            @Query("_search")boolean b,
            @Query("nd") String time,
            @Query("limit")int  pageSize,
            @Query("page")int pageNo,
            @Query("sidx")String sidx,
            @Query("order")String  asc,
            @Query("_")String _,
            @Query("username")String username
    );


    @GET("schedulecard/lectrueList")
    Observable<courseDTO>getLectureList(
            @Query("_search")boolean b,
            @Query("nd") String time,
            @Query("limit")int  pageSize,
            @Query("page")int pageNo,
            @Query("sidx")String sidx,
            @Query("order")String  asc,
            @Query("_")String _
    );
    //课程预约
    @POST("schedulecard/save")
    Observable<CodeAndMsgDTO>Lecture_save(@Body ScheduleCardEntity scheduleCardEntity);


    // 查看考试预约
    @GET("schedulecard/selfExa")
    Observable<examDTO>getExam(
            @Query("_search")boolean b,
            @Query("nd") String time,
            @Query("limit")int  pageSize,
            @Query("page")int pageNo,
            @Query("sidx")String sidx,
            @Query("order")String  asc,
            @Query("_")String _,
            @Query("username")String username
    );

    // 查看考试
    @POST("schedulecard/save")
    Observable<CodeAndMsgDTO>exam_save(@Body ScheduleCardEntity scheduleCardEntity);


    //查看消息
    @GET("message/list")
    Observable<messageDTO>getMessage(
            @Query("_search")boolean b,
            @Query("nd") String time,
            @Query("limit")int  pageSize,
            @Query("page")int pageNo,
            @Query("sidx")String sidx,
            @Query("order")String  asc,
            @Query("_")String _
    );

   //回复消息
   @GET("leavingmessage/self")
   Observable<messageDTO>getReMessage(
           @Query("_search")boolean b,
           @Query("nd") String time,
           @Query("limit")int  pageSize,
           @Query("page")int pageNo,
           @Query("sidx")String sidx,
           @Query("order")String  asc,
           @Query("_")String _,
           @Query("username")String username
   );

    // 消息回复
    @POST("leavingmessage/save")
    Observable<CodeAndMsgDTO>message_save(@Body LeavingMessageEntity messageEntity);

    //查看自己课程
    @GET("schedulecard/self")
    Observable<courseDTO>getSelfcource(
            @Query("_search")boolean b,
            @Query("nd") String time,
            @Query("limit")int  pageSize,
            @Query("page")int pageNo,
            @Query("sidx")String sidx,
            @Query("order")String  asc,
            @Query("_")String _,
            @Query("username")String username
    );
}
