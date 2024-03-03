package com.example.fullstackbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "feature_management")
public class Feature {

    @Id
    @GeneratedValue
    private Long id;

    @JsonProperty("feature_name")
    private String featureName;

    @JsonProperty("display_section")
    private String displaySection;

    @JsonProperty("feature_display_name")
    private String featureDisplayName;

    @JsonProperty("feature_explanation")
    private String featureExplanation;

    @JsonProperty("external_site_link")
    private String externalSiteLink;

    @JsonProperty("registrant")
    private String registrant;

    @JsonProperty("registration_date")
    private String registrationDate;

    @JsonProperty("updater")
    private String updater;

    @JsonProperty("update_date")
    private String updateDate;

    @Override
    public String toString() {
        return "{" + this.featureDisplayName + " " + this.featureExplanation + "}";
    }
}
