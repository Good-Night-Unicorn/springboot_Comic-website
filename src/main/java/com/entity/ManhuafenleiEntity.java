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
 * 漫画分类
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-01 17:16:21
 */
@TableName("manhuafenlei")
public class ManhuafenleiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ManhuafenleiEntity() {
		
	}
	
	public ManhuafenleiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 漫画分类
	 */
					
	private String manhuafenlei;
	
	/**
	 * 漫画标签
	 */
					
	private String manhuabiaoqian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：漫画分类
	 */
	public void setManhuafenlei(String manhuafenlei) {
		this.manhuafenlei = manhuafenlei;
	}
	/**
	 * 获取：漫画分类
	 */
	public String getManhuafenlei() {
		return manhuafenlei;
	}
	/**
	 * 设置：漫画标签
	 */
	public void setManhuabiaoqian(String manhuabiaoqian) {
		this.manhuabiaoqian = manhuabiaoqian;
	}
	/**
	 * 获取：漫画标签
	 */
	public String getManhuabiaoqian() {
		return manhuabiaoqian;
	}

}
