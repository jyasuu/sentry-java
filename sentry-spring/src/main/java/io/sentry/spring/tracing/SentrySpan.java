package io.sentry.spring.tracing;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;

/**
 * Bean method annotated with {@link SentrySpan} executed within {@link io.sentry.SentryTransaction}
 * gets wrapped into {@link io.sentry.Span}.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SentrySpan {

  /**
   * Span description.
   *
   * @return description
   */
  String description() default "";

  /**
   * Span operation.
   *
   * @return operation.
   */
  @AliasFor("value")
  String operation() default "";

  /**
   * Span operation.
   *
   * @return operation.
   */
  @AliasFor("operation")
  String value() default "";
}
