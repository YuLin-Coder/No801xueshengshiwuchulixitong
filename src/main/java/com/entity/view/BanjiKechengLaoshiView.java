package com.entity.view;

import com.entity.BanjiKechengLaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 班级课程老师关系
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-03-26
 */
@TableName("banji_kecheng_laoshi")
public class BanjiKechengLaoshiView extends BanjiKechengLaoshiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 班级的值
		*/
		private String banjiValue;
		/**
		* 课程的值
		*/
		private String kechengValue;



		//级联表 laoshi
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
				* 性别的值
				*/
				private String sexValue;
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
				* 政治面貌的值
				*/
				private String politicsValue;
			/**
			* 家庭住址
			*/
			private String laoshiAddress;
			/**
			* 角色
			*/
			private Integer roleTypes;
				/**
				* 角色的值
				*/
				private String roleValue;

	public BanjiKechengLaoshiView() {

	}

	public BanjiKechengLaoshiView(BanjiKechengLaoshiEntity banjiKechengLaoshiEntity) {
		try {
			BeanUtils.copyProperties(this, banjiKechengLaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 班级的值
			*/
			public String getBanjiValue() {
				return banjiValue;
			}
			/**
			* 设置： 班级的值
			*/
			public void setBanjiValue(String banjiValue) {
				this.banjiValue = banjiValue;
			}
			/**
			* 获取： 课程的值
			*/
			public String getKechengValue() {
				return kechengValue;
			}
			/**
			* 设置： 课程的值
			*/
			public void setKechengValue(String kechengValue) {
				this.kechengValue = kechengValue;
			}










				//级联表的get和set laoshi
					/**
					* 获取： 账户
					*/
					public String getUsername() {
						return username;
					}
					/**
					* 设置： 账户
					*/
					public void setUsername(String username) {
						this.username = username;
					}
					/**
					* 获取： 密码
					*/
					public String getPassword() {
						return password;
					}
					/**
					* 设置： 密码
					*/
					public void setPassword(String password) {
						this.password = password;
					}
					/**
					* 获取： 姓名
					*/
					public String getLaoshiName() {
						return laoshiName;
					}
					/**
					* 设置： 姓名
					*/
					public void setLaoshiName(String laoshiName) {
						this.laoshiName = laoshiName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getLaoshiIdNumber() {
						return laoshiIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setLaoshiIdNumber(String laoshiIdNumber) {
						this.laoshiIdNumber = laoshiIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getLaoshiPhone() {
						return laoshiPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setLaoshiPhone(String laoshiPhone) {
						this.laoshiPhone = laoshiPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getLaoshiPhoto() {
						return laoshiPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setLaoshiPhoto(String laoshiPhoto) {
						this.laoshiPhoto = laoshiPhoto;
					}
					/**
					* 获取： 民族
					*/
					public String getLaoshiNation() {
						return laoshiNation;
					}
					/**
					* 设置： 民族
					*/
					public void setLaoshiNation(String laoshiNation) {
						this.laoshiNation = laoshiNation;
					}
					/**
					* 获取： 政治面貌
					*/
					public Integer getPoliticsTypes() {
						return politicsTypes;
					}
					/**
					* 设置： 政治面貌
					*/
					public void setPoliticsTypes(Integer politicsTypes) {
						this.politicsTypes = politicsTypes;
					}


						/**
						* 获取： 政治面貌的值
						*/
						public String getPoliticsValue() {
							return politicsValue;
						}
						/**
						* 设置： 政治面貌的值
						*/
						public void setPoliticsValue(String politicsValue) {
							this.politicsValue = politicsValue;
						}
					/**
					* 获取： 家庭住址
					*/
					public String getLaoshiAddress() {
						return laoshiAddress;
					}
					/**
					* 设置： 家庭住址
					*/
					public void setLaoshiAddress(String laoshiAddress) {
						this.laoshiAddress = laoshiAddress;
					}
					/**
					* 获取： 角色
					*/
					public Integer getRoleTypes() {
						return roleTypes;
					}
					/**
					* 设置： 角色
					*/
					public void setRoleTypes(Integer roleTypes) {
						this.roleTypes = roleTypes;
					}


						/**
						* 获取： 角色的值
						*/
						public String getRoleValue() {
							return roleValue;
						}
						/**
						* 设置： 角色的值
						*/
						public void setRoleValue(String roleValue) {
							this.roleValue = roleValue;
						}








}
