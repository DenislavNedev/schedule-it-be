package com.uni.sofia.schedule.it.data;


import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@DynamicUpdate
public class AppEvent {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "start", nullable = false)
    private Date start;

    @Column(name = "end", nullable = false)
    private Date end;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "presentation_url", nullable = false)
    private String presentationUrl;

    @Column(name = "meeting_url", nullable = false)
    private String meetingUrl;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPresentationUrl() {
        return presentationUrl;
    }

    public void setPresentationUrl(String presentationUrl) {
        this.presentationUrl = presentationUrl;
    }

    public String getMeetingUrl() {
        return meetingUrl;
    }

    public void setMeetingUrl(String meetingUrl) {
        this.meetingUrl = meetingUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
