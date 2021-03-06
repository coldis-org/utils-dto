package org.coldis.library.dto;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * DTO type metadata.
 */
@Documented
@Target(TYPE)
@Retention(RUNTIME)
public @interface DtoType {

	/**
	 * Context is used to identify types and attributes that should be bound
	 * together.
	 */
	public String context() default "";

	/**
	 * Target path. Default is "src/main/java".
	 */
	public String targetPath() default "src/main/java";

	/**
	 * Template relative path (from resources).
	 */
	public String templatePath() default "dto/template/JavaDto.java";

	/**
	 * The DTO file extension.
	 */
	public String fileExtension() default "java";

	/**
	 * DTO type namespace.
	 */
	public String namespace();

	/**
	 * DTO type name. Default is the origin class name with the "Dto" append.
	 */
	public String name() default "";

	/**
	 * DTO type description.
	 */
	public String description() default "";

}
