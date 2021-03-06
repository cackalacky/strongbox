package org.carlspring.strongbox.web;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This annotation maps Artifact Controller classes to `/storages` URL using
 * repository layout from strongbox storages configuration.
 * 
 * @author sbespalov
 * 
 * @see CustomRequestMappingHandlerMapping
 * @see LayoutRequestCondition
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
@RequestMapping("/storages")
public @interface LayoutRequestMapping
{

    /**
     * Layout Alias.
     */
    String value();

}
