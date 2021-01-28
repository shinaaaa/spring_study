package hello.core;

import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// @ComponentScan은 @Component가 붙은 모든 클래스를 스프링 빈으로 등록함
// 스프링 빈의 기본 이름은 맨 앞글자만 소문자 형태인 클래스 명을 사용
@Configuration
@ComponentScan(
        basePackages = "hello.core",
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    // 수동 Bean 등록
    // 동일한 Bean 이름이 있으면
    // 수동 Bean 등록 후  자동 Bean에 Override 됨
//    @Bean(name = "memoryMemberRepository")
//    MemoryMemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }


}
