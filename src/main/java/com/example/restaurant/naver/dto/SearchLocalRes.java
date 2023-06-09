package com.example.restaurant.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
// SearchLocalRes 클래스 : Naver Local API에서 결과 정보를 받기 위한 객체 클래스.
public class SearchLocalRes {

    private String lastBuildDate;
    private int total;
    private int start;
    private int display;
    private List<SearchLocalItem> items;

    // 리스트로 받을 객체 -> 클래스 객체로 정리.
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SearchLocalItem {
        private String title;
        private String link;
        private String description;
        private String category;
        private String telephone;
        private String address;
        private String roadAddress;
        private int mapx;
        private int mapy;
    }
}