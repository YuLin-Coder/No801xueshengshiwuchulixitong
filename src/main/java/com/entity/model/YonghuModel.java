package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-03-26
 */
public class YonghuModel implements Serializable {
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
     * 学生姓名
     */
    private String name;


    /**
     * 学生性别
     */
    private Integer sexTypes;


    /**
     * 学生身份证号
     */
    private String idNumber;


    /**
     * 学生手机号
     */
    private String phone;


    /**
     * 学生照片
     */
    private String yonghuPhoto;


    /**
     * 学生民族
     */
    private String nation;


    /**
     * 学生政治面貌
     */
    private Integer politicsTypes;


    /**
     * 学生家庭住址
     */
    private String address;


    /**
     * 学生班级
     */
    private Integer banjiTypes;


    /**
     * 学生年级
     */
    private Integer nianjiTypes;


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
	 * 获取：学生姓名
	 */
    public String getName() {
        return name;
    }


    /**
	 * 设置：学生姓名
	 */
    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 获取：学生性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：学生性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：学生身份证号
	 */
    public String getIdNumber() {
        return idNumber;
    }


    /**
	 * 设置：学生身份证号
	 */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    /**
	 * 获取：学生手机号
	 */
    public String getPhone() {
        return phone;
    }


    /**
	 * 设置：学生手机号
	 */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
	 * 获取：学生照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 设置：学生照片
	 */
    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：学生民族
	 */
    public String getNation() {
        return nation;
    }


    /**
	 * 设置：学生民族
	 */
    public void setNation(String nation) {
        this.nation = nation;
    }
    /**
	 * 获取：学生政治面貌
	 */
    public Integer getPoliticsTypes() {
        return politicsTypes;
    }


    /**
	 * 设置：学生政治面貌
	 */
    public void setPoliticsTypes(Integer politicsTypes) {
        this.politicsTypes = politicsTypes;
    }
    /**
	 * 获取：学生家庭住址
	 */
    public String getAddress() {
        return address;
    }


    /**
	 * 设置：学生家庭住址
	 */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
	 * 获取：学生班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 设置：学生班级
	 */
    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 获取：学生年级
	 */
    public Integer getNianjiTypes() {
        return nianjiTypes;
    }


    /**
	 * 设置：学生年级
	 */
    public void setNianjiTypes(Integer nianjiTypes) {
        this.nianjiTypes = nianjiTypes;
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
