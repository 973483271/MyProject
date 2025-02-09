package com.imcode.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户与角色对应关系
 * </p>
 *
 * @author jack
 * @since 2019-12-21
 */
@TableName("sys_user_role")
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 角色名称
     * @return
     */
    private String name;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "UserRole [userId=" + userId + ", roleId=" + roleId + ", name="
				+ name + "]";
	}
}
