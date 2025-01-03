package com.hc.mall.common.dto;

import lombok.*;

import java.util.List;

/**
 * @auther hc
 * @description 权限框架中使用的用户信息封装类
 * @date 2024/1/30
 * @github https://github.com/hc1990011110
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id;
    private String username;
    private String clientId;
    private List<String> permissionList;
}
