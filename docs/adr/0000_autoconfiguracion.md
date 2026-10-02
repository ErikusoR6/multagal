POSTIVE MATCHES:

AopAutoConfiguration matched:
- @ConditionalOnBooleanProperty (spring.aop.auto=true) matched (OnPropertyCondition)

AopAutoConfiguration.ClassProxyingConfiguration matched:
- @ConditionalOnMissingClass did not find unwanted class 'org.aspectj.weaver.Advice' (OnClassCondition)
- @ConditionalOnBooleanProperty (spring.aop.proxy-target-class=true) matched (OnPropertyCondition)

ApplicationAvailabilityAutoConfiguration#applicationAvailability matched:
- @ConditionalOnMissingBean (types: org.springframework.boot.availability.ApplicationAvailability; SearchStrategy: all) did not find any beans (OnBeanCondition)

NEGATIVE MATCHES:

AopAutoConfiguration.AspectJAutoProxyingConfiguration:
Did not match:
- @ConditionalOnClass did not find required class 'org.aspectj.weaver.Advice' (OnClassCondition)
