registry.addInterceptor(authInterceptor())
        .addPathPatterns("/**")
        .excludePathPatterns("/user/login", "/user/register", "/imserver/**", "/files/**", "/alipay/**",
                "/doc.html", "/webjars/**", "/swagger-resources/**");
