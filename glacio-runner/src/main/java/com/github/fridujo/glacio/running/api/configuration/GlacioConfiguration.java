package com.github.fridujo.glacio.running.api.configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GlacioConfiguration {

    String[] featurePaths() default {};

    String[] gluePaths() default {};
}
