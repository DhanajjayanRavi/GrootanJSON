
package pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "about",
    "likes",
    "created",
    "submitted"
})
public class Input {

    @JsonProperty("about")
    private String about;
    @JsonProperty("likes")
    private Integer likes;
    @JsonProperty("created")
    private Integer created;
    @JsonProperty("submitted")
    private List<Double> submitted = new ArrayList<Double>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("about")
    public String getAbout() {
        return about;
    }

    @JsonProperty("about")
    public void setAbout(String about) {
        this.about = about;
    }

    public Input withAbout(String about) {
        this.about = about;
        return this;
    }

    @JsonProperty("likes")
    public Integer getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Input withLikes(Integer likes) {
        this.likes = likes;
        return this;
    }

    @JsonProperty("created")
    public Integer getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(Integer created) {
        this.created = created;
    }

    public Input withCreated(Integer created) {
        this.created = created;
        return this;
    }

    @JsonProperty("submitted")
    public List<Double> getSubmitted() {
        return submitted;
    }

    @JsonProperty("submitted")
    public void setSubmitted(List<Double> submitted) {
        this.submitted = submitted;
    }

    public Input withSubmitted(List<Double> submitted) {
        this.submitted = submitted;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Input withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(about).append(likes).append(created).append(submitted).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Input) == false) {
            return false;
        }
        Input rhs = ((Input) other);
        return new EqualsBuilder().append(about, rhs.about).append(likes, rhs.likes).append(created, rhs.created).append(submitted, rhs.submitted).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
