package com.entity.view;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 学生
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-03-26
 */
@TableName("yonghu")
public class YonghuView extends YonghuEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 学生性别的值
		*/
		private String sexValue;
		/**
		* 学生政治面貌的值
		*/
		private String politicsValue;
		/**
		* 学生班级的值
		*/
		private String banjiValue;
		/**
		* 学生年级的值
		*/
		private String nianjiValue;



	public YonghuView() {

	}

	public YonghuView(YonghuEntity yonghuEntity) {
		try {
			BeanUtils.copyProperties(this, yonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
