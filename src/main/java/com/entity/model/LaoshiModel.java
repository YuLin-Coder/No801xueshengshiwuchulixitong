package com.entity.model;

import com.entity.LaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 老师
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-03-26
 */
public class LaoshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 姓名
     */
    private String laoshiName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 身份证号
     */
    private String laoshiIdNumber;


    /**
     * 手机号
     */
    private String laoshiPhone;


    /**
     * 照片
     */
    private String laoshiPhoto;


    /**
     * 民族
     */
    private String laoshiNation;


    /**
     * 政治面貌
     */
    private Integer politicsTypes;


    /**
     * 家庭住址
     */
    private String laoshiAddress;


    /**
     * 角色
     */
    private Integer roleTypes;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：姓名
	 */
    public String getLaoshiName() {
        return laoshiName;
    }


    /**
	 * 设置：姓名
	 */
    public void setLaoshiName(String laoshiName) {
        this.laoshiName = laoshiName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：身份证号
	 */
    public String getLaoshiIdNumber() {
        return laoshiIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setLaoshiIdNumber(String laoshiIdNumber) {
        this.laoshiIdNumber = laoshiIdNumber;
    }
    /**
	 * 获取：手机号
	 */
    public String getLaoshiPhone() {
        return laoshiPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setLaoshiPhone(String laoshiPhone) {
        this.laoshiPhone = laoshiPhone;
    }
    /**
	 * 获取：照片
	 */
    public String getLaoshiPhoto() {
        return laoshiPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setLaoshiPhoto(String laoshiPhoto) {
        this.laoshiPhoto = laoshiPhoto;
    }
    /**
	 * 获取：民族
	 */
    public String getLaoshiNation() {
        return laoshiNation;
    }


    /**
	 * 设置：民族
	 */
    public void setLaoshiNation(String laoshiNation) {
        this.laoshiNation = laoshiNation;
    }
    /**
	 * 获取：政治面貌
	 */
    public Integer getPoliticsTypes() {
        return politicsTypes;
    }


    /**
	 * 设置：政治面貌
	 */
    public void setPoliticsTypes(Integer politicsTypes) {
        this.politicsTypes = politicsTypes;
    }
    /**
	 * 获取：家庭住址
	 */
    public String getLaoshiAddress() {
        return laoshiAddress;
    }


    /**
	 * 设置：家庭住址
	 */
    public void setLaoshiAddress(String laoshiAddress) {
        this.laoshiAddress = laoshiAddress;
    }
    /**
	 * 获取：角色
	 */
    public Integer getRoleTypes() {
        return roleTypes;
    }


    /**
	 * 设置：角色
	 */
    public void setRoleTypes(Integer roleTypes) {
        this.roleTypes = roleTypes;
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
