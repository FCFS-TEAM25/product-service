package com.sparta.limited.product_service.config;

import com.sparta.limited.common_module.config.AuditorAwareConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AuditorAwareConfig.class)
public class ProductAuditConfig {

}
