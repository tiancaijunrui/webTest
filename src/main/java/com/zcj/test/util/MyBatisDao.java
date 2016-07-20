package com.zcj.test.util;

import org.springframework.stereotype.Repository;

@Repository
public @interface MyBatisDao {
	String value() default "";
}
