package com.entity.view;

import com.entity.ChangdishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 场地申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-03-26
 */
@TableName("changdishenqing")
public class ChangdishenqingView extends ChangdishenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 场地的值
		*/
		private String changdiValue;
		/**
		* 使用类型的值
		*/
		private String shiyongValue;
		/**
		* 审核类型的值
		*/
		private String shenheValue;



		//级联表 yonghu
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
				* 学生性别的值
				*/
				private String sexValue;
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
				* 学生政治面貌的值
				*/
				private String politicsValue;
			/**
			* 学生家庭住址
			*/
			private String address;
			/**
			* 学生班级
			*/
			private Integer banjiTypes;
				/**
				* 学生班级的值
				*/
				private String banjiValue;
			/**
			* 学生年级
			*/
			private Integer nianjiTypes;
				/**
				* 学生年级的值
				*/
				private String nianjiValue;

	public ChangdishenqingView() {

	}

	public ChangdishenqingView(ChangdishenqingEntity changdishenqingEntity) {
		try {
			BeanUtils.copyProperties(this, changdishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 场地的值
			*/
			public String getChangdiValue() {
				return changdiValue;
			}
			/**
			* 设置： 场地的值
			*/
			public void setChangdiValue(String changdiValue) {
				this.changdiValue = changdiValue;
			}
			/**
			* 获取： 使用类型的值
			*/
			public String getShiyongValue() {
				return shiyongValue;
			}
			/**
			* 设置： 使用类型的值
			*/
			public void setShiyongValue(String shiyongValue) {
				this.shiyongValue = shiyongValue;
			}
			/**
			* 获取： 审核类型的值
			*/
			public String getShenheValue() {
				return shenheValue;
			}
			/**
			* 设置： 审核类型的值
			*/
			public void setShenheValue(String shenheValue) {
				this.shenheValue = shenheValue;
			}
















				//级联表的get和set yonghu
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
					* 获取： 学生姓名
					*/
					public String getName() {
						return name;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setName(String name) {
						this.name = name;
					}
					/**
					* 获取： 学生性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 学生性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 学生性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 学生性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 学生身份证号
					*/
					public String getIdNumber() {
						return idNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setIdNumber(String idNumber) {
						this.idNumber = idNumber;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getPhone() {
						return phone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setPhone(String phone) {
						this.phone = phone;
					}
					/**
					* 获取： 学生照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 学生照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 学生民族
					*/
					public String getNation() {
						return nation;
					}
					/**
					* 设置： 学生民族
					*/
					public void setNation(String nation) {
						this.nation = nation;
					}
					/**
					* 获取： 学生政治面貌
					*/
					public Integer getPoliticsTypes() {
						return politicsTypes;
					}
					/**
					* 设置： 学生政治面貌
					*/
					public void setPoliticsTypes(Integer politicsTypes) {
						this.politicsTypes = politicsTypes;
					}


						/**
						* 获取： 学生政治面貌的值
						*/
						public String getPoliticsValue() {
							return politicsValue;
						}
						/**
						* 设置： 学生政治面貌的值
						*/
						public void setPoliticsValue(String politicsValue) {
							this.politicsValue = politicsValue;
						}
					/**
					* 获取： 学生家庭住址
					*/
					public String getAddress() {
						return address;
					}
					/**
					* 设置： 学生家庭住址
					*/
					public void setAddress(String address) {
						this.address = address;
					}
					/**
					* 获取： 学生班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 学生班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 学生班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 学生班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}
					/**
					* 获取： 学生年级
					*/
					public Integer getNianjiTypes() {
						return nianjiTypes;
					}
					/**
					* 设置： 学生年级
					*/
					public void setNianjiTypes(Integer nianjiTypes) {
						this.nianjiTypes = nianjiTypes;
					}


						/**
						* 获取： 学生年级的值
						*/
						public String getNianjiValue() {
							return nianjiValue;
						}
						/**
						* 设置： 学生年级的值
						*/
						public void setNianjiValue(String nianjiValue) {
							this.nianjiValue = nianjiValue;
						}


}
