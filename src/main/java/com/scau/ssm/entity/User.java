package com.scau.ssm.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * User：用户实体
 *
 * @author chen
 * @date 2019/02/15
 */
@Getter
@Setter
@ToString
public class User {
    private Integer uid;
    private String username;
    private String dbSource;
}
