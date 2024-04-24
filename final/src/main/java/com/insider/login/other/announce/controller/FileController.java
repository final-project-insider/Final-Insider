package com.insider.login.other.announce.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.insider.login.other.announce.dto.AnnounceDTO;

public class FileController {

    public static AnnounceDTO convertJsonToAnnounceDTO(String announceDTOJson) {
        // JSON 문자열을 AnnounceDTO 객체로 변환하는 로직을 구현해야 함
        // 예시로는 ObjectMapper를 사용하여 JSON을 객체로 변환하는 방법을 사용할 수 있습니다.
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(announceDTOJson, AnnounceDTO.class);
        } catch (JsonProcessingException e) {
            // JSON을 파싱하는 도중에 오류 발생 시 처리
            e.printStackTrace();
            return null;
        }
    }

}