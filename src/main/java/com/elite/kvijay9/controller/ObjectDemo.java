package com.elite.kvijay9.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Scanner;

public class ObjectDemo {

    public static void main(String[] args) throws JsonProcessingException {

        Scanner scanner = new Scanner(System.in);
        String json  = scanner.next();

        TenantViewConfig tenantViewConfig = new TenantViewConfig();
        TenantViewConfig.AdminSearchViewConfig adminSearchViewConfig = new TenantViewConfig.AdminSearchViewConfig();
        adminSearchViewConfig.setBannerTextVisible(true);
        adminSearchViewConfig.setBasicSearchOptions(List.of("UUID", "EMAIL"));
        adminSearchViewConfig.setRequiredFields(List.of("field1", "field2"));
        adminSearchViewConfig.setAdvancedSearchFields(List.of("field1", "field2"));
        tenantViewConfig.setAdminSearchViewConfig(adminSearchViewConfig);

        ObjectMapper objectMapper = new ObjectMapper();
        //String json = objectMapper.writeValueAsString(tenantViewConfig);
        TenantViewConfig tenantViewConfig1 = objectMapper.readValue(json, TenantViewConfig.class);
        System.out.println(json);
        System.out.println(tenantViewConfig);

        System.out.println(List.of("1", "2"));

    }
}

class TenantViewConfig {
    @JsonProperty("admin_search_view_config")
    private AdminSearchViewConfig adminSearchViewConfig;

    public AdminSearchViewConfig getAdminSearchViewConfig() {
        return adminSearchViewConfig;
    }

    public void setAdminSearchViewConfig(AdminSearchViewConfig adminSearchViewConfig) {
        this.adminSearchViewConfig = adminSearchViewConfig;
    }

    public static class AdminSearchViewConfig {
        @JsonProperty("advanced_search_fields")
        private List<String> advancedSearchFields;
        @JsonProperty("required_fields")
        private List<String> requiredFields;
        @JsonProperty("banner_text_visible")
        private boolean isBannerTextVisible;
        @JsonProperty("basic_search_options")
        private List<String> basicSearchOptions;

        public List<String> getAdvancedSearchFields() {
            return advancedSearchFields;
        }

        public void setAdvancedSearchFields(List<String> showInAdvancedFields) {
            this.advancedSearchFields = showInAdvancedFields;
        }

        public List<String> getRequiredFields() {
            return requiredFields;
        }

        public void setRequiredFields(List<String> requiredFields) {
            this.requiredFields = requiredFields;
        }

        public boolean isBannerTextVisible() {
            return isBannerTextVisible;
        }

        public void setBannerTextVisible(boolean bannerTextVisible) {
            isBannerTextVisible = bannerTextVisible;
        }

        public List<String> getBasicSearchOptions() {
            return basicSearchOptions;
        }

        public void setBasicSearchOptions(List<String> basicSearchOptions) {
            this.basicSearchOptions = basicSearchOptions;
        }

        @Override
        public String toString() {
            return "AdminSearchViewConfig{" +
                    "showInAdvancedFields=" + advancedSearchFields +
                    ", requiredFields=" + requiredFields +
                    ", isBannerTextVisible=" + isBannerTextVisible +
                    ", basicSearchOptions=" + basicSearchOptions +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "TenantViewConfig{" +
                "adminSearchViewConfig=" + adminSearchViewConfig +
                '}';
    }
}