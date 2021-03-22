package com.wjx.qilin.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author liusha
 * @date 2021/3/23 00:00
 * @mail liusha@wacai.com
 * @description
 */
@Getter
@AllArgsConstructor
public enum OrderEnum {
    ORDER(0, "正序"),
    RE_ORDER(1, "反序");

    private Integer code;

    private String message;
}
