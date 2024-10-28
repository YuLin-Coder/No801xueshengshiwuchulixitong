package com.entity.model;

import com.entity.QingjiashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 请假申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-03-26
 */
public class QingjiashenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 请假人
     */
    private Integer yonghuId;


    /**
     * 请假类型
     */
    private Integer qingjiaTypes;


    /**
     * 请假原因
     */
    private String qingjiaContent;


    /**
     * 请假开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date startTime;


    /**
     * 请假结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date endTime;


    /**
     * 审核类型
     */
    private Integer shenheTypes;


    /**
     * 审核备注
     */
    private String beizhuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：请假人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：请假人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：请假类型
	 */
    public Integer getQingjiaTypes() {
        return qingjiaTypes;
    }


    /**
	 * 设置：请假类型
	 */
    public void setQingjiaTypes(Integer qingjiaTypes) {
        this.qingjiaTypes = qingjiaTypes;
    }
    /**
	 * 获取：请假原因
	 */
    public String getQingjiaContent() {
        return qingjiaContent;
    }


    /**
	 * 设置：请假原因
	 */
    public void setQingjiaContent(String qingjiaContent) {
        this.qingjiaContent = qingjiaContent;
    }
    /**
	 * 获取：请假开始时间
	 */
    public Date getStartTime() {
        return startTime;
    }


    /**
	 * 设置：请假开始时间
	 */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    /**
	 * 获取：请假结束时间
	 */
    public Date getEndTime() {
        return endTime;
    }


    /**
	 * 设置：请假结束时间
	 */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    /**
	 * 获取：审核类型
	 */
    public Integer getShenheTypes() {
        return shenheTypes;
    }


    /**
	 * 设置：审核类型
	 */
    public void setShenheTypes(Integer shenheTypes) {
        this.shenheTypes = shenheTypes;
    }
    /**
	 * 获取：审核备注
	 */
    public String getBeizhuContent() {
        return beizhuContent;
    }


    /**
	 * 设置：审核备注
	 */
    public void setBeizhuContent(String beizhuContent) {
        this.beizhuContent = beizhuContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
