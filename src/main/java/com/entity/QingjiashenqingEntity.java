package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 请假申请
 *
 * @author 
 * @email
 * @date 2021-03-26
 */
@TableName("qingjiashenqing")
public class QingjiashenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QingjiashenqingEntity() {

	}

	public QingjiashenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 请假人
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 请假类型
     */
    @TableField(value = "qingjia_types")

    private Integer qingjiaTypes;


    /**
     * 请假原因
     */
    @TableField(value = "qingjia_content")

    private String qingjiaContent;


    /**
     * 请假开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "start_time",fill = FieldFill.UPDATE)

    private Date startTime;


    /**
     * 请假结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "end_time",fill = FieldFill.UPDATE)

    private Date endTime;


    /**
     * 审核类型
     */
    @TableField(value = "shenhe_types")

    private Integer shenheTypes;


    /**
     * 审核备注
     */
    @TableField(value = "beizhu_content")

    private String beizhuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：请假人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：请假人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：请假类型
	 */
    public Integer getQingjiaTypes() {
        return qingjiaTypes;
    }


    /**
	 * 获取：请假类型
	 */

    public void setQingjiaTypes(Integer qingjiaTypes) {
        this.qingjiaTypes = qingjiaTypes;
    }
    /**
	 * 设置：请假原因
	 */
    public String getQingjiaContent() {
        return qingjiaContent;
    }


    /**
	 * 获取：请假原因
	 */

    public void setQingjiaContent(String qingjiaContent) {
        this.qingjiaContent = qingjiaContent;
    }
    /**
	 * 设置：请假开始时间
	 */
    public Date getStartTime() {
        return startTime;
    }


    /**
	 * 获取：请假开始时间
	 */

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    /**
	 * 设置：请假结束时间
	 */
    public Date getEndTime() {
        return endTime;
    }


    /**
	 * 获取：请假结束时间
	 */

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    /**
	 * 设置：审核类型
	 */
    public Integer getShenheTypes() {
        return shenheTypes;
    }


    /**
	 * 获取：审核类型
	 */

    public void setShenheTypes(Integer shenheTypes) {
        this.shenheTypes = shenheTypes;
    }
    /**
	 * 设置：审核备注
	 */
    public String getBeizhuContent() {
        return beizhuContent;
    }


    /**
	 * 获取：审核备注
	 */

    public void setBeizhuContent(String beizhuContent) {
        this.beizhuContent = beizhuContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Qingjiashenqing{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", qingjiaTypes=" + qingjiaTypes +
            ", qingjiaContent=" + qingjiaContent +
            ", startTime=" + startTime +
            ", endTime=" + endTime +
            ", shenheTypes=" + shenheTypes +
            ", beizhuContent=" + beizhuContent +
            ", createTime=" + createTime +
        "}";
    }
}
