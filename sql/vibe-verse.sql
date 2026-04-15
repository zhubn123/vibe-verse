create database if not exists vibe_verse;

use vibe_verse;

-- 用户表
create table if not exists user
(
    id           bigint auto_increment comment 'id' primary key,
    userAccount  varchar(256)                           not null comment '账号',
    userPassword varchar(512)                           not null comment '密码',
    userName     varchar(256)                           null comment '用户昵称',
    userAvatar   varchar(1024)                          null comment '用户头像',
    userProfile  varchar(512)                           null comment '用户简介',
    userRole     varchar(256) default 'user'            not null comment '用户角色：user/admin',
    create_by    varchar(64)                            NULL DEFAULT '' COMMENT '创建人',
    createTime   datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_by    varchar(64)                            NULL DEFAULT '' COMMENT '更新人',
    updateTime   datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    status       tinyint      default 0                 not null comment '帐号状态（0正常 1停用）'
) comment '用户' collate = utf8mb4_unicode_ci;
