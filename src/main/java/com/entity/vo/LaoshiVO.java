package com.entity.vo;

import com.entity.LaoshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 老师
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-03-26
 */
@TableName("laoshi")
public class LaoshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 姓名
     */

    @TableField(value = "laoshi_name")
    private String laoshiName;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 身份证号
     */

    @TableField(value = "laoshi_id_number")
    private String laoshiIdNumber;


    /**
     * 手机号
     */

    @TableField(value = "laoshi_phone")
    private String laoshiPhone;


    /**
     * 照片
     */

    @TableField(value = "laoshi_photo")
    private String laoshiPhoto;


    /**
     * 民族
     */

    @TableField(value = "laoshi_nation")
    private String laoshiNation;


    /**
     * 政治面貌
     */

    @TableField(value = "politics_types")
    private Integer politicsTypes;


    /**
     * 家庭住址
     */

    @TableField(value = "laoshi_address")
    private String laoshiAddress;


    /**
     * 角色
     */

    @TableField(value = "role_types")
    private Integer roleTypes;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：姓名
	 */
    public String getLaoshiName() {
        return laoshiName;
    }


    /**
	 * 获取：姓名
	 */

    public void setLaoshiName(String laoshiName) {
        this.laoshiName = laoshiName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：身份证号
	 */
    public String getLaoshiIdNumber() {
        return laoshiIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setLaoshiIdNumber(String laoshiIdNumber) {
        this.laoshiIdNumber = laoshiIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getLaoshiPhone() {
        return laoshiPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setLaoshiPhone(String laoshiPhone) {
        this.laoshiPhone = laoshiPhone;
    }
    /**
	 * 设置：照片
	 */
    public String getLaoshiPhoto() {
        return laoshiPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setLaoshiPhoto(String laoshiPhoto) {
        this.laoshiPhoto = laoshiPhoto;
    }
    /**
	 * 设置：民族
	 */
    public String getLaoshiNation() {
        return laoshiNation;
    }


    /**
	 * 获取：民族
	 */

    public void setLaoshiNation(String laoshiNation) {
        this.laoshiNation = laoshiNation;
    }
    /**
	 * 设置：政治面貌
	 */
    public Integer getPoliticsTypes() {
        return politicsTypes;
    }


    /**
	 * 获取：政治面貌
	 */

    public void setPoliticsTypes(Integer politicsTypes) {
        this.politicsTypes = politicsTypes;
    }
    /**
	 * 设置：家庭住址
	 */
    public String getLaoshiAddress() {
        return laoshiAddress;
    }


    /**
	 * 获取：家庭住址
	 */

    public void setLaoshiAddress(String laoshiAddress) {
        this.laoshiAddress = laoshiAddress;
    }
    /**
	 * 设置：角色
	 */
    public Integer getRoleTypes() {
        return roleTypes;
    }


    /**
	 * 获取：角色
	 */

    public void setRoleTypes(Integer roleTypes) {
        this.roleTypes = roleTypes;
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
