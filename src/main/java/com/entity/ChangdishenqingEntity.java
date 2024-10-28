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
 * 场地申请
 *
 * @author 
 * @email
 * @date 2021-03-26
 */
@TableName("changdishenqing")
public class ChangdishenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChangdishenqingEntity() {

	}

	public ChangdishenqingEntity(T t) {
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
     * 场地
     */
    @TableField(value = "changdi_types")

    private Integer changdiTypes;


    /**
     * 使用类型
     */
    @TableField(value = "shiyong_types")

    private Integer shiyongTypes;


    /**
     * 申请人
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 使用时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "start_time",fill = FieldFill.UPDATE)

    private Date startTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "end_time",fill = FieldFill.UPDATE)

    private Date endTime;


    /**
     * 申请内容
     */
    @TableField(value = "shenqing_content")

    private String shenqingContent;


    /**
     * 审核类型
     */
    @TableField(value = "shenhe_types")

    private Integer shenheTypes;


    /**
     * 备注
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
	 * 设置：场地
	 */
    public Integer getChangdiTypes() {
        return changdiTypes;
    }


    /**
	 * 获取：场地
	 */

    public void setChangdiTypes(Integer changdiTypes) {
        this.changdiTypes = changdiTypes;
    }
    /**
	 * 设置：使用类型
	 */
    public Integer getShiyongTypes() {
        return shiyongTypes;
    }


    /**
	 * 获取：使用类型
	 */

    public void setShiyongTypes(Integer shiyongTypes) {
        this.shiyongTypes = shiyongTypes;
    }
    /**
	 * 设置：申请人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：申请人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：使用时间
	 */
    public Date getStartTime() {
        return startTime;
    }


    /**
	 * 获取：使用时间
	 */

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    /**
	 * 设置：结束时间
	 */
    public Date getEndTime() {
        return endTime;
    }


    /**
	 * 获取：结束时间
	 */

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    /**
	 * 设置：申请内容
	 */
    public String getShenqingContent() {
        return shenqingContent;
    }


    /**
	 * 获取：申请内容
	 */

    public void setShenqingContent(String shenqingContent) {
        this.shenqingContent = shenqingContent;
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
	 * 设置：备注
	 */
    public String getBeizhuContent() {
        return beizhuContent;
    }


    /**
	 * 获取：备注
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
        return "Changdishenqing{" +
            "id=" + id +
            ", changdiTypes=" + changdiTypes +
            ", shiyongTypes=" + shiyongTypes +
            ", yonghuId=" + yonghuId +
            ", startTime=" + startTime +
            ", endTime=" + endTime +
            ", shenqingContent=" + shenqingContent +
            ", shenheTypes=" + shenheTypes +
            ", beizhuContent=" + beizhuContent +
            ", createTime=" + createTime +
        "}";
    }
}
