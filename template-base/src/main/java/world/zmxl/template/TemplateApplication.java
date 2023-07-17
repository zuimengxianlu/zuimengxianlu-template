package world.zmxl.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * 应用入口启动类
 *
 * @author your name
 * @date date
 */
@SpringBootApplication
@ComponentScan(useDefaultFilters = true, basePackages = {"world.zmxl.template.*"},
        includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE)})
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class);
    }

}
