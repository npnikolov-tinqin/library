package com.tinqin.academy.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.jackson.JacksonDecoder;
import lombok.RequiredArgsConstructor;
import feign.codec.Decoder;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.context.annotation.Bean;

@RequiredArgsConstructor
public class ReportingClientConfiguration {
    private final ObjectMapper objectMapper;

    @Bean
    public Decoder feignDecoder() {
        return new ResponseEntityDecoder(new JacksonDecoder(objectMapper));
    }

}
