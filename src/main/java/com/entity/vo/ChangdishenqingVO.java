package com.entity.vo;

import com.entity.ChangdishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 场地申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-03-26
 */
@TableName("changdishenqing")
public class ChangdishenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "start_time")
    private Date startTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "end_time")
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

    @TableField(value = "create_time")
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

}
