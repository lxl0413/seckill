package com.example.seckill.validator;

import com.example.seckill.vo.IsMobileValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;

//注解的标识范围
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
//指定注解的留存时间。此类型注释将在运行时通过反射方式可用，会被加载入JVM中
@Retention(RetentionPolicy.RUNTIME)
//注解信息会写入到javadoc文档中
@Documented

/**
 * 指定验证器
 * 可以有多个处理的类，比如可以一个类处理String类型，一个处理Long类型：
 * StringChecker.class, LongChecker.class
 */
@Constraint(
        validatedBy = {IsMobileValidator.class}
)
public @interface IsMobile {
    //以下为注解属性
    boolean required() default true;

    String message() default "手机号码格式错误";

    //将validator进行分类，不同类group中会执行不同的validator操作
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
