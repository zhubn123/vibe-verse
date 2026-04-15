package com.fz.vibeverse.domain.entity;

import com.fz.vibeverse.common.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

/**
 * User
 *
 * @author zhubn
 * @date 2026/4/10
 */
@Data
@NoArgsConstructor
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private Long userName;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 登录时间
     */
    private Long loginTime;

    /**
     * 用户名
     */
    private String username;

    /**
     * 角色
     */
    private String roles;
}
